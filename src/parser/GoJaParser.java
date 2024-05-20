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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, INT_CONSTANT=38, 
		REAL_CONSTANT=39, REAL_1=40, REAL_2=41, CHAR_CONSTANT=42, IDENTIFICADOR=43, 
		COMMENT=44, MULTI_COMMENT=45, WS=46;
	public static final int
		RULE_program = 0, RULE_definiciones = 1, RULE_var_definition = 2, RULE_func_definition = 3, 
		RULE_statement = 4, RULE_statements = 5, RULE_expresion = 6, RULE_expresiones = 7, 
		RULE_params = 8, RULE_param = 9, RULE_tipo = 10, RULE_campos = 11, RULE_tipo_simple = 12, 
		RULE_vars = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definiciones", "var_definition", "func_definition", "statement", 
			"statements", "expresion", "expresiones", "params", "param", "tipo", 
			"campos", "tipo_simple", "vars"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'func'", "'main'", "'('", "')'", "'{'", "'}'", "'var'", "';'", 
			"'='", "'write'", "'read'", "'return'", "'while'", "'if'", "'else'", 
			"'.'", "'['", "']'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "','", "'struct'", 
			"'int'", "'char'", "'float32'"
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
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					((ProgramContext)_localctx).d = definiciones();
					 _localctx.defs.addAll(((ProgramContext)_localctx).d.ast); 
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(36);
			((ProgramContext)_localctx).l = match(T__0);
			setState(37);
			((ProgramContext)_localctx).m = match(T__1);
			setState(38);
			match(T__2);
			setState(39);
			match(T__3);
			setState(40);
			match(T__4);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(41);
				((ProgramContext)_localctx).var_definition = var_definition();
				 _localctx.cuerpo.addAll(((ProgramContext)_localctx).var_definition.ast) ;
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14259293027336L) != 0)) {
				{
				{
				setState(49);
				((ProgramContext)_localctx).statement = statement();
				 _localctx.cuerpo.add(((ProgramContext)_localctx).statement.ast) ;
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(T__5);
			 _localctx.defs.add(
			            new FunctionDefinition(((ProgramContext)_localctx).l.getLine(), ((ProgramContext)_localctx).l.getCharPositionInLine() + 1,
			                            new FunctionType(((ProgramContext)_localctx).l.getLine(), ((ProgramContext)_localctx).l.getCharPositionInLine() + 1, VoidType.getInstance(), new ArrayList<>())
			                            , (((ProgramContext)_localctx).m!=null?((ProgramContext)_localctx).m.getText():null), _localctx.cuerpo)
			        );
			setState(59);
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
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((DefinicionesContext)_localctx).v = var_definition();
				 _localctx.ast.addAll(((DefinicionesContext)_localctx).v.ast); 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
			setState(70);
			((Var_definitionContext)_localctx).l = match(T__6);
			setState(71);
			((Var_definitionContext)_localctx).vars = vars();
			setState(72);
			((Var_definitionContext)_localctx).tipo = tipo();
			setState(73);
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
			setState(76);
			((Func_definitionContext)_localctx).l = match(T__0);
			setState(77);
			((Func_definitionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(78);
			match(T__2);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(79);
				((Func_definitionContext)_localctx).params = params();
				 _localctx.fparams.addAll(((Func_definitionContext)_localctx).params.ast); 
				}
			}

			setState(84);
			match(T__3);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				setState(85);
				((Func_definitionContext)_localctx).tipo_simple = tipo_simple();
				 ((Func_definitionContext)_localctx).t =  ((Func_definitionContext)_localctx).tipo_simple.ast; 
				}
			}

			setState(90);
			match(T__4);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(91);
				((Func_definitionContext)_localctx).var_definition = var_definition();
				 _localctx.cuerpo.addAll(((Func_definitionContext)_localctx).var_definition.ast) ;
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14259293027336L) != 0)) {
				{
				{
				setState(99);
				((Func_definitionContext)_localctx).statement = statement();
				 _localctx.cuerpo.add(((Func_definitionContext)_localctx).statement.ast) ;
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
		public ExpresionesContext left;
		public Token l;
		public ExpresionesContext rigth;
		public ExpresionesContext expresiones;
		public ExpresionContext expresion;
		public StatementsContext statements;
		public StatementsContext tBody;
		public StatementsContext fBody;
		public List<ExpresionesContext> expresiones() {
			return getRuleContexts(ExpresionesContext.class);
		}
		public ExpresionesContext expresiones(int i) {
			return getRuleContext(ExpresionesContext.class,i);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
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
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				((StatementContext)_localctx).left = expresiones();
				setState(111);
				((StatementContext)_localctx).l = match(T__8);
				setState(112);
				((StatementContext)_localctx).rigth = expresiones();
				setState(113);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new MultipleAssignment(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).left.ast, ((StatementContext)_localctx).rigth.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((StatementContext)_localctx).l = match(T__9);
				setState(117);
				((StatementContext)_localctx).expresiones = expresiones();
				setState(118);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Write(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresiones.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				((StatementContext)_localctx).l = match(T__10);
				setState(122);
				((StatementContext)_localctx).expresiones = expresiones();
				setState(123);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Read(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresiones.ast); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				((StatementContext)_localctx).l = match(T__11);
				setState(127);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(128);
				match(T__7);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				((StatementContext)_localctx).l = match(T__12);
				setState(132);
				match(T__2);
				setState(133);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(134);
				match(T__3);
				setState(135);
				((StatementContext)_localctx).statements = statements();
				 ((StatementContext)_localctx).ast =  new While(((StatementContext)_localctx).l.getLine(), ((StatementContext)_localctx).l.getCharPositionInLine() + 1, ((StatementContext)_localctx).expresion.ast, ((StatementContext)_localctx).statements.ast); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				((StatementContext)_localctx).l = match(T__13);
				setState(139);
				match(T__2);
				setState(140);
				((StatementContext)_localctx).expresion = expresion(0);
				setState(141);
				match(T__3);
				setState(142);
				((StatementContext)_localctx).tBody = statements();
				setState(147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(143);
					match(T__14);
					{
					setState(144);
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
				setState(151);
				((StatementContext)_localctx).l = match(IDENTIFICADOR);
				setState(152);
				match(T__2);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14259292995592L) != 0)) {
					{
					setState(153);
					((StatementContext)_localctx).expresiones = expresiones();
					 _localctx.fparams.addAll(((StatementContext)_localctx).expresiones.ast); 
					}
				}

				setState(158);
				match(T__3);
				setState(159);
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
		enterRule(_localctx, 10, RULE_statements);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__18:
			case T__19:
			case T__34:
			case T__35:
			case T__36:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				((StatementsContext)_localctx).statement = statement();
				 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__4);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14259293027336L) != 0)) {
					{
					{
					setState(167);
					((StatementsContext)_localctx).statement = statement();
					 _localctx.ast.add(((StatementsContext)_localctx).statement.ast); 
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(179);
				match(T__2);
				setState(180);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(181);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  ((ExpresionContext)_localctx).expresion.ast; 
				}
				break;
			case 2:
				{
				setState(184);
				((ExpresionContext)_localctx).tipo_simple = tipo_simple();
				setState(185);
				match(T__2);
				setState(186);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(187);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  new Cast(((ExpresionContext)_localctx).tipo_simple.ast.getLine(), ((ExpresionContext)_localctx).tipo_simple.ast.getColumn(), ((ExpresionContext)_localctx).tipo_simple.ast, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 3:
				{
				setState(190);
				((ExpresionContext)_localctx).l = match(T__18);
				setState(191);
				((ExpresionContext)_localctx).expresion = expresion(11);
				 ((ExpresionContext)_localctx).ast =  new UnaryMinus(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 4:
				{
				setState(194);
				((ExpresionContext)_localctx).l = match(T__19);
				setState(195);
				((ExpresionContext)_localctx).expresion = expresion(10);
				 ((ExpresionContext)_localctx).ast =  new UnaryNot(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, ((ExpresionContext)_localctx).expresion.ast); 
				}
				break;
			case 5:
				{
				setState(198);
				((ExpresionContext)_localctx).l = match(IDENTIFICADOR);
				setState(199);
				match(T__2);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14259292995592L) != 0)) {
					{
					setState(200);
					((ExpresionContext)_localctx).expresiones = expresiones();
					 _localctx.fparams.addAll(((ExpresionContext)_localctx).expresiones.ast); 
					}
				}

				setState(205);
				match(T__3);
				 ((ExpresionContext)_localctx).ast =  new FunctionInvocation(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1,
				                          new Variable(((ExpresionContext)_localctx).l.getLine(), ((ExpresionContext)_localctx).l.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).l!=null?((ExpresionContext)_localctx).l.getText():null)), _localctx.fparams);
				}
				break;
			case 6:
				{
				setState(207);
				((ExpresionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new IntLiteral(((ExpresionContext)_localctx).INT_CONSTANT.getLine(), ((ExpresionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((ExpresionContext)_localctx).INT_CONSTANT!=null?((ExpresionContext)_localctx).INT_CONSTANT.getText():null))); 
				}
				break;
			case 7:
				{
				setState(209);
				((ExpresionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new FloatLiteral(((ExpresionContext)_localctx).REAL_CONSTANT.getLine(), ((ExpresionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToReal((((ExpresionContext)_localctx).REAL_CONSTANT!=null?((ExpresionContext)_localctx).REAL_CONSTANT.getText():null))); 
				}
				break;
			case 8:
				{
				setState(211);
				((ExpresionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpresionContext)_localctx).ast =  new CharLiteral(((ExpresionContext)_localctx).CHAR_CONSTANT.getLine(), ((ExpresionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1, LexerHelper.lexemeToChar((((ExpresionContext)_localctx).CHAR_CONSTANT!=null?((ExpresionContext)_localctx).CHAR_CONSTANT.getText():null))); 
				}
				break;
			case 9:
				{
				setState(213);
				((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 ((ExpresionContext)_localctx).ast =  new Variable(((ExpresionContext)_localctx).IDENTIFICADOR.getLine(), ((ExpresionContext)_localctx).IDENTIFICADOR.getCharPositionInLine() + 1, (((ExpresionContext)_localctx).IDENTIFICADOR!=null?((ExpresionContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(247);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(217);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(218);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(10);
						 ((ExpresionContext)_localctx).ast =  new Arithmetic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(222);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(223);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__23) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(9);
						 ((ExpresionContext)_localctx).ast =  new Arithmetic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(227);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(228);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(8);
						 ((ExpresionContext)_localctx).ast =  new Comparasion(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(232);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(233);
						((ExpresionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((ExpresionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(234);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(7);
						 ((ExpresionContext)_localctx).ast =  new Logic(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast, (((ExpresionContext)_localctx).op!=null?((ExpresionContext)_localctx).op.getText():null)); 
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(237);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(238);
						match(T__15);
						setState(239);
						((ExpresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
						 ((ExpresionContext)_localctx).ast =  new FieldAccess(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn(), ((ExpresionContext)_localctx).exp1.ast, (((ExpresionContext)_localctx).IDENTIFICADOR!=null?((ExpresionContext)_localctx).IDENTIFICADOR.getText():null)) ;
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(241);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(242);
						match(T__16);
						setState(243);
						((ExpresionContext)_localctx).exp2 = ((ExpresionContext)_localctx).expresion = expresion(0);
						setState(244);
						match(T__17);
						 ((ExpresionContext)_localctx).ast =  new ArrayAccess(((ExpresionContext)_localctx).exp1.ast.getLine(), ((ExpresionContext)_localctx).exp1.ast.getColumn() + 1, ((ExpresionContext)_localctx).exp1.ast, ((ExpresionContext)_localctx).exp2.ast); 
						}
						break;
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 14, RULE_expresiones);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				((ExpresionesContext)_localctx).expresion = expresion(0);
				 _localctx.ast.add(((ExpresionesContext)_localctx).expresion.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				((ExpresionesContext)_localctx).expresion = expresion(0);
				 _localctx.ast.add(((ExpresionesContext)_localctx).expresion.ast); 
				setState(257);
				match(T__32);
				setState(258);
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
		enterRule(_localctx, 16, RULE_params);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((ParamsContext)_localctx).param = param();
				 _localctx.ast.add(((ParamsContext)_localctx).param.ast); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				((ParamsContext)_localctx).param = param();
				setState(267);
				match(T__32);
				setState(268);
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
		enterRule(_localctx, 18, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((ParamContext)_localctx).l = match(T__6);
			setState(274);
			((ParamContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(275);
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
		enterRule(_localctx, 20, RULE_tipo);
		int _la;
		try {
			setState(299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((TipoContext)_localctx).t = tipo_simple();
				 ((TipoContext)_localctx).ast =  ((TipoContext)_localctx).t.ast; 
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((TipoContext)_localctx).a = match(T__16);
				setState(282);
				((TipoContext)_localctx).s = match(INT_CONSTANT);
				setState(283);
				match(T__17);
				setState(284);
				((TipoContext)_localctx).ti = tipo();
				 ((TipoContext)_localctx).ast =  new ArrayType(((TipoContext)_localctx).a.getLine(), ((TipoContext)_localctx).a.getCharPositionInLine() + 1, LexerHelper.lexemeToInt((((TipoContext)_localctx).s!=null?((TipoContext)_localctx).s.getText():null)), ((TipoContext)_localctx).ti.ast);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				((TipoContext)_localctx).a = match(T__33);
				setState(288);
				match(T__4);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(289);
					((TipoContext)_localctx).campos = campos();
					 _localctx.fields.addAll(((TipoContext)_localctx).campos.ast); 
					}
					}
					setState(296);
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
				            
				setState(298);
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
		enterRule(_localctx, 22, RULE_campos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((CamposContext)_localctx).l = match(T__6);
			setState(302);
			((CamposContext)_localctx).vars = vars();
			setState(303);
			((CamposContext)_localctx).tipo = tipo();
			setState(304);
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
		enterRule(_localctx, 24, RULE_tipo_simple);
		try {
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(T__34);
				 ((Tipo_simpleContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__35);
				 ((Tipo_simpleContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(311);
				match(T__36);
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
		enterRule(_localctx, 26, RULE_vars);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((VarsContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 _localctx.ast.add((((VarsContext)_localctx).IDENTIFICADOR!=null?((VarsContext)_localctx).IDENTIFICADOR.getText():null)); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				((VarsContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(318);
				match(T__32);
				setState(319);
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
		case 6:
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
		"\u0004\u0001.\u0145\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		" \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u00005\b\u0000\n\u0000\f\u00008\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001E\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"S\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"Y\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"_\b\u0003\n\u0003\f\u0003b\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u009d\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a2\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00ab\b\u0005\n\u0005\f\u0005\u00ae\t\u0005"+
		"\u0001\u0005\u0003\u0005\u00b1\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cc\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d8\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u00f8\b\u0006\n\u0006\f\u0006\u00fb\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0106\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0110\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0125"+
		"\b\n\n\n\f\n\u0128\t\n\u0001\n\u0001\n\u0003\n\u012c\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u013a\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0143\b\r\u0001\r\u0000\u0001"+
		"\f\u000e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u0000\u0004\u0001\u0000\u0015\u0017\u0002\u0000\u0013\u0013\u0018"+
		"\u0018\u0001\u0000\u0019\u001e\u0001\u0000\u001f \u015f\u0000!\u0001\u0000"+
		"\u0000\u0000\u0002D\u0001\u0000\u0000\u0000\u0004F\u0001\u0000\u0000\u0000"+
		"\u0006L\u0001\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00b0"+
		"\u0001\u0000\u0000\u0000\f\u00d7\u0001\u0000\u0000\u0000\u000e\u0105\u0001"+
		"\u0000\u0000\u0000\u0010\u010f\u0001\u0000\u0000\u0000\u0012\u0111\u0001"+
		"\u0000\u0000\u0000\u0014\u012b\u0001\u0000\u0000\u0000\u0016\u012d\u0001"+
		"\u0000\u0000\u0000\u0018\u0139\u0001\u0000\u0000\u0000\u001a\u0142\u0001"+
		"\u0000\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0006"+
		"\u0000\uffff\uffff\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001c\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000"+
		"\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005\u0002\u0000\u0000&\'\u0005"+
		"\u0003\u0000\u0000\'(\u0005\u0004\u0000\u0000(.\u0005\u0005\u0000\u0000"+
		")*\u0003\u0004\u0002\u0000*+\u0006\u0000\uffff\uffff\u0000+-\u0001\u0000"+
		"\u0000\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/6\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u000012\u0003\b\u0004\u000023\u0006\u0000\uffff\uffff"+
		"\u000035\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000058\u0001\u0000"+
		"\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u00009:\u0005\u0006\u0000\u0000"+
		":;\u0006\u0000\uffff\uffff\u0000;<\u0005\u0000\u0000\u0001<=\u0006\u0000"+
		"\uffff\uffff\u0000=\u0001\u0001\u0000\u0000\u0000>?\u0003\u0004\u0002"+
		"\u0000?@\u0006\u0001\uffff\uffff\u0000@E\u0001\u0000\u0000\u0000AB\u0003"+
		"\u0006\u0003\u0000BC\u0006\u0001\uffff\uffff\u0000CE\u0001\u0000\u0000"+
		"\u0000D>\u0001\u0000\u0000\u0000DA\u0001\u0000\u0000\u0000E\u0003\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0007\u0000\u0000GH\u0003\u001a\r\u0000HI\u0003"+
		"\u0014\n\u0000IJ\u0005\b\u0000\u0000JK\u0006\u0002\uffff\uffff\u0000K"+
		"\u0005\u0001\u0000\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0005+\u0000"+
		"\u0000NR\u0005\u0003\u0000\u0000OP\u0003\u0010\b\u0000PQ\u0006\u0003\uffff"+
		"\uffff\u0000QS\u0001\u0000\u0000\u0000RO\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TX\u0005\u0004\u0000\u0000"+
		"UV\u0003\u0018\f\u0000VW\u0006\u0003\uffff\uffff\u0000WY\u0001\u0000\u0000"+
		"\u0000XU\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000Z`\u0005\u0005\u0000\u0000[\\\u0003\u0004\u0002\u0000\\]\u0006"+
		"\u0003\uffff\uffff\u0000]_\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000"+
		"\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000"+
		"\u0000\u0000ah\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0003"+
		"\b\u0004\u0000de\u0006\u0003\uffff\uffff\u0000eg\u0001\u0000\u0000\u0000"+
		"fc\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000kl\u0005\u0006\u0000\u0000lm\u0006\u0003\uffff\uffff\u0000"+
		"m\u0007\u0001\u0000\u0000\u0000no\u0003\u000e\u0007\u0000op\u0005\t\u0000"+
		"\u0000pq\u0003\u000e\u0007\u0000qr\u0005\b\u0000\u0000rs\u0006\u0004\uffff"+
		"\uffff\u0000s\u00a2\u0001\u0000\u0000\u0000tu\u0005\n\u0000\u0000uv\u0003"+
		"\u000e\u0007\u0000vw\u0005\b\u0000\u0000wx\u0006\u0004\uffff\uffff\u0000"+
		"x\u00a2\u0001\u0000\u0000\u0000yz\u0005\u000b\u0000\u0000z{\u0003\u000e"+
		"\u0007\u0000{|\u0005\b\u0000\u0000|}\u0006\u0004\uffff\uffff\u0000}\u00a2"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\f\u0000\u0000\u007f\u0080\u0003"+
		"\f\u0006\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0082\u0006\u0004"+
		"\uffff\uffff\u0000\u0082\u00a2\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		"\r\u0000\u0000\u0084\u0085\u0005\u0003\u0000\u0000\u0085\u0086\u0003\f"+
		"\u0006\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u0088\u0003\n\u0005"+
		"\u0000\u0088\u0089\u0006\u0004\uffff\uffff\u0000\u0089\u00a2\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0005\u000e\u0000\u0000\u008b\u008c\u0005\u0003"+
		"\u0000\u0000\u008c\u008d\u0003\f\u0006\u0000\u008d\u008e\u0005\u0004\u0000"+
		"\u0000\u008e\u0093\u0003\n\u0005\u0000\u008f\u0090\u0005\u000f\u0000\u0000"+
		"\u0090\u0091\u0003\n\u0005\u0000\u0091\u0092\u0006\u0004\uffff\uffff\u0000"+
		"\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000"+
		"\u0095\u0096\u0006\u0004\uffff\uffff\u0000\u0096\u00a2\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005+\u0000\u0000\u0098\u009c\u0005\u0003\u0000\u0000"+
		"\u0099\u009a\u0003\u000e\u0007\u0000\u009a\u009b\u0006\u0004\uffff\uffff"+
		"\u0000\u009b\u009d\u0001\u0000\u0000\u0000\u009c\u0099\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a0\u0005\b\u0000\u0000"+
		"\u00a0\u00a2\u0006\u0004\uffff\uffff\u0000\u00a1n\u0001\u0000\u0000\u0000"+
		"\u00a1t\u0001\u0000\u0000\u0000\u00a1y\u0001\u0000\u0000\u0000\u00a1~"+
		"\u0001\u0000\u0000\u0000\u00a1\u0083\u0001\u0000\u0000\u0000\u00a1\u008a"+
		"\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a2\t\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0003\b\u0004\u0000\u00a4\u00a5\u0006\u0005"+
		"\uffff\uffff\u0000\u00a5\u00b1\u0001\u0000\u0000\u0000\u00a6\u00ac\u0005"+
		"\u0005\u0000\u0000\u00a7\u00a8\u0003\b\u0004\u0000\u00a8\u00a9\u0006\u0005"+
		"\uffff\uffff\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00b1\u0005"+
		"\u0006\u0000\u0000\u00b0\u00a3\u0001\u0000\u0000\u0000\u00b0\u00a6\u0001"+
		"\u0000\u0000\u0000\u00b1\u000b\u0001\u0000\u0000\u0000\u00b2\u00b3\u0006"+
		"\u0006\uffff\uffff\u0000\u00b3\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5"+
		"\u0003\f\u0006\u0000\u00b5\u00b6\u0005\u0004\u0000\u0000\u00b6\u00b7\u0006"+
		"\u0006\uffff\uffff\u0000\u00b7\u00d8\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0003\u0018\f\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u00bb\u0003"+
		"\f\u0006\u0000\u00bb\u00bc\u0005\u0004\u0000\u0000\u00bc\u00bd\u0006\u0006"+
		"\uffff\uffff\u0000\u00bd\u00d8\u0001\u0000\u0000\u0000\u00be\u00bf\u0005"+
		"\u0013\u0000\u0000\u00bf\u00c0\u0003\f\u0006\u000b\u00c0\u00c1\u0006\u0006"+
		"\uffff\uffff\u0000\u00c1\u00d8\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0014\u0000\u0000\u00c3\u00c4\u0003\f\u0006\n\u00c4\u00c5\u0006\u0006"+
		"\uffff\uffff\u0000\u00c5\u00d8\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005"+
		"+\u0000\u0000\u00c7\u00cb\u0005\u0003\u0000\u0000\u00c8\u00c9\u0003\u000e"+
		"\u0007\u0000\u00c9\u00ca\u0006\u0006\uffff\uffff\u0000\u00ca\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0004\u0000\u0000\u00ce\u00d8\u0006\u0006\uffff\uffff\u0000\u00cf\u00d0"+
		"\u0005&\u0000\u0000\u00d0\u00d8\u0006\u0006\uffff\uffff\u0000\u00d1\u00d2"+
		"\u0005\'\u0000\u0000\u00d2\u00d8\u0006\u0006\uffff\uffff\u0000\u00d3\u00d4"+
		"\u0005*\u0000\u0000\u00d4\u00d8\u0006\u0006\uffff\uffff\u0000\u00d5\u00d6"+
		"\u0005+\u0000\u0000\u00d6\u00d8\u0006\u0006\uffff\uffff\u0000\u00d7\u00b2"+
		"\u0001\u0000\u0000\u0000\u00d7\u00b8\u0001\u0000\u0000\u0000\u00d7\u00be"+
		"\u0001\u0000\u0000\u0000\u00d7\u00c2\u0001\u0000\u0000\u0000\u00d7\u00c6"+
		"\u0001\u0000\u0000\u0000\u00d7\u00cf\u0001\u0000\u0000\u0000\u00d7\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d3\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00f9\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\n\t\u0000\u0000\u00da\u00db\u0007\u0000\u0000\u0000\u00db\u00dc\u0003"+
		"\f\u0006\n\u00dc\u00dd\u0006\u0006\uffff\uffff\u0000\u00dd\u00f8\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\n\b\u0000\u0000\u00df\u00e0\u0007\u0001"+
		"\u0000\u0000\u00e0\u00e1\u0003\f\u0006\t\u00e1\u00e2\u0006\u0006\uffff"+
		"\uffff\u0000\u00e2\u00f8\u0001\u0000\u0000\u0000\u00e3\u00e4\n\u0007\u0000"+
		"\u0000\u00e4\u00e5\u0007\u0002\u0000\u0000\u00e5\u00e6\u0003\f\u0006\b"+
		"\u00e6\u00e7\u0006\u0006\uffff\uffff\u0000\u00e7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\n\u0006\u0000\u0000\u00e9\u00ea\u0007\u0003\u0000\u0000"+
		"\u00ea\u00eb\u0003\f\u0006\u0007\u00eb\u00ec\u0006\u0006\uffff\uffff\u0000"+
		"\u00ec\u00f8\u0001\u0000\u0000\u0000\u00ed\u00ee\n\u000e\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0010\u0000\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u00f8"+
		"\u0006\u0006\uffff\uffff\u0000\u00f1\u00f2\n\r\u0000\u0000\u00f2\u00f3"+
		"\u0005\u0011\u0000\u0000\u00f3\u00f4\u0003\f\u0006\u0000\u00f4\u00f5\u0005"+
		"\u0012\u0000\u0000\u00f5\u00f6\u0006\u0006\uffff\uffff\u0000\u00f6\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00d9\u0001\u0000\u0000\u0000\u00f7\u00de"+
		"\u0001\u0000\u0000\u0000\u00f7\u00e3\u0001\u0000\u0000\u0000\u00f7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f7\u00ed\u0001\u0000\u0000\u0000\u00f7\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\r\u0001"+
		"\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003"+
		"\f\u0006\u0000\u00fd\u00fe\u0006\u0007\uffff\uffff\u0000\u00fe\u0106\u0001"+
		"\u0000\u0000\u0000\u00ff\u0100\u0003\f\u0006\u0000\u0100\u0101\u0006\u0007"+
		"\uffff\uffff\u0000\u0101\u0102\u0005!\u0000\u0000\u0102\u0103\u0003\u000e"+
		"\u0007\u0000\u0103\u0104\u0006\u0007\uffff\uffff\u0000\u0104\u0106\u0001"+
		"\u0000\u0000\u0000\u0105\u00fc\u0001\u0000\u0000\u0000\u0105\u00ff\u0001"+
		"\u0000\u0000\u0000\u0106\u000f\u0001\u0000\u0000\u0000\u0107\u0108\u0003"+
		"\u0012\t\u0000\u0108\u0109\u0006\b\uffff\uffff\u0000\u0109\u0110\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0003\u0012\t\u0000\u010b\u010c\u0005!"+
		"\u0000\u0000\u010c\u010d\u0003\u0010\b\u0000\u010d\u010e\u0006\b\uffff"+
		"\uffff\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0107\u0001\u0000"+
		"\u0000\u0000\u010f\u010a\u0001\u0000\u0000\u0000\u0110\u0011\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\u0007\u0000\u0000\u0112\u0113\u0005+\u0000"+
		"\u0000\u0113\u0114\u0003\u0018\f\u0000\u0114\u0115\u0006\t\uffff\uffff"+
		"\u0000\u0115\u0013\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u0018\f\u0000"+
		"\u0117\u0118\u0006\n\uffff\uffff\u0000\u0118\u012c\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\u0011\u0000\u0000\u011a\u011b\u0005&\u0000\u0000\u011b"+
		"\u011c\u0005\u0012\u0000\u0000\u011c\u011d\u0003\u0014\n\u0000\u011d\u011e"+
		"\u0006\n\uffff\uffff\u0000\u011e\u012c\u0001\u0000\u0000\u0000\u011f\u0120"+
		"\u0005\"\u0000\u0000\u0120\u0126\u0005\u0005\u0000\u0000\u0121\u0122\u0003"+
		"\u0016\u000b\u0000\u0122\u0123\u0006\n\uffff\uffff\u0000\u0123\u0125\u0001"+
		"\u0000\u0000\u0000\u0124\u0121\u0001\u0000\u0000\u0000\u0125\u0128\u0001"+
		"\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001"+
		"\u0000\u0000\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0129\u012a\u0006\n\uffff\uffff\u0000\u012a\u012c\u0005"+
		"\u0006\u0000\u0000\u012b\u0116\u0001\u0000\u0000\u0000\u012b\u0119\u0001"+
		"\u0000\u0000\u0000\u012b\u011f\u0001\u0000\u0000\u0000\u012c\u0015\u0001"+
		"\u0000\u0000\u0000\u012d\u012e\u0005\u0007\u0000\u0000\u012e\u012f\u0003"+
		"\u001a\r\u0000\u012f\u0130\u0003\u0014\n\u0000\u0130\u0131\u0005\b\u0000"+
		"\u0000\u0131\u0132\u0006\u000b\uffff\uffff\u0000\u0132\u0017\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005#\u0000\u0000\u0134\u013a\u0006\f\uffff"+
		"\uffff\u0000\u0135\u0136\u0005$\u0000\u0000\u0136\u013a\u0006\f\uffff"+
		"\uffff\u0000\u0137\u0138\u0005%\u0000\u0000\u0138\u013a\u0006\f\uffff"+
		"\uffff\u0000\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0135\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u0019\u0001\u0000"+
		"\u0000\u0000\u013b\u013c\u0005+\u0000\u0000\u013c\u0143\u0006\r\uffff"+
		"\uffff\u0000\u013d\u013e\u0005+\u0000\u0000\u013e\u013f\u0005!\u0000\u0000"+
		"\u013f\u0140\u0003\u001a\r\u0000\u0140\u0141\u0006\r\uffff\uffff\u0000"+
		"\u0141\u0143\u0001\u0000\u0000\u0000\u0142\u013b\u0001\u0000\u0000\u0000"+
		"\u0142\u013d\u0001\u0000\u0000\u0000\u0143\u001b\u0001\u0000\u0000\u0000"+
		"\u0017!.6DRX`h\u0093\u009c\u00a1\u00ac\u00b0\u00cb\u00d7\u00f7\u00f9\u0105"+
		"\u010f\u0126\u012b\u0139\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}