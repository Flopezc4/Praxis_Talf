// Generated from com\miorganizacion\simple1\Interprete1\Simple1.g4 by ANTLR 4.5.1
package com.miorganizacion.simple1.Interprete1;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Simple1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ASSIGN=4, NUM=5, COMA=6, PUNTOCOMA=7, AND=8, 
		OR=9, TODO=10, CREATE=11, TABLE=12, PAR_OPEN=13, PAR_CLOSE=14, DELETE=15, 
		INT=16, VARCHAR=17, GT=18, LT=19, GEQ=20, LEQ=21, EQ=22, NEQ=23, ID=24, 
		WS=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "ASSIGN", "NUM", "COMA", "PUNTOCOMA", "AND", 
		"OR", "TODO", "CREATE", "TABLE", "PAR_OPEN", "PAR_CLOSE", "DELETE", "INT", 
		"VARCHAR", "GT", "LT", "GEQ", "LEQ", "EQ", "NEQ", "ID", "WS"
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


	public Simple1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\33\u009d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\6\6K\n\6\r\6\16\6L\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\7\31\u0092\n\31\f\31\16\31\u0095\13\31\3\32\6\32\u0098\n\32"+
		"\r\32\16\32\u0099\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\u009f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5<\3\2\2\2\7A\3\2\2"+
		"\2\tG\3\2\2\2\13J\3\2\2\2\rN\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23V\3\2\2"+
		"\2\25Y\3\2\2\2\27[\3\2\2\2\31b\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2"+
		"\2\2!s\3\2\2\2#w\3\2\2\2%\177\3\2\2\2\'\u0081\3\2\2\2)\u0083\3\2\2\2+"+
		"\u0086\3\2\2\2-\u0089\3\2\2\2/\u008c\3\2\2\2\61\u008f\3\2\2\2\63\u0097"+
		"\3\2\2\2\65\66\7U\2\2\66\67\7G\2\2\678\7N\2\289\7G\2\29:\7E\2\2:;\7V\2"+
		"\2;\4\3\2\2\2<=\7H\2\2=>\7T\2\2>?\7Q\2\2?@\7O\2\2@\6\3\2\2\2AB\7Y\2\2"+
		"BC\7J\2\2CD\7G\2\2DE\7T\2\2EF\7G\2\2F\b\3\2\2\2GH\7?\2\2H\n\3\2\2\2IK"+
		"\t\2\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\f\3\2\2\2NO\7.\2\2O"+
		"\16\3\2\2\2PQ\7=\2\2Q\20\3\2\2\2RS\7C\2\2ST\7P\2\2TU\7F\2\2U\22\3\2\2"+
		"\2VW\7Q\2\2WX\7T\2\2X\24\3\2\2\2YZ\7,\2\2Z\26\3\2\2\2[\\\7E\2\2\\]\7T"+
		"\2\2]^\7G\2\2^_\7C\2\2_`\7V\2\2`a\7G\2\2a\30\3\2\2\2bc\7V\2\2cd\7C\2\2"+
		"de\7D\2\2ef\7N\2\2fg\7G\2\2g\32\3\2\2\2hi\7*\2\2i\34\3\2\2\2jk\7+\2\2"+
		"k\36\3\2\2\2lm\7F\2\2mn\7G\2\2no\7N\2\2op\7G\2\2pq\7V\2\2qr\7G\2\2r \3"+
		"\2\2\2st\7K\2\2tu\7P\2\2uv\7V\2\2v\"\3\2\2\2wx\7X\2\2xy\7C\2\2yz\7T\2"+
		"\2z{\7E\2\2{|\7J\2\2|}\7C\2\2}~\7T\2\2~$\3\2\2\2\177\u0080\7@\2\2\u0080"+
		"&\3\2\2\2\u0081\u0082\7>\2\2\u0082(\3\2\2\2\u0083\u0084\7@\2\2\u0084\u0085"+
		"\7?\2\2\u0085*\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\7?\2\2\u0088,\3"+
		"\2\2\2\u0089\u008a\7?\2\2\u008a\u008b\7?\2\2\u008b.\3\2\2\2\u008c\u008d"+
		"\7#\2\2\u008d\u008e\7?\2\2\u008e\60\3\2\2\2\u008f\u0093\t\3\2\2\u0090"+
		"\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\62\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098"+
		"\t\5\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\32\2\2\u009c\64\3\2\2"+
		"\2\6\2L\u0093\u0099\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}