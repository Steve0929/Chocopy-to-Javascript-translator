// Generated from C:/Users/Mike/IdeaProjects/Chocopy-to-Javascript-translator/Grammar\chocogrammar.g4 by ANTLR 4.8
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
		TK_MAYOR=36, TK_IS=37, RETURN=38, TK_FUNC_TYPE=39, PRINT=40, LEN=41, INPUT=42, 
		ID=43, IDSTRING=44, STRING=45, INTEGER=46, LINE_COMMENT=47, SKIP_=48, 
		NEWLINE=49, INDENT=50, DEDENT=51;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_func_def = 3, 
		RULE_func_body = 4, RULE_typed_var = 5, RULE_type = 6, RULE_global_decl = 7, 
		RULE_nonlocal_decl = 8, RULE_var_def = 9, RULE_stmt = 10, RULE_if_expr = 11, 
		RULE_else_expr = 12, RULE_elif_expr = 13, RULE_while_expr = 14, RULE_for_expr = 15, 
		RULE_simple_stmt = 16, RULE_asig_stmt = 17, RULE_return_st = 18, RULE_block = 19, 
		RULE_literal = 20, RULE_expr = 21, RULE_not_expr = 22, RULE_cexpr = 23, 
		RULE_array_lenght = 24, RULE_print = 25, RULE_input = 26, RULE_bin_op = 27, 
		RULE_target = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "func_def", "func_body", "typed_var", 
			"type", "global_decl", "nonlocal_decl", "var_def", "stmt", "if_expr", 
			"else_expr", "elif_expr", "while_expr", "for_expr", "simple_stmt", "asig_stmt", 
			"return_st", "block", "literal", "expr", "not_expr", "cexpr", "array_lenght", 
			"print", "input", "bin_op", "target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'not'", "'and'", "'or'", "'if'", "'else'", "'elif'", "'('", "')'", 
			"'['", "']'", "'-'", "','", "'.'", "'='", "'class'", "':'", "'pass'", 
			"'def'", "'global'", "'nonlocal'", "'while'", "'for'", "'in'", "'None'", 
			"'True'", "'False'", "'+'", "'*'", "'//'", "'%'", "'=='", "'!='", "'<='", 
			"'>='", "'<'", "'>'", "'is'", "'return'", "'->'", "'print'", "'len'", 
			"'input'"
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
			"TK_IS", "RETURN", "TK_FUNC_TYPE", "PRINT", "LEN", "INPUT", "ID", "IDSTRING", 
			"STRING", "INTEGER", "LINE_COMMENT", "SKIP_", "NEWLINE", "INDENT", "DEDENT"
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
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(61);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(58);
						var_def();
						}
						break;
					case DEF:
						{
						setState(59);
						func_def();
						}
						break;
					case CLASS:
						{
						setState(60);
						class_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
				{
				{
				setState(66);
				stmt();
				}
				}
				setState(71);
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
			setState(72);
			match(CLASS);
			setState(73);
			match(ID);
			setState(74);
			match(TK_PAR_IZQ);
			setState(75);
			match(ID);
			setState(76);
			match(TK_PAR_DER);
			setState(77);
			match(TK_DOS_PUNTOS);
			setState(78);
			match(NEWLINE);
			setState(79);
			match(INDENT);
			setState(80);
			class_body();
			setState(81);
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
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(PASS);
				setState(84);
				match(NEWLINE);
				}
				break;
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(87);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(85);
						var_def();
						}
						break;
					case DEF:
						{
						setState(86);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(89); 
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
			setState(93);
			match(DEF);
			setState(94);
			match(ID);
			setState(95);
			match(TK_PAR_IZQ);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(96);
				typed_var();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(97);
					match(TK_COMMA);
					setState(98);
					typed_var();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(106);
			match(TK_PAR_DER);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_FUNC_TYPE) {
				{
				setState(107);
				match(TK_FUNC_TYPE);
				setState(108);
				type();
				}
			}

			setState(111);
			match(TK_DOS_PUNTOS);
			setState(112);
			match(NEWLINE);
			setState(113);
			match(INDENT);
			setState(114);
			func_body();
			setState(115);
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
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(121);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(117);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(118);
						nonlocal_decl();
						}
						break;
					case ID:
						{
						setState(119);
						var_def();
						}
						break;
					case DEF:
						{
						setState(120);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				stmt();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
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
			setState(131);
			match(ID);
			setState(132);
			match(TK_DOS_PUNTOS);
			setState(133);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(ID);
				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(IDSTRING);
				}
				break;
			case TK_COR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(TK_COR_IZQ);
				setState(138);
				type();
				setState(139);
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
			setState(143);
			match(GLOBAL);
			setState(144);
			match(ID);
			setState(145);
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
			setState(147);
			match(NONLOCAL);
			setState(148);
			match(ID);
			setState(149);
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
			setState(151);
			typed_var();
			setState(152);
			match(TK_ASIG);
			setState(153);
			literal();
			setState(154);
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
			setState(162);
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
			case LEN:
			case INPUT:
			case ID:
			case IDSTRING:
			case STRING:
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				simple_stmt();
				setState(157);
				match(NEWLINE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				if_expr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				while_expr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Elif_exprContext> elif_expr() {
			return getRuleContexts(Elif_exprContext.class);
		}
		public Elif_exprContext elif_expr(int i) {
			return getRuleContext(Elif_exprContext.class,i);
		}
		public Else_exprContext else_expr() {
			return getRuleContext(Else_exprContext.class,0);
		}
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
			setState(164);
			match(IF);
			setState(165);
			expr(0);
			setState(166);
			match(TK_DOS_PUNTOS);
			setState(167);
			block();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(168);
				elif_expr();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(174);
				else_expr();
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

	public static class Else_exprContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(chocogrammarParser.ELSE, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterElse_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitElse_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitElse_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_exprContext else_expr() throws RecognitionException {
		Else_exprContext _localctx = new Else_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ELSE);
			setState(178);
			match(TK_DOS_PUNTOS);
			setState(179);
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

	public static class Elif_exprContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(chocogrammarParser.ELIF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Elif_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterElif_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitElif_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitElif_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_exprContext elif_expr() throws RecognitionException {
		Elif_exprContext _localctx = new Elif_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elif_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ELIF);
			setState(182);
			expr(0);
			setState(183);
			match(TK_DOS_PUNTOS);
			setState(184);
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
		enterRule(_localctx, 28, RULE_while_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE);
			setState(187);
			expr(0);
			setState(188);
			match(TK_DOS_PUNTOS);
			setState(189);
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
		enterRule(_localctx, 30, RULE_for_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(FOR);
			setState(192);
			match(ID);
			setState(193);
			match(IN);
			setState(194);
			expr(0);
			setState(195);
			match(TK_DOS_PUNTOS);
			setState(196);
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
		enterRule(_localctx, 32, RULE_simple_stmt);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(PASS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				return_st();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
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
		enterRule(_localctx, 34, RULE_asig_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(204);
					target();
					setState(205);
					match(TK_ASIG);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(209); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(211);
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
		enterRule(_localctx, 36, RULE_return_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(RETURN);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
				{
				setState(214);
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
		enterRule(_localctx, 38, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(NEWLINE);
			setState(218);
			match(INDENT);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				stmt();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
			setState(224);
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
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PAR_IZQ:
			case TK_COR_IZQ:
			case TK_MENOS:
			case NONE:
			case TRUE:
			case FALSE:
			case PRINT:
			case LEN:
			case INPUT:
			case ID:
			case IDSTRING:
			case STRING:
			case INTEGER:
				{
				setState(229);
				cexpr(0);
				}
				break;
			case NOT:
				{
				setState(230);
				not_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(234);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(237);
						match(IF);
						setState(238);
						expr(0);
						setState(239);
						match(ELSE);
						setState(240);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(246);
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
		enterRule(_localctx, 44, RULE_not_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(NOT);
			setState(248);
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
		public Array_lenghtContext array_lenght() {
			return getRuleContext(Array_lenghtContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_cexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(251);
				match(ID);
				}
				break;
			case 2:
				{
				setState(252);
				literal();
				}
				break;
			case 3:
				{
				setState(253);
				match(TK_COR_IZQ);
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(254);
					expr(0);
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(255);
						match(TK_COMMA);
						setState(256);
						expr(0);
						}
						}
						setState(261);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(264);
				match(TK_COR_DER);
				}
				break;
			case 4:
				{
				setState(265);
				match(TK_PAR_IZQ);
				setState(266);
				expr(0);
				setState(267);
				match(TK_PAR_DER);
				}
				break;
			case 5:
				{
				setState(269);
				match(ID);
				setState(270);
				match(TK_PAR_IZQ);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(271);
					expr(0);
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(272);
						match(TK_COMMA);
						setState(273);
						expr(0);
						}
						}
						setState(278);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(281);
				match(TK_PAR_DER);
				}
				break;
			case 6:
				{
				setState(282);
				print();
				}
				break;
			case 7:
				{
				setState(283);
				array_lenght();
				}
				break;
			case 8:
				{
				setState(284);
				input();
				}
				break;
			case 9:
				{
				setState(285);
				match(TK_MENOS);
				setState(286);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						bin_op();
						setState(291);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(293);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(294);
						match(TK_PUNTO);
						setState(295);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(296);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(297);
						match(TK_COR_IZQ);
						setState(298);
						expr(0);
						setState(299);
						match(TK_COR_DER);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(301);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(302);
						match(TK_PUNTO);
						setState(303);
						match(ID);
						setState(304);
						match(TK_PAR_IZQ);
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
							{
							setState(305);
							expr(0);
							setState(310);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==TK_COMMA) {
								{
								{
								setState(306);
								match(TK_COMMA);
								setState(307);
								expr(0);
								}
								}
								setState(312);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(315);
						match(TK_PAR_DER);
						}
						break;
					}
					} 
				}
				setState(320);
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

	public static class Array_lenghtContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(chocogrammarParser.LEN, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public Array_lenghtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_lenght; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterArray_lenght(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitArray_lenght(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitArray_lenght(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_lenghtContext array_lenght() throws RecognitionException {
		Array_lenghtContext _localctx = new Array_lenghtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_array_lenght);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(LEN);
			setState(322);
			match(TK_PAR_IZQ);
			setState(323);
			expr(0);
			setState(324);
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
		enterRule(_localctx, 50, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(PRINT);
			setState(327);
			match(TK_PAR_IZQ);
			setState(328);
			expr(0);
			setState(329);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(chocogrammarParser.INPUT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(INPUT);
			setState(332);
			match(TK_PAR_IZQ);
			setState(333);
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
		enterRule(_localctx, 54, RULE_bin_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		enterRule(_localctx, 56, RULE_target);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				cexpr(0);
				setState(339);
				match(TK_PUNTO);
				setState(340);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				cexpr(0);
				setState(343);
				match(TK_COR_IZQ);
				setState(344);
				expr(0);
				setState(345);
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
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 23:
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
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0160\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4Z\n\4\r\4\16\4[\5\4^\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5f\n\5\f\5\16\5i\13\5\5\5k\n\5\3\5\3\5\3\5\5\5p\n"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177\13\6"+
		"\3\6\6\6\u0082\n\6\r\6\16\6\u0083\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0090\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\3\r\3\r\3\r\3\r\3\r\7\r\u00ac"+
		"\n\r\f\r\16\r\u00af\13\r\3\r\5\r\u00b2\n\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\5\22\u00cd\n\22\3\23\3\23\3\23\6\23\u00d2"+
		"\n\23\r\23\16\23\u00d3\3\23\3\23\3\24\3\24\5\24\u00da\n\24\3\25\3\25\3"+
		"\25\6\25\u00df\n\25\r\25\16\25\u00e0\3\25\3\25\3\26\3\26\3\27\3\27\3\27"+
		"\5\27\u00ea\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00f5"+
		"\n\27\f\27\16\27\u00f8\13\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\7\31\u0104\n\31\f\31\16\31\u0107\13\31\5\31\u0109\n\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0115\n\31\f\31\16\31"+
		"\u0118\13\31\5\31\u011a\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0122"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0137\n\31\f\31\16\31\u013a\13\31"+
		"\5\31\u013c\n\31\3\31\7\31\u013f\n\31\f\31\16\31\u0142\13\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u015e\n\36\3\36"+
		"\2\4,\60\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:\2\5\4\2\32\34.\60\3\2\4\5\4\2\r\r\35\'\2\u0175\2A\3\2\2\2\4J\3\2\2"+
		"\2\6]\3\2\2\2\b_\3\2\2\2\n}\3\2\2\2\f\u0085\3\2\2\2\16\u008f\3\2\2\2\20"+
		"\u0091\3\2\2\2\22\u0095\3\2\2\2\24\u0099\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6"+
		"\3\2\2\2\32\u00b3\3\2\2\2\34\u00b7\3\2\2\2\36\u00bc\3\2\2\2 \u00c1\3\2"+
		"\2\2\"\u00cc\3\2\2\2$\u00d1\3\2\2\2&\u00d7\3\2\2\2(\u00db\3\2\2\2*\u00e4"+
		"\3\2\2\2,\u00e9\3\2\2\2.\u00f9\3\2\2\2\60\u0121\3\2\2\2\62\u0143\3\2\2"+
		"\2\64\u0148\3\2\2\2\66\u014d\3\2\2\28\u0151\3\2\2\2:\u015d\3\2\2\2<@\5"+
		"\24\13\2=@\5\b\5\2>@\5\4\3\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\26\f\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\7\21\2\2KL\7-\2\2LM\7\t\2"+
		"\2MN\7-\2\2NO\7\n\2\2OP\7\22\2\2PQ\7\63\2\2QR\7\64\2\2RS\5\6\4\2ST\7\65"+
		"\2\2T\5\3\2\2\2UV\7\23\2\2V^\7\63\2\2WZ\5\24\13\2XZ\5\b\5\2YW\3\2\2\2"+
		"YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]U\3\2\2\2]Y\3\2\2"+
		"\2^\7\3\2\2\2_`\7\24\2\2`a\7-\2\2aj\7\t\2\2bg\5\f\7\2cd\7\16\2\2df\5\f"+
		"\7\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2"+
		"\2\2jk\3\2\2\2kl\3\2\2\2lo\7\n\2\2mn\7)\2\2np\5\16\b\2om\3\2\2\2op\3\2"+
		"\2\2pq\3\2\2\2qr\7\22\2\2rs\7\63\2\2st\7\64\2\2tu\5\n\6\2uv\7\65\2\2v"+
		"\t\3\2\2\2w|\5\20\t\2x|\5\22\n\2y|\5\24\13\2z|\5\b\5\2{w\3\2\2\2{x\3\2"+
		"\2\2{y\3\2\2\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2"+
		"\2\177}\3\2\2\2\u0080\u0082\5\26\f\2\u0081\u0080\3\2\2\2\u0082\u0083\3"+
		"\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\13\3\2\2\2\u0085"+
		"\u0086\7-\2\2\u0086\u0087\7\22\2\2\u0087\u0088\5\16\b\2\u0088\r\3\2\2"+
		"\2\u0089\u0090\7-\2\2\u008a\u0090\7.\2\2\u008b\u008c\7\13\2\2\u008c\u008d"+
		"\5\16\b\2\u008d\u008e\7\f\2\2\u008e\u0090\3\2\2\2\u008f\u0089\3\2\2\2"+
		"\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u0090\17\3\2\2\2\u0091\u0092"+
		"\7\25\2\2\u0092\u0093\7-\2\2\u0093\u0094\7\63\2\2\u0094\21\3\2\2\2\u0095"+
		"\u0096\7\26\2\2\u0096\u0097\7-\2\2\u0097\u0098\7\63\2\2\u0098\23\3\2\2"+
		"\2\u0099\u009a\5\f\7\2\u009a\u009b\7\20\2\2\u009b\u009c\5*\26\2\u009c"+
		"\u009d\7\63\2\2\u009d\25\3\2\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\7\63"+
		"\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a5\5\30\r\2\u00a2\u00a5\5\36\20\2\u00a3"+
		"\u00a5\5 \21\2\u00a4\u009e\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a3\3\2\2\2\u00a5\27\3\2\2\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8"+
		"\5,\27\2\u00a8\u00a9\7\22\2\2\u00a9\u00ad\5(\25\2\u00aa\u00ac\5\34\17"+
		"\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\5\32\16\2"+
		"\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\31\3\2\2\2\u00b3\u00b4"+
		"\7\7\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5(\25\2\u00b6\33\3\2\2\2\u00b7"+
		"\u00b8\7\b\2\2\u00b8\u00b9\5,\27\2\u00b9\u00ba\7\22\2\2\u00ba\u00bb\5"+
		"(\25\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\27\2\2\u00bd\u00be\5,\27\2\u00be"+
		"\u00bf\7\22\2\2\u00bf\u00c0\5(\25\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\30"+
		"\2\2\u00c2\u00c3\7-\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c5\5,\27\2\u00c5"+
		"\u00c6\7\22\2\2\u00c6\u00c7\5(\25\2\u00c7!\3\2\2\2\u00c8\u00cd\7\23\2"+
		"\2\u00c9\u00cd\5,\27\2\u00ca\u00cd\5&\24\2\u00cb\u00cd\5$\23\2\u00cc\u00c8"+
		"\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"#\3\2\2\2\u00ce\u00cf\5:\36\2\u00cf\u00d0\7\20\2\2\u00d0\u00d2\3\2\2\2"+
		"\u00d1\u00ce\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5,\27\2\u00d6%\3\2\2\2\u00d7"+
		"\u00d9\7(\2\2\u00d8\u00da\5,\27\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\'\3\2\2\2\u00db\u00dc\7\63\2\2\u00dc\u00de\7\64\2\2\u00dd\u00df"+
		"\5\26\f\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\65\2\2\u00e3)\3"+
		"\2\2\2\u00e4\u00e5\t\2\2\2\u00e5+\3\2\2\2\u00e6\u00e7\b\27\1\2\u00e7\u00ea"+
		"\5\60\31\2\u00e8\u00ea\5.\30\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2"+
		"\u00ea\u00f6\3\2\2\2\u00eb\u00ec\f\4\2\2\u00ec\u00ed\t\3\2\2\u00ed\u00f5"+
		"\5,\27\5\u00ee\u00ef\f\3\2\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5,\27\2\u00f1"+
		"\u00f2\7\7\2\2\u00f2\u00f3\5,\27\4\u00f3\u00f5\3\2\2\2\u00f4\u00eb\3\2"+
		"\2\2\u00f4\u00ee\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7-\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\3\2\2"+
		"\u00fa\u00fb\5,\27\2\u00fb/\3\2\2\2\u00fc\u00fd\b\31\1\2\u00fd\u0122\7"+
		"-\2\2\u00fe\u0122\5*\26\2\u00ff\u0108\7\13\2\2\u0100\u0105\5,\27\2\u0101"+
		"\u0102\7\16\2\2\u0102\u0104\5,\27\2\u0103\u0101\3\2\2\2\u0104\u0107\3"+
		"\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0122\7\f\2\2\u010b\u010c\7\t\2\2\u010c\u010d\5,\27\2\u010d"+
		"\u010e\7\n\2\2\u010e\u0122\3\2\2\2\u010f\u0110\7-\2\2\u0110\u0119\7\t"+
		"\2\2\u0111\u0116\5,\27\2\u0112\u0113\7\16\2\2\u0113\u0115\5,\27\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2"+
		"\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0111\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0122\7\n\2\2\u011c\u0122\5\64"+
		"\33\2\u011d\u0122\5\62\32\2\u011e\u0122\5\66\34\2\u011f\u0120\7\r\2\2"+
		"\u0120\u0122\5\60\31\3\u0121\u00fc\3\2\2\2\u0121\u00fe\3\2\2\2\u0121\u00ff"+
		"\3\2\2\2\u0121\u010b\3\2\2\2\u0121\u010f\3\2\2\2\u0121\u011c\3\2\2\2\u0121"+
		"\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0140\3\2"+
		"\2\2\u0123\u0124\f\4\2\2\u0124\u0125\58\35\2\u0125\u0126\5\60\31\5\u0126"+
		"\u013f\3\2\2\2\u0127\u0128\f\13\2\2\u0128\u0129\7\17\2\2\u0129\u013f\7"+
		"-\2\2\u012a\u012b\f\n\2\2\u012b\u012c\7\13\2\2\u012c\u012d\5,\27\2\u012d"+
		"\u012e\7\f\2\2\u012e\u013f\3\2\2\2\u012f\u0130\f\t\2\2\u0130\u0131\7\17"+
		"\2\2\u0131\u0132\7-\2\2\u0132\u013b\7\t\2\2\u0133\u0138\5,\27\2\u0134"+
		"\u0135\7\16\2\2\u0135\u0137\5,\27\2\u0136\u0134\3\2\2\2\u0137\u013a\3"+
		"\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013b\u0133\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013f\7\n\2\2\u013e\u0123\3\2\2\2\u013e\u0127\3\2\2\2\u013e"+
		"\u012a\3\2\2\2\u013e\u012f\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\61\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144"+
		"\7+\2\2\u0144\u0145\7\t\2\2\u0145\u0146\5,\27\2\u0146\u0147\7\n\2\2\u0147"+
		"\63\3\2\2\2\u0148\u0149\7*\2\2\u0149\u014a\7\t\2\2\u014a\u014b\5,\27\2"+
		"\u014b\u014c\7\n\2\2\u014c\65\3\2\2\2\u014d\u014e\7,\2\2\u014e\u014f\7"+
		"\t\2\2\u014f\u0150\7\n\2\2\u0150\67\3\2\2\2\u0151\u0152\t\4\2\2\u0152"+
		"9\3\2\2\2\u0153\u015e\7-\2\2\u0154\u0155\5\60\31\2\u0155\u0156\7\17\2"+
		"\2\u0156\u0157\7-\2\2\u0157\u015e\3\2\2\2\u0158\u0159\5\60\31\2\u0159"+
		"\u015a\7\13\2\2\u015a\u015b\5,\27\2\u015b\u015c\7\f\2\2\u015c\u015e\3"+
		"\2\2\2\u015d\u0153\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0158\3\2\2\2\u015e"+
		";\3\2\2\2#?AGY[]gjo{}\u0083\u008f\u00a4\u00ad\u00b1\u00cc\u00d3\u00d9"+
		"\u00e0\u00e9\u00f4\u00f6\u0105\u0108\u0116\u0119\u0121\u0138\u013b\u013e"+
		"\u0140\u015d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}