// Generated from com\miorganizacion\simple1\Interprete1\Simple1.g4 by ANTLR 4.5.1
package com.miorganizacion.simple1.Interprete1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Simple1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ASSIGN=4, NUM=5, COMA=6, PUNTOCOMA=7, AND=8, 
		OR=9, TODO=10, CREATE=11, TABLE=12, PAR_OPEN=13, PAR_CLOSE=14, DELETE=15, 
		INT=16, VARCHAR=17, GT=18, LT=19, GEQ=20, LEQ=21, EQ=22, NEQ=23, ID=24, 
		WS=25;
	public static final int
		RULE_program = 0, RULE_consultasimple = 1, RULE_consultaselect = 2, RULE_table = 3, 
		RULE_columna = 4, RULE_condition = 5, RULE_creandotablanueva = 6, RULE_tipo = 7, 
		RULE_columnaa = 8, RULE_var = 9, RULE_atributos = 10;
	public static final String[] ruleNames = {
		"program", "consultasimple", "consultaselect", "table", "columna", "condition", 
		"creandotablanueva", "tipo", "columnaa", "var", "atributos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SELECT'", "'FROM'", "'WHERE'", "'='", null, "','", "';'", "'AND'", 
		"'OR'", "'*'", "'CREATE'", "'TABLE'", "'('", "')'", "'DELETE'", "'INT'", 
		"'VARCHAR'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "ASSIGN", "NUM", "COMA", "PUNTOCOMA", 
		"AND", "OR", "TODO", "CREATE", "TABLE", "PAR_OPEN", "PAR_CLOSE", "DELETE", 
		"INT", "VARCHAR", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Simple1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ConsultasimpleContext consultasimple() {
			return getRuleContext(ConsultasimpleContext.class,0);
		}
		public CreandotablanuevaContext creandotablanueva() {
			return getRuleContext(CreandotablanuevaContext.class,0);
		}
		public ConsultaselectContext consultaselect() {
			return getRuleContext(ConsultaselectContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(25);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				consultasimple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				creandotablanueva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				consultaselect();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsultasimpleContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(Simple1Parser.SELECT, 0); }
		public TerminalNode TODO() { return getToken(Simple1Parser.TODO, 0); }
		public TerminalNode FROM() { return getToken(Simple1Parser.FROM, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(Simple1Parser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(Simple1Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Simple1Parser.COMA, i);
		}
		public ConsultasimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultasimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterConsultasimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitConsultasimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitConsultasimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultasimpleContext consultasimple() throws RecognitionException {
		ConsultasimpleContext _localctx = new ConsultasimpleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_consultasimple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(SELECT);
			setState(28);
			match(TODO);
			setState(29);
			match(FROM);
			setState(30);
			table();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(31);
				match(COMA);
				setState(32);
				table();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(PUNTOCOMA);
			System.out.println("Consultando");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsultaselectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(Simple1Parser.SELECT, 0); }
		public List<ColumnaContext> columna() {
			return getRuleContexts(ColumnaContext.class);
		}
		public ColumnaContext columna(int i) {
			return getRuleContext(ColumnaContext.class,i);
		}
		public TerminalNode FROM() { return getToken(Simple1Parser.FROM, 0); }
		public List<TableContext> table() {
			return getRuleContexts(TableContext.class);
		}
		public TableContext table(int i) {
			return getRuleContext(TableContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(Simple1Parser.WHERE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(Simple1Parser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(Simple1Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Simple1Parser.COMA, i);
		}
		public List<TerminalNode> AND() { return getTokens(Simple1Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(Simple1Parser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(Simple1Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(Simple1Parser.OR, i);
		}
		public ConsultaselectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consultaselect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterConsultaselect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitConsultaselect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitConsultaselect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsultaselectContext consultaselect() throws RecognitionException {
		ConsultaselectContext _localctx = new ConsultaselectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_consultaselect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(SELECT);
			setState(42);
			columna();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(43);
				match(COMA);
				setState(44);
				columna();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(FROM);
			setState(51);
			table();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(52);
				match(COMA);
				setState(53);
				table();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(WHERE);
			setState(60);
			condition();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				{
				setState(61);
				match(COMA);
				setState(62);
				condition();
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(64);
					match(AND);
					setState(65);
					condition();
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(71);
					match(OR);
					setState(72);
					condition();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(PUNTOCOMA);
			System.out.println("Consultando");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Simple1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Simple1Parser.ID, i);
		}
		public TerminalNode COMA() { return getToken(Simple1Parser.COMA, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !(_la==COMA || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnaContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Simple1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Simple1Parser.ID, i);
		}
		public TerminalNode COMA() { return getToken(Simple1Parser.COMA, 0); }
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_columna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==COMA || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Simple1Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Simple1Parser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(Simple1Parser.ASSIGN, 0); }
		public TerminalNode COMA() { return getToken(Simple1Parser.COMA, 0); }
		public TerminalNode AND() { return getToken(Simple1Parser.AND, 0); }
		public TerminalNode OR() { return getToken(Simple1Parser.OR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(ID);
				setState(91);
				match(ASSIGN);
				setState(92);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(COMA);
				setState(94);
				match(AND);
				setState(95);
				match(OR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(ID);
				setState(97);
				match(ASSIGN);
				setState(98);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreandotablanuevaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Simple1Parser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(Simple1Parser.TABLE, 0); }
		public TerminalNode ID() { return getToken(Simple1Parser.ID, 0); }
		public TerminalNode PAR_OPEN() { return getToken(Simple1Parser.PAR_OPEN, 0); }
		public AtributosContext atributos() {
			return getRuleContext(AtributosContext.class,0);
		}
		public TerminalNode PAR_CLOSE() { return getToken(Simple1Parser.PAR_CLOSE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(Simple1Parser.PUNTOCOMA, 0); }
		public CreandotablanuevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creandotablanueva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterCreandotablanueva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitCreandotablanueva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitCreandotablanueva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreandotablanuevaContext creandotablanueva() throws RecognitionException {
		CreandotablanuevaContext _localctx = new CreandotablanuevaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_creandotablanueva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(CREATE);
			setState(102);
			match(TABLE);
			setState(103);
			match(ID);
			setState(104);
			match(PAR_OPEN);
			setState(105);
			atributos();
			setState(106);
			match(PAR_CLOSE);
			setState(107);
			match(PUNTOCOMA);
			System.out.println("Consultando");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Simple1Parser.INT, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo);
		try {
			setState(112);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(INT);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnaaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Simple1Parser.ID, 0); }
		public ColumnaaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnaa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterColumnaa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitColumnaa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitColumnaa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaaContext columnaa() throws RecognitionException {
		ColumnaaContext _localctx = new ColumnaaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_columnaa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VARCHAR() { return getToken(Simple1Parser.VARCHAR, 0); }
		public TerminalNode PAR_OPEN() { return getToken(Simple1Parser.PAR_OPEN, 0); }
		public TerminalNode NUM() { return getToken(Simple1Parser.NUM, 0); }
		public TerminalNode PAR_CLOSE() { return getToken(Simple1Parser.PAR_CLOSE, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(VARCHAR);
			setState(117);
			match(PAR_OPEN);
			setState(118);
			match(NUM);
			setState(119);
			match(PAR_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtributosContext extends ParserRuleContext {
		public List<ColumnaaContext> columnaa() {
			return getRuleContexts(ColumnaaContext.class);
		}
		public ColumnaaContext columnaa(int i) {
			return getRuleContext(ColumnaaContext.class,i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Simple1Parser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Simple1Parser.COMA, i);
		}
		public AtributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).enterAtributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Simple1Listener ) ((Simple1Listener)listener).exitAtributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Simple1Visitor ) return ((Simple1Visitor<? extends T>)visitor).visitAtributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtributosContext atributos() throws RecognitionException {
		AtributosContext _localctx = new AtributosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			columnaa();
			setState(122);
			tipo();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(123);
				match(COMA);
				setState(124);
				columnaa();
				setState(125);
				tipo();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33\u0087\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\3\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\7\4Q\n\4\f\4"+
		"\16\4T\13\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7f\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\ts\n\t\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0082\n\f"+
		"\f\f\16\f\u0085\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\4\2\b\b"+
		"\32\32\u0087\2\33\3\2\2\2\4\35\3\2\2\2\6+\3\2\2\2\bX\3\2\2\2\nZ\3\2\2"+
		"\2\fe\3\2\2\2\16g\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26{\3\2"+
		"\2\2\30\34\5\4\3\2\31\34\5\16\b\2\32\34\5\6\4\2\33\30\3\2\2\2\33\31\3"+
		"\2\2\2\33\32\3\2\2\2\34\3\3\2\2\2\35\36\7\3\2\2\36\37\7\f\2\2\37 \7\4"+
		"\2\2 %\5\b\5\2!\"\7\b\2\2\"$\5\b\5\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\t\2\2)*\b\3\1\2*\5\3\2\2\2+,\7\3\2\2"+
		",\61\5\n\6\2-.\7\b\2\2.\60\5\n\6\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2"+
		"\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\4\2\2\65:\5\b\5\2\66"+
		"\67\7\b\2\2\679\5\b\5\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3"+
		"\2\2\2<:\3\2\2\2=>\7\5\2\2>R\5\f\7\2?@\7\b\2\2@A\5\f\7\2AF\3\2\2\2BC\7"+
		"\n\2\2CE\5\f\7\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GM\3\2\2\2HF\3"+
		"\2\2\2IJ\7\13\2\2JL\5\f\7\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ"+
		"\3\2\2\2OM\3\2\2\2P?\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2T"+
		"R\3\2\2\2UV\7\t\2\2VW\b\4\1\2W\7\3\2\2\2XY\t\2\2\2Y\t\3\2\2\2Z[\t\2\2"+
		"\2[\13\3\2\2\2\\]\7\32\2\2]^\7\6\2\2^f\7\32\2\2_`\7\b\2\2`a\7\n\2\2af"+
		"\7\13\2\2bc\7\32\2\2cd\7\6\2\2df\7\32\2\2e\\\3\2\2\2e_\3\2\2\2eb\3\2\2"+
		"\2f\r\3\2\2\2gh\7\r\2\2hi\7\16\2\2ij\7\32\2\2jk\7\17\2\2kl\5\26\f\2lm"+
		"\7\20\2\2mn\7\t\2\2no\b\b\1\2o\17\3\2\2\2ps\7\22\2\2qs\5\24\13\2rp\3\2"+
		"\2\2rq\3\2\2\2s\21\3\2\2\2tu\7\32\2\2u\23\3\2\2\2vw\7\23\2\2wx\7\17\2"+
		"\2xy\7\7\2\2yz\7\20\2\2z\25\3\2\2\2{|\5\22\n\2|\u0083\5\20\t\2}~\7\b\2"+
		"\2~\177\5\22\n\2\177\u0080\5\20\t\2\u0080\u0082\3\2\2\2\u0081}\3\2\2\2"+
		"\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\27"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\f\33%\61:FMRer\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}