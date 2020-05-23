// Generated from D:/Documents/Tareas/NOVENA_MATRICULA/Lenguajes_de_programacion/Practicas/Chocopy-to-Javascript-translator/Grammar\chocogrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chocogrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, AND=2, OR=3, IF=4, ELSE=5, ELIF=6, TK_PAR_IZQ=7, TK_PAR_DER=8, 
		TK_COR_IZQ=9, TK_COR_DER=10, TK_MENOS=11, TK_COMMA=12, TK_PUNTO=13, TK_ASIG=14, 
		CLASS=15, TK_DOS_PUNTOS=16, PASS=17, DEF=18, GLOBAL=19, NONLOCAL=20, WHILE=21, 
		FOR=22, IN=23, NONE=24, TRUE=25, FALSE=26, TK_MAS=27, TK_POR=28, TK_DIV=29, 
		TK_MOD=30, TK_COMP=31, TK_DIF=32, TK_MENOR_IG=33, TK_MAYOR_IG=34, TK_MENOR=35, 
		TK_MAYOR=36, TK_IS=37, RETURN=38, TK_FUNC_TYPE=39, PRINT=40, ID=41, IDSTRING=42, 
		STRING=43, INTEGER=44, LINE_COMMENT=45, SKIP_=46, NEWLINE=47, INDENT=48, 
		DEDENT=49;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_func_def = 3, 
		RULE_func_body = 4, RULE_typed_var = 5, RULE_type = 6, RULE_global_decl = 7, 
		RULE_nonlocal_decl = 8, RULE_var_def = 9, RULE_stmt = 10, RULE_if_expr = 11, 
		RULE_while_expr = 12, RULE_for_expr = 13, RULE_simple_stmt = 14, RULE_asig_stmt = 15, 
		RULE_return_st = 16, RULE_block = 17, RULE_literal = 18, RULE_expr = 19, 
		RULE_not_expr = 20, RULE_cexpr = 21, RULE_print = 22, RULE_bin_op = 23, 
		RULE_target = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "func_def", "func_body", "typed_var", 
			"type", "global_decl", "nonlocal_decl", "var_def", "stmt", "if_expr", 
			"while_expr", "for_expr", "simple_stmt", "asig_stmt", "return_st", "block", 
			"literal", "expr", "not_expr", "cexpr", "print", "bin_op", "target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'not'", "'and'", "'or'", "'if'", "'else'", "'elif'", "'('", "')'", 
			"'['", "']'", "'-'", "','", "'.'", "'='", "'class'", "':'", "'pass'", 
			"'def'", "'global'", "'nonlocal'", "'while'", "'for'", "'in'", "'None'", 
			"'True'", "'False'", "'+'", "'*'", "'//'", "'%'", "'=='", "'!='", "'<='", 
			"'>='", "'<'", "'>'", "'is'", "'return'", "'->'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NOT", "AND", "OR", "IF", "ELSE", "ELIF", "TK_PAR_IZQ", "TK_PAR_DER", 
			"TK_COR_IZQ", "TK_COR_DER", "TK_MENOS", "TK_COMMA", "TK_PUNTO", "TK_ASIG", 
			"CLASS", "TK_DOS_PUNTOS", "PASS", "DEF", "GLOBAL", "NONLOCAL", "WHILE", 
			"FOR", "IN", "NONE", "TRUE", "FALSE", "TK_MAS", "TK_POR", "TK_DIV", "TK_MOD", 
			"TK_COMP", "TK_DIF", "TK_MENOR_IG", "TK_MAYOR_IG", "TK_MENOR", "TK_MAYOR", 
			"TK_IS", "RETURN", "TK_FUNC_TYPE", "PRINT", "ID", "IDSTRING", "STRING", 
			"INTEGER", "LINE_COMMENT", "SKIP_", "NEWLINE", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "chocogrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public chocogrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(53);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(50);
						var_def();
						}
						break;
					case DEF:
						{
						setState(51);
						func_def();
						}
						break;
					case CLASS:
						{
						setState(52);
						class_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(58);
				stmt();
				}
				}
				setState(63);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(chocogrammarParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(chocogrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(chocogrammarParser.ID, i);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocogrammarParser.INDENT, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(chocogrammarParser.DEDENT, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CLASS);
			setState(65);
			match(ID);
			setState(66);
			match(TK_PAR_IZQ);
			setState(67);
			match(ID);
			setState(68);
			match(TK_PAR_DER);
			setState(69);
			match(TK_DOS_PUNTOS);
			setState(70);
			match(NEWLINE);
			setState(71);
			match(INDENT);
			setState(72);
			class_body();
			setState(73);
			match(DEDENT);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(chocogrammarParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterClass_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitClass_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitClass_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_body);
		int _la;
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(PASS);
				setState(76);
				match(NEWLINE);
				}
				break;
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(79);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(77);
						var_def();
						}
						break;
					case DEF:
						{
						setState(78);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF || _la==ID );
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(chocogrammarParser.DEF, 0); }
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocogrammarParser.INDENT, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(chocogrammarParser.DEDENT, 0); }
		public List<Typed_varContext> typed_var() {
			return getRuleContexts(Typed_varContext.class);
		}
		public Typed_varContext typed_var(int i) {
			return getRuleContext(Typed_varContext.class,i);
		}
		public TerminalNode TK_FUNC_TYPE() { return getToken(chocogrammarParser.TK_FUNC_TYPE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(chocogrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(chocogrammarParser.TK_COMMA, i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(DEF);
			setState(86);
			match(ID);
			setState(87);
			match(TK_PAR_IZQ);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(88);
				typed_var();
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(89);
					match(TK_COMMA);
					setState(90);
					typed_var();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(98);
			match(TK_PAR_DER);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_FUNC_TYPE) {
				{
				setState(99);
				match(TK_FUNC_TYPE);
				setState(100);
				type();
				}
			}

			setState(103);
			match(TK_DOS_PUNTOS);
			setState(104);
			match(NEWLINE);
			setState(105);
			match(INDENT);
			setState(106);
			func_body();
			setState(107);
			match(DEDENT);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public List<Global_declContext> global_decl() {
			return getRuleContexts(Global_declContext.class);
		}
		public Global_declContext global_decl(int i) {
			return getRuleContext(Global_declContext.class,i);
		}
		public List<Nonlocal_declContext> nonlocal_decl() {
			return getRuleContexts(Nonlocal_declContext.class);
		}
		public Nonlocal_declContext nonlocal_decl(int i) {
			return getRuleContext(Nonlocal_declContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(113);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(109);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(110);
						nonlocal_decl();
						}
						break;
					case ID:
						{
						setState(111);
						var_def();
						}
						break;
					case DEF:
						{
						setState(112);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(119); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				stmt();
				}
				}
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
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

	public static class Typed_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterTyped_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitTyped_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitTyped_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_varContext typed_var() throws RecognitionException {
		Typed_varContext _localctx = new Typed_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typed_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(ID);
			setState(124);
			match(TK_DOS_PUNTOS);
			setState(125);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public TerminalNode IDSTRING() { return getToken(chocogrammarParser.IDSTRING, 0); }
		public TerminalNode TK_COR_IZQ() { return getToken(chocogrammarParser.TK_COR_IZQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_COR_DER() { return getToken(chocogrammarParser.TK_COR_DER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(ID);
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(IDSTRING);
				}
				break;
			case TK_COR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(TK_COR_IZQ);
				setState(130);
				type();
				setState(131);
				match(TK_COR_DER);
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

	public static class Global_declContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(chocogrammarParser.GLOBAL, 0); }
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public Global_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterGlobal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitGlobal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitGlobal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_declContext global_decl() throws RecognitionException {
		Global_declContext _localctx = new Global_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(GLOBAL);
			setState(136);
			match(ID);
			setState(137);
			match(NEWLINE);
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

	public static class Nonlocal_declContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(chocogrammarParser.NONLOCAL, 0); }
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public Nonlocal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterNonlocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitNonlocal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitNonlocal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_declContext nonlocal_decl() throws RecognitionException {
		Nonlocal_declContext _localctx = new Nonlocal_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonlocal_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(NONLOCAL);
			setState(140);
			match(ID);
			setState(141);
			match(NEWLINE);
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

	public static class Var_defContext extends ParserRuleContext {
		public Typed_varContext typed_var() {
			return getRuleContext(Typed_varContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(chocogrammarParser.TK_ASIG, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			typed_var();
			setState(144);
			match(TK_ASIG);
			setState(145);
			literal();
			setState(146);
			match(NEWLINE);
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

	public static class StmtContext extends ParserRuleContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public If_exprContext if_expr() {
			return getRuleContext(If_exprContext.class,0);
		}
		public While_exprContext while_expr() {
			return getRuleContext(While_exprContext.class,0);
		}
		public For_exprContext for_expr() {
			return getRuleContext(For_exprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TK_PAR_IZQ:
			case TK_COR_IZQ:
			case TK_MENOS:
			case PASS:
			case NONE:
			case TRUE:
			case FALSE:
			case RETURN:
			case PRINT:
			case ID:
			case IDSTRING:
			case STRING:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				simple_stmt();
				setState(149);
				match(NEWLINE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				if_expr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				while_expr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				for_expr();
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

	public static class If_exprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(chocogrammarParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_DOS_PUNTOS() { return getTokens(chocogrammarParser.TK_DOS_PUNTOS); }
		public TerminalNode TK_DOS_PUNTOS(int i) {
			return getToken(chocogrammarParser.TK_DOS_PUNTOS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(chocogrammarParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(chocogrammarParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(chocogrammarParser.ELSE, 0); }
		public If_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterIf_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitIf_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitIf_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_exprContext if_expr() throws RecognitionException {
		If_exprContext _localctx = new If_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IF);
			setState(157);
			expr(0);
			setState(158);
			match(TK_DOS_PUNTOS);
			setState(159);
			block();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(160);
				match(ELIF);
				setState(161);
				expr(0);
				setState(162);
				match(TK_DOS_PUNTOS);
				setState(163);
				block();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(170);
				match(ELSE);
				setState(171);
				match(TK_DOS_PUNTOS);
				setState(172);
				block();
				}
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

	public static class While_exprContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(chocogrammarParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterWhile_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitWhile_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitWhile_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_exprContext while_expr() throws RecognitionException {
		While_exprContext _localctx = new While_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WHILE);
			setState(176);
			expr(0);
			setState(177);
			match(TK_DOS_PUNTOS);
			setState(178);
			block();
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

	public static class For_exprContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(chocogrammarParser.FOR, 0); }
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public TerminalNode IN() { return getToken(chocogrammarParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterFor_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitFor_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitFor_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_exprContext for_expr() throws RecognitionException {
		For_exprContext _localctx = new For_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_for_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(FOR);
			setState(181);
			match(ID);
			setState(182);
			match(IN);
			setState(183);
			expr(0);
			setState(184);
			match(TK_DOS_PUNTOS);
			setState(185);
			block();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(chocogrammarParser.PASS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stContext return_st() {
			return getRuleContext(Return_stContext.class,0);
		}
		public Asig_stmtContext asig_stmt() {
			return getRuleContext(Asig_stmtContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simple_stmt);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				return_st();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(190);
				asig_stmt();
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

	public static class Asig_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> TK_ASIG() { return getTokens(chocogrammarParser.TK_ASIG); }
		public TerminalNode TK_ASIG(int i) {
			return getToken(chocogrammarParser.TK_ASIG, i);
		}
		public Asig_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterAsig_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitAsig_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitAsig_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asig_stmtContext asig_stmt() throws RecognitionException {
		Asig_stmtContext _localctx = new Asig_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asig_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(193);
					target();
					setState(194);
					match(TK_ASIG);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(200);
			expr(0);
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

	public static class Return_stContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(chocogrammarParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterReturn_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitReturn_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitReturn_st(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stContext return_st() throws RecognitionException {
		Return_stContext _localctx = new Return_stContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(RETURN);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
				{
				setState(203);
				expr(0);
				}
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocogrammarParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(chocogrammarParser.DEDENT, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(NEWLINE);
			setState(207);
			match(INDENT);
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				stmt();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
			setState(213);
			match(DEDENT);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(chocogrammarParser.NONE, 0); }
		public TerminalNode TRUE() { return getToken(chocogrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(chocogrammarParser.FALSE, 0); }
		public TerminalNode INTEGER() { return getToken(chocogrammarParser.INTEGER, 0); }
		public TerminalNode IDSTRING() { return getToken(chocogrammarParser.IDSTRING, 0); }
		public TerminalNode STRING() { return getToken(chocogrammarParser.STRING, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public Not_exprContext not_expr() {
			return getRuleContext(Not_exprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(chocogrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(chocogrammarParser.OR, 0); }
		public TerminalNode IF() { return getToken(chocogrammarParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(chocogrammarParser.ELSE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PAR_IZQ:
			case TK_COR_IZQ:
			case TK_MENOS:
			case NONE:
			case TRUE:
			case FALSE:
			case PRINT:
			case ID:
			case IDSTRING:
			case STRING:
			case INTEGER:
				{
				setState(218);
				cexpr(0);
				}
				break;
			case NOT:
				{
				setState(219);
				not_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(222);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(223);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(225);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(226);
						match(IF);
						setState(227);
						expr(0);
						setState(228);
						match(ELSE);
						setState(229);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Not_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(chocogrammarParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Not_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterNot_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitNot_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitNot_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_exprContext not_expr() throws RecognitionException {
		Not_exprContext _localctx = new Not_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_not_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NOT);
			setState(237);
			expr(0);
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

	public static class CexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TK_COR_IZQ() { return getToken(chocogrammarParser.TK_COR_IZQ, 0); }
		public TerminalNode TK_COR_DER() { return getToken(chocogrammarParser.TK_COR_DER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_COMMA() { return getTokens(chocogrammarParser.TK_COMMA); }
		public TerminalNode TK_COMMA(int i) {
			return getToken(chocogrammarParser.TK_COMMA, i);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode TK_MENOS() { return getToken(chocogrammarParser.TK_MENOS, 0); }
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(chocogrammarParser.TK_PUNTO, 0); }
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterCexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitCexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitCexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_cexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(240);
				match(ID);
				}
				break;
			case 2:
				{
				setState(241);
				literal();
				}
				break;
			case 3:
				{
				setState(242);
				match(TK_COR_IZQ);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(243);
					expr(0);
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(244);
						match(TK_COMMA);
						setState(245);
						expr(0);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(253);
				match(TK_COR_DER);
				}
				break;
			case 4:
				{
				setState(254);
				match(TK_PAR_IZQ);
				setState(255);
				expr(0);
				setState(256);
				match(TK_PAR_DER);
				}
				break;
			case 5:
				{
				setState(258);
				match(ID);
				setState(259);
				match(TK_PAR_IZQ);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(260);
					expr(0);
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(261);
						match(TK_COMMA);
						setState(262);
						expr(0);
						}
						}
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(270);
				match(TK_PAR_DER);
				}
				break;
			case 6:
				{
				setState(271);
				print();
				}
				break;
			case 7:
				{
				setState(272);
				match(TK_MENOS);
				setState(273);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(276);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(277);
						bin_op();
						setState(278);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(280);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(281);
						match(TK_PUNTO);
						setState(282);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(283);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(284);
						match(TK_COR_IZQ);
						setState(285);
						expr(0);
						setState(286);
						match(TK_COR_DER);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(288);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(289);
						match(TK_PUNTO);
						setState(290);
						match(ID);
						setState(291);
						match(TK_PAR_IZQ);
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
							{
							setState(292);
							expr(0);
							setState(297);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==TK_COMMA) {
								{
								{
								setState(293);
								match(TK_COMMA);
								setState(294);
								expr(0);
								}
								}
								setState(299);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(302);
						match(TK_PAR_DER);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(chocogrammarParser.PRINT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(PRINT);
			setState(309);
			match(TK_PAR_IZQ);
			setState(310);
			expr(0);
			setState(311);
			match(TK_PAR_DER);
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode TK_MAS() { return getToken(chocogrammarParser.TK_MAS, 0); }
		public TerminalNode TK_MENOS() { return getToken(chocogrammarParser.TK_MENOS, 0); }
		public TerminalNode TK_POR() { return getToken(chocogrammarParser.TK_POR, 0); }
		public TerminalNode TK_DIV() { return getToken(chocogrammarParser.TK_DIV, 0); }
		public TerminalNode TK_MOD() { return getToken(chocogrammarParser.TK_MOD, 0); }
		public TerminalNode TK_COMP() { return getToken(chocogrammarParser.TK_COMP, 0); }
		public TerminalNode TK_DIF() { return getToken(chocogrammarParser.TK_DIF, 0); }
		public TerminalNode TK_MENOR_IG() { return getToken(chocogrammarParser.TK_MENOR_IG, 0); }
		public TerminalNode TK_MAYOR_IG() { return getToken(chocogrammarParser.TK_MAYOR_IG, 0); }
		public TerminalNode TK_MENOR() { return getToken(chocogrammarParser.TK_MENOR, 0); }
		public TerminalNode TK_MAYOR() { return getToken(chocogrammarParser.TK_MAYOR, 0); }
		public TerminalNode TK_IS() { return getToken(chocogrammarParser.TK_IS, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOS) | (1L << TK_MAS) | (1L << TK_POR) | (1L << TK_DIV) | (1L << TK_MOD) | (1L << TK_COMP) | (1L << TK_DIF) | (1L << TK_MENOR_IG) | (1L << TK_MAYOR_IG) | (1L << TK_MENOR) | (1L << TK_MAYOR) | (1L << TK_IS))) != 0)) ) {
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(chocogrammarParser.ID, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(chocogrammarParser.TK_PUNTO, 0); }
		public TerminalNode TK_COR_IZQ() { return getToken(chocogrammarParser.TK_COR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_COR_DER() { return getToken(chocogrammarParser.TK_COR_DER, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_target);
		try {
			setState(325);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				cexpr(0);
				setState(317);
				match(TK_PUNTO);
				setState(318);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				cexpr(0);
				setState(321);
				match(TK_COR_IZQ);
				setState(322);
				expr(0);
				setState(323);
				match(TK_COR_DER);
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
		case 19:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 21:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u014a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\7\2>\n\2\f\2\16\2A"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4"+
		"R\n\4\r\4\16\4S\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13"+
		"\5\5\5c\n\5\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\7\6t\n\6\f\6\16\6w\13\6\3\6\6\6z\n\6\r\6\16\6{\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u0088\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00a8\n\r\f\r\16\r\u00ab\13\r\3\r\3\r\3\r"+
		"\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\5\20\u00c2\n\20\3\21\3\21\3\21\6\21\u00c7\n"+
		"\21\r\21\16\21\u00c8\3\21\3\21\3\22\3\22\5\22\u00cf\n\22\3\23\3\23\3\23"+
		"\6\23\u00d4\n\23\r\23\16\23\u00d5\3\23\3\23\3\24\3\24\3\25\3\25\3\25\5"+
		"\25\u00df\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00ea"+
		"\n\25\f\25\16\25\u00ed\13\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc\13\27\5\27\u00fe\n\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u010a\n\27\f\27\16\27"+
		"\u010d\13\27\5\27\u010f\n\27\3\27\3\27\3\27\3\27\5\27\u0115\n\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u012a\n\27\f\27\16\27\u012d\13\27\5\27\u012f"+
		"\n\27\3\27\7\27\u0132\n\27\f\27\16\27\u0135\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0148\n\32\3\32\2\4(,\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\2\5\4\2\32\34,.\3\2\4\5\4\2\r\r\35\'\2\u0161\29\3\2\2\2\4B"+
		"\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\nu\3\2\2\2\f}\3\2\2\2\16\u0087\3\2\2\2"+
		"\20\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u0091\3\2\2\2\26\u009c\3\2\2\2\30"+
		"\u009e\3\2\2\2\32\u00b1\3\2\2\2\34\u00b6\3\2\2\2\36\u00c1\3\2\2\2 \u00c6"+
		"\3\2\2\2\"\u00cc\3\2\2\2$\u00d0\3\2\2\2&\u00d9\3\2\2\2(\u00de\3\2\2\2"+
		"*\u00ee\3\2\2\2,\u0114\3\2\2\2.\u0136\3\2\2\2\60\u013b\3\2\2\2\62\u0147"+
		"\3\2\2\2\648\5\24\13\2\658\5\b\5\2\668\5\4\3\2\67\64\3\2\2\2\67\65\3\2"+
		"\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:?\3\2\2\2;9\3\2\2\2"+
		"<>\5\26\f\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2"+
		"\2BC\7\21\2\2CD\7+\2\2DE\7\t\2\2EF\7+\2\2FG\7\n\2\2GH\7\22\2\2HI\7\61"+
		"\2\2IJ\7\62\2\2JK\5\6\4\2KL\7\63\2\2L\5\3\2\2\2MN\7\23\2\2NV\7\61\2\2"+
		"OR\5\24\13\2PR\5\b\5\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2TV\3\2\2\2UM\3\2\2\2UQ\3\2\2\2V\7\3\2\2\2WX\7\24\2\2XY\7+\2\2Yb\7\t"+
		"\2\2Z_\5\f\7\2[\\\7\16\2\2\\^\5\f\7\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`"+
		"\3\2\2\2`c\3\2\2\2a_\3\2\2\2bZ\3\2\2\2bc\3\2\2\2cd\3\2\2\2dg\7\n\2\2e"+
		"f\7)\2\2fh\5\16\b\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\22\2\2jk\7\61\2"+
		"\2kl\7\62\2\2lm\5\n\6\2mn\7\63\2\2n\t\3\2\2\2ot\5\20\t\2pt\5\22\n\2qt"+
		"\5\24\13\2rt\5\b\5\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2"+
		"us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2\2xz\5\26\f\2yx\3\2\2\2z{\3\2\2"+
		"\2{y\3\2\2\2{|\3\2\2\2|\13\3\2\2\2}~\7+\2\2~\177\7\22\2\2\177\u0080\5"+
		"\16\b\2\u0080\r\3\2\2\2\u0081\u0088\7+\2\2\u0082\u0088\7,\2\2\u0083\u0084"+
		"\7\13\2\2\u0084\u0085\5\16\b\2\u0085\u0086\7\f\2\2\u0086\u0088\3\2\2\2"+
		"\u0087\u0081\3\2\2\2\u0087\u0082\3\2\2\2\u0087\u0083\3\2\2\2\u0088\17"+
		"\3\2\2\2\u0089\u008a\7\25\2\2\u008a\u008b\7+\2\2\u008b\u008c\7\61\2\2"+
		"\u008c\21\3\2\2\2\u008d\u008e\7\26\2\2\u008e\u008f\7+\2\2\u008f\u0090"+
		"\7\61\2\2\u0090\23\3\2\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7\20\2\2\u0093"+
		"\u0094\5&\24\2\u0094\u0095\7\61\2\2\u0095\25\3\2\2\2\u0096\u0097\5\36"+
		"\20\2\u0097\u0098\7\61\2\2\u0098\u009d\3\2\2\2\u0099\u009d\5\30\r\2\u009a"+
		"\u009d\5\32\16\2\u009b\u009d\5\34\17\2\u009c\u0096\3\2\2\2\u009c\u0099"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\27\3\2\2\2\u009e"+
		"\u009f\7\6\2\2\u009f\u00a0\5(\25\2\u00a0\u00a1\7\22\2\2\u00a1\u00a9\5"+
		"$\23\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5(\25\2\u00a4\u00a5\7\22\2\2\u00a5"+
		"\u00a6\5$\23\2\u00a6\u00a8\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a8\u00ab\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\7\22\2\2\u00ae\u00b0\5"+
		"$\23\2\u00af\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\31\3\2\2\2\u00b1"+
		"\u00b2\7\27\2\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\5"+
		"$\23\2\u00b5\33\3\2\2\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8\7+\2\2\u00b8"+
		"\u00b9\7\31\2\2\u00b9\u00ba\5(\25\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\5"+
		"$\23\2\u00bc\35\3\2\2\2\u00bd\u00c2\7\23\2\2\u00be\u00c2\5(\25\2\u00bf"+
		"\u00c2\5\"\22\2\u00c0\u00c2\5 \21\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3"+
		"\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\37\3\2\2\2\u00c3"+
		"\u00c4\5\62\32\2\u00c4\u00c5\7\20\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c3"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\3\2\2\2\u00ca\u00cb\5(\25\2\u00cb!\3\2\2\2\u00cc\u00ce\7(\2\2\u00cd"+
		"\u00cf\5(\25\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf#\3\2\2\2"+
		"\u00d0\u00d1\7\61\2\2\u00d1\u00d3\7\62\2\2\u00d2\u00d4\5\26\f\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\63\2\2\u00d8%\3\2\2\2\u00d9\u00da"+
		"\t\2\2\2\u00da\'\3\2\2\2\u00db\u00dc\b\25\1\2\u00dc\u00df\5,\27\2\u00dd"+
		"\u00df\5*\26\2\u00de\u00db\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00eb\3\2"+
		"\2\2\u00e0\u00e1\f\4\2\2\u00e1\u00e2\t\3\2\2\u00e2\u00ea\5(\25\5\u00e3"+
		"\u00e4\f\3\2\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7\7\7"+
		"\2\2\u00e7\u00e8\5(\25\4\u00e8\u00ea\3\2\2\2\u00e9\u00e0\3\2\2\2\u00e9"+
		"\u00e3\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec)\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7\3\2\2\u00ef\u00f0"+
		"\5(\25\2\u00f0+\3\2\2\2\u00f1\u00f2\b\27\1\2\u00f2\u0115\7+\2\2\u00f3"+
		"\u0115\5&\24\2\u00f4\u00fd\7\13\2\2\u00f5\u00fa\5(\25\2\u00f6\u00f7\7"+
		"\16\2\2\u00f7\u00f9\5(\25\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0115\7\f\2\2\u0100\u0101\7\t\2\2\u0101\u0102\5(\25\2\u0102\u0103\7\n"+
		"\2\2\u0103\u0115\3\2\2\2\u0104\u0105\7+\2\2\u0105\u010e\7\t\2\2\u0106"+
		"\u010b\5(\25\2\u0107\u0108\7\16\2\2\u0108\u010a\5(\25\2\u0109\u0107\3"+
		"\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0106\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0115\7\n\2\2\u0111\u0115\5.\30\2\u0112"+
		"\u0113\7\r\2\2\u0113\u0115\5,\27\3\u0114\u00f1\3\2\2\2\u0114\u00f3\3\2"+
		"\2\2\u0114\u00f4\3\2\2\2\u0114\u0100\3\2\2\2\u0114\u0104\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0133\3\2\2\2\u0116\u0117\f\4"+
		"\2\2\u0117\u0118\5\60\31\2\u0118\u0119\5,\27\5\u0119\u0132\3\2\2\2\u011a"+
		"\u011b\f\t\2\2\u011b\u011c\7\17\2\2\u011c\u0132\7+\2\2\u011d\u011e\f\b"+
		"\2\2\u011e\u011f\7\13\2\2\u011f\u0120\5(\25\2\u0120\u0121\7\f\2\2\u0121"+
		"\u0132\3\2\2\2\u0122\u0123\f\7\2\2\u0123\u0124\7\17\2\2\u0124\u0125\7"+
		"+\2\2\u0125\u012e\7\t\2\2\u0126\u012b\5(\25\2\u0127\u0128\7\16\2\2\u0128"+
		"\u012a\5(\25\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0126\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\7\n"+
		"\2\2\u0131\u0116\3\2\2\2\u0131\u011a\3\2\2\2\u0131\u011d\3\2\2\2\u0131"+
		"\u0122\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134-\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7*\2\2\u0137\u0138"+
		"\7\t\2\2\u0138\u0139\5(\25\2\u0139\u013a\7\n\2\2\u013a/\3\2\2\2\u013b"+
		"\u013c\t\4\2\2\u013c\61\3\2\2\2\u013d\u0148\7+\2\2\u013e\u013f\5,\27\2"+
		"\u013f\u0140\7\17\2\2\u0140\u0141\7+\2\2\u0141\u0148\3\2\2\2\u0142\u0143"+
		"\5,\27\2\u0143\u0144\7\13\2\2\u0144\u0145\5(\25\2\u0145\u0146\7\f\2\2"+
		"\u0146\u0148\3\2\2\2\u0147\u013d\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0142"+
		"\3\2\2\2\u0148\63\3\2\2\2#\679?QSU_bgsu{\u0087\u009c\u00a9\u00af\u00c1"+
		"\u00c8\u00ce\u00d5\u00de\u00e9\u00eb\u00fa\u00fd\u010b\u010e\u0114\u012b"+
		"\u012e\u0131\u0133\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}