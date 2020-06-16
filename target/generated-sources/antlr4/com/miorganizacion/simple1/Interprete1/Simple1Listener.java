// Generated from com\miorganizacion\simple1\Interprete1\Simple1.g4 by ANTLR 4.5.1
package com.miorganizacion.simple1.Interprete1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Simple1Parser}.
 */
public interface Simple1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Simple1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Simple1Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#consultasimple}.
	 * @param ctx the parse tree
	 */
	void enterConsultasimple(Simple1Parser.ConsultasimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#consultasimple}.
	 * @param ctx the parse tree
	 */
	void exitConsultasimple(Simple1Parser.ConsultasimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#consultaselect}.
	 * @param ctx the parse tree
	 */
	void enterConsultaselect(Simple1Parser.ConsultaselectContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#consultaselect}.
	 * @param ctx the parse tree
	 */
	void exitConsultaselect(Simple1Parser.ConsultaselectContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(Simple1Parser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(Simple1Parser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(Simple1Parser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(Simple1Parser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(Simple1Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(Simple1Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#creandotablanueva}.
	 * @param ctx the parse tree
	 */
	void enterCreandotablanueva(Simple1Parser.CreandotablanuevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#creandotablanueva}.
	 * @param ctx the parse tree
	 */
	void exitCreandotablanueva(Simple1Parser.CreandotablanuevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Simple1Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Simple1Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#columnaa}.
	 * @param ctx the parse tree
	 */
	void enterColumnaa(Simple1Parser.ColumnaaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#columnaa}.
	 * @param ctx the parse tree
	 */
	void exitColumnaa(Simple1Parser.ColumnaaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Simple1Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Simple1Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Simple1Parser#atributos}.
	 * @param ctx the parse tree
	 */
	void enterAtributos(Simple1Parser.AtributosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Simple1Parser#atributos}.
	 * @param ctx the parse tree
	 */
	void exitAtributos(Simple1Parser.AtributosContext ctx);
}