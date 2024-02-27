import ast.ASTNode;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;

public class Main {

	public static void main(String... args) throws Exception {
		if (args.length<1) {
			System.err.println("Please, pass me the input file.");
			return;
		}

		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		GoJaLexer lexer = new GoJaLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GoJaParser parser = new GoJaParser(tokens);

		// El ASTNode es nuestro ASTNode por lo que si lo cambiamos de nombre, hay que cambiarlo aquí también
		ASTNode ast = parser.program().ast;

		// * The AST is shown
		IntrospectorModel model = new IntrospectorModel("Program", ast);
		new IntrospectorView("Introspector", model);
	}
}