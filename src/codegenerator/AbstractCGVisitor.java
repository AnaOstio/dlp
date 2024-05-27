package codegenerator;

import ast.Program;
import ast.definitions.FunctionDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import visitor.Visitor;

public class AbstractCGVisitor<TP, TR> implements Visitor<TP, TR> {

    @Override
    public TR visit(Program p, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Program'");
    }

    @Override
    public TR visit(VarDefinition v, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'VarDefinition'");
    }

    @Override
    public TR visit(FunctionDefinition f, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'FunctionDefinition'");
    }

    @Override
    public TR visit(Assignment a, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Assigment'");
    }

    @Override
    public TR visit(IfElse i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'IfElse'");
    }

    @Override
    public TR visit(Read r, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Read'");
    }

    @Override
    public TR visit(Return r, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Return'");
    }

    @Override
    public TR visit(While w, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'While'");
    }

    @Override
    public TR visit(Write w, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Write'");
    }

    @Override
    public TR visit(Arithmetic a, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Arithmetic'");
    }

    @Override
    public TR visit(ArrayAccess a, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'ArrayAccess'");
    }

    @Override
    public TR visit(Cast c, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Cast'");
    }

    @Override
    public TR visit(Comparasion c, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Comparasion'");
    }

    @Override
    public TR visit(FieldAccess f, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'FieldAccess'");
    }

    @Override
    public TR visit(FunctionInvocation f, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'FunctionInvocation'");
    }

    @Override
    public TR visit(Logic l, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Logic'");
    }

    @Override
    public TR visit(UnaryMinus u, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'UnaryMinus'");
    }

    @Override
    public TR visit(UnaryNot u, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'UnaryNot'");
    }

    @Override
    public TR visit(Variable v, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'Variable'");
    }

    @Override
    public TR visit(CharLiteral c, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'CharLiteral'");
    }

    @Override
    public TR visit(IntLiteral i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'IntLiteral'");
    }

    @Override
    public TR visit(FloatLiteral f, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'FloatLiteral'");
    }

    @Override
    public TR visit(ArrayType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'ArrayType'");
    }

    @Override
    public TR visit(CharType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'CharType'");
    }

    @Override
    public TR visit(ErrorType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'ErrorType'");
    }

    @Override
    public TR visit(FunctionType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'FunctionType'");
    }

    @Override
    public TR visit(FloatType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'FloatType'");
    }

    @Override
    public TR visit(StructType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'StructType'");
    }

    @Override
    public TR visit(VoidType i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'VoidType'");
    }

    @Override
    public TR visit(StructField i, TP param) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'StructField'");
    }

    @Override
    public TR visit(IntType i, TP o) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'IntType'");
    }

    @Override
    public TR visit(BooleanType i, TP o) {
        throw new IllegalStateException("Esta plantilla no es aplicable a 'BooleanType'");
    }
}
