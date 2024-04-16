package codegenerator;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Expression;
import ast.statements.Assignment;
import ast.statements.Read;
import ast.statements.Write;
import visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, Void> {

    private ValueCGVisitor vv = new ValueCGVisitor(getCodeGenerator());
    private AddressCGVisitor av = new AddressCGVisitor(getCodeGenerator());

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    /*
        [Program: program -> definitions*]
     */
    @Override
    public Void visit(Program p, Void param) {
        // Bucle for para escribir los comentarios de las var globales
        for (Definition d: p.getBody()) {
            if(d instanceof VarDefinition) {
                d.accept(this, param);
            }
        }
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
    public Void visit(Write w, Void param) {
        for (Expression e: w.getExpression()) {
            getCodeGenerator().line(e.getLine());
            // Comentario
            // habria que aceptarlo con el value
            // de alguna forma hay que pasarle el valor que se calcula
            getCodeGenerator().out(e.getType(), "hola");
        }

        return super.visit(w, param);
    }

    /*
      [Read:  Statement -> expression* ]
        expression*.forEach(e -> { address[[e]], in?, store? })
     */
    @Override
    public Void visit(Read r, Void param) {
        return super.visit(r, param);
    }

    /*
      [Assignment: Statement -> expr expr2]
        address[expr]
        value[expr2]
        convert ->  en caso de que haga falta hacer una conversion de los tipos (no se si lo hacemos)
        store?
     */
    @Override
    public Void visit(Assignment a, Void param) {
        return super.visit(a, param);
    }
}
