// Generated from C:/Users/Usuario/Documents/UNI/5ºAño/2º Semestre/DLP/dlp/src/parser/GoJa.g4 by ANTLR 4.13.1
package parser;

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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, INT_CONSTANT=43, REAL_CONSTANT=44, 
		REAL_1=45, REAL_2=46, CHAR_CONSTANT=47, IDENTIFICADOR=48, COMMENT=49, 
		MULTI_COMMENT=50, WS=51;
	public static final int
		RULE_program = 0, RULE_definiciones = 1, RULE_var_definition = 2, RULE_func_definition = 3, 
		RULE_statement = 4, RULE_switch_statements = 5, RULE_statements = 6, RULE_expresion = 7, 
		RULE_expresiones = 8, RULE_params = 9, RULE_param = 10, RULE_tipo = 11, 
		RULE_campos = 12, RULE_tipo_simple = 13, RULE_vars = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definiciones", "var_definition", "func_definition", "statement", 
			"switch_statements", "statements", "expresion", "expresiones", "params", 
			"param", "tipo", "campos", "tipo_simple", "vars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'main'", "'('", "')'", "'{'", "'}'", "'var'", "';'", 
			"'='", "'write'", "'read'", "'return'", "'while'", "'if'", "'else'", 
			"'switch'", "'default'", "':'", "'break'", "'case'", "'.'", "'['", "']'", 
			"'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'<'", "'>'", "'<='", "'>='", 
			"'!='", "'=='", "'&&'", "'||'", "','", "'struct'", "'int'", "'char'", 
			"'float32'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "INT_CONSTANT", "REAL_CONSTANT", 
			"REAL_1", "REAL_2", "CHAR_CONSTANT", "IDENTIFICADOR", "COMMENT", "MULTI_COMMENT", 
			"WS"
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
		public List<Definition> defs = new ArrayList<>();
		public List<Statement> cuerpo = new ArrayList<>();;
		public DefinicionesContext d;
		public Token l;
		public Token m;
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public TerminalNode EOF() { return getToken(GoJaParser.EOF, 0); }
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
		public List<DefinicionesContext> definiciones() {
			return getRuleContexts(DefinicionesContext.class);
		}
		public DefinicionesContext definiciones(int i) {
			return getRuleContext(DefinicionesContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).d = definiciones();
					 _localctx.defs.addAll(((ProgramContext)_localctx).d.ast); 
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).l = match(T__0);
			setState(39);
			((ProgramContext)_localctx).m = match(T__1);
			setState(40);
			match(T__2);
			setState(41);
			match(T__3);
			setState(42);
			match(T__4);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(43);
				((ProgramContext)_localctx).var_definition = var_definition();
				 _localctx.cuerpo.addAll(((ProgramContext)_localctx).var_definition.ast) ;
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456297375955976L) != 0)) {
				{
				{
				setState(51);
				((ProgramContext)_localctx).statement = statement();
				 _localctx.cuerpo.add(((ProgramContext)_localctx).statement.ast) ;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			match(T__5);
			 _localctx.defs.add(
			            new FunctionDefinition(((ProgramContext)_localctx).l.getLine(), ((ProgramContext)_localctx).l.getCharPositionInLine() + 1,
			                            new FunctionType(((ProgramContext)_localctx).l.getLine(), ((ProgramContext)_localctx).l.getCharPositionInLine() + 1, VoidType.getInstance(), new ArrayList<>())
			                            , (((ProgramContext)_localctx).m!=null?((ProgramContext)_localctx).m.getText():null), _localctx.cuerpo)
			        );
			setState(61);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(1, 1, _localctx.defs); 
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				((DefinicionesContext)_localctx).v = var_definition();
				 _localctx.ast.addAll(((DefinicionesContext)_localctx).v.ast); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
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
		public List<String> cDefs = new ArrayList<>();;
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
			setState(72);
			((Var_definitionContext)_localctx).l = match(T__6);
			setState(73);
			((Var_definitionContext)_localctx).vars = vars();
			setState(74);
			((Var_definitionContext)_localctx).tipo = tipo();
			setState(75);
			match(T__7);

			            for (String id: ((Var_definitionContext)_localctx).vars.ast) {
			                if(_localctx.cDefs.contains(id)){
			                    ErrorType t = new ErrorType("Variable " + id + " ya definida", ((Var_definitionContext)_localctx).l.getLine(), ((Var_definitionContext)_localctx).l.getCharPositionInLine() + 1);
			                } else {
			                    _localctx.ast.add(new VarDefinition(((Var_definitionContext)_localctx).l.getLine(), ((Var_definitionContext)_localctx).l.getCharPositionInLine() + 1, ((Var_definitionContext)_localctx).tipo.ast, id));
			                }
			                _localctx.cDefs.add(id);

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
	public static class Func_definitionContext extends ParserRuleContext {
		public FunctionDefinition ast;
		public Type t = VoidType.getInstance();
		public List<VarDefinition> fparams = new ArrayList<>();
		public List<Statement> cuerpo = new ArrayList<>();;
		public Token l;
		public Token IDENTIFICADOR;
		public ParamsContext params;
		public Tipo_simpleContext tipo_simple;
		public Var_definitionContext var_definition;
		public StatementContext statement;
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
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
		enterRule(_localctx, 6, RULE_func_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			((Func_definitionContext)_localctx).l = match(T__0);
			setState(79);
			((Func_definitionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(80);
			match(T__2);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(81);
				((Func_definitionContext)_localctx).params = params();
				 _localctx.fparams.addAll(((Func_definitionContext)_localctx).params.ast); 
				}
			}

			setState(86);
			match(T__3);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7696581394432L) != 0)) {
				{
				setState(87);
				((Func_definitionContext)_localctx).tipo_simple = tipo_simple();
				 ((Func_definitionContext)_localctx).t =  ((Func_definitionContext)_localctx).tipo_simple.ast; 
				}
			}

			setState(92);
			match(T__4);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(93);
				((Func_definitionContext)_localctx).var_definition = var_definition();
				 _localctx.cuerpo.addAll(((Func_definitionContext)_localctx).var_definition.ast) ;
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456297375955976L) != 0)) {
				{
				{
				setState(101);
				((Func_definitionContext)_localctx).statement = statement();
				 _localctx.cuerpo.add(((Func_definitionContext)_localctx).statement.ast) ;
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(T__5);
			 ((Func_definitionContext)_localctx).ast =  new FunctionDefinition(((Func_definitionContext)_localctx).l.getLine(), ((Func_definitionContext)_localctx).l.getCharPositionInLine() + 1,
			                new FunctionType(((Func_definitionContext)_localctx).l.getLine(), ((Func_definitionContext)_localctx).l.getCharPositionInLine() + 1, _localctx.t, _localctx.fparams)
			                , (((Func_definitionContext)_localctx).IDENTIFICADOR!=null?((Func_definitionContext)_localctx).IDENTIFICADOR.getText():null), _localctx.cuerpo);
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
		public List<Expression> fparams = new ArrayList<>();
		public List<Statement> elseBody = new ArrayList<>();;
		public ExpresionContext exp1;
		public ExpresionContext exp2;
		public Token l;
		public ExpresionesContext expresiones;
		public ExpresionContext expresion;
		public StatementsContext statements;
		public StatementsContext tBody;
		public StatementsContext fBody;
		public ExpresionContext cond;
		public Switch_statementsContext cases;
		public StatementsContext def;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public Switch_statementsContext switch_statements() {
			return getRuleContext(Switch_statementsContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				((StatementContext)_localctx).exp1 = expresion(0);
				setState(113);
				match(T__8);
				setState(114);
				((StatementContext)_localctx).exp2 = expresion(0);
				setState(115);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Assignment(((StatementContext)_localctx).exp1.ast.getLine(),((StatementContext)_localctx).exp1.ast.getColumn(), ((StatementContext)_localctx).exp1.ast, ((StatementContext)_localctx).exp2.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((StatementContext)_localctx).l = match(T__9);
				setState(119);
				((StatementContext)_localctx).expresiones = expresiones();
				setState(120);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresiones.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				((StatementContext)_localctx).l = match(T__10);
				setState(124);
				((StatementContext)_localctx).expresiones = expresiones();
				setState(125);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresiones.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				((StatementContext)_localctx).l = match(T__11);
				setState(129);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(130);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				((StatementContext)_localctx).l = match(T__12);
				setState(134);
				match(T__2);
				setState(135);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(136);
				match(T__3);
				setState(137);
				((StatementContext)_localctx).statements = statements();
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast, ((StatementContext)_localctx).statements.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(140);
				((StatementContext)_localctx).l = match(T__13);
				setState(141);
				match(T__2);
				setState(142);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(143);
				match(T__3);
				setState(144);
				((StatementContext)_localctx).tBody = statements();
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(145);
					match(T__14);
					{
					setState(146);
					((StatementContext)_localctx).fBody = statements();
					 _localctx.elseBody.addAll(((StatementContext)_localctx).fBody.ast); 
					}
					}
					break;
				}
				 ((StatementContext)_localctx).ast =  new IfElse(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast, ((StatementContext)_localctx).tBody.ast, _localctx.elseBody); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(153);
				((StatementContext)_localctx).l = match(T__15);
				setState(154);
				match(T__2);
				setState(155);
				((StatementContext)_localctx).cond = expresion(0);
				setState(156);
				match(T__3);
				setState(157);
				match(T__4);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(158);
					((StatementContext)_localctx).cases = switch_statements();
					}
				}

				setState(161);
				match(T__16);
				setState(162);
				match(T__17);
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456297375956008L) != 0)) {
					{
					{
					setState(163);
					((StatementContext)_localctx).def = statements();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(169);
				match(T__18);
				setState(170);
				match(T__7);
				setState(171);
				match(T__5);
				((StatementContext)_localctx).ast =  new Switch(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).cond.ast, ((StatementContext)_localctx).cases.ast, ((StatementContext)_localctx).def.ast); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(174);
				((StatementContext)_localctx).l = match(IDENTIFICADOR);
				setState(175);
				match(T__2);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456297375858696L) != 0)) {
					{
					setState(176);
					((StatementContext)_localctx).expresiones = expresiones();
					 _localctx.fparams.addAll(((StatementContext)_localctx).expresiones.ast); 
					}
				}

				setState(181);
				match(T__3);
				setState(182);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new FunctionInvocation(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1,
				                     new Variable(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, (((StatementContext)_localctx).l!=null?((StatementContext)_localctx).l.getText():null)), _localctx.fparams);
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
	public static class Switch_statementsContext extends ParserRuleContext {
		public Map<Expression, List<Statement>> ast = new HashMap<>();
		public ExpresionContext exp;
		public StatementsContext stmts;
		public Switch_statementsContext switch_stmts;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Switch_statementsContext switch_statements() {
			return getRuleContext(Switch_statementsContext.class,0);
		}
		public Switch_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitSwitch_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementsContext switch_statements() throws RecognitionException {
		Switch_statementsContext _localctx = new Switch_statementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_switch_statements);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(T__19);
				setState(187);
				((Switch_statementsContext)_localctx).exp = expresion(0);
				setState(188);
				match(T__17);
				setState(189);
				((Switch_statementsContext)_localctx).stmts = statements();
				 _localctx.ast.put(((Switch_statementsContext)_localctx).exp.ast, ((Switch_statementsContext)_localctx).stmts.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__19);
				setState(193);
				((Switch_statementsContext)_localctx).exp = expresion(0);
				setState(194);
				match(T__17);
				setState(195);
				((Switch_statementsContext)_localctx).stmts = statements();
				setState(196);
				((Switch_statementsContext)_localctx).switch_stmts = switch_statements();
				 _localctx.ast.put(((Switch_statementsContext)_localctx).exp.ast, ((Switch_statementsContext)_localctx).stmts.ast); _localctx.ast.putAll(((Switch_statementsContext)_localctx).switch_stmts.ast); 
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
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__23:
			case T__24:
			case T__39:
			case T__40:
			case T__41:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((StatementsContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				match(T__4);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456297375955976L) != 0)) {
					{
					{
					setState(205);
					((StatementsContext)_localctx).statement = statement();
					 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
		public ExpresionContext expresion;
		public Tipo_simpleContext tipo_simple;
		public Token l;
		public ExpresionesContext expresiones;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token IDENTIFICADOR;
		public Token op;
		public ExpresionContext exp2;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(GoJaParser.IDENTIFICADOR, 0); }
		public ExpresionesContext expresiones() {
			return getRuleContext(ExpresionesContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(GoJaParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(GoJaParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(GoJaParser.CHAR_CONSTANT, 0); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(217);
				match(T__2);
				setState(218);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(219);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  ((ExpresionContext)_localctx).expresion.ast; 
				}
				break;
			case 2:
				{
				setState(222);
				((ExpresionContext)_localctx).tipo_simple = tipo_simple();
				setState(223);
				match(T__2);
				setState(224);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(225);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  new Cast(((ExpresionContext)_localctx).tipo_simple.ast.getLine(), ((ExpresionContext)_localctx).tipo_simple.ast.getColumn(), ((ExpresionContext)_localctx).tipo_simple.ast, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 3:
				{
				setState(228);
				((ExpresionContext)_localctx).l = match(T__23);
				setState(229);
				((ExpresionContext)_localctx).expresion = expresion(11);
				 ((ExpresionContext)_localctx).ast =  new UnaryMinus(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 4:
				{
				setState(232);
				((ExpresionContext)_localctx).l = match(T__24);
				setState(233);
				((ExpresionContext)_localctx).expresion = expresion(10);
				 ((ExpresionContext)_localctx).ast =  new UnaryNot(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				{
				setState(236);
				((ExpresionContext)_localctx).l = match(IDENTIFICADOR);
				setState(237);
				match(T__2);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 456297375858696L) != 0)) {
					{
					setState(238);
					((ExpresionContext)_localctx).expresiones = expresiones();
					 _localctx.fparams.addAll(((ExpresionContext)_localctx).expresiones.ast); 
					}
				}

				setState(243);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  new FunctionInvocation(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1,
				                          new Variable(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).l!=null?((ExpresionContext)_localctx).l.getText():null)), _localctx.fparams);
				}
				break;
			case 6:
				{
				setState(245);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new IntLiteral(((ExpresionContext)_localctx).INT_CONSTANT.getLine(), ((ExpresionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpresionContext)_localctx).INT_CONSTANT!=null?((ExpresionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(247);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new FloatLiteral(((ExpresionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpresionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpresionContext)_localctx).REAL_CONSTANT!=null?((ExpresionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(249);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new CharLiteral(((ExpresionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpresionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpresionContext)_localctx).CHAR_CONSTANT!=null?((ExpresionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(251);
				((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 ((ExpresionContext)_localctx).ast =  new Variable(((ExpresionContext)_localctx).IDENTIFICADOR.getLine(), ((ExpresionContext)_localctx).IDENTIFICADOR.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).IDENTIFICADOR!=null?((ExpresionContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(255);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(256);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(257);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(10);
						 ((ExpresionContext)_localctx).ast =  new Arithmetic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(260);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(261);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(9);
						 ((ExpresionContext)_localctx).ast =  new Arithmetic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(265);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(266);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(267);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(8);
						 ((ExpresionContext)_localctx).ast =  new Comparasion(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(270);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(271);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(7);
						 ((ExpresionContext)_localctx).ast =  new Logic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(275);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(276);
						match(T__20);
						setState(277);
						((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
						 ((ExpresionContext)_localctx).ast =  new FieldAccess(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, (((ExpresionContext)_localctx).IDENTIFICADOR!=null?((ExpresionContext)_localctx).IDENTIFICADOR.getText():null)) ;
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(279);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(280);
						match(T__21);
						setState(281);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(0);
						setState(282);
						match(T__22);
						 ((ExpresionContext)_localctx).ast =  new ArrayAccess(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn() + 1, ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast); 
						}
						break;
					}
					} 
				}
				setState(289);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 16, RULE_expresiones);
		try {
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((ExpresionesContext)_localctx).expresion = expresion(0);
				 _localctx.ast.add(((ExpresionesContext)_localctx).expresion.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				((ExpresionesContext)_localctx).expresion = expresion(0);
				 _localctx.ast.add(((ExpresionesContext)_localctx).expresion.ast); 
				setState(295);
				match(T__37);
				setState(296);
				((ExpresionesContext)_localctx).expresiones = expresiones();
				 _localctx.ast.addAll(((ExpresionesContext)_localctx).expresiones.ast); 
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
	public static class ParamsContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<>();;
		public ParamContext param;
		public ParamsContext params;
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
		enterRule(_localctx, 18, RULE_params);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				((ParamsContext)_localctx).param = param();
				 _localctx.ast.add(((ParamsContext)_localctx).param.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				((ParamsContext)_localctx).param = param();
				setState(305);
				match(T__37);
				setState(306);
				((ParamsContext)_localctx).params = params();
				 ((ParamsContext)_localctx).params.ast.add(((ParamsContext)_localctx).param.ast); ((ParamsContext)_localctx).ast =  ((ParamsContext)_localctx).params.ast; 
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
		public Token l;
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
		enterRule(_localctx, 20, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			((ParamContext)_localctx).l = match(T__6);
			setState(312);
			((ParamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(313);
			((ParamContext)_localctx).tipo_simple = tipo_simple();
			((ParamContext)_localctx).ast =  new VarDefinition(((ParamContext)_localctx).l.getLine(), ((ParamContext)_localctx).l.getCharPositionInLine() + 1, ((ParamContext)_localctx).tipo_simple.ast, (((ParamContext)_localctx).IDENTIFICADOR!=null?((ParamContext)_localctx).IDENTIFICADOR.getText():null)); 
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
		public List<StructField> fields = new ArrayList<>();
		public List<String> definidos = new ArrayList<>();;
		public Tipo_simpleContext t;
		public Token a;
		public Token s;
		public TipoContext ti;
		public CamposContext campos;
		public Tipo_simpleContext tipo_simple() {
			return getRuleContext(Tipo_simpleContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(GoJaParser.INT_CONSTANT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<CamposContext> campos() {
			return getRuleContexts(CamposContext.class);
		}
		public CamposContext campos(int i) {
			return getRuleContext(CamposContext.class,i);
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
		enterRule(_localctx, 22, RULE_tipo);
		int _la;
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((TipoContext)_localctx).t = tipo_simple();
				 ((TipoContext)_localctx).ast =  ((TipoContext)_localctx).t.ast; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				((TipoContext)_localctx).a = match(T__21);
				setState(320);
				((TipoContext)_localctx).s = match(INT_CONSTANT);
				setState(321);
				match(T__22);
				setState(322);
				((TipoContext)_localctx).ti = tipo();
				 ((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).a.getLine(), ((TipoContext)_localctx).a.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((TipoContext)_localctx).s!=null?((TipoContext)_localctx).s.getText():null)), ((TipoContext)_localctx).ti.ast);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				((TipoContext)_localctx).a = match(T__38);
				setState(326);
				match(T__4);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(327);
					((TipoContext)_localctx).campos = campos();
					 _localctx.fields.addAll(((TipoContext)_localctx).campos.ast); 
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}

				               for(StructField f: _localctx.fields){
				                    if(_localctx.definidos.contains(f.getName())){
				                        ErrorType e = new ErrorType("Campo " + f.getName() + " ya definido", f.getLine(), f.getColumn());
				                    }
				                    _localctx.definidos.add(f.getName());
				               }
				                ((TipoContext)_localctx).ast =  new StructType(((TipoContext)_localctx).a.getLine(), ((TipoContext)_localctx).a.getCharPositionInLine() + 1, _localctx.fields);
				            
				setState(336);
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
	public static class CamposContext extends ParserRuleContext {
		public List<StructField> ast = new ArrayList<>();;
		public List<String> definidos = new ArrayList<>();;
		public Token l;
		public VarsContext vars;
		public TipoContext tipo;
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public CamposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GoJaVisitor ) return ((GoJaVisitor<? extends T>)visitor).visitCampos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CamposContext campos() throws RecognitionException {
		CamposContext _localctx = new CamposContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_campos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			((CamposContext)_localctx).l = match(T__6);
			setState(340);
			((CamposContext)_localctx).vars = vars();
			setState(341);
			((CamposContext)_localctx).tipo = tipo();
			setState(342);
			match(T__7);

			            for(String id: ((CamposContext)_localctx).vars.ast) {
			                if(_localctx.definidos.contains(id)){
			                    ErrorType e = new ErrorType("Variable " + id + " ya definido", ((CamposContext)_localctx).l.getLine(), ((CamposContext)_localctx).l.getCharPositionInLine() + 1);
			                } else {
			                    _localctx.ast.add(new StructField(((CamposContext)_localctx).l.getLine(), ((CamposContext)_localctx).l.getCharPositionInLine() + 1, ((CamposContext)_localctx).tipo.ast, id));
			                }
			                _localctx.definidos.add(id);
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
		enterRule(_localctx, 26, RULE_tipo_simple);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__39:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(T__39);
				 ((Tipo_simpleContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(T__40);
				 ((Tipo_simpleContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(T__41);
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
		enterRule(_localctx, 28, RULE_vars);
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				((VarsContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 _localctx.ast.add((((VarsContext)_localctx).IDENTIFICADOR!=null?((VarsContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				((VarsContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(356);
				match(T__37);
				setState(357);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
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
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00013\u016b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000/\b\u0000\n\u0000\f\u00002\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u00007\b\u0000\n\u0000\f\u0000:\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003[\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003i\b\u0003\n\u0003\f\u0003l\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0096\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u00a0\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00a5\b\u0004\n\u0004\f\u0004\u00a8\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b4\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00b9\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u00c8\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d1\b\u0006\n\u0006\f\u0006"+
		"\u00d4\t\u0006\u0001\u0006\u0003\u0006\u00d7\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00f2\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00fe\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u011e\b\u0007\n\u0007\f\u0007\u0121\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b\u012c\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0136\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0005\u000b\u014b\b\u000b\n\u000b\f\u000b\u014e\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0152\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0160\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0169\b\u000e\u0001\u000e\u0000"+
		"\u0001\u000e\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u0000\u0004\u0001\u0000\u001a\u001c\u0002\u0000"+
		"\u0018\u0018\u001d\u001d\u0001\u0000\u001e#\u0001\u0000$%\u0188\u0000"+
		"#\u0001\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004H\u0001"+
		"\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\b\u00b8\u0001\u0000"+
		"\u0000\u0000\n\u00c7\u0001\u0000\u0000\u0000\f\u00d6\u0001\u0000\u0000"+
		"\u0000\u000e\u00fd\u0001\u0000\u0000\u0000\u0010\u012b\u0001\u0000\u0000"+
		"\u0000\u0012\u0135\u0001\u0000\u0000\u0000\u0014\u0137\u0001\u0000\u0000"+
		"\u0000\u0016\u0151\u0001\u0000\u0000\u0000\u0018\u0153\u0001\u0000\u0000"+
		"\u0000\u001a\u015f\u0001\u0000\u0000\u0000\u001c\u0168\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0006\u0000\uffff\uffff"+
		"\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000\u0000\u0000\"%\u0001"+
		"\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000"+
		"$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000&\'\u0005\u0001\u0000"+
		"\u0000\'(\u0005\u0002\u0000\u0000()\u0005\u0003\u0000\u0000)*\u0005\u0004"+
		"\u0000\u0000*0\u0005\u0005\u0000\u0000+,\u0003\u0004\u0002\u0000,-\u0006"+
		"\u0000\uffff\uffff\u0000-/\u0001\u0000\u0000\u0000.+\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000018\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000034\u0003"+
		"\b\u0004\u000045\u0006\u0000\uffff\uffff\u000057\u0001\u0000\u0000\u0000"+
		"63\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009;\u0001\u0000\u0000\u0000:8\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0006\u0000\u0000<=\u0006\u0000\uffff\uffff\u0000"+
		"=>\u0005\u0000\u0000\u0001>?\u0006\u0000\uffff\uffff\u0000?\u0001\u0001"+
		"\u0000\u0000\u0000@A\u0003\u0004\u0002\u0000AB\u0006\u0001\uffff\uffff"+
		"\u0000BG\u0001\u0000\u0000\u0000CD\u0003\u0006\u0003\u0000DE\u0006\u0001"+
		"\uffff\uffff\u0000EG\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000"+
		"FC\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000HI\u0005\u0007"+
		"\u0000\u0000IJ\u0003\u001c\u000e\u0000JK\u0003\u0016\u000b\u0000KL\u0005"+
		"\b\u0000\u0000LM\u0006\u0002\uffff\uffff\u0000M\u0005\u0001\u0000\u0000"+
		"\u0000NO\u0005\u0001\u0000\u0000OP\u00050\u0000\u0000PT\u0005\u0003\u0000"+
		"\u0000QR\u0003\u0012\t\u0000RS\u0006\u0003\uffff\uffff\u0000SU\u0001\u0000"+
		"\u0000\u0000TQ\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VZ\u0005\u0004\u0000\u0000WX\u0003\u001a\r\u0000XY\u0006"+
		"\u0003\uffff\uffff\u0000Y[\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\b\u0005\u0005"+
		"\u0000\u0000]^\u0003\u0004\u0002\u0000^_\u0006\u0003\uffff\uffff\u0000"+
		"_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cj\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000ef\u0003\b\u0004\u0000fg\u0006\u0003"+
		"\uffff\uffff\u0000gi\u0001\u0000\u0000\u0000he\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0006"+
		"\u0000\u0000no\u0006\u0003\uffff\uffff\u0000o\u0007\u0001\u0000\u0000"+
		"\u0000pq\u0003\u000e\u0007\u0000qr\u0005\t\u0000\u0000rs\u0003\u000e\u0007"+
		"\u0000st\u0005\b\u0000\u0000tu\u0006\u0004\uffff\uffff\u0000u\u00b9\u0001"+
		"\u0000\u0000\u0000vw\u0005\n\u0000\u0000wx\u0003\u0010\b\u0000xy\u0005"+
		"\b\u0000\u0000yz\u0006\u0004\uffff\uffff\u0000z\u00b9\u0001\u0000\u0000"+
		"\u0000{|\u0005\u000b\u0000\u0000|}\u0003\u0010\b\u0000}~\u0005\b\u0000"+
		"\u0000~\u007f\u0006\u0004\uffff\uffff\u0000\u007f\u00b9\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\f\u0000\u0000\u0081\u0082\u0003\u000e\u0007\u0000"+
		"\u0082\u0083\u0005\b\u0000\u0000\u0083\u0084\u0006\u0004\uffff\uffff\u0000"+
		"\u0084\u00b9\u0001\u0000\u0000\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086"+
		"\u0087\u0005\u0003\u0000\u0000\u0087\u0088\u0003\u000e\u0007\u0000\u0088"+
		"\u0089\u0005\u0004\u0000\u0000\u0089\u008a\u0003\f\u0006\u0000\u008a\u008b"+
		"\u0006\u0004\uffff\uffff\u0000\u008b\u00b9\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0005\u000e\u0000\u0000\u008d\u008e\u0005\u0003\u0000\u0000\u008e"+
		"\u008f\u0003\u000e\u0007\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090"+
		"\u0095\u0003\f\u0006\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0093"+
		"\u0003\f\u0006\u0000\u0093\u0094\u0006\u0004\uffff\uffff\u0000\u0094\u0096"+
		"\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0006\u0004\uffff\uffff\u0000\u0098\u00b9\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0005\u0010\u0000\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b"+
		"\u009c\u0003\u000e\u0007\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d"+
		"\u009f\u0005\u0005\u0000\u0000\u009e\u00a0\u0003\n\u0005\u0000\u009f\u009e"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0011\u0000\u0000\u00a2\u00a6"+
		"\u0005\u0012\u0000\u0000\u00a3\u00a5\u0003\f\u0006\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0013\u0000\u0000\u00aa\u00ab\u0005\b\u0000\u0000\u00ab\u00ac\u0005\u0006"+
		"\u0000\u0000\u00ac\u00ad\u0006\u0004\uffff\uffff\u0000\u00ad\u00b9\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u00050\u0000\u0000\u00af\u00b3\u0005\u0003"+
		"\u0000\u0000\u00b0\u00b1\u0003\u0010\b\u0000\u00b1\u00b2\u0006\u0004\uffff"+
		"\uffff\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b7\u0005\b\u0000"+
		"\u0000\u00b7\u00b9\u0006\u0004\uffff\uffff\u0000\u00b8p\u0001\u0000\u0000"+
		"\u0000\u00b8v\u0001\u0000\u0000\u0000\u00b8{\u0001\u0000\u0000\u0000\u00b8"+
		"\u0080\u0001\u0000\u0000\u0000\u00b8\u0085\u0001\u0000\u0000\u0000\u00b8"+
		"\u008c\u0001\u0000\u0000\u0000\u00b8\u0099\u0001\u0000\u0000\u0000\u00b8"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b9\t\u0001\u0000\u0000\u0000\u00ba\u00bb"+
		"\u0005\u0014\u0000\u0000\u00bb\u00bc\u0003\u000e\u0007\u0000\u00bc\u00bd"+
		"\u0005\u0012\u0000\u0000\u00bd\u00be\u0003\f\u0006\u0000\u00be\u00bf\u0006"+
		"\u0005\uffff\uffff\u0000\u00bf\u00c8\u0001\u0000\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0014\u0000\u0000\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3"+
		"\u0005\u0012\u0000\u0000\u00c3\u00c4\u0003\f\u0006\u0000\u00c4\u00c5\u0003"+
		"\n\u0005\u0000\u00c5\u00c6\u0006\u0005\uffff\uffff\u0000\u00c6\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ba\u0001\u0000\u0000\u0000\u00c7\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c8\u000b\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003"+
		"\b\u0004\u0000\u00ca\u00cb\u0006\u0006\uffff\uffff\u0000\u00cb\u00d7\u0001"+
		"\u0000\u0000\u0000\u00cc\u00d2\u0005\u0005\u0000\u0000\u00cd\u00ce\u0003"+
		"\b\u0004\u0000\u00ce\u00cf\u0006\u0006\uffff\uffff\u0000\u00cf\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d7\u0005\u0006\u0000\u0000\u00d6\u00c9\u0001"+
		"\u0000\u0000\u0000\u00d6\u00cc\u0001\u0000\u0000\u0000\u00d7\r\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0006\u0007\uffff\uffff\u0000\u00d9\u00da\u0005"+
		"\u0003\u0000\u0000\u00da\u00db\u0003\u000e\u0007\u0000\u00db\u00dc\u0005"+
		"\u0004\u0000\u0000\u00dc\u00dd\u0006\u0007\uffff\uffff\u0000\u00dd\u00fe"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0003\u001a\r\u0000\u00df\u00e0\u0005"+
		"\u0003\u0000\u0000\u00e0\u00e1\u0003\u000e\u0007\u0000\u00e1\u00e2\u0005"+
		"\u0004\u0000\u0000\u00e2\u00e3\u0006\u0007\uffff\uffff\u0000\u00e3\u00fe"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0018\u0000\u0000\u00e5\u00e6"+
		"\u0003\u000e\u0007\u000b\u00e6\u00e7\u0006\u0007\uffff\uffff\u0000\u00e7"+
		"\u00fe\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0019\u0000\u0000\u00e9"+
		"\u00ea\u0003\u000e\u0007\n\u00ea\u00eb\u0006\u0007\uffff\uffff\u0000\u00eb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00ec\u00ed\u00050\u0000\u0000\u00ed\u00f1"+
		"\u0005\u0003\u0000\u0000\u00ee\u00ef\u0003\u0010\b\u0000\u00ef\u00f0\u0006"+
		"\u0007\uffff\uffff\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\u0004\u0000\u0000\u00f4\u00fe"+
		"\u0006\u0007\uffff\uffff\u0000\u00f5\u00f6\u0005+\u0000\u0000\u00f6\u00fe"+
		"\u0006\u0007\uffff\uffff\u0000\u00f7\u00f8\u0005,\u0000\u0000\u00f8\u00fe"+
		"\u0006\u0007\uffff\uffff\u0000\u00f9\u00fa\u0005/\u0000\u0000\u00fa\u00fe"+
		"\u0006\u0007\uffff\uffff\u0000\u00fb\u00fc\u00050\u0000\u0000\u00fc\u00fe"+
		"\u0006\u0007\uffff\uffff\u0000\u00fd\u00d8\u0001\u0000\u0000\u0000\u00fd"+
		"\u00de\u0001\u0000\u0000\u0000\u00fd\u00e4\u0001\u0000\u0000\u0000\u00fd"+
		"\u00e8\u0001\u0000\u0000\u0000\u00fd\u00ec\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f5\u0001\u0000\u0000\u0000\u00fd\u00f7\u0001\u0000\u0000\u0000\u00fd"+
		"\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe"+
		"\u011f\u0001\u0000\u0000\u0000\u00ff\u0100\n\t\u0000\u0000\u0100\u0101"+
		"\u0007\u0000\u0000\u0000\u0101\u0102\u0003\u000e\u0007\n\u0102\u0103\u0006"+
		"\u0007\uffff\uffff\u0000\u0103\u011e\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\n\b\u0000\u0000\u0105\u0106\u0007\u0001\u0000\u0000\u0106\u0107\u0003"+
		"\u000e\u0007\t\u0107\u0108\u0006\u0007\uffff\uffff\u0000\u0108\u011e\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\n\u0007\u0000\u0000\u010a\u010b\u0007\u0002"+
		"\u0000\u0000\u010b\u010c\u0003\u000e\u0007\b\u010c\u010d\u0006\u0007\uffff"+
		"\uffff\u0000\u010d\u011e\u0001\u0000\u0000\u0000\u010e\u010f\n\u0006\u0000"+
		"\u0000\u010f\u0110\u0007\u0003\u0000\u0000\u0110\u0111\u0003\u000e\u0007"+
		"\u0007\u0111\u0112\u0006\u0007\uffff\uffff\u0000\u0112\u011e\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\n\u000e\u0000\u0000\u0114\u0115\u0005\u0015\u0000"+
		"\u0000\u0115\u0116\u00050\u0000\u0000\u0116\u011e\u0006\u0007\uffff\uffff"+
		"\u0000\u0117\u0118\n\r\u0000\u0000\u0118\u0119\u0005\u0016\u0000\u0000"+
		"\u0119\u011a\u0003\u000e\u0007\u0000\u011a\u011b\u0005\u0017\u0000\u0000"+
		"\u011b\u011c\u0006\u0007\uffff\uffff\u0000\u011c\u011e\u0001\u0000\u0000"+
		"\u0000\u011d\u00ff\u0001\u0000\u0000\u0000\u011d\u0104\u0001\u0000\u0000"+
		"\u0000\u011d\u0109\u0001\u0000\u0000\u0000\u011d\u010e\u0001\u0000\u0000"+
		"\u0000\u011d\u0113\u0001\u0000\u0000\u0000\u011d\u0117\u0001\u0000\u0000"+
		"\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u000f\u0001\u0000\u0000"+
		"\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122\u0123\u0003\u000e\u0007"+
		"\u0000\u0123\u0124\u0006\b\uffff\uffff\u0000\u0124\u012c\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0003\u000e\u0007\u0000\u0126\u0127\u0006\b\uffff\uffff"+
		"\u0000\u0127\u0128\u0005&\u0000\u0000\u0128\u0129\u0003\u0010\b\u0000"+
		"\u0129\u012a\u0006\b\uffff\uffff\u0000\u012a\u012c\u0001\u0000\u0000\u0000"+
		"\u012b\u0122\u0001\u0000\u0000\u0000\u012b\u0125\u0001\u0000\u0000\u0000"+
		"\u012c\u0011\u0001\u0000\u0000\u0000\u012d\u012e\u0003\u0014\n\u0000\u012e"+
		"\u012f\u0006\t\uffff\uffff\u0000\u012f\u0136\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0003\u0014\n\u0000\u0131\u0132\u0005&\u0000\u0000\u0132\u0133"+
		"\u0003\u0012\t\u0000\u0133\u0134\u0006\t\uffff\uffff\u0000\u0134\u0136"+
		"\u0001\u0000\u0000\u0000\u0135\u012d\u0001\u0000\u0000\u0000\u0135\u0130"+
		"\u0001\u0000\u0000\u0000\u0136\u0013\u0001\u0000\u0000\u0000\u0137\u0138"+
		"\u0005\u0007\u0000\u0000\u0138\u0139\u00050\u0000\u0000\u0139\u013a\u0003"+
		"\u001a\r\u0000\u013a\u013b\u0006\n\uffff\uffff\u0000\u013b\u0015\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0003\u001a\r\u0000\u013d\u013e\u0006\u000b"+
		"\uffff\uffff\u0000\u013e\u0152\u0001\u0000\u0000\u0000\u013f\u0140\u0005"+
		"\u0016\u0000\u0000\u0140\u0141\u0005+\u0000\u0000\u0141\u0142\u0005\u0017"+
		"\u0000\u0000\u0142\u0143\u0003\u0016\u000b\u0000\u0143\u0144\u0006\u000b"+
		"\uffff\uffff\u0000\u0144\u0152\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"\'\u0000\u0000\u0146\u014c\u0005\u0005\u0000\u0000\u0147\u0148\u0003\u0018"+
		"\f\u0000\u0148\u0149\u0006\u000b\uffff\uffff\u0000\u0149\u014b\u0001\u0000"+
		"\u0000\u0000\u014a\u0147\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000"+
		"\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014f\u0150\u0006\u000b\uffff\uffff\u0000\u0150\u0152\u0005"+
		"\u0006\u0000\u0000\u0151\u013c\u0001\u0000\u0000\u0000\u0151\u013f\u0001"+
		"\u0000\u0000\u0000\u0151\u0145\u0001\u0000\u0000\u0000\u0152\u0017\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0005\u0007\u0000\u0000\u0154\u0155\u0003"+
		"\u001c\u000e\u0000\u0155\u0156\u0003\u0016\u000b\u0000\u0156\u0157\u0005"+
		"\b\u0000\u0000\u0157\u0158\u0006\f\uffff\uffff\u0000\u0158\u0019\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0005(\u0000\u0000\u015a\u0160\u0006\r"+
		"\uffff\uffff\u0000\u015b\u015c\u0005)\u0000\u0000\u015c\u0160\u0006\r"+
		"\uffff\uffff\u0000\u015d\u015e\u0005*\u0000\u0000\u015e\u0160\u0006\r"+
		"\uffff\uffff\u0000\u015f\u0159\u0001\u0000\u0000\u0000\u015f\u015b\u0001"+
		"\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u001b\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u00050\u0000\u0000\u0162\u0169\u0006\u000e"+
		"\uffff\uffff\u0000\u0163\u0164\u00050\u0000\u0000\u0164\u0165\u0005&\u0000"+
		"\u0000\u0165\u0166\u0003\u001c\u000e\u0000\u0166\u0167\u0006\u000e\uffff"+
		"\uffff\u0000\u0167\u0169\u0001\u0000\u0000\u0000\u0168\u0161\u0001\u0000"+
		"\u0000\u0000\u0168\u0163\u0001\u0000\u0000\u0000\u0169\u001d\u0001\u0000"+
		"\u0000\u0000\u001a#08FTZbj\u0095\u009f\u00a6\u00b3\u00b8\u00c7\u00d2\u00d6"+
		"\u00f1\u00fd\u011d\u011f\u012b\u0135\u014c\u0151\u015f\u0168";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}