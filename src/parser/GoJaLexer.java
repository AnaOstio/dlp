// Generated from C:/Users/Usuario/Documents/UNI/5ºAño/2º Semestre/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
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
		"\u0004\u0000\to\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0004\u0000\u0015\b\u0000\u000b"+
		"\u0000\f\u0000\u0016\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\"\b\u0002\u0001\u0003\u0003\u0003%\b\u0003\u0001\u0003\u0003\u0003(\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003,\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004B\b\u0004\u0001\u0005\u0003\u0005E\b\u0005\u0001\u0005"+
		"\u0005\u0005H\b\u0005\n\u0005\f\u0005K\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006Q\b\u0006\n\u0006\f\u0006T\t\u0006"+
		"\u0001\u0006\u0003\u0006W\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007_\b\u0007\n\u0007\f\u0007"+
		"b\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0004\bj\b\b\u000b\b\f\bk\u0001\b\u0001\b\u0002R`\u0000\t\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0001\u0000\u0007\u0001\u000009\u0002\u0000EEee\u0002"+
		"\u0000++--\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0001\n\n\u0003"+
		"\u0000\t\n\r\r  |\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0001\u0014\u0001\u0000\u0000"+
		"\u0000\u0003\u0019\u0001\u0000\u0000\u0000\u0005\u001f\u0001\u0000\u0000"+
		"\u0000\u0007$\u0001\u0000\u0000\u0000\tA\u0001\u0000\u0000\u0000\u000b"+
		"D\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000"+
		"\u0000\u0000\u0011i\u0001\u0000\u0000\u0000\u0013\u0015\u0007\u0000\u0000"+
		"\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000"+
		"\u0000\u0016\u0014\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u0002\u0001\u0000\u0000\u0000\u0018\u001a\u0003\u0001\u0000"+
		"\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u001e\u0003\u0005\u0002"+
		"\u0000\u001c\u001e\u0003\u0007\u0003\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e\u0004\u0001\u0000\u0000"+
		"\u0000\u001f!\u0005.\u0000\u0000 \"\u0003\u0001\u0000\u0000! \u0001\u0000"+
		"\u0000\u0000!\"\u0001\u0000\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000"+
		"#%\u0005.\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\'\u0001\u0000\u0000\u0000&(\u0003\u0001\u0000\u0000\'&\u0001\u0000\u0000"+
		"\u0000\'(\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0007\u0001"+
		"\u0000\u0000*,\u0007\u0002\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0003\u0001\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/0\u0005\'\u0000\u000001\t\u0000\u0000\u0000"+
		"1B\u0005\'\u0000\u000023\u0005\'\u0000\u000034\u0005\\\u0000\u000045\u0005"+
		"n\u0000\u00005B\u0005\'\u0000\u000067\u0005\'\u0000\u000078\u0005\\\u0000"+
		"\u000089\u0005t\u0000\u00009B\u0005\'\u0000\u0000:;\u0005\'\u0000\u0000"+
		";<\u0005\\\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000"+
		">?\u0007\u0000\u0000\u0000?@\u0007\u0000\u0000\u0000@B\u0005\'\u0000\u0000"+
		"A/\u0001\u0000\u0000\u0000A2\u0001\u0000\u0000\u0000A6\u0001\u0000\u0000"+
		"\u0000A:\u0001\u0000\u0000\u0000B\n\u0001\u0000\u0000\u0000CE\u0007\u0003"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000EI\u0001\u0000\u0000\u0000FH\u0007"+
		"\u0004\u0000\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\f\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005/\u0000\u0000MN\u0005/\u0000\u0000"+
		"NR\u0001\u0000\u0000\u0000OQ\t\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UW\u0007\u0005"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0006"+
		"\u0006\u0000\u0000Y\u000e\u0001\u0000\u0000\u0000Z[\u0005/\u0000\u0000"+
		"[\\\u0005*\u0000\u0000\\`\u0001\u0000\u0000\u0000]_\t\u0000\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000"+
		"\u0000\u0000cd\u0005*\u0000\u0000de\u0005/\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0006\u0007\u0000\u0000g\u0010\u0001\u0000\u0000\u0000hj\u0007"+
		"\u0006\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0006\b\u0000\u0000n\u0012\u0001\u0000\u0000\u0000\u000f\u0000"+
		"\u0016\u0019\u001d!$\'+ADIRV`k\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}