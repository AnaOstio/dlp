package codegenerator;

import ast.definitions.FunctionDefinition;
import ast.expressions.*;

public class ValueCGVisitor extends AbstractCGVisitor<FunctionDefinition, Void>{

    private AddressCGVisitor av;
    private CodeGenerator cg;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        this.cg = codeGenerator;
    }

    public void setAddressVisitor(AddressCGVisitor av){
        this.av = av;
    }

    /*
        [Variable: expresion -> id:string]()
            addres[expresion]
            <load> expreison.type.suffix
     */
    @Override
    public Void visit(Variable v, FunctionDefinition param) {
        v.accept(av, param);
        this.cg.load(v.getType());
        return null;
    }

    /*
        [IntLiteral: expresion -> value:int]() =
            <pushi> value
     */
    @Override
    public Void visit(IntLiteral i, FunctionDefinition param) {
        this.cg.push(i.getValue());
        return null;
    }

    /*
        [FloatLiteral: expresion -> value:double]() =
            <pushf> value
     */
    @Override
    public Void visit(FloatLiteral f, FunctionDefinition param) {
        this.cg.push(f.getValue());
        return null;
    }

    /*
        [CharLiteral: expression -> value:char]() =
            <push> value
     */
    @Override
    public Void visit(CharLiteral c, FunctionDefinition param) {
        this.cg.push(c.getValue());
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
            case "*": this.cg.operation("mul", a.getType()); break;
            case "/": this.cg.operation("div", a.getType()); break;
            case "%": this.cg.operation("mod", a.getType()); break;
            case "+": this.cg.operation("add", a.getType()); break;
            case "-": this.cg.operation("sub", a.getType()); break;
        }
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, FunctionDefinition param) {
        u.getRight().accept(this, param);
        this.cg.push(-1);
        this.cg.operation("mul", u.getRight().getType());
        return null;
    }

    @Override
    public Void visit(Comparasion c, FunctionDefinition param) {
        c.getLeft().accept(this, param);
        c.getRight().accept(this, param);
        switch (c.getOperator()) {
            case "==": this.cg.operation("eq", c.getType()); break;
            case "!=": this.cg.operation("ne", c.getType()); break;
            case "<":  this.cg.operation("lt", c.getType()); break;
            case "<=": this.cg.operation("le", c.getType()); break;
            case ">":  this.cg.operation("gt", c.getType()); break;
            case ">=": this.cg.operation("ge", c.getType()); break;
        }
        return null;
    }

    @Override
    public Void visit(Logic l, FunctionDefinition param) {
        l.getLeft().accept(this, param);
        l.getRight().accept(this, param);
        switch (l.getOperator()) {
            case "&&": this.cg.operation("and", null); break;
            case "||": this.cg.operation("or", null); break;
        }

        return null;
    }

    @Override
    public Void visit(UnaryNot u, FunctionDefinition param) {
        u.getRight().accept(this, param);
        this.cg.operation("not", null);
        return null;
    }

    @Override
    public Void visit(Cast c, FunctionDefinition param) {
        c.getExpression().accept(this, param);
        this.cg.cast(c.getCastType(), c.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, FunctionDefinition param) {
        f.getParameters().forEach(p -> p.accept(this, param));
        this.cg.call(f.getName().getName());
        return null;
    }
}
