import org.antlr.v4.runtime.*;
import introspector.model.IntrospectorModel;

import ast.ASTNode;
import errorhandler.ErrorHandler;
import introspector.view.IntrospectorView;
import parser.*;
import semantic.IdentificationVisitor;
import semantic.TypeCheckingVisitor;

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

		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(),null);

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
