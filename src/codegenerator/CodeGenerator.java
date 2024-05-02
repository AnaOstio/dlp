package codegenerator;

import ast.types.CharType;
import ast.types.FloatType;
import ast.types.IntType;
import ast.types.Type;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;
    int count = 1;

    public CodeGenerator(String output, String input) {
        try {
            this.out = new PrintWriter(output);
            source(input);
        } catch (IOException e) {
            System.err.println("Error abriendo el fichero " + output);

        }
    }

    public void source(String input) {
        out.println();
        out.println("#source \"" + input + "\"" );
        out.println();
        out.flush();
    }

    public void call(String method) {
        out.println("call " + method);
        out.flush();
    }

    public void line(int line) {
        out.println("#line\t" + line);
    }

    public void halt() {
        out.println("halt");
        out.println();
        out.println();
        out.flush();
    }

    public void push(int v) {
        out.println("\tpushi\t" + v);
        out.flush();
    }

    public void push(char c) {
        out.println("\tpushi\t" + (int) c);
        out.flush();
    }

    public void push(double f) {
        out.println("\tpushf\t" + f);
        out.flush();
    }

    public void pusha(int a) {
        out.println("\tpusha\t" + a);
        out.flush();
    }

    public void pushBP(){
        out.println("\tpush BP");
    }

    public void out(Type type){
        out.println("\tout" + type.suffix());
        out.flush();
    }

    public void in(Type type){
        out.println("in " + type.suffix());
        out.flush();
    }

    public void store(Type type) {
        out.println("store " + type.suffix());
        out.flush();
    }

    public void mainInvocation(){
        out.println("\n ' Invocation to the main function");
        out.flush();
    }

    public void comment(String comment) {
        out.println("\t ' * " + comment);
        out.flush();
    }

    public void label(String name){
        out.println(name + ":");
        out.flush();
    }

    public void enter(int value){
        out.println("\tenter " + value);
        out.flush();
    }

    public void ret(int a, int b, int c){
        out.println("ret "+  a  + ", " + b + ", " + c);
        out.flush();
    }

    public String nextLabel(){
        return "label " + this.count++;
    }

    public void jmp(String label){
        out.println("jmp " + label);
        out.flush();
    }

    public void jz(String label) {
        out.println("jz " + label);
        out.flush();
    }

    public void pop(Type type){
        out.println("pop" + type.suffix());
        out.flush();
    }

    public void load(Type type) {
        out.println("load" + type.suffix());
        out.flush();
    }

    public void operation(String operation, Type type){
        if (type == null) out.println(operation);
        else out.println(operation + type.suffix());
        out.flush();
    }

    /**
     * Conversions
     *
     * 	b2i 	Pops one character and pushes it as an integer
     * 	i2f 	Pops one integer and pushes it as a real number
     * 	f2i 	Pops one real number and pushes it as an integer
     * 	i2b 	Pops one integer and pushes it as a character
     * @param newT
     * @param exprType
     */
    public void cast(Type newT, Type exprType){
        if (exprType == CharType.getInstance() && newT == IntType.getInstance()) {
            out.println("b2i");
        } else if (exprType == IntType.getInstance() && newT == CharType.getInstance()) {
            out.println("i2b");
        } else if (exprType == FloatType.getInstance() && newT == CharType.getInstance()) {
            out.println("f2i");
            out.println("i2b");
        } else if (exprType == CharType.getInstance() && newT == FloatType.getInstance()) {
            out.println("b2i");
            out.println("i2f");
        } else if (exprType == IntType.getInstance() && newT == FloatType.getInstance()) {
            out.println("i2f");
        }else if (exprType == FloatType.getInstance() && newT == IntType.getInstance()) {
            out.println("f2i");
        }
        out.flush();
    }
}
