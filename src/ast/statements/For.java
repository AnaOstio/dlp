package ast.statements;

import ast.expressions.Expression;
import visitor.Visitor;

import java.util.List;

public class For extends AbstractStatement {

    Statement inicializacion, incremento;
    Expression condicion;

    List<Statement> forBody;

    public For(int line, int column, Statement inicializacion, Expression condicion, Statement incremento, List<Statement> forBody) {
        super(line, column);
        this.condicion = condicion;
        this.incremento = incremento;
        this.inicializacion = inicializacion;
        this.forBody = forBody;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }

    public Statement getInicializacion() {
        return inicializacion;
    }

    public void setInicializacion(Statement inicializacion) {
        this.inicializacion = inicializacion;
    }

    public Statement getIncremento() {
        return incremento;
    }

    public void setIncremento(Statement incremento) {
        this.incremento = incremento;
    }

    public Expression getCondicion() {
        return condicion;
    }

    public void setCondicion(Expression condicion) {
        this.condicion = condicion;
    }

    public List<Statement> getForBody() {
        return forBody;
    }

    public void setForBody(List<Statement> forBody) {
        this.forBody = forBody;
    }
}
