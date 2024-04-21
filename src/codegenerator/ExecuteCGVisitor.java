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

    private ValueCGVisitor vv = new ValueCGVisitor(getCodeGenerator());
    private AddressCGVisitor av = new AddressCGVisitor(getCodeGenerator());

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
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
        getCodeGenerator().mainInvocation();
        getCodeGenerator().call("main");
        getCodeGenerator().halt();

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
            getCodeGenerator().line(e.getLine());
            getCodeGenerator().comment("Write");
            e.accept(av, param);
            getCodeGenerator().out(e.getType());
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
            getCodeGenerator().line(e.getLine());
            getCodeGenerator().comment("Read");
            e.accept(av, param);
            getCodeGenerator().in(e.getType());
            getCodeGenerator().store(e.getType());
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
        getCodeGenerator().line(a.getLeft().getLine());
        getCodeGenerator().comment("Assignment");
        a.getLeft().accept(av, param);
        a.getRight().accept(vv, param);
        getCodeGenerator().store(a.getLeft().getType());
        return super.visit(a, param);
    }

    /*
        [VarDefinition: definition -> var ID type ]]() =
            <' * Tipo'> type ID <(offset > definition.offset <)>
     */
    @Override
    public Void visit(VarDefinition v, FunctionDefinition param) {
        getCodeGenerator().comment("Tipo " +  v.getType().toString() + " " + v.getName() + " (offset " + v.getOffset() + ")");
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
        getCodeGenerator().line(f.getLine());
        getCodeGenerator().label(f.getName());
        getCodeGenerator().comment("Parameters");
        List<VarDefinition> params = ((FunctionType)f.getType()).getParameters();
        for(int i = params.size() -1; i >= 0; i--){
            params.get(i).accept(this, param);
        }

        getCodeGenerator().comment("Local variables");
        for(Statement s: f.getBody()) {
            if(s instanceof VarDefinition)
                s.accept(this, f);
        }

        getCodeGenerator().enter(f.getLocalVariablesBytes() * -1);
        for(Statement s: f.getBody()) {
            if(!(s instanceof VarDefinition))
                s.accept(this, f);
        }

        FunctionType fType = ((FunctionType) f.getType());
        if(fType.getReturnType() == VoidType.getInstance())
            getCodeGenerator().ret(0, f.getLocalVariablesBytes() * -1, fType.getParametersBytes());

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
        getCodeGenerator().line(w.getLine());
        getCodeGenerator().comment("While");
        String bucle = getCodeGenerator().nextLabel();
        String end = getCodeGenerator().nextLabel();

        getCodeGenerator().line(w.getExpression().getLine());
        getCodeGenerator().label(bucle);
        w.getExpression().accept(vv, param);
        getCodeGenerator().jz(end);
        getCodeGenerator().comment("While body");
        w.getStatements().forEach(s -> s.accept(this, param));
        getCodeGenerator().jmp(bucle);
        getCodeGenerator().label(end);

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
        getCodeGenerator().line(i.getLine());
        getCodeGenerator().comment("If-Else");

        String falseS = getCodeGenerator().nextLabel();
        String end = getCodeGenerator().nextLabel();
        getCodeGenerator().line(i.getCondition().getLine());
        i.getCondition().accept(vv, param);
        getCodeGenerator().jz(falseS);
        getCodeGenerator().comment("True body");
        i.getTrueStatements().forEach(s -> s.accept(this, param));
        getCodeGenerator().jmp(end);
        getCodeGenerator().label(falseS);
        getCodeGenerator().comment("False body");
        i.getFalseStatements().forEach(s -> s.accept(this, param));
        getCodeGenerator().label(end);

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
        getCodeGenerator().line(f.getLine());
        ((Expression) f).accept(vv, param);
        if(((Expression) f).getType() == VoidType.getInstance())
            getCodeGenerator().pop(((Expression) f).getType());

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
        getCodeGenerator().line(r.getLine());
        getCodeGenerator().comment("Return");
        r.getExpression().accept(vv, param);
        getCodeGenerator().ret(((FunctionType)param.getType()).getReturnType().numberOfBytes(), param.getLocalVariablesBytes() * -1, ((FunctionType)param.getType()).getParametersBytes());

        return null;
    }
}
