// Generated from com\miorganizacion\simple1\Interprete1\Simple1.g4 by ANTLR 4.5.1
package com.miorganizacion.simple1.Interprete1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Simple1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Simple1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(Simple1Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#consultasimple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsultasimple(Simple1Parser.ConsultasimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#consultaselect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsultaselect(Simple1Parser.ConsultaselectContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(Simple1Parser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(Simple1Parser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(Simple1Parser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#creandotablanueva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreandotablanueva(Simple1Parser.CreandotablanuevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Simple1Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#columnaa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnaa(Simple1Parser.ColumnaaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Simple1Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Simple1Parser#atributos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtributos(Simple1Parser.AtributosContext ctx);
}