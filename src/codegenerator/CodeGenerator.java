package codegenerator;

import ast.types.Type;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private PrintWriter out;

    public CodeGenerator(String output, String input) {
        try {
            this.out = new PrintWriter(output);
            source(input);
        } catch (IOException e) {
            System.err.println("Error abriendo el fichero " + output);

        }
    }

    public void source(String input) {
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

    public void push(float f) {
        out.println("\tpushf\t" + f);
        out.flush();
    }

    public void pusha(int a) {
        out.println("\tpusha\t" + a);
        out.flush();
    }

    public void out(Type type, String content){
        out.println("\tout" + type.suffix() + "\t" + content);
        out.flush();
    }
}
