package codegenerator;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import ast.expressions.FunctionInvocation;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.VoidType;

import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void> {

    private final ValueCGVisitor vv;
    private final AddressCGVisitor av;
    
    private CodeGenerator cg;

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
        this.vv = new ValueCGVisitor(codeGenerator);
        this.av = new AddressCGVisitor(codeGenerator);
        av.setValueVisitor(vv);
        vv.setAddressVisitor(av);
    }

    /*
        [Program: program -> definitions*]() =
            definitions.forEach( d -> { if d instance of VarDefinition execute[[d]] } )
            <<call main>>
            <<halt>>
            definitions.forEach( d -> { if d instance of FunctionDefinition execute[[d]] } )
     */
    @Override
    public Void visit(Program p, FunctionDefinition param) {
        // Bucle for para escribir los comentarios de las var globales
        for (Definition d: p.getBody()) {
            if(d instanceof VarDefinition) {
                d.accept(this, param);
            }
        }
        this.cg.mainInvocation();
        this.cg.call("main");
        this.cg.halt();

        for (Definition d: p.getBody()) {
            if(d instanceof FunctionDefinition) {
                d.accept(this, param);
            }
        }
        return null;
    }

    /*
      [Write:  Statement -> expression* ]
        expression*.forEach(e -> { value[[e]], out? })
     */
    @Override
    public Void visit(Write w, FunctionDefinition param) {
        for (Expression e: w.getExpression()) {
            this.cg.line(e.getLine());
            this.cg.comment("Write");
            e.accept(vv, param);
            this.cg.out(e.getType());
            this.cg.newLine();
        }

        return null;
    }

    /*
      [Read:  Statement -> expression* ]() =
        expression*.forEach(e -> {
            address[[e]]
            <<in>> e.type.suffix()
            <<store>> e.type.suffix()
            })
     */
    @Override
    public Void visit(Read r, FunctionDefinition param) {

        for (Expression e: r.getExpression()) {
            this.cg.line(e.getLine());
            this.cg.comment("Read");
            e.accept(av, param);
            this.cg.in(e.getType());
            this.cg.store(e.getType());
            this.cg.newLine();
        }

        return null;
    }

    /*
      [Assignment: Statement -> expr expr2]
        address[[expr]]
        value[[expr2]]
        <<store>> e.type.suffix()
     */
    @Override
    public Void visit(Assignment a, FunctionDefinition param) {
        this.cg.line(a.getLeft().getLine());
        this.cg.comment("Assignment");
        a.getLeft().accept(av, param);
        a.getRight().accept(vv, param);
        this.cg.store(a.getLeft().getType());
        this.cg.newLine();
        return null;
    }

    /*
      [MultipleAssignment: Statement -> expr* expr2*]
        for (i = 0; i < expr*.size(); i++) {
             address[[expr[i]]]
             value[[expr2[i]]]
             <<store>> e.type.suffix()
        }
     */
    @Override
    public Void visit(MultipleAssignment a, FunctionDefinition param) {
        this.cg.line(a.getLeft().get(0).getLine());
        this.cg.comment("Multiple Assignment");

        // Para cada uno de esto ahora lo que tenemos que hacer es recorrer y
        // pillar el de cada uno
        for(int i = 0; i < a.getLeft().size(); i++){
            a.getLeft().get(i).accept(av, param);
            a.getRight().get(i).accept(vv, param);
            this.cg.store(a.getLeft().get(i).getType());
            this.cg.newLine();
        }
    
        return null;
    }

    /*
        [VarDefinition: definition -> var ID type ]]() =
            <' * Tipo'> type ID <(offset > definition.offset <)>
     */
    @Override
    public Void visit(VarDefinition v, FunctionDefinition param) {
        this.cg.comment("Tipo " +  v.getType().toString() + " " + v.getName() + " (offset " + v.getOffset() + ")");
        return null;
    }

    /*
        [FunctionDefinition: definition -> ID type statements*]() =
            ID <:>
            <' * Parameters>
            type.parameters*.forEach(p -> execute[[p]])
            <' * Local variables >
            statements*.forEach(s -> execute[[s]])
     */
    @Override
    public Void visit(FunctionDefinition f, FunctionDefinition param) {
        this.cg.line(f.getLine());
        this.cg.label(f.getName());
        this.cg.comment("Parameters");
        List<VarDefinition> params = ((FunctionType)f.getType()).getParameters();
        for(int i = params.size() -1; i >= 0; i--){
            params.get(i).accept(this, param);
        }

        this.cg.comment("Local variables");
        for(Statement s: f.getBody()) {
            if(s instanceof VarDefinition)
                s.accept(this, f);
        }

        this.cg.enter(f.getLocalVariablesBytes() * -1);
        for(Statement s: f.getBody()) {
            if(!(s instanceof VarDefinition))
                s.accept(this, f);
        }

        FunctionType fType = ((FunctionType) f.getType());
        if(fType.getReturnType() == VoidType.getInstance())
            this.cg.ret(0, f.getLocalVariablesBytes() * -1, fType.getParametersBytes());

        this.cg.newLine();
        return null;
    }

    /*
        [While: statement -> exp statements*]() =
            String bucle = cg.nextLabel()
            String end = cg.nextLabel()
            bucle <:>
            value[[exp]]
            <jz> end
            statements*.forEach(s -> execute[s])
            <jmp> bucle
            <end>
     */
    @Override
    public Void visit(While w, FunctionDefinition param) {
        this.cg.line(w.getLine());
        this.cg.comment("While");
        String bucle = this.cg.nextLabel();
        String end = this.cg.nextLabel();

        this.cg.line(w.getExpression().getLine());
        this.cg.label(bucle);
        w.getExpression().accept(vv, param);
        this.cg.jz(end);
        this.cg.comment("While body");
        w.getStatements().forEach(s -> s.accept(this, param));
        this.cg.jmp(bucle);
        this.cg.label(end);
        this.cg.newLine();
        return null;
    }

    /*
        [IElse: statement -> exp statementsT* statementsF*]() =
            String falseS = cg.nextLabel()
            String end = cg.nextLabel()
            value[[exp]]
            <jz> falseS
            statementsT*.forEach(s -> execute[s])
            <jmp> end
            <falseS>
            statementsF*.forEach(s -> execute[s])
            <end>
     */
    @Override
    public Void visit(IfElse i, FunctionDefinition param) {
        this.cg.line(i.getLine());
        this.cg.comment("If-Else");

        String falseS = this.cg.nextLabel();
        String end = this.cg.nextLabel();
        this.cg.line(i.getCondition().getLine());
        i.getCondition().accept(vv, param);
        this.cg.jz(falseS);
        this.cg.comment("True body");
        i.getTrueStatements().forEach(s -> s.accept(this, param));
        this.cg.jmp(end);
        this.cg.label(falseS);
        this.cg.comment("False body");
        i.getFalseStatements().forEach(s -> s.accept(this, param));
        this.cg.label(end);

        this.cg.newLine();
        return null;
    }

    /*
        [FunctionInvocation: statement -> expresion expresiones*]() =
            value[[(Expression) statement]]
            if(!((Expression) statement).type instanceof VoidType)
                <pop> ((Expression).statement).type.suffix
     */
    @Override
    public Void visit(FunctionInvocation f, FunctionDefinition param) {
        this.cg.line(f.getLine());
        ((Expression) f).accept(vv, param);
        if(!(((Expression) f).getType() == VoidType.getInstance()))
            this.cg.pop(((Expression) f).getType());

        this.cg.newLine();
        return null;
    }

    /*
        [Return: statement -> expression](funcDefinition) =
            value[[expression]]
            <ret> funcDefinition.type.returnType.numberOfBytes(),
                  funcDefinition.localVariables,
                  funcDefinition.type.paramsBytes
     */
    @Override
    public Void visit(Return r, FunctionDefinition param) {
        this.cg.line(r.getLine());
        this.cg.comment("Return");
        r.getExpression().accept(vv, param);
        this.cg.ret(((FunctionType)param.getType()).getReturnType().numberOfBytes(), param.getLocalVariablesBytes() * -1, ((FunctionType)param.getType()).getParametersBytes());

        this.cg.newLine();
        return null;
    }
}
