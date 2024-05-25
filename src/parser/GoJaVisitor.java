// Generated from C:/Users/Usuario/Documents/UNI/5ºAño/2º Semestre/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
package parser;

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
	 * Visit a parse tree produced by {@link GoJaParser#definiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniciones(GoJaParser.DefinicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#var_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_definition(GoJaParser.Var_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#func_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_definition(GoJaParser.Func_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GoJaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#switch_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_statements(GoJaParser.Switch_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(GoJaParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(GoJaParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(GoJaParser.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GoJaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(GoJaParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(GoJaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#campos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCampos(GoJaParser.CamposContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#tipo_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_simple(GoJaParser.Tipo_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GoJaParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(GoJaParser.VarsContext ctx);
}