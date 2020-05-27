// Generated from C:/Users/chimi/IdeaProjects/Translate/Grammar\chocogrammar.g4 by ANTLR 4.8
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
		ID=43, IDSTRING=44, STRING=45, INTEGER=46, LINE_COMMENT=47, COMMENT=48, 
		SKIP_=49, NEWLINE=50, INDENT=51, DEDENT=52;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_func_def = 3, 
		RULE_func_body = 4, RULE_typed_var = 5, RULE_type = 6, RULE_global_decl = 7, 
		RULE_nonlocal_decl = 8, RULE_var_def = 9, RULE_stmt = 10, RULE_if_expr = 11, 
		RULE_else_expr = 12, RULE_elif_expr = 13, RULE_while_expr = 14, RULE_for_expr = 15, 
		RULE_simple_stmt = 16, RULE_asig_stmt = 17, RULE_return_st = 18, RULE_block = 19, 
		RULE_literal = 20, RULE_expr = 21, RULE_not_expr = 22, RULE_cexpr = 23, 
		RULE_array_lenght = 24, RULE_print = 25, RULE_input = 26, RULE_bin_op = 27, 
		RULE_target = 28, RULE_posible_comment = 29, RULE_posible_line_comment = 30;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "func_def", "func_body", "typed_var", 
			"type", "global_decl", "nonlocal_decl", "var_def", "stmt", "if_expr", 
			"else_expr", "elif_expr", "while_expr", "for_expr", "simple_stmt", "asig_stmt", 
			"return_st", "block", "literal", "expr", "not_expr", "cexpr", "array_lenght", 
			"print", "input", "bin_op", "target", "posible_comment", "posible_line_comment"
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
			"STRING", "INTEGER", "LINE_COMMENT", "COMMENT", "SKIP_", "NEWLINE", "INDENT", 
			"DEDENT"
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
		public TerminalNode NEWLINE() { return getToken(chocogrammarParser.NEWLINE, 0); }
		public List<Posible_line_commentContext> posible_line_comment() {
			return getRuleContexts(Posible_line_commentContext.class);
		}
		public Posible_line_commentContext posible_line_comment(int i) {
			return getRuleContext(Posible_line_commentContext.class,i);
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
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case NOT:
			case IF:
			case TK_PAR_IZQ:
			case TK_COR_IZQ:
			case TK_MENOS:
			case CLASS:
			case PASS:
			case DEF:
			case WHILE:
			case FOR:
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
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(65);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(62);
							var_def();
							}
							break;
						case DEF:
							{
							setState(63);
							func_def();
							}
							break;
						case CLASS:
							{
							setState(64);
							class_def();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					{
					setState(70);
					stmt();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LINE_COMMENT:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LINE_COMMENT) {
					{
					{
					setState(76);
					posible_line_comment();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(NEWLINE);
				setState(86); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(86);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ID:
							{
							setState(83);
							var_def();
							}
							break;
						case DEF:
							{
							setState(84);
							func_def();
							}
							break;
						case CLASS:
							{
							setState(85);
							class_def();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(88); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					stmt();
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
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
			setState(97);
			match(CLASS);
			setState(98);
			match(ID);
			setState(99);
			match(TK_PAR_IZQ);
			setState(100);
			match(ID);
			setState(101);
			match(TK_PAR_DER);
			setState(102);
			match(TK_DOS_PUNTOS);
			setState(103);
			match(NEWLINE);
			setState(104);
			match(INDENT);
			setState(105);
			class_body();
			setState(106);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(PASS);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(109);
					posible_line_comment();
					}
				}

				setState(112);
				match(NEWLINE);
				}
				break;
			case DEF:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(115);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(113);
						var_def();
						}
						break;
					case DEF:
						{
						setState(114);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(117); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF || _la==ID );
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(119);
					posible_line_comment();
					}
				}

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
		public List<Posible_line_commentContext> posible_line_comment() {
			return getRuleContexts(Posible_line_commentContext.class);
		}
		public Posible_line_commentContext posible_line_comment(int i) {
			return getRuleContext(Posible_line_commentContext.class,i);
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
			setState(124);
			match(DEF);
			setState(125);
			match(ID);
			setState(126);
			match(TK_PAR_IZQ);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(127);
				typed_var();
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMMA) {
					{
					{
					setState(128);
					match(TK_COMMA);
					setState(129);
					typed_var();
					}
					}
					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(137);
			match(TK_PAR_DER);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_FUNC_TYPE) {
				{
				setState(138);
				match(TK_FUNC_TYPE);
				setState(139);
				type();
				}
			}

			setState(142);
			match(TK_DOS_PUNTOS);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(143);
				posible_line_comment();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(NEWLINE);
			setState(150);
			match(INDENT);
			setState(151);
			func_body();
			setState(152);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case IF:
			case TK_PAR_IZQ:
			case TK_COR_IZQ:
			case TK_MENOS:
			case PASS:
			case DEF:
			case GLOBAL:
			case NONLOCAL:
			case WHILE:
			case FOR:
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
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(158);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GLOBAL:
							{
							setState(154);
							global_decl();
							}
							break;
						case NONLOCAL:
							{
							setState(155);
							nonlocal_decl();
							}
							break;
						case ID:
							{
							setState(156);
							var_def();
							}
							break;
						case DEF:
							{
							setState(157);
							func_def();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(162);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					stmt();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(168);
					posible_line_comment();
					}
				}

				}
				break;
			case LINE_COMMENT:
			case DEDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(171);
					posible_line_comment();
					}
				}

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
			setState(176);
			match(ID);
			setState(177);
			match(TK_DOS_PUNTOS);
			setState(178);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(181);
					posible_line_comment();
					}
				}

				}
				break;
			case IDSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(IDSTRING);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(185);
					posible_line_comment();
					}
				}

				}
				break;
			case TK_COR_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(TK_COR_IZQ);
				setState(189);
				type();
				setState(190);
				match(TK_COR_DER);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(191);
					posible_line_comment();
					}
				}

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
		public List<Posible_line_commentContext> posible_line_comment() {
			return getRuleContexts(Posible_line_commentContext.class);
		}
		public Posible_line_commentContext posible_line_comment(int i) {
			return getRuleContext(Posible_line_commentContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(GLOBAL);
			setState(197);
			match(ID);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(198);
				posible_line_comment();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
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
		public List<Posible_line_commentContext> posible_line_comment() {
			return getRuleContexts(Posible_line_commentContext.class);
		}
		public Posible_line_commentContext posible_line_comment(int i) {
			return getRuleContext(Posible_line_commentContext.class,i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(NONLOCAL);
			setState(207);
			match(ID);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINE_COMMENT) {
				{
				{
				setState(208);
				posible_line_comment();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			typed_var();
			setState(217);
			match(TK_ASIG);
			setState(218);
			literal();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(219);
				posible_line_comment();
				}
			}

			setState(222);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(chocogrammarParser.EOF, 0); }
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
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				simple_stmt();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(225);
					posible_line_comment();
					}
				}

				setState(228);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				simple_stmt();
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LINE_COMMENT) {
					{
					setState(231);
					posible_line_comment();
					}
				}

				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(234);
					match(NEWLINE);
					}
				}

				setState(237);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				if_expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				while_expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				for_expr();
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

	public static class If_exprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(chocogrammarParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocogrammarParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
			setState(244);
			match(IF);
			setState(245);
			expr(0);
			setState(246);
			match(TK_DOS_PUNTOS);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(247);
				posible_line_comment();
				}
			}

			setState(250);
			block();
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(251);
				elif_expr();
				}
				}
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(257);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ELSE);
			setState(261);
			match(TK_DOS_PUNTOS);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(262);
				posible_line_comment();
				}
			}

			setState(265);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(ELIF);
			setState(268);
			expr(0);
			setState(269);
			match(TK_DOS_PUNTOS);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(270);
				posible_line_comment();
				}
			}

			setState(273);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(WHILE);
			setState(276);
			expr(0);
			setState(277);
			match(TK_DOS_PUNTOS);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(278);
				posible_line_comment();
				}
			}

			setState(281);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(FOR);
			setState(284);
			match(ID);
			setState(285);
			match(IN);
			setState(286);
			expr(0);
			setState(287);
			match(TK_DOS_PUNTOS);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(288);
				posible_line_comment();
				}
			}

			setState(291);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(PASS);
				setState(295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(294);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				expr(0);
				setState(299);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(298);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				return_st();
				setState(303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(302);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(305);
				asig_stmt();
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(306);
					posible_line_comment();
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
			setState(314); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(311);
					target();
					setState(312);
					match(TK_ASIG);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(316); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(318);
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
			setState(320);
			match(RETURN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
				{
				setState(321);
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
			setState(324);
			match(NEWLINE);
			setState(325);
			match(INDENT);
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(326);
				stmt();
				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
			setState(331);
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
			setState(333);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
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
			setState(344);
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
				setState(336);
				cexpr(0);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(337);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(340);
				not_expr();
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(341);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(346);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(347);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(348);
						expr(0);
						setState(350);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
						case 1:
							{
							setState(349);
							posible_line_comment();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(352);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(353);
						match(IF);
						setState(354);
						expr(0);
						setState(355);
						match(ELSE);
						setState(356);
						expr(0);
						setState(358);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
						case 1:
							{
							setState(357);
							posible_line_comment();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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
			setState(365);
			match(NOT);
			setState(366);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(369);
				match(ID);
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(370);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(373);
				literal();
				}
				break;
			case 3:
				{
				setState(374);
				match(TK_COR_IZQ);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(375);
					expr(0);
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(376);
						match(TK_COMMA);
						setState(377);
						expr(0);
						}
						}
						setState(382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(385);
				match(TK_COR_DER);
				}
				break;
			case 4:
				{
				setState(386);
				match(TK_PAR_IZQ);
				setState(387);
				expr(0);
				setState(388);
				match(TK_PAR_DER);
				}
				break;
			case 5:
				{
				setState(390);
				match(ID);
				setState(391);
				match(TK_PAR_IZQ);
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(392);
					expr(0);
					setState(397);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(393);
						match(TK_COMMA);
						setState(394);
						expr(0);
						}
						}
						setState(399);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(402);
				match(TK_PAR_DER);
				}
				break;
			case 6:
				{
				setState(403);
				print();
				}
				break;
			case 7:
				{
				setState(404);
				array_lenght();
				}
				break;
			case 8:
				{
				setState(405);
				input();
				}
				break;
			case 9:
				{
				setState(406);
				match(TK_MENOS);
				setState(407);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(437);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(410);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(411);
						bin_op();
						setState(412);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(414);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(415);
						match(TK_PUNTO);
						setState(416);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(417);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(418);
						match(TK_COR_IZQ);
						setState(419);
						expr(0);
						setState(420);
						match(TK_COR_DER);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(422);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(423);
						match(TK_PUNTO);
						setState(424);
						match(ID);
						setState(425);
						match(TK_PAR_IZQ);
						setState(434);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
							{
							setState(426);
							expr(0);
							setState(431);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==TK_COMMA) {
								{
								{
								setState(427);
								match(TK_COMMA);
								setState(428);
								expr(0);
								}
								}
								setState(433);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(436);
						match(TK_PAR_DER);
						}
						break;
					}
					} 
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
			setState(442);
			match(LEN);
			setState(443);
			match(TK_PAR_IZQ);
			setState(444);
			expr(0);
			setState(445);
			match(TK_PAR_DER);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(446);
				posible_line_comment();
				}
				break;
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(chocogrammarParser.PRINT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
			setState(449);
			match(PRINT);
			setState(450);
			match(TK_PAR_IZQ);
			setState(451);
			expr(0);
			setState(452);
			match(TK_PAR_DER);
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(453);
				posible_line_comment();
				}
				break;
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(chocogrammarParser.INPUT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocogrammarParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocogrammarParser.TK_PAR_DER, 0); }
		public Posible_line_commentContext posible_line_comment() {
			return getRuleContext(Posible_line_commentContext.class,0);
		}
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
			setState(456);
			match(INPUT);
			setState(457);
			match(TK_PAR_IZQ);
			setState(458);
			match(TK_PAR_DER);
			setState(460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(459);
				posible_line_comment();
				}
				break;
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
			setState(462);
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
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				cexpr(0);
				setState(466);
				match(TK_PUNTO);
				setState(467);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				cexpr(0);
				setState(470);
				match(TK_COR_IZQ);
				setState(471);
				expr(0);
				setState(472);
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

	public static class Posible_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(chocogrammarParser.COMMENT, 0); }
		public Posible_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posible_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterPosible_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitPosible_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitPosible_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Posible_commentContext posible_comment() throws RecognitionException {
		Posible_commentContext _localctx = new Posible_commentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_posible_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(COMMENT);
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

	public static class Posible_line_commentContext extends ParserRuleContext {
		public TerminalNode LINE_COMMENT() { return getToken(chocogrammarParser.LINE_COMMENT, 0); }
		public Posible_line_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posible_line_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).enterPosible_line_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocogrammarListener ) ((chocogrammarListener)listener).exitPosible_line_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocogrammarVisitor ) return ((chocogrammarVisitor<? extends T>)visitor).visitPosible_line_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Posible_line_commentContext posible_line_comment() throws RecognitionException {
		Posible_line_commentContext _localctx = new Posible_line_commentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_posible_line_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(LINE_COMMENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P"+
		"\n\2\f\2\16\2S\13\2\3\2\3\2\3\2\3\2\6\2Y\n\2\r\2\16\2Z\3\2\6\2^\n\2\r"+
		"\2\16\2_\5\2b\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\5\4q\n\4\3\4\3\4\3\4\6\4v\n\4\r\4\16\4w\3\4\5\4{\n\4\5\4}\n\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\5\5\u008a\n\5\3\5\3"+
		"\5\3\5\5\5\u008f\n\5\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\6\6"+
		"\u00a7\n\6\r\6\16\6\u00a8\3\6\5\6\u00ac\n\6\3\6\5\6\u00af\n\6\5\6\u00b1"+
		"\n\6\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00b9\n\b\3\b\3\b\5\b\u00bd\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00c3\n\b\5\b\u00c5\n\b\3\t\3\t\3\t\7\t\u00ca\n\t\f\t\16"+
		"\t\u00cd\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\5\13\u00df\n\13\3\13\3\13\3\f\3\f\5\f\u00e5"+
		"\n\f\3\f\3\f\3\f\3\f\5\f\u00eb\n\f\3\f\5\f\u00ee\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\f\u00f5\n\f\3\r\3\r\3\r\3\r\5\r\u00fb\n\r\3\r\3\r\7\r\u00ff\n\r\f"+
		"\r\16\r\u0102\13\r\3\r\5\r\u0105\n\r\3\16\3\16\3\16\5\16\u010a\n\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\5\17\u0112\n\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\5\20\u011a\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0124"+
		"\n\21\3\21\3\21\3\22\3\22\5\22\u012a\n\22\3\22\3\22\5\22\u012e\n\22\3"+
		"\22\3\22\5\22\u0132\n\22\3\22\3\22\5\22\u0136\n\22\5\22\u0138\n\22\3\23"+
		"\3\23\3\23\6\23\u013d\n\23\r\23\16\23\u013e\3\23\3\23\3\24\3\24\5\24\u0145"+
		"\n\24\3\25\3\25\3\25\6\25\u014a\n\25\r\25\16\25\u014b\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\27\5\27\u0155\n\27\3\27\3\27\5\27\u0159\n\27\5\27\u015b"+
		"\n\27\3\27\3\27\3\27\3\27\5\27\u0161\n\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0169\n\27\7\27\u016b\n\27\f\27\16\27\u016e\13\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u0176\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u017d\n"+
		"\31\f\31\16\31\u0180\13\31\5\31\u0182\n\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\7\31\u018e\n\31\f\31\16\31\u0191\13\31\5\31\u0193"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u019b\n\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\7\31\u01b0\n\31\f\31\16\31\u01b3\13\31\5\31\u01b5\n\31\3\31\7\31"+
		"\u01b8\n\31\f\31\16\31\u01bb\13\31\3\32\3\32\3\32\3\32\3\32\5\32\u01c2"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u01c9\n\33\3\34\3\34\3\34\3\34\5\34"+
		"\u01cf\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u01dd\n\36\3\37\3\37\3 \3 \3 \2\4,\60!\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\4\2\32\34.\60\3\2\4\5\4\2\r"+
		"\r\35\'\2\u021d\2a\3\2\2\2\4c\3\2\2\2\6|\3\2\2\2\b~\3\2\2\2\n\u00b0\3"+
		"\2\2\2\f\u00b2\3\2\2\2\16\u00c4\3\2\2\2\20\u00c6\3\2\2\2\22\u00d0\3\2"+
		"\2\2\24\u00da\3\2\2\2\26\u00f4\3\2\2\2\30\u00f6\3\2\2\2\32\u0106\3\2\2"+
		"\2\34\u010d\3\2\2\2\36\u0115\3\2\2\2 \u011d\3\2\2\2\"\u0137\3\2\2\2$\u013c"+
		"\3\2\2\2&\u0142\3\2\2\2(\u0146\3\2\2\2*\u014f\3\2\2\2,\u015a\3\2\2\2."+
		"\u016f\3\2\2\2\60\u019a\3\2\2\2\62\u01bc\3\2\2\2\64\u01c3\3\2\2\2\66\u01ca"+
		"\3\2\2\28\u01d0\3\2\2\2:\u01dc\3\2\2\2<\u01de\3\2\2\2>\u01e0\3\2\2\2@"+
		"D\5\24\13\2AD\5\b\5\2BD\5\4\3\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2GE\3\2\2\2HJ\5\26\f\2IH\3\2\2\2JM\3\2"+
		"\2\2KI\3\2\2\2KL\3\2\2\2Lb\3\2\2\2MK\3\2\2\2NP\5> \2ON\3\2\2\2PS\3\2\2"+
		"\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TX\7\64\2\2UY\5\24\13\2VY\5"+
		"\b\5\2WY\5\4\3\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[]\3\2\2\2\\^\5\26\f\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2"+
		"`b\3\2\2\2aE\3\2\2\2aQ\3\2\2\2b\3\3\2\2\2cd\7\21\2\2de\7-\2\2ef\7\t\2"+
		"\2fg\7-\2\2gh\7\n\2\2hi\7\22\2\2ij\7\64\2\2jk\7\65\2\2kl\5\6\4\2lm\7\66"+
		"\2\2m\5\3\2\2\2np\7\23\2\2oq\5> \2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r}\7\64"+
		"\2\2sv\5\24\13\2tv\5\b\5\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3"+
		"\2\2\2xz\3\2\2\2y{\5> \2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|n\3\2\2\2|u\3\2"+
		"\2\2}\7\3\2\2\2~\177\7\24\2\2\177\u0080\7-\2\2\u0080\u0089\7\t\2\2\u0081"+
		"\u0086\5\f\7\2\u0082\u0083\7\16\2\2\u0083\u0085\5\f\7\2\u0084\u0082\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u008a\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008e\7\n\2\2\u008c\u008d\7)\2\2\u008d"+
		"\u008f\5\16\b\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3"+
		"\2\2\2\u0090\u0094\7\22\2\2\u0091\u0093\5> \2\u0092\u0091\3\2\2\2\u0093"+
		"\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\64\2\2\u0098\u0099\7\65\2\2\u0099"+
		"\u009a\5\n\6\2\u009a\u009b\7\66\2\2\u009b\t\3\2\2\2\u009c\u00a1\5\20\t"+
		"\2\u009d\u00a1\5\22\n\2\u009e\u00a1\5\24\13\2\u009f\u00a1\5\b\5\2\u00a0"+
		"\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\5\26\f\2\u00a6\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa\u00ac\5> \2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00b1\3\2\2\2\u00ad\u00af\5> \2\u00ae\u00ad\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00a2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\13\3\2\2\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\7\22\2\2\u00b4\u00b5\5\16\b"+
		"\2\u00b5\r\3\2\2\2\u00b6\u00b8\7-\2\2\u00b7\u00b9\5> \2\u00b8\u00b7\3"+
		"\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c5\3\2\2\2\u00ba\u00bc\7.\2\2\u00bb"+
		"\u00bd\5> \2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c5\3\2\2"+
		"\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c2\7\f\2\2\u00c1"+
		"\u00c3\5> \2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2"+
		"\2\u00c4\u00b6\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\17"+
		"\3\2\2\2\u00c6\u00c7\7\25\2\2\u00c7\u00cb\7-\2\2\u00c8\u00ca\5> \2\u00c9"+
		"\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\64\2\2\u00cf"+
		"\21\3\2\2\2\u00d0\u00d1\7\26\2\2\u00d1\u00d5\7-\2\2\u00d2\u00d4\5> \2"+
		"\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\64\2\2"+
		"\u00d9\23\3\2\2\2\u00da\u00db\5\f\7\2\u00db\u00dc\7\20\2\2\u00dc\u00de"+
		"\5*\26\2\u00dd\u00df\5> \2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\7\64\2\2\u00e1\25\3\2\2\2\u00e2\u00e4\5\"\22"+
		"\2\u00e3\u00e5\5> \2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e7\7\64\2\2\u00e7\u00f5\3\2\2\2\u00e8\u00ea\5\"\22\2"+
		"\u00e9\u00eb\5> \2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00ee\7\64\2\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7\2\2\3\u00f0\u00f5\3\2\2\2\u00f1\u00f5"+
		"\5\30\r\2\u00f2\u00f5\5\36\20\2\u00f3\u00f5\5 \21\2\u00f4\u00e2\3\2\2"+
		"\2\u00f4\u00e8\3\2\2\2\u00f4\u00f1\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\27\3\2\2\2\u00f6\u00f7\7\6\2\2\u00f7\u00f8\5,\27\2\u00f8"+
		"\u00fa\7\22\2\2\u00f9\u00fb\5> \2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0100\5(\25\2\u00fd\u00ff\5\34\17\2\u00fe"+
		"\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\5\32\16\2\u0104"+
		"\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\31\3\2\2\2\u0106\u0107\7\7\2"+
		"\2\u0107\u0109\7\22\2\2\u0108\u010a\5> \2\u0109\u0108\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\5(\25\2\u010c\33\3\2\2\2\u010d"+
		"\u010e\7\b\2\2\u010e\u010f\5,\27\2\u010f\u0111\7\22\2\2\u0110\u0112\5"+
		"> \2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0114\5(\25\2\u0114\35\3\2\2\2\u0115\u0116\7\27\2\2\u0116\u0117\5,\27"+
		"\2\u0117\u0119\7\22\2\2\u0118\u011a\5> \2\u0119\u0118\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\5(\25\2\u011c\37\3\2\2\2\u011d"+
		"\u011e\7\30\2\2\u011e\u011f\7-\2\2\u011f\u0120\7\31\2\2\u0120\u0121\5"+
		",\27\2\u0121\u0123\7\22\2\2\u0122\u0124\5> \2\u0123\u0122\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\5(\25\2\u0126!\3\2\2\2"+
		"\u0127\u0129\7\23\2\2\u0128\u012a\5> \2\u0129\u0128\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u0138\3\2\2\2\u012b\u012d\5,\27\2\u012c\u012e\5> \2\u012d"+
		"\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0138\3\2\2\2\u012f\u0131\5&"+
		"\24\2\u0130\u0132\5> \2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0138\3\2\2\2\u0133\u0135\5$\23\2\u0134\u0136\5> \2\u0135\u0134\3\2\2"+
		"\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0127\3\2\2\2\u0137\u012b"+
		"\3\2\2\2\u0137\u012f\3\2\2\2\u0137\u0133\3\2\2\2\u0138#\3\2\2\2\u0139"+
		"\u013a\5:\36\2\u013a\u013b\7\20\2\2\u013b\u013d\3\2\2\2\u013c\u0139\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0141\5,\27\2\u0141%\3\2\2\2\u0142\u0144\7(\2\2\u0143"+
		"\u0145\5,\27\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\'\3\2\2\2"+
		"\u0146\u0147\7\64\2\2\u0147\u0149\7\65\2\2\u0148\u014a\5\26\f\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\7\66\2\2\u014e)\3\2\2\2\u014f\u0150"+
		"\t\2\2\2\u0150+\3\2\2\2\u0151\u0152\b\27\1\2\u0152\u0154\5\60\31\2\u0153"+
		"\u0155\5> \2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015b\3\2\2"+
		"\2\u0156\u0158\5.\30\2\u0157\u0159\5> \2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0151\3\2\2\2\u015a\u0156\3\2\2\2\u015b"+
		"\u016c\3\2\2\2\u015c\u015d\f\4\2\2\u015d\u015e\t\3\2\2\u015e\u0160\5,"+
		"\27\2\u015f\u0161\5> \2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u016b\3\2\2\2\u0162\u0163\f\3\2\2\u0163\u0164\7\6\2\2\u0164\u0165\5,"+
		"\27\2\u0165\u0166\7\7\2\2\u0166\u0168\5,\27\2\u0167\u0169\5> \2\u0168"+
		"\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a\u015c\3\2"+
		"\2\2\u016a\u0162\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d-\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\3\2\2"+
		"\u0170\u0171\5,\27\2\u0171/\3\2\2\2\u0172\u0173\b\31\1\2\u0173\u0175\7"+
		"-\2\2\u0174\u0176\5> \2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u019b\3\2\2\2\u0177\u019b\5*\26\2\u0178\u0181\7\13\2\2\u0179\u017e\5"+
		",\27\2\u017a\u017b\7\16\2\2\u017b\u017d\5,\27\2\u017c\u017a\3\2\2\2\u017d"+
		"\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2"+
		"\2\2\u0180\u017e\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u019b\7\f\2\2\u0184\u0185\7\t\2\2\u0185\u0186\5,"+
		"\27\2\u0186\u0187\7\n\2\2\u0187\u019b\3\2\2\2\u0188\u0189\7-\2\2\u0189"+
		"\u0192\7\t\2\2\u018a\u018f\5,\27\2\u018b\u018c\7\16\2\2\u018c\u018e\5"+
		",\27\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u018a\3\2"+
		"\2\2\u0192\u0193\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019b\7\n\2\2\u0195"+
		"\u019b\5\64\33\2\u0196\u019b\5\62\32\2\u0197\u019b\5\66\34\2\u0198\u0199"+
		"\7\r\2\2\u0199\u019b\5\60\31\3\u019a\u0172\3\2\2\2\u019a\u0177\3\2\2\2"+
		"\u019a\u0178\3\2\2\2\u019a\u0184\3\2\2\2\u019a\u0188\3\2\2\2\u019a\u0195"+
		"\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0197\3\2\2\2\u019a\u0198\3\2\2\2\u019b"+
		"\u01b9\3\2\2\2\u019c\u019d\f\4\2\2\u019d\u019e\58\35\2\u019e\u019f\5\60"+
		"\31\5\u019f\u01b8\3\2\2\2\u01a0\u01a1\f\13\2\2\u01a1\u01a2\7\17\2\2\u01a2"+
		"\u01b8\7-\2\2\u01a3\u01a4\f\n\2\2\u01a4\u01a5\7\13\2\2\u01a5\u01a6\5,"+
		"\27\2\u01a6\u01a7\7\f\2\2\u01a7\u01b8\3\2\2\2\u01a8\u01a9\f\t\2\2\u01a9"+
		"\u01aa\7\17\2\2\u01aa\u01ab\7-\2\2\u01ab\u01b4\7\t\2\2\u01ac\u01b1\5,"+
		"\27\2\u01ad\u01ae\7\16\2\2\u01ae\u01b0\5,\27\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b5\3\2"+
		"\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\7\n\2\2\u01b7\u019c\3\2\2\2\u01b7\u01a0\3\2"+
		"\2\2\u01b7\u01a3\3\2\2\2\u01b7\u01a8\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\61\3\2\2\2\u01bb\u01b9\3\2\2"+
		"\2\u01bc\u01bd\7+\2\2\u01bd\u01be\7\t\2\2\u01be\u01bf\5,\27\2\u01bf\u01c1"+
		"\7\n\2\2\u01c0\u01c2\5> \2\u01c1\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\63\3\2\2\2\u01c3\u01c4\7*\2\2\u01c4\u01c5\7\t\2\2\u01c5\u01c6\5,\27\2"+
		"\u01c6\u01c8\7\n\2\2\u01c7\u01c9\5> \2\u01c8\u01c7\3\2\2\2\u01c8\u01c9"+
		"\3\2\2\2\u01c9\65\3\2\2\2\u01ca\u01cb\7,\2\2\u01cb\u01cc\7\t\2\2\u01cc"+
		"\u01ce\7\n\2\2\u01cd\u01cf\5> \2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2"+
		"\2\u01cf\67\3\2\2\2\u01d0\u01d1\t\4\2\2\u01d19\3\2\2\2\u01d2\u01dd\7-"+
		"\2\2\u01d3\u01d4\5\60\31\2\u01d4\u01d5\7\17\2\2\u01d5\u01d6\7-\2\2\u01d6"+
		"\u01dd\3\2\2\2\u01d7\u01d8\5\60\31\2\u01d8\u01d9\7\13\2\2\u01d9\u01da"+
		"\5,\27\2\u01da\u01db\7\f\2\2\u01db\u01dd\3\2\2\2\u01dc\u01d2\3\2\2\2\u01dc"+
		"\u01d3\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dd;\3\2\2\2\u01de\u01df\7\62\2\2"+
		"\u01df=\3\2\2\2\u01e0\u01e1\7\61\2\2\u01e1?\3\2\2\2HCEKQXZ_apuwz|\u0086"+
		"\u0089\u008e\u0094\u00a0\u00a2\u00a8\u00ab\u00ae\u00b0\u00b8\u00bc\u00c2"+
		"\u00c4\u00cb\u00d5\u00de\u00e4\u00ea\u00ed\u00f4\u00fa\u0100\u0104\u0109"+
		"\u0111\u0119\u0123\u0129\u012d\u0131\u0135\u0137\u013e\u0144\u014b\u0154"+
		"\u0158\u015a\u0160\u0168\u016a\u016c\u0175\u017e\u0181\u018f\u0192\u019a"+
		"\u01b1\u01b4\u01b7\u01b9\u01c1\u01c8\u01ce\u01dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}