// Generated from C:/Users/UO275780/Desktop/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
package parser;

    // Para que reconzca las clases que queremos utilizar
    import ast.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.expressions.*;
    import ast.definitions.*;
    import java.util.List;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GoJaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GoJaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GoJaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GoJaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(GoJaParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GoJaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#tipo_compuesto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_compuesto(GoJaParser.Tipo_compuestoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#tipo_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_simple(GoJaParser.Tipo_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(GoJaParser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#def_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_variable(GoJaParser.Def_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#struct_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_definition(GoJaParser.Struct_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#func_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_definition(GoJaParser.Func_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#func_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_parameters(GoJaParser.Func_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GoJaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(GoJaParser.SentenciaContext ctx);
}