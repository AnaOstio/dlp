package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.expressions.*;

public class ValueCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void>{

    private AddressCGVisitor av = new AddressCGVisitor(getCodeGenerator());

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    /*
        [Variable: expresion -> id:string]()
            addres[expresion]
            <load> expreison.type.suffix
     */
    @Override
    public Void visit(Variable v, FunctionDefinition param) {
        v.accept(av, param);
        getCodeGenerator().load(v.getType());
        return null;
    }

    /*
        [IntLiteral: expresion -> value:int]() =
            <pushi> value
     */
    @Override
    public Void visit(IntLiteral i, FunctionDefinition param) {
        getCodeGenerator().push(i.getValue());
        return null;
    }

    /*
        [FloatLiteral: expresion -> value:double]() =
            <pushf> value
     */
    @Override
    public Void visit(FloatLiteral f, FunctionDefinition param) {
        getCodeGenerator().push(f.getValue());
        return null;
    }

    /*
        [CharLiteral: expression -> value:char]() =
            <push> value
     */
    @Override
    public Void visit(CharLiteral c, FunctionDefinition param) {
        getCodeGenerator().push(c.getValue());
        return null;
    }

    /*
        [Arithmetic: expression -> left operator right]() =
            value[a.left]
            value[a.right]
            switch (operator)
                case '+' <add> a.type.suffix break
                case '-' <sub> a.type.suffix break
                case '*' <mul> a.type.suffix break
                case '/' <div> a.type.suffix break
                case '%' <mod> a.type.suffix break
     */
    @Override
    public Void visit(Arithmetic a, FunctionDefinition param) {
        a.getLeft().accept(this, param);
        a.getRight().accept(this, param);

        switch (a.getOperator()) {
            case "*": getCodeGenerator().operation("mul", a.getType()); break;
            case "/": getCodeGenerator().operation("div", a.getType()); break;
            case "%": getCodeGenerator().operation("mod", a.getType()); break;
            case "+": getCodeGenerator().operation("add", a.getType()); break;
            case "-": getCodeGenerator().operation("sub", a.getType()); break;
        }
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, FunctionDefinition param) {
        u.getRight().accept(this, param);
        getCodeGenerator().push(-1);
        getCodeGenerator().operation("mul", u.getRight().getType());
        return null;
    }

    @Override
    public Void visit(Comparasion c, FunctionDefinition param) {
        c.getLeft().accept(this, param);
        c.getRight().accept(this, param);
        switch (c.getOperator()) {
            case "==": getCodeGenerator().operation("eq", c.getType()); break;
            case "!=": getCodeGenerator().operation("ne", c.getType()); break;
            case "<":  getCodeGenerator().operation("lt", c.getType()); break;
            case "<=": getCodeGenerator().operation("le", c.getType()); break;
            case ">":  getCodeGenerator().operation("gt", c.getType()); break;
            case ">=": getCodeGenerator().operation("ge", c.getType()); break;
        }
        return null;
    }

    @Override
    public Void visit(Logic l, FunctionDefinition param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);
        switch (l.getOperator()) {
            case "&&": getCodeGenerator().operation("and", null); break;
            case "||": getCodeGenerator().operation("or", null); break;
        }

        return null;
    }

    @Override
    public Void visit(UnaryNot u, FunctionDefinition param) {
        u.getRight().accept(this, param);
        getCodeGenerator().operation("not", null);
        return null;
    }

    @Override
    public Void visit(Cast c, FunctionDefinition param) {
        c.getExpression().accept(this, param);
        getCodeGenerator().cast(c.getCastType(), c.getExpression().getType());
        return null;
    }
}
