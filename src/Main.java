import org.antlr.v4.runtime.*;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorView;
import ast.ASTNode;
import errorhandler.ErrorHandler;
import parser.*;
import semantic.TypeCheckingVisitor;
import visitor.Visitor;

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
		ASTNode ast = parser.program().ast;

		Visitor typeCheckingVisitor = new TypeCheckingVisitor();
		ast.accept(typeCheckingVisitor,null);

		// * Check errors
		if(ErrorHandler.getInstance().anyError()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			IntrospectorModel model=new IntrospectorModel("Program", ast);
			new IntrospectorView("Introspector", model);
		}
	}
}
