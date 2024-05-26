package semantic;

import ast.definitions.FunctionDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.AbstractVisitor;

import java.util.List;
import java.util.stream.Collectors;

public class TypeCheckingVisitor extends AbstractVisitor<Type, Void> {
    @Override
    public Void visit(Assignment a, Type param) {
        super.visit(a, param);

        if(!a.getLeft().getLValue())
            new ErrorType("No se puede realizar la asignacion", a.getLine(), a.getColumn());

        a.getLeft().setType(a.getLeft().getType().mustPromotesTo(a.getRight().getType(), a));
        return null;
    }

    @Override
    public Void visit(Read r, Type param) {
        for (Expression e:  r.getExpression()){
            e.accept(this, param);
            if(!e.getLValue()){
                new ErrorType("La expresión " + e.toString() + " no se puede usar en un Read", e.getLine(), e.getColumn());
            }
        }
        return null;
    }

    @Override
    public Void visit(Arithmetic a, Type param) {
        super.visit(a, param);

        // TODO mirar esto de TypeChecking
        if (a.getLeft().getType() == CharType.getInstance() && a.getRight().getType() == CharType.getInstance()) {
            a.setType(IntType.getInstance());
        } else {
            a.setType(a.getLeft().getType().arithmetic(a.getRight().getType(), a));
        }

        a.setLValue(false);
        return null;
    }

    @Override
    public Void visit(ArrayAccess a, Type param) {
        super.visit(a, param);
        a.setType(a.getLeft().getType().brackets(a.getRight().getType(), a));

        a.setLValue(true);
        return null;
    }

    @Override
    public Void visit(Cast c, Type param) {
        super.visit(c, param);
        c.setType(c.getExpression().getType().canBeCastTo(c.getCastType(), c));

        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparasion c, Type param) {
        super.visit(c, param);
        c.setType(c.getLeft().getType().comparison(c.getRight().getType(), c));

        c.setLValue(false);
        return null;
    }

    @Override
    public Void visit(FieldAccess f, Type param) {
        super.visit(f, param);
        f.setType(f.getLeft().getType().dot(f.getRight(), f));
        
        f.setLValue(true);
        return null;
    }

    @Override
    public Void visit(FunctionInvocation f, Type param) {
        f.setLValue(false);
        super.visit(f, param);
        // Recogemos los tipos
        List<Type> types = f.getParameters().stream().map(Expression::getType).collect(Collectors.toList());
        if(f.getName().getType() != null){
            f.setType(f.getName().getType().parenthesis(types, f));
        }

        return null;
    }

    @Override
    public Void visit(Logic l, Type param) {
        super.visit(l, param);
        l.setType(l.getLeft().getType().logical(l.getRight().getType(), l));

        l.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryMinus u, Type param) {
        super.visit(u, param);
        u.setType(u.getRight().getType().arithmetic(u));

        u.setLValue(false);
        return null;
    }

    @Override
    public Void visit(UnaryNot u, Type param) {
        super.visit(u, param);
        u.setType(u.getRight().getType().logical(u));

        u.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Variable v, Type param) {
        v.setLValue(true);
        v.setType(v.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(CharLiteral c, Type param) {
        c.setLValue(false);
        c.setType(CharType.getInstance());
        return null;
    }

    @Override
    public Void visit(IntLiteral i, Type param) {
        i.setLValue(false);
        i.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(FloatLiteral f, Type param) {
        f.setLValue(false);
        f.setType(FloatType.getInstance());
        return null;
    }

    @Override
    public Void visit(IfElse i, Type param) {
        super.visit(i, param);

        if(!i.getCondition().getType().isLogic(i)) {
            new ErrorType("La condición de una sentencia IF debe ser lógica", i.getLine(), i.getColumn());
        }

        return null;
    }

    @Override
    public Void visit(Return r, Type param) {
        super.visit(r, param);
        if(r.getExpression().getType() != param){
            new ErrorType("El tipo de retorno no coincide con el tipo definido en su funcion", r.getLine(), r.getColumn());
        }

        return null;
    }

    @Override
    public Void visit(While w, Type param) {
        super.visit(w, param);

        if(!w.getExpression().getType().isLogic(w)) {
            new ErrorType("La condición de una sentencia IF debe ser lógica", w.getLine(), w.getColumn());
        }

        return null;
    }

    @Override
    public Void visit(FunctionDefinition f, Type param) {
        super.visit(f,((FunctionType)f.getType()).getReturnType());
        return null;
    }

    @Override
    public Void visit(Pow p, Type param) {
        super.visit(p, param);

        if (!(p.getRigth().getType() instanceof IntType))
            new ErrorType("La expresion de la derecha tiene que ser de tipo entero", p.getLine(), p.getColumn());

        p.setType(p.getLeft().getType().arithmetic(p.getRigth().getType(), p));

        p.setLValue(false);
        return null;
    }
}
