// Generated from C:/Users/UO275780/Desktop/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
package parser;

    // Para que reconzca las clases que queremos utilizar
    import ast.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.expressions.*;
    import ast.definitions.*;
    import java.util.List;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GoJaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, REAL_1=40, REAL_2=41, CHAR_CONSTANT=42, IDENTIFICADOR=43, 
		COMMENT=44, MULTI_COMMENT=45, WS=46;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_tipo = 2, RULE_tipo_compuesto = 3, 
		RULE_tipo_simple = 4, RULE_definicion = 5, RULE_def_variable = 6, RULE_struct_definition = 7, 
		RULE_func_definition = 8, RULE_func_parameters = 9, RULE_expresion = 10, 
		RULE_sentencia = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "tipo", "tipo_compuesto", "tipo_simple", "definicion", 
			"def_variable", "struct_definition", "func_definition", "func_parameters", 
			"expresion", "sentencia"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'int'", "'char'", "'float32'", "'var'", "','", "';'", 
			"'struct {'", "'};'", "'func'", "'('", "')'", "'{'", "'}'", "'-'", "'!'", 
			"'*'", "'/'", "'%'", "'+'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", 
			"'&&'", "'||'", "'.'", "'='", "'write'", "'read'", "'return'", "'while ('", 
			"'if'", "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT_CONSTANT", "REAL_CONSTANT", "REAL_1", "REAL_2", "CHAR_CONSTANT", 
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

	@Override
	public String getGrammarFileName() { return "GoJa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GoJaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ASTNode ast;
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5 || _la==T__10) {
				{
				{
				setState(24);
				definition();
				}
				}
				setState(29);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public Def_variableContext def_variable() {
			return getRuleContext(Def_variableContext.class,0);
		}
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				def_variable();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				func_definition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public Tipo_compuestoContext tipo_compuesto() {
			return getRuleContext(Tipo_compuestoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				tipo_simple();
				}
				break;
			case T__0:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				tipo_compuesto();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_compuestoContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(GoJaParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(GoJaParser.INT_CONSTANT, i);
		}
		public Tipo_compuestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_compuesto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitTipo_compuesto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_compuestoContext tipo_compuesto() throws RecognitionException {
		Tipo_compuestoContext _localctx = new Tipo_compuestoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo_compuesto);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(IDENTIFICADOR);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(39);
					match(T__0);
					setState(40);
					match(INT_CONSTANT);
					setState(41);
					match(T__1);
					}
					}
					setState(44); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(46);
				tipo_simple();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_simpleContext extends ParserRuleContext {
		public Tipo_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_simple; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitTipo_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_simpleContext tipo_simple() throws RecognitionException {
		Tipo_simpleContext _localctx = new Tipo_simpleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinicionContext extends ParserRuleContext {
		public Def_variableContext def_variable() {
			return getRuleContext(Def_variableContext.class,0);
		}
		public Struct_definitionContext struct_definition() {
			return getRuleContext(Struct_definitionContext.class,0);
		}
		public DefinicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitDefinicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionContext definicion() throws RecognitionException {
		DefinicionContext _localctx = new DefinicionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definicion);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				def_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				struct_definition();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Def_variableContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(GoJaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GoJaParser.IDENTIFICADOR, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Def_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_variable; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitDef_variable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Def_variableContext def_variable() throws RecognitionException {
		Def_variableContext _localctx = new Def_variableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_def_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			match(IDENTIFICADOR);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(57);
					match(T__6);
					setState(58);
					match(IDENTIFICADOR);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(64);
			tipo();
			setState(65);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Struct_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public List<Def_variableContext> def_variable() {
			return getRuleContexts(Def_variableContext.class);
		}
		public Def_variableContext def_variable(int i) {
			return getRuleContext(Def_variableContext.class,i);
		}
		public Struct_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitStruct_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_definitionContext struct_definition() throws RecognitionException {
		Struct_definitionContext _localctx = new Struct_definitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_struct_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(IDENTIFICADOR);
			setState(69);
			match(T__8);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(70);
				def_variable();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(76);
			match(T__9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_definitionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public List<Func_parametersContext> func_parameters() {
			return getRuleContexts(Func_parametersContext.class);
		}
		public Func_parametersContext func_parameters(int i) {
			return getRuleContext(Func_parametersContext.class,i);
		}
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public List<DefinicionContext> definicion() {
			return getRuleContexts(DefinicionContext.class);
		}
		public DefinicionContext definicion(int i) {
			return getRuleContext(DefinicionContext.class,i);
		}
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public Func_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitFunc_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_definitionContext func_definition() throws RecognitionException {
		Func_definitionContext _localctx = new Func_definitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__10);
			setState(79);
			match(IDENTIFICADOR);
			setState(80);
			match(T__11);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(81);
				func_parameters();
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			match(T__12);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 56L) != 0)) {
				{
				setState(88);
				tipo_simple();
				}
			}

			setState(91);
			match(T__13);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(92);
				definicion();
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14151917441082L) != 0)) {
				{
				{
				setState(98);
				sentencia();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__14);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Func_parametersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(GoJaParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(GoJaParser.IDENTIFICADOR, i);
		}
		public List<Tipo_simpleContext> tipo_simple() {
			return getRuleContexts(Tipo_simpleContext.class);
		}
		public Tipo_simpleContext tipo_simple(int i) {
			return getRuleContext(Tipo_simpleContext.class,i);
		}
		public Func_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitFunc_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_parametersContext func_parameters() throws RecognitionException {
		Func_parametersContext _localctx = new Func_parametersContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_func_parameters);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(T__5);
				setState(107);
				match(IDENTIFICADOR);
				setState(108);
				tipo_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__5);
				setState(110);
				match(IDENTIFICADOR);
				setState(111);
				tipo_simple();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(112);
					match(T__6);
					setState(113);
					match(T__5);
					setState(114);
					match(IDENTIFICADOR);
					setState(115);
					tipo_simple();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> lista = new ArrayList<>();
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token IDENTIFICADOR;
		public TerminalNode INT_CONSTANT() { return getToken(GoJaParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GoJaParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GoJaParser.CHAR_CONSTANT, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(124);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new IntLiteral(((ExpresionContext)_localctx).INT_CONSTANT.getLine(), ((ExpresionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpresionContext)_localctx).INT_CONSTANT!=null?((ExpresionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 2:
				{
				setState(126);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new FloatLiteral(((ExpresionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpresionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpresionContext)_localctx).REAL_CONSTANT!=null?((ExpresionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(128);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new CharLiteral(((ExpresionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpresionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpresionContext)_localctx).CHAR_CONSTANT!=null?((ExpresionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(130);
				((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 ((ExpresionContext)_localctx).ast =  new Variable(((ExpresionContext)_localctx).IDENTIFICADOR.getLine(), ((ExpresionContext)_localctx).IDENTIFICADOR.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).IDENTIFICADOR!=null?((ExpresionContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			case 5:
				{
				setState(132);
				match(T__15);
				setState(133);
				expresion(11);
				}
				break;
			case 6:
				{
				setState(134);
				match(T__16);
				setState(135);
				expresion(10);
				}
				break;
			case 7:
				{
				setState(136);
				((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(137);
				match(T__11);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14018773454906L) != 0)) {
					{
					setState(138);
					expresion(0);
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(139);
						match(T__6);
						setState(140);
						expresion(0);
						}
						}
						setState(145);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(148);
				match(T__12);
				}
				break;
			case 8:
				{
				setState(149);
				tipo();
				setState(150);
				match(T__11);
				setState(151);
				expresion(0);
				setState(152);
				match(T__12);
				}
				break;
			case 9:
				{
				setState(154);
				match(T__11);
				setState(155);
				expresion(0);
				setState(156);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(160);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(161);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						expresion(10);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(163);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(164);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__20) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(165);
						expresion(9);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(166);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(167);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(168);
						expresion(8);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(169);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(170);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(171);
						expresion(7);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(172);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(173);
						match(T__0);
						setState(174);
						expresion(0);
						setState(175);
						match(T__1);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(177);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(178);
						match(T__29);
						setState(179);
						((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitSentencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentencia);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				expresion(0);
				setState(186);
				match(T__30);
				setState(187);
				expresion(0);
				setState(188);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__31);
				setState(191);
				expresion(0);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(192);
					match(T__6);
					setState(193);
					expresion(0);
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				match(T__32);
				setState(202);
				expresion(0);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(203);
					match(T__6);
					setState(204);
					expresion(0);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(IDENTIFICADOR);
				setState(213);
				match(T__11);
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14018773454906L) != 0)) {
					{
					setState(214);
					expresion(0);
					setState(219);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(215);
						match(T__6);
						setState(216);
						expresion(0);
						}
						}
						setState(221);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(224);
				match(T__12);
				setState(225);
				match(T__7);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
				match(T__33);
				setState(227);
				expresion(0);
				setState(228);
				match(T__7);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				match(T__34);
				setState(231);
				expresion(0);
				setState(232);
				match(T__12);
				setState(242);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case T__3:
				case T__4:
				case T__11:
				case T__15:
				case T__16:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case IDENTIFICADOR:
					{
					setState(233);
					sentencia();
					}
					break;
				case T__13:
					{
					setState(234);
					match(T__13);
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14151917441082L) != 0)) {
						{
						{
						setState(235);
						sentencia();
						}
						}
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(241);
					match(T__14);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				match(T__35);
				setState(245);
				match(T__11);
				setState(246);
				expresion(0);
				setState(247);
				match(T__12);
				setState(257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__2:
				case T__3:
				case T__4:
				case T__11:
				case T__15:
				case T__16:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__35:
				case INT_CONSTANT:
				case REAL_CONSTANT:
				case CHAR_CONSTANT:
				case IDENTIFICADOR:
					{
					setState(248);
					sentencia();
					}
					break;
				case T__13:
					{
					setState(249);
					match(T__13);
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14151917441082L) != 0)) {
						{
						{
						setState(250);
						sentencia();
						}
						}
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(256);
					match(T__14);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(259);
					match(T__36);
					setState(269);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__0:
					case T__2:
					case T__3:
					case T__4:
					case T__11:
					case T__15:
					case T__16:
					case T__31:
					case T__32:
					case T__33:
					case T__34:
					case T__35:
					case INT_CONSTANT:
					case REAL_CONSTANT:
					case CHAR_CONSTANT:
					case IDENTIFICADOR:
						{
						setState(260);
						sentencia();
						}
						break;
					case T__13:
						{
						setState(261);
						match(T__13);
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14151917441082L) != 0)) {
							{
							{
							setState(262);
							sentencia();
							}
							}
							setState(267);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(268);
						match(T__14);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0114\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001!\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"%\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003"+
		"+\b\u0003\u000b\u0003\f\u0003,\u0001\u0003\u0003\u00030\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u00056\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006<\b\u0006\n\u0006"+
		"\f\u0006?\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007H\b\u0007\n\u0007\f\u0007K\t"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b"+
		"S\b\b\n\b\f\bV\t\b\u0001\b\u0001\b\u0003\bZ\b\b\u0001\b\u0001\b\u0005"+
		"\b^\b\b\n\b\f\ba\t\b\u0001\b\u0005\bd\b\b\n\b\f\bg\t\b\u0001\b\u0001\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\tu\b\t\n\t\f\tx\t\t\u0003\tz\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u008e\b\n\n"+
		"\n\f\n\u0091\t\n\u0003\n\u0093\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u009f\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00b5\b\n\n\n\f\n\u00b8\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u00c3\b\u000b\n\u000b\f\u000b\u00c6\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ce"+
		"\b\u000b\n\u000b\f\u000b\u00d1\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00da\b\u000b"+
		"\n\u000b\f\u000b\u00dd\t\u000b\u0003\u000b\u00df\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ed"+
		"\b\u000b\n\u000b\f\u000b\u00f0\t\u000b\u0001\u000b\u0003\u000b\u00f3\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u00fc\b\u000b\n\u000b\f\u000b\u00ff\t\u000b"+
		"\u0001\u000b\u0003\u000b\u0102\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0108\b\u000b\n\u000b\f\u000b\u010b\t\u000b\u0001"+
		"\u000b\u0003\u000b\u010e\b\u000b\u0003\u000b\u0110\b\u000b\u0003\u000b"+
		"\u0112\b\u000b\u0001\u000b\u0001=\u0001\u0014\f\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0005\u0001\u0000\u0003\u0005"+
		"\u0001\u0000\u0012\u0014\u0002\u0000\u0010\u0010\u0015\u0015\u0001\u0000"+
		"\u0016\u001b\u0001\u0000\u001c\u001d\u0136\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0002 \u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006"+
		"/\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n5\u0001\u0000\u0000"+
		"\u0000\f7\u0001\u0000\u0000\u0000\u000eC\u0001\u0000\u0000\u0000\u0010"+
		"N\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014\u009e\u0001"+
		"\u0000\u0000\u0000\u0016\u0111\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e!\u0003\f\u0006\u0000\u001f!\u0003\u0010\b\u0000"+
		" \u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!\u0003"+
		"\u0001\u0000\u0000\u0000\"%\u0003\b\u0004\u0000#%\u0003\u0006\u0003\u0000"+
		"$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0005\u0001\u0000"+
		"\u0000\u0000&0\u0005+\u0000\u0000\'(\u0005\u0001\u0000\u0000()\u0005&"+
		"\u0000\u0000)+\u0005\u0002\u0000\u0000*\'\u0001\u0000\u0000\u0000+,\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000.0\u0003\b\u0004\u0000/&\u0001\u0000\u0000\u0000"+
		"/*\u0001\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u000012\u0007\u0000"+
		"\u0000\u00002\t\u0001\u0000\u0000\u000036\u0003\f\u0006\u000046\u0003"+
		"\u000e\u0007\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"6\u000b\u0001\u0000\u0000\u000078\u0005\u0006\u0000\u00008=\u0005+\u0000"+
		"\u00009:\u0005\u0007\u0000\u0000:<\u0005+\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000=;\u0001\u0000"+
		"\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0003"+
		"\u0004\u0002\u0000AB\u0005\b\u0000\u0000B\r\u0001\u0000\u0000\u0000CD"+
		"\u0005\u0006\u0000\u0000DE\u0005+\u0000\u0000EI\u0005\t\u0000\u0000FH"+
		"\u0003\f\u0006\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JL\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000LM\u0005\n\u0000\u0000M\u000f\u0001\u0000"+
		"\u0000\u0000NO\u0005\u000b\u0000\u0000OP\u0005+\u0000\u0000PT\u0005\f"+
		"\u0000\u0000QS\u0003\u0012\t\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WY\u0005\r\u0000\u0000XZ\u0003"+
		"\b\u0004\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[_\u0005\u000e\u0000\u0000\\^\u0003\n\u0005\u0000]\\"+
		"\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000"+
		"\u0000_`\u0001\u0000\u0000\u0000`e\u0001\u0000\u0000\u0000a_\u0001\u0000"+
		"\u0000\u0000bd\u0003\u0016\u000b\u0000cb\u0001\u0000\u0000\u0000dg\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\u000f\u0000"+
		"\u0000i\u0011\u0001\u0000\u0000\u0000jk\u0005\u0006\u0000\u0000kl\u0005"+
		"+\u0000\u0000lz\u0003\b\u0004\u0000mn\u0005\u0006\u0000\u0000no\u0005"+
		"+\u0000\u0000ov\u0003\b\u0004\u0000pq\u0005\u0007\u0000\u0000qr\u0005"+
		"\u0006\u0000\u0000rs\u0005+\u0000\u0000su\u0003\b\u0004\u0000tp\u0001"+
		"\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000yj\u0001\u0000\u0000\u0000ym\u0001\u0000\u0000\u0000z\u0013\u0001"+
		"\u0000\u0000\u0000{|\u0006\n\uffff\uffff\u0000|}\u0005&\u0000\u0000}\u009f"+
		"\u0006\n\uffff\uffff\u0000~\u007f\u0005\'\u0000\u0000\u007f\u009f\u0006"+
		"\n\uffff\uffff\u0000\u0080\u0081\u0005*\u0000\u0000\u0081\u009f\u0006"+
		"\n\uffff\uffff\u0000\u0082\u0083\u0005+\u0000\u0000\u0083\u009f\u0006"+
		"\n\uffff\uffff\u0000\u0084\u0085\u0005\u0010\u0000\u0000\u0085\u009f\u0003"+
		"\u0014\n\u000b\u0086\u0087\u0005\u0011\u0000\u0000\u0087\u009f\u0003\u0014"+
		"\n\n\u0088\u0089\u0005+\u0000\u0000\u0089\u0092\u0005\f\u0000\u0000\u008a"+
		"\u008f\u0003\u0014\n\u0000\u008b\u008c\u0005\u0007\u0000\u0000\u008c\u008e"+
		"\u0003\u0014\n\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u008a\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u009f\u0005"+
		"\r\u0000\u0000\u0095\u0096\u0003\u0004\u0002\u0000\u0096\u0097\u0005\f"+
		"\u0000\u0000\u0097\u0098\u0003\u0014\n\u0000\u0098\u0099\u0005\r\u0000"+
		"\u0000\u0099\u009f\u0001\u0000\u0000\u0000\u009a\u009b\u0005\f\u0000\u0000"+
		"\u009b\u009c\u0003\u0014\n\u0000\u009c\u009d\u0005\r\u0000\u0000\u009d"+
		"\u009f\u0001\u0000\u0000\u0000\u009e{\u0001\u0000\u0000\u0000\u009e~\u0001"+
		"\u0000\u0000\u0000\u009e\u0080\u0001\u0000\u0000\u0000\u009e\u0082\u0001"+
		"\u0000\u0000\u0000\u009e\u0084\u0001\u0000\u0000\u0000\u009e\u0086\u0001"+
		"\u0000\u0000\u0000\u009e\u0088\u0001\u0000\u0000\u0000\u009e\u0095\u0001"+
		"\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000\u009f\u00b6\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\n\t\u0000\u0000\u00a1\u00a2\u0007\u0001"+
		"\u0000\u0000\u00a2\u00b5\u0003\u0014\n\n\u00a3\u00a4\n\b\u0000\u0000\u00a4"+
		"\u00a5\u0007\u0002\u0000\u0000\u00a5\u00b5\u0003\u0014\n\t\u00a6\u00a7"+
		"\n\u0007\u0000\u0000\u00a7\u00a8\u0007\u0003\u0000\u0000\u00a8\u00b5\u0003"+
		"\u0014\n\b\u00a9\u00aa\n\u0006\u0000\u0000\u00aa\u00ab\u0007\u0004\u0000"+
		"\u0000\u00ab\u00b5\u0003\u0014\n\u0007\u00ac\u00ad\n\u0002\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0001\u0000\u0000\u00ae\u00af\u0003\u0014\n\u0000\u00af"+
		"\u00b0\u0005\u0002\u0000\u0000\u00b0\u00b5\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\n\u0001\u0000\u0000\u00b2\u00b3\u0005\u001e\u0000\u0000\u00b3\u00b5"+
		"\u0005+\u0000\u0000\u00b4\u00a0\u0001\u0000\u0000\u0000\u00b4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00b4\u00a6\u0001\u0000\u0000\u0000\u00b4\u00a9\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ac\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u0015\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0003"+
		"\u0014\n\u0000\u00ba\u00bb\u0005\u001f\u0000\u0000\u00bb\u00bc\u0003\u0014"+
		"\n\u0000\u00bc\u00bd\u0005\b\u0000\u0000\u00bd\u0112\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005 \u0000\u0000\u00bf\u00c4\u0003\u0014\n\u0000"+
		"\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u00c3\u0003\u0014\n\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0005\b\u0000\u0000\u00c8\u0112\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005!\u0000\u0000\u00ca\u00cf\u0003\u0014\n\u0000\u00cb\u00cc\u0005"+
		"\u0007\u0000\u0000\u00cc\u00ce\u0003\u0014\n\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\b\u0000"+
		"\u0000\u00d3\u0112\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005+\u0000\u0000"+
		"\u00d5\u00de\u0005\f\u0000\u0000\u00d6\u00db\u0003\u0014\n\u0000\u00d7"+
		"\u00d8\u0005\u0007\u0000\u0000\u00d8\u00da\u0003\u0014\n\u0000\u00d9\u00d7"+
		"\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00df"+
		"\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00d6"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\r\u0000\u0000\u00e1\u0112\u0005"+
		"\b\u0000\u0000\u00e2\u00e3\u0005\"\u0000\u0000\u00e3\u00e4\u0003\u0014"+
		"\n\u0000\u00e4\u00e5\u0005\b\u0000\u0000\u00e5\u0112\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0005#\u0000\u0000\u00e7\u00e8\u0003\u0014\n\u0000"+
		"\u00e8\u00f2\u0005\r\u0000\u0000\u00e9\u00f3\u0003\u0016\u000b\u0000\u00ea"+
		"\u00ee\u0005\u000e\u0000\u0000\u00eb\u00ed\u0003\u0016\u000b\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f3\u0005\u000f\u0000\u0000\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2"+
		"\u00ea\u0001\u0000\u0000\u0000\u00f3\u0112\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005$\u0000\u0000\u00f5\u00f6\u0005\f\u0000\u0000\u00f6\u00f7"+
		"\u0003\u0014\n\u0000\u00f7\u0101\u0005\r\u0000\u0000\u00f8\u0102\u0003"+
		"\u0016\u000b\u0000\u00f9\u00fd\u0005\u000e\u0000\u0000\u00fa\u00fc\u0003"+
		"\u0016\u000b\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0005\u000f\u0000\u0000\u0101\u00f8\u0001"+
		"\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0102\u010f\u0001"+
		"\u0000\u0000\u0000\u0103\u010d\u0005%\u0000\u0000\u0104\u010e\u0003\u0016"+
		"\u000b\u0000\u0105\u0109\u0005\u000e\u0000\u0000\u0106\u0108\u0003\u0016"+
		"\u000b\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000"+
		"\u0000\u0000\u010a\u010c\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0005\u000f\u0000\u0000\u010d\u0104\u0001\u0000"+
		"\u0000\u0000\u010d\u0105\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000"+
		"\u0000\u0000\u010f\u0103\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u00b9\u0001\u0000"+
		"\u0000\u0000\u0111\u00be\u0001\u0000\u0000\u0000\u0111\u00c9\u0001\u0000"+
		"\u0000\u0000\u0111\u00d4\u0001\u0000\u0000\u0000\u0111\u00e2\u0001\u0000"+
		"\u0000\u0000\u0111\u00e6\u0001\u0000\u0000\u0000\u0111\u00f4\u0001\u0000"+
		"\u0000\u0000\u0112\u0017\u0001\u0000\u0000\u0000\u001f\u001b $,/5=ITY"+
		"_evy\u008f\u0092\u009e\u00b4\u00b6\u00c4\u00cf\u00db\u00de\u00ee\u00f2"+
		"\u00fd\u0101\u0109\u010d\u010f\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}