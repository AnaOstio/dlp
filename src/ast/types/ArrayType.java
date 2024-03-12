package ast.types;

import visitor.Visitor;

public class ArrayType extends AbstractType {

    private Type arrayType;
    private int size; // Tamaño del array

    public ArrayType(int line, int column, int size, Type arrayType) {
        super(line, column);
        this.arrayType = arrayType;
        this.size = size;
    }

    public Type getArrayType() {
        return arrayType;
    }

    public void setArrayType(Type arrayType) {
        this.arrayType = arrayType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP o) {
        return v.visit(this, o);
    }
}
