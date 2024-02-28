// Generated from C:/Users/Usuario/Documents/UNI/5�A�o/2� Semestre/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.statements.*;
    import ast.types.*;
    import ast.expressions.*;
    import ast.definitions.*;

	import java.util.*;

	import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		T__31=32, T__32=33, T__33=34, T__34=35, INT_CONSTANT=36, REAL_CONSTANT=37, 
		REAL_1=38, REAL_2=39, CHAR_CONSTANT=40, IDENTIFICADOR=41, COMMENT=42, 
		MULTI_COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_definiciones = 1, RULE_var_definition = 2, RULE_vars = 3, 
		RULE_tipo = 4, RULE_func_definition = 5, RULE_tipo_simple = 6, RULE_params = 7, 
		RULE_param = 8, RULE_statement = 9, RULE_statements = 10, RULE_expresion = 11, 
		RULE_expresiones = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definiciones", "var_definition", "vars", "tipo", "func_definition", 
			"tipo_simple", "params", "param", "statement", "statements", "expresion", 
			"expresiones"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'main'", "'('", "')'", "'{'", "'}'", "'var'", "';'", 
			"','", "'['", "']'", "'def'", "'int'", "'char'", "'float32'", "'='", 
			"'write'", "'read'", "'return'", "'while'", "'if'", "'else'", "'-'", 
			"'*'", "'/'", "'%'", "'+'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", 
			"'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT_CONSTANT", "REAL_CONSTANT", "REAL_1", "REAL_2", "CHAR_CONSTANT", 
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
		public Program ast;
		public List<Definition> others = new ArrayList<>();
		public List<Statement> mainBody = new ArrayList<Statement>();;
		public DefinicionesContext definiciones;
		public Token f;
		public Token m;
		public Var_definitionContext var_definition;
		public StatementContext s;
		public TerminalNode EOF() { return getToken(GoJaParser.EOF, 0); }
		public List<DefinicionesContext> definiciones() {
			return getRuleContexts(DefinicionesContext.class);
		}
		public DefinicionesContext definiciones(int i) {
			return getRuleContext(DefinicionesContext.class,i);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__11) {
				{
				{
				setState(26);
				((ProgramContext)_localctx).definiciones = definiciones();
				 _localctx.others.addAll(((ProgramContext)_localctx).definiciones.ast); 
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			((ProgramContext)_localctx).f = match(T__0);
			setState(35);
			((ProgramContext)_localctx).m = match(T__1);
			setState(36);
			match(T__2);
			setState(37);
			match(T__3);
			setState(38);
			match(T__4);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(39);
				((ProgramContext)_localctx).var_definition = var_definition();
				 _localctx.mainBody.addAll(((ProgramContext)_localctx).var_definition.ast); 
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3504705823752L) != 0)) {
				{
				{
				setState(47);
				((ProgramContext)_localctx).s = statement();
				 _localctx.mainBody.addAll((Collection<? extends Statement>) ((ProgramContext)_localctx).s.ast);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__5);
			 _localctx.others.add(new FunctionDefinition(((ProgramContext)_localctx).f.getLine(), ((ProgramContext)_localctx).f.getCharPositionInLine() + 1,
			                    new FunctionType(((ProgramContext)_localctx).f.getLine(), ((ProgramContext)_localctx).f.getCharPositionInLine() + 1,
			                    VoidType.getInstance(), new ArrayList<VarDefinition>()),
			                    (((ProgramContext)_localctx).m!=null?((ProgramContext)_localctx).m.getText():null), _localctx.mainBody
			                ));
			 ((ProgramContext)_localctx).ast =  new Program(1, 1, _localctx.others); 
			setState(58);
			match(EOF);
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
	public static class DefinicionesContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();;
		public Var_definitionContext v;
		public Func_definitionContext f;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Func_definitionContext func_definition() {
			return getRuleContext(Func_definitionContext.class,0);
		}
		public DefinicionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definiciones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitDefiniciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicionesContext definiciones() throws RecognitionException {
		DefinicionesContext _localctx = new DefinicionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definiciones);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				((DefinicionesContext)_localctx).v = var_definition();
				 _localctx.ast.addAll(((DefinicionesContext)_localctx).v.ast); 
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				((DefinicionesContext)_localctx).f = func_definition();
				 _localctx.ast.add(((DefinicionesContext)_localctx).f.ast); 
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
	public static class Var_definitionContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();;
		public Token l;
		public VarsContext vars;
		public TipoContext tipo;
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((Var_definitionContext)_localctx).l = match(T__6);
			setState(69);
			((Var_definitionContext)_localctx).vars = vars();
			setState(70);
			((Var_definitionContext)_localctx).tipo = tipo();
			setState(71);
			match(T__7);
			   for(String v: ((Var_definitionContext)_localctx).vars.ast) {
			                _localctx.ast.add(new VarDefinition(((Var_definitionContext)_localctx).l.getLine(), ((Var_definitionContext)_localctx).l.getCharPositionInLine() + 1, ((Var_definitionContext)_localctx).tipo.ast, v));
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
	public static class VarsContext extends ParserRuleContext {
		public List<String> ast = new ArrayList<>();;
		public Token IDENTIFICADOR;
		public VarsContext vars;
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vars);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				((VarsContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 _localctx.ast.add((((VarsContext)_localctx).IDENTIFICADOR!=null?((VarsContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((VarsContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(77);
				match(T__8);
				setState(78);
				((VarsContext)_localctx).vars = vars();
				 ((VarsContext)_localctx).vars.ast.add((((VarsContext)_localctx).IDENTIFICADOR!=null?((VarsContext)_localctx).IDENTIFICADOR.getText():null)); ((VarsContext)_localctx).ast =  ((VarsContext)_localctx).vars.ast; 
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
	public static class TipoContext extends ParserRuleContext {
		public Type ast;
		public Tipo_simpleContext tipo_simple;
		public Token i;
		public Token INT_CONSTANT;
		public TipoContext tipo;
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(GoJaParser.INT_CONSTANT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((TipoContext)_localctx).tipo_simple = tipo_simple();
				 ((TipoContext)_localctx).ast =  ((TipoContext)_localctx).tipo_simple.ast; 
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((TipoContext)_localctx).i = match(T__9);
				setState(87);
				((TipoContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(88);
				match(T__10);
				setState(89);
				((TipoContext)_localctx).tipo = tipo();
				  ((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).i.getLine(), ((TipoContext)_localctx).i.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((TipoContext)_localctx).INT_CONSTANT!=null?((TipoContext)_localctx).INT_CONSTANT.getText():null)), ((TipoContext)_localctx).tipo.ast); 
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
	public static class Func_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Type t = VoidType.getInstance();
		public List<VarDefinition> lparams = new ArrayList<>();
		public List<Statement> body = new ArrayList<>();;
		public Token d;
		public Token id;
		public ParamsContext p;
		public Tipo_simpleContext tipo_simple;
		public Var_definitionContext v;
		public StatementContext s;
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 10, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((Func_definitionContext)_localctx).d = match(T__11);
			setState(95);
			((Func_definitionContext)_localctx).id = match(IDENTIFICADOR);
			setState(96);
			match(T__2);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(97);
				((Func_definitionContext)_localctx).p = params();
				 _localctx.lparams.addAll(((Func_definitionContext)_localctx).p.ast); 
				}
			}

			setState(102);
			match(T__3);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 57344L) != 0)) {
				{
				setState(103);
				((Func_definitionContext)_localctx).tipo_simple = tipo_simple();
				 ((Func_definitionContext)_localctx).t =  ((Func_definitionContext)_localctx).tipo_simple.ast; 
				}
			}

			setState(108);
			match(T__4);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(109);
				((Func_definitionContext)_localctx).v = var_definition();
				 _localctx.body.addAll(((Func_definitionContext)_localctx).v.ast); 
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3504705823752L) != 0)) {
				{
				{
				setState(117);
				((Func_definitionContext)_localctx).s = statement();
				 _localctx.body.addAll((Collection<? extends Statement>) ((Func_definitionContext)_localctx).s.ast);
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__5);
			 ((Func_definitionContext)_localctx).ast =  new FunctionDefinition(((Func_definitionContext)_localctx).d.getLine(), ((Func_definitionContext)_localctx).d.getCharPositionInLine() + 1,
			                                     new FunctionType(((Func_definitionContext)_localctx).d.getLine(), ((Func_definitionContext)_localctx).d.getCharPositionInLine() + 1,
			                                     _localctx.t, _localctx.lparams),
			                                     (((Func_definitionContext)_localctx).id!=null?((Func_definitionContext)_localctx).id.getText():null), _localctx.body
			                                 );
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
		public Type ast;
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
		enterRule(_localctx, 12, RULE_tipo_simple);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__12);
				 ((Tipo_simpleContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__13);
				 ((Tipo_simpleContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				match(T__14);
				 ((Tipo_simpleContext)_localctx).ast =  FloatType.getInstance(); 
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
	public static class ParamsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();;
		public ParamContext param;
		public ParamsContext p;
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				((ParamsContext)_localctx).param = param();
				 _localctx.ast.add(((ParamsContext)_localctx).param.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((ParamsContext)_localctx).param = param();
				setState(140);
				match(T__8);
				setState(141);
				((ParamsContext)_localctx).p = params();
				 ((ParamsContext)_localctx).p.ast.add(((ParamsContext)_localctx).param.ast); ((ParamsContext)_localctx).ast =  ((ParamsContext)_localctx).p.ast;
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
	public static class ParamContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token d;
		public Token IDENTIFICADOR;
		public Tipo_simpleContext tipo_simple;
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			((ParamContext)_localctx).d = match(T__6);
			setState(147);
			((ParamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(148);
			((ParamContext)_localctx).tipo_simple = tipo_simple();
			 ((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).d.getLine(), ((ParamContext)_localctx).d.getCharPositionInLine() + 1, ((ParamContext)_localctx).tipo_simple.ast, (((ParamContext)_localctx).IDENTIFICADOR!=null?((ParamContext)_localctx).IDENTIFICADOR.getText():null)); 
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
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Expression> fparams = new ArrayList<>();;
		public ExpresionContext exp1;
		public ExpresionContext exp2;
		public Token l;
		public ExpresionesContext expresiones;
		public ExpresionContext expresion;
		public StatementsContext statements;
		public StatementsContext st;
		public StatementsContext sn;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((StatementContext)_localctx).exp1 = expresion(0);
				setState(152);
				match(T__15);
				setState(153);
				((StatementContext)_localctx).exp2 = expresion(0);
				setState(154);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).exp1.ast.getLine(),((StatementContext)_localctx).exp1.ast.getColumn(), ((StatementContext)_localctx).exp1.ast, ((StatementContext)_localctx).exp2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				((StatementContext)_localctx).l = match(T__16);
				setState(158);
				((StatementContext)_localctx).expresiones = expresiones();
				setState(159);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresiones.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				((StatementContext)_localctx).l = match(T__17);
				setState(163);
				((StatementContext)_localctx).expresiones = expresiones();
				setState(164);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresiones.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				((StatementContext)_localctx).l = match(IDENTIFICADOR);
				setState(168);
				match(T__2);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3504701760520L) != 0)) {
					{
					setState(169);
					((StatementContext)_localctx).expresiones = expresiones();
					 _localctx.fparams.addAll(((StatementContext)_localctx).expresiones.ast); 
					}
				}

				setState(174);
				match(T__3);
				 ((StatementContext)_localctx).ast =  new FunctionInvocation(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1,
				                new Variable(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, (((StatementContext)_localctx).l!=null?((StatementContext)_localctx).l.getText():null)), _localctx.fparams); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				((StatementContext)_localctx).l = match(T__18);
				setState(177);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(178);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				((StatementContext)_localctx).l = match(T__19);
				setState(182);
				match(T__2);
				setState(183);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(184);
				match(T__3);
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(185);
					((StatementContext)_localctx).statements = statements();
					}
					break;
				}
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast, ((StatementContext)_localctx).statements.ast); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(190);
				((StatementContext)_localctx).l = match(T__20);
				setState(191);
				match(T__2);
				setState(192);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(193);
				match(T__3);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(194);
					((StatementContext)_localctx).st = statements();
					}
					break;
				}
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(197);
					match(T__21);
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(198);
						((StatementContext)_localctx).sn = statements();
						}
						break;
					}
					}
					break;
				}
				 ((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast, ((StatementContext)_localctx).st.ast, ((StatementContext)_localctx).sn.ast); 
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
	public static class StatementsContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__12:
			case T__13:
			case T__14:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__22:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				((StatementsContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__4);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3504705823752L) != 0)) {
					{
					{
					setState(211);
					((StatementsContext)_localctx).statement = statement();
					 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(T__5);
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
	public static class ExpresionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> fparams = new ArrayList<>();;
		public ExpresionContext exp1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token IDENTIFICADOR;
		public Token l;
		public ExpresionContext expresion;
		public TipoContext tipo;
		public ExpresionesContext expresiones;
		public Token op;
		public ExpresionContext exp2;
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
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(223);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new IntLiteral(((ExpresionContext)_localctx).INT_CONSTANT.getLine(), ((ExpresionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpresionContext)_localctx).INT_CONSTANT!=null?((ExpresionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 2:
				{
				setState(225);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new FloatLiteral(((ExpresionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpresionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpresionContext)_localctx).REAL_CONSTANT!=null?((ExpresionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 3:
				{
				setState(227);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new CharLiteral(((ExpresionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpresionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpresionContext)_localctx).CHAR_CONSTANT!=null?((ExpresionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 4:
				{
				setState(229);
				((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 ((ExpresionContext)_localctx).ast =  new Variable(((ExpresionContext)_localctx).IDENTIFICADOR.getLine(), ((ExpresionContext)_localctx).IDENTIFICADOR.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).IDENTIFICADOR!=null?((ExpresionContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			case 5:
				{
				setState(231);
				((ExpresionContext)_localctx).l = match(T__22);
				setState(232);
				((ExpresionContext)_localctx).expresion = expresion(9);
				 ((ExpresionContext)_localctx).ast =  new UnaryMinus(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 6:
				{
				setState(235);
				((ExpresionContext)_localctx).tipo = tipo();
				setState(236);
				match(T__2);
				setState(237);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(238);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  new Cast(((ExpresionContext)_localctx).tipo.ast.getLine(), ((ExpresionContext)_localctx).tipo.ast.getColumn(), ((ExpresionContext)_localctx).tipo.ast, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 7:
				{
				setState(241);
				match(T__2);
				setState(242);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(243);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  ((ExpresionContext)_localctx).expresion.ast; 
				}
				break;
			case 8:
				{
				setState(246);
				((ExpresionContext)_localctx).l = match(IDENTIFICADOR);
				setState(247);
				match(T__2);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3504701760520L) != 0)) {
					{
					setState(248);
					((ExpresionContext)_localctx).expresiones = expresiones();
					 _localctx.fparams.addAll(((ExpresionContext)_localctx).expresiones.ast); 
					}
				}

				setState(253);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  new FunctionInvocation(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1,
				            new Variable(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).l!=null?((ExpresionContext)_localctx).l.getText():null)), _localctx.fparams); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(257);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(258);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(259);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(9);
						 ((ExpresionContext)_localctx).ast =  new Arithmetic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(262);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(263);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__26) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(264);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(8);
						 ((ExpresionContext)_localctx).ast =  new Arithmetic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(267);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(268);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16911433728L) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(269);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(7);
						 ((ExpresionContext)_localctx).ast =  new Comparasion(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(272);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(273);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(274);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(6);
						 ((ExpresionContext)_localctx).ast =  new Logic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(277);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(278);
						match(T__9);
						setState(279);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(0);
						setState(280);
						match(T__10);
						 ((ExpresionContext)_localctx).ast =  new ArrayAccess(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn() + 1, ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast); 
						}
						break;
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class ExpresionesContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();;
		public ExpresionContext expresion;
		public ExpresionesContext expresiones;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public ExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionesContext expresiones() throws RecognitionException {
		ExpresionesContext _localctx = new ExpresionesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expresiones);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				((ExpresionesContext)_localctx).expresion = expresion(0);
				 _localctx.ast.add(((ExpresionesContext)_localctx).expresion.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				((ExpresionesContext)_localctx).expresion = expresion(0);
				setState(292);
				match(T__8);
				setState(293);
				((ExpresionesContext)_localctx).expresiones = expresiones();
				 ((ExpresionesContext)_localctx).expresiones.ast.add(((ExpresionesContext)_localctx).expresion.ast); ((ExpresionesContext)_localctx).ast =  ((ExpresionesContext)_localctx).expresiones.ast; 
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
		case 11:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u012b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000+\b\u0000"+
		"\n\u0000\f\u0000.\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"3\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"R\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005e\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005k\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005q\b\u0005\n\u0005\f\u0005t\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005y\b\u0005\n\u0005\f\u0005|\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u0087\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0091\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ad\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bb"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00c4"+
		"\b\t\u0001\t\u0001\t\u0003\t\u00c8\b\t\u0003\t\u00ca\b\t\u0001\t\u0001"+
		"\t\u0003\t\u00ce\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00d7\b\n\n\n\f\n\u00da\t\n\u0001\n\u0003\n\u00dd\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00fc"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0100\b\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u011c\b\u000b\n\u000b\f\u000b\u011f\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0129"+
		"\b\f\u0001\f\u0000\u0001\u0016\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u0000\u0004\u0001\u0000\u0018\u001a\u0002\u0000"+
		"\u0017\u0017\u001b\u001b\u0001\u0000\u001c!\u0001\u0000\"#\u0145\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004D\u0001"+
		"\u0000\u0000\u0000\u0006Q\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000"+
		"\u0000\n^\u0001\u0000\u0000\u0000\f\u0086\u0001\u0000\u0000\u0000\u000e"+
		"\u0090\u0001\u0000\u0000\u0000\u0010\u0092\u0001\u0000\u0000\u0000\u0012"+
		"\u00cd\u0001\u0000\u0000\u0000\u0014\u00dc\u0001\u0000\u0000\u0000\u0016"+
		"\u00ff\u0001\u0000\u0000\u0000\u0018\u0128\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0006\u0000\uffff\uffff\u0000"+
		"\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000\u0000!\u001f\u0001\u0000"+
		"\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u0005"+
		"\u0003\u0000\u0000%&\u0005\u0004\u0000\u0000&,\u0005\u0005\u0000\u0000"+
		"\'(\u0003\u0004\u0002\u0000()\u0006\u0000\uffff\uffff\u0000)+\u0001\u0000"+
		"\u0000\u0000*\'\u0001\u0000\u0000\u0000+.\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-4\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000/0\u0003\u0012\t\u000001\u0006\u0000\uffff\uffff"+
		"\u000013\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000036\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000057\u0001"+
		"\u0000\u0000\u000064\u0001\u0000\u0000\u000078\u0005\u0006\u0000\u0000"+
		"89\u0006\u0000\uffff\uffff\u00009:\u0006\u0000\uffff\uffff\u0000:;\u0005"+
		"\u0000\u0000\u0001;\u0001\u0001\u0000\u0000\u0000<=\u0003\u0004\u0002"+
		"\u0000=>\u0006\u0001\uffff\uffff\u0000>C\u0001\u0000\u0000\u0000?@\u0003"+
		"\n\u0005\u0000@A\u0006\u0001\uffff\uffff\u0000AC\u0001\u0000\u0000\u0000"+
		"B<\u0001\u0000\u0000\u0000B?\u0001\u0000\u0000\u0000C\u0003\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0003"+
		"\b\u0004\u0000GH\u0005\b\u0000\u0000HI\u0006\u0002\uffff\uffff\u0000I"+
		"\u0005\u0001\u0000\u0000\u0000JK\u0005)\u0000\u0000KR\u0006\u0003\uffff"+
		"\uffff\u0000LM\u0005)\u0000\u0000MN\u0005\t\u0000\u0000NO\u0003\u0006"+
		"\u0003\u0000OP\u0006\u0003\uffff\uffff\u0000PR\u0001\u0000\u0000\u0000"+
		"QJ\u0001\u0000\u0000\u0000QL\u0001\u0000\u0000\u0000R\u0007\u0001\u0000"+
		"\u0000\u0000ST\u0003\f\u0006\u0000TU\u0006\u0004\uffff\uffff\u0000U]\u0001"+
		"\u0000\u0000\u0000VW\u0005\n\u0000\u0000WX\u0005$\u0000\u0000XY\u0005"+
		"\u000b\u0000\u0000YZ\u0003\b\u0004\u0000Z[\u0006\u0004\uffff\uffff\u0000"+
		"[]\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000"+
		"\u0000]\t\u0001\u0000\u0000\u0000^_\u0005\f\u0000\u0000_`\u0005)\u0000"+
		"\u0000`d\u0005\u0003\u0000\u0000ab\u0003\u000e\u0007\u0000bc\u0006\u0005"+
		"\uffff\uffff\u0000ce\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fj\u0005\u0004\u0000"+
		"\u0000gh\u0003\f\u0006\u0000hi\u0006\u0005\uffff\uffff\u0000ik\u0001\u0000"+
		"\u0000\u0000jg\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lr\u0005\u0005\u0000\u0000mn\u0003\u0004\u0002\u0000"+
		"no\u0006\u0005\uffff\uffff\u0000oq\u0001\u0000\u0000\u0000pm\u0001\u0000"+
		"\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001"+
		"\u0000\u0000\u0000sz\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"uv\u0003\u0012\t\u0000vw\u0006\u0005\uffff\uffff\u0000wy\u0001\u0000\u0000"+
		"\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000\u0000\u0000|z\u0001"+
		"\u0000\u0000\u0000}~\u0005\u0006\u0000\u0000~\u007f\u0006\u0005\uffff"+
		"\uffff\u0000\u007f\u000b\u0001\u0000\u0000\u0000\u0080\u0081\u0005\r\u0000"+
		"\u0000\u0081\u0087\u0006\u0006\uffff\uffff\u0000\u0082\u0083\u0005\u000e"+
		"\u0000\u0000\u0083\u0087\u0006\u0006\uffff\uffff\u0000\u0084\u0085\u0005"+
		"\u000f\u0000\u0000\u0085\u0087\u0006\u0006\uffff\uffff\u0000\u0086\u0080"+
		"\u0001\u0000\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\r\u0001\u0000\u0000\u0000\u0088\u0089\u0003"+
		"\u0010\b\u0000\u0089\u008a\u0006\u0007\uffff\uffff\u0000\u008a\u0091\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0003\u0010\b\u0000\u008c\u008d\u0005\t"+
		"\u0000\u0000\u008d\u008e\u0003\u000e\u0007\u0000\u008e\u008f\u0006\u0007"+
		"\uffff\uffff\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u0088\u0001"+
		"\u0000\u0000\u0000\u0090\u008b\u0001\u0000\u0000\u0000\u0091\u000f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u0094\u0005"+
		")\u0000\u0000\u0094\u0095\u0003\f\u0006\u0000\u0095\u0096\u0006\b\uffff"+
		"\uffff\u0000\u0096\u0011\u0001\u0000\u0000\u0000\u0097\u0098\u0003\u0016"+
		"\u000b\u0000\u0098\u0099\u0005\u0010\u0000\u0000\u0099\u009a\u0003\u0016"+
		"\u000b\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0006\t\uffff"+
		"\uffff\u0000\u009c\u00ce\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0011"+
		"\u0000\u0000\u009e\u009f\u0003\u0018\f\u0000\u009f\u00a0\u0005\b\u0000"+
		"\u0000\u00a0\u00a1\u0006\t\uffff\uffff\u0000\u00a1\u00ce\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0012\u0000\u0000\u00a3\u00a4\u0003\u0018\f\u0000"+
		"\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0006\t\uffff\uffff\u0000"+
		"\u00a6\u00ce\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005)\u0000\u0000\u00a8"+
		"\u00ac\u0005\u0003\u0000\u0000\u00a9\u00aa\u0003\u0018\f\u0000\u00aa\u00ab"+
		"\u0006\t\uffff\uffff\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0004\u0000\u0000\u00af\u00ce"+
		"\u0006\t\uffff\uffff\u0000\u00b0\u00b1\u0005\u0013\u0000\u0000\u00b1\u00b2"+
		"\u0003\u0016\u000b\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b4\u0006"+
		"\t\uffff\uffff\u0000\u00b4\u00ce\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0014\u0000\u0000\u00b6\u00b7\u0005\u0003\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0016\u000b\u0000\u00b8\u00ba\u0005\u0004\u0000\u0000\u00b9\u00bb\u0003"+
		"\u0014\n\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bd\u0006\t\uffff"+
		"\uffff\u0000\u00bd\u00ce\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0015"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0003\u0000\u0000\u00c0\u00c1\u0003\u0016"+
		"\u000b\u0000\u00c1\u00c3\u0005\u0004\u0000\u0000\u00c2\u00c4\u0003\u0014"+
		"\n\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c9\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005\u0016\u0000"+
		"\u0000\u00c6\u00c8\u0003\u0014\n\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000"+
		"\u00c9\u00c5\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0006\t\uffff\uffff\u0000"+
		"\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u0097\u0001\u0000\u0000\u0000"+
		"\u00cd\u009d\u0001\u0000\u0000\u0000\u00cd\u00a2\u0001\u0000\u0000\u0000"+
		"\u00cd\u00a7\u0001\u0000\u0000\u0000\u00cd\u00b0\u0001\u0000\u0000\u0000"+
		"\u00cd\u00b5\u0001\u0000\u0000\u0000\u00cd\u00be\u0001\u0000\u0000\u0000"+
		"\u00ce\u0013\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003\u0012\t\u0000\u00d0"+
		"\u00d1\u0006\n\uffff\uffff\u0000\u00d1\u00dd\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d8\u0005\u0005\u0000\u0000\u00d3\u00d4\u0003\u0012\t\u0000\u00d4\u00d5"+
		"\u0006\n\uffff\uffff\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000\u0000\u00d8\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9\u00db"+
		"\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00dd"+
		"\u0005\u0006\u0000\u0000\u00dc\u00cf\u0001\u0000\u0000\u0000\u00dc\u00d2"+
		"\u0001\u0000\u0000\u0000\u00dd\u0015\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0006\u000b\uffff\uffff\u0000\u00df\u00e0\u0005$\u0000\u0000\u00e0\u0100"+
		"\u0006\u000b\uffff\uffff\u0000\u00e1\u00e2\u0005%\u0000\u0000\u00e2\u0100"+
		"\u0006\u000b\uffff\uffff\u0000\u00e3\u00e4\u0005(\u0000\u0000\u00e4\u0100"+
		"\u0006\u000b\uffff\uffff\u0000\u00e5\u00e6\u0005)\u0000\u0000\u00e6\u0100"+
		"\u0006\u000b\uffff\uffff\u0000\u00e7\u00e8\u0005\u0017\u0000\u0000\u00e8"+
		"\u00e9\u0003\u0016\u000b\t\u00e9\u00ea\u0006\u000b\uffff\uffff\u0000\u00ea"+
		"\u0100\u0001\u0000\u0000\u0000\u00eb\u00ec\u0003\b\u0004\u0000\u00ec\u00ed"+
		"\u0005\u0003\u0000\u0000\u00ed\u00ee\u0003\u0016\u000b\u0000\u00ee\u00ef"+
		"\u0005\u0004\u0000\u0000\u00ef\u00f0\u0006\u000b\uffff\uffff\u0000\u00f0"+
		"\u0100\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0003\u0000\u0000\u00f2"+
		"\u00f3\u0003\u0016\u000b\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4"+
		"\u00f5\u0006\u000b\uffff\uffff\u0000\u00f5\u0100\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0005)\u0000\u0000\u00f7\u00fb\u0005\u0003\u0000\u0000\u00f8"+
		"\u00f9\u0003\u0018\f\u0000\u00f9\u00fa\u0006\u000b\uffff\uffff\u0000\u00fa"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005\u0004\u0000\u0000\u00fe\u0100\u0006\u000b\uffff\uffff\u0000"+
		"\u00ff\u00de\u0001\u0000\u0000\u0000\u00ff\u00e1\u0001\u0000\u0000\u0000"+
		"\u00ff\u00e3\u0001\u0000\u0000\u0000\u00ff\u00e5\u0001\u0000\u0000\u0000"+
		"\u00ff\u00e7\u0001\u0000\u0000\u0000\u00ff\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ff\u00f1\u0001\u0000\u0000\u0000\u00ff\u00f6\u0001\u0000\u0000\u0000"+
		"\u0100\u011d\u0001\u0000\u0000\u0000\u0101\u0102\n\b\u0000\u0000\u0102"+
		"\u0103\u0007\u0000\u0000\u0000\u0103\u0104\u0003\u0016\u000b\t\u0104\u0105"+
		"\u0006\u000b\uffff\uffff\u0000\u0105\u011c\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\n\u0007\u0000\u0000\u0107\u0108\u0007\u0001\u0000\u0000\u0108\u0109"+
		"\u0003\u0016\u000b\b\u0109\u010a\u0006\u000b\uffff\uffff\u0000\u010a\u011c"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\n\u0006\u0000\u0000\u010c\u010d\u0007"+
		"\u0002\u0000\u0000\u010d\u010e\u0003\u0016\u000b\u0007\u010e\u010f\u0006"+
		"\u000b\uffff\uffff\u0000\u010f\u011c\u0001\u0000\u0000\u0000\u0110\u0111"+
		"\n\u0005\u0000\u0000\u0111\u0112\u0007\u0003\u0000\u0000\u0112\u0113\u0003"+
		"\u0016\u000b\u0006\u0113\u0114\u0006\u000b\uffff\uffff\u0000\u0114\u011c"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\n\u0002\u0000\u0000\u0116\u0117\u0005"+
		"\n\u0000\u0000\u0117\u0118\u0003\u0016\u000b\u0000\u0118\u0119\u0005\u000b"+
		"\u0000\u0000\u0119\u011a\u0006\u000b\uffff\uffff\u0000\u011a\u011c\u0001"+
		"\u0000\u0000\u0000\u011b\u0101\u0001\u0000\u0000\u0000\u011b\u0106\u0001"+
		"\u0000\u0000\u0000\u011b\u010b\u0001\u0000\u0000\u0000\u011b\u0110\u0001"+
		"\u0000\u0000\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011c\u011f\u0001"+
		"\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001"+
		"\u0000\u0000\u0000\u011e\u0017\u0001\u0000\u0000\u0000\u011f\u011d\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0003\u0016\u000b\u0000\u0121\u0122\u0006"+
		"\f\uffff\uffff\u0000\u0122\u0129\u0001\u0000\u0000\u0000\u0123\u0124\u0003"+
		"\u0016\u000b\u0000\u0124\u0125\u0005\t\u0000\u0000\u0125\u0126\u0003\u0018"+
		"\f\u0000\u0126\u0127\u0006\f\uffff\uffff\u0000\u0127\u0129\u0001\u0000"+
		"\u0000\u0000\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0123\u0001\u0000"+
		"\u0000\u0000\u0129\u0019\u0001\u0000\u0000\u0000\u0019\u001f,4BQ\\djr"+
		"z\u0086\u0090\u00ac\u00ba\u00c3\u00c7\u00c9\u00cd\u00d8\u00dc\u00fb\u00ff"+
		"\u011b\u011d\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}