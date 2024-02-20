// Generated from C:/Users/UO275780/Desktop/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GoJaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_CONSTANT=1, REAL_CONSTANT=2, REAL_1=3, REAL_2=4, CHAR_CONSTANT=5, 
		IDENTIFICADOR=6, COMMENT=7, MULTI_COMMENT=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT_CONSTANT", "REAL_CONSTANT", "REAL_1", "REAL_2", "CHAR_CONSTANT", 
			"IDENTIFICADOR", "COMMENT", "MULTI_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_CONSTANT", "REAL_CONSTANT", "REAL_1", "REAL_2", "CHAR_CONSTANT", 
			"IDENTIFICADOR", "COMMENT", "MULTI_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GoJaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GoJa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\tr\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0003\u0003$\b\u0003\u0001\u0003\u0003\u0003\'\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0004\u0003"+
		"\u0004A\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0005"+
		"\u0003\u0005H\b\u0005\u0001\u0005\u0005\u0005K\b\u0005\n\u0005\f\u0005"+
		"N\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"T\b\u0006\n\u0006\f\u0006W\t\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007b\b\u0007\n\u0007\f\u0007e\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bm\b\b\u000b\b\f\bn\u0001"+
		"\b\u0001\b\u0002Uc\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0007\u0001\u0000"+
		"09\u0002\u0000EEee\u0002\u0000++--\u0003\u0000AZ__az\u0004\u000009AZ_"+
		"_az\u0001\u0001\n\n\u0003\u0000\t\n\r\r  \u0080\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0001\u0014\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000\u0000\u0000"+
		"\u0005\u001f\u0001\u0000\u0000\u0000\u0007#\u0001\u0000\u0000\u0000\t"+
		"D\u0001\u0000\u0000\u0000\u000bG\u0001\u0000\u0000\u0000\rO\u0001\u0000"+
		"\u0000\u0000\u000f]\u0001\u0000\u0000\u0000\u0011l\u0001\u0000\u0000\u0000"+
		"\u0013\u0015\u0007\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0002\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0003\u0001\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u001e\u0003\u0005\u0002\u0000\u001c\u001e\u0003\u0007\u0003\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005.\u0000\u0000 !\u0003"+
		"\u0001\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"$\u0005.\u0000\u0000"+
		"#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000"+
		"\u0000%\'\u0003\u0001\u0000\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000"+
		"\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0007\u0001\u0000\u0000)+\u0007"+
		"\u0002\u0000\u0000*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000"+
		"+,\u0001\u0000\u0000\u0000,-\u0003\u0001\u0000\u0000-\b\u0001\u0000\u0000"+
		"\u0000./\u0005\'\u0000\u0000/0\t\u0000\u0000\u00000E\u0005\'\u0000\u0000"+
		"12\u0005\'\u0000\u000023\u0005\\\u0000\u000034\u0005n\u0000\u00004E\u0005"+
		"\'\u0000\u000056\u0005\'\u0000\u000067\u0005\\\u0000\u000078\u0005t\u0000"+
		"\u00008E\u0005\'\u0000\u00009:\u0005\'\u0000\u0000:;\u0005\\\u0000\u0000"+
		";=\u0001\u0000\u0000\u0000<>\u0007\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?A\u0007\u0000"+
		"\u0000\u0000@?\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0007\u0000\u0000\u0000CE\u0005\'\u0000\u0000D.\u0001"+
		"\u0000\u0000\u0000D1\u0001\u0000\u0000\u0000D5\u0001\u0000\u0000\u0000"+
		"D9\u0001\u0000\u0000\u0000E\n\u0001\u0000\u0000\u0000FH\u0007\u0003\u0000"+
		"\u0000GF\u0001\u0000\u0000\u0000HL\u0001\u0000\u0000\u0000IK\u0007\u0004"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\f\u0001\u0000\u0000\u0000"+
		"NL\u0001\u0000\u0000\u0000OP\u0005/\u0000\u0000PQ\u0005/\u0000\u0000Q"+
		"U\u0001\u0000\u0000\u0000RT\t\u0000\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000US\u0001\u0000\u0000"+
		"\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0007\u0005"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0006"+
		"\u0006\u0000\u0000\\\u000e\u0001\u0000\u0000\u0000]^\u0005/\u0000\u0000"+
		"^_\u0005*\u0000\u0000_c\u0001\u0000\u0000\u0000`b\t\u0000\u0000\u0000"+
		"a`\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000"+
		"\u0000\u0000fg\u0005*\u0000\u0000gh\u0005/\u0000\u0000hi\u0001\u0000\u0000"+
		"\u0000ij\u0006\u0007\u0000\u0000j\u0010\u0001\u0000\u0000\u0000km\u0007"+
		"\u0006\u0000\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pq\u0006\b\u0000\u0000q\u0012\u0001\u0000\u0000\u0000\u0010\u0000"+
		"\u0016\u0019\u001d#&*=@DGLUYcn\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}