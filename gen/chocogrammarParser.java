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
			setState(233);
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
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				if_expr();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				while_expr();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
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
			setState(235);
			match(IF);
			setState(236);
			expr(0);
			setState(237);
			match(TK_DOS_PUNTOS);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(238);
				posible_line_comment();
				}
			}

			setState(241);
			block();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(242);
				elif_expr();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(248);
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
			setState(251);
			match(ELSE);
			setState(252);
			match(TK_DOS_PUNTOS);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(253);
				posible_line_comment();
				}
			}

			setState(256);
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
			setState(258);
			match(ELIF);
			setState(259);
			expr(0);
			setState(260);
			match(TK_DOS_PUNTOS);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(261);
				posible_line_comment();
				}
			}

			setState(264);
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
			setState(266);
			match(WHILE);
			setState(267);
			expr(0);
			setState(268);
			match(TK_DOS_PUNTOS);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(269);
				posible_line_comment();
				}
			}

			setState(272);
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
			setState(274);
			match(FOR);
			setState(275);
			match(ID);
			setState(276);
			match(IN);
			setState(277);
			expr(0);
			setState(278);
			match(TK_DOS_PUNTOS);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_COMMENT) {
				{
				setState(279);
				posible_line_comment();
				}
			}

			setState(282);
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
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(PASS);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(285);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				expr(0);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(289);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				return_st();
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(293);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				asig_stmt();
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(297);
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
			setState(305); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(302);
					target();
					setState(303);
					match(TK_ASIG);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(309);
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
			setState(311);
			match(RETURN);
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
				{
				setState(312);
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
			setState(315);
			match(NEWLINE);
			setState(316);
			match(INDENT);
			setState(318); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(317);
				stmt();
				}
				}
				setState(320); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << PASS) | (1L << WHILE) | (1L << FOR) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << RETURN) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0) );
			setState(322);
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
			setState(324);
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
			setState(335);
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
				setState(327);
				cexpr(0);
				setState(329);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(328);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case NOT:
				{
				setState(331);
				not_expr();
				setState(333);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(332);
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
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(351);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(338);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(339);
						expr(0);
						setState(341);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
						case 1:
							{
							setState(340);
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
						setState(343);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(344);
						match(IF);
						setState(345);
						expr(0);
						setState(346);
						match(ELSE);
						setState(347);
						expr(0);
						setState(349);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(348);
							posible_line_comment();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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
			setState(356);
			match(NOT);
			setState(357);
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
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(360);
				match(ID);
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(361);
					posible_line_comment();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(364);
				literal();
				}
				break;
			case 3:
				{
				setState(365);
				match(TK_COR_IZQ);
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(366);
					expr(0);
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(367);
						match(TK_COMMA);
						setState(368);
						expr(0);
						}
						}
						setState(373);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(376);
				match(TK_COR_DER);
				}
				break;
			case 4:
				{
				setState(377);
				match(TK_PAR_IZQ);
				setState(378);
				expr(0);
				setState(379);
				match(TK_PAR_DER);
				}
				break;
			case 5:
				{
				setState(381);
				match(ID);
				setState(382);
				match(TK_PAR_IZQ);
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
					{
					setState(383);
					expr(0);
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMMA) {
						{
						{
						setState(384);
						match(TK_COMMA);
						setState(385);
						expr(0);
						}
						}
						setState(390);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(393);
				match(TK_PAR_DER);
				}
				break;
			case 6:
				{
				setState(394);
				print();
				}
				break;
			case 7:
				{
				setState(395);
				array_lenght();
				}
				break;
			case 8:
				{
				setState(396);
				input();
				}
				break;
			case 9:
				{
				setState(397);
				match(TK_MENOS);
				setState(398);
				cexpr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(401);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(402);
						bin_op();
						setState(403);
						cexpr(3);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(405);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(406);
						match(TK_PUNTO);
						setState(407);
						match(ID);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(408);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(409);
						match(TK_COR_IZQ);
						setState(410);
						expr(0);
						setState(411);
						match(TK_COR_DER);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(413);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(414);
						match(TK_PUNTO);
						setState(415);
						match(ID);
						setState(416);
						match(TK_PAR_IZQ);
						setState(425);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << TK_PAR_IZQ) | (1L << TK_COR_IZQ) | (1L << TK_MENOS) | (1L << NONE) | (1L << TRUE) | (1L << FALSE) | (1L << PRINT) | (1L << LEN) | (1L << INPUT) | (1L << ID) | (1L << IDSTRING) | (1L << STRING) | (1L << INTEGER))) != 0)) {
							{
							setState(417);
							expr(0);
							setState(422);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==TK_COMMA) {
								{
								{
								setState(418);
								match(TK_COMMA);
								setState(419);
								expr(0);
								}
								}
								setState(424);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(427);
						match(TK_PAR_DER);
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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
			setState(433);
			match(LEN);
			setState(434);
			match(TK_PAR_IZQ);
			setState(435);
			expr(0);
			setState(436);
			match(TK_PAR_DER);
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(437);
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
			setState(440);
			match(PRINT);
			setState(441);
			match(TK_PAR_IZQ);
			setState(442);
			expr(0);
			setState(443);
			match(TK_PAR_DER);
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(444);
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
			setState(447);
			match(INPUT);
			setState(448);
			match(TK_PAR_IZQ);
			setState(449);
			match(TK_PAR_DER);
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(450);
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
			setState(453);
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
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				cexpr(0);
				setState(457);
				match(TK_PUNTO);
				setState(458);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				cexpr(0);
				setState(461);
				match(TK_COR_IZQ);
				setState(462);
				expr(0);
				setState(463);
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
			setState(467);
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
			setState(469);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u01da\4\2\t\2"+
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
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ec\n\f\3\r\3\r\3\r\3\r\5\r\u00f2\n\r\3"+
		"\r\3\r\7\r\u00f6\n\r\f\r\16\r\u00f9\13\r\3\r\5\r\u00fc\n\r\3\16\3\16\3"+
		"\16\5\16\u0101\n\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u0109\n\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\5\20\u0111\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u011b\n\21\3\21\3\21\3\22\3\22\5\22\u0121\n\22\3\22\3"+
		"\22\5\22\u0125\n\22\3\22\3\22\5\22\u0129\n\22\3\22\3\22\5\22\u012d\n\22"+
		"\5\22\u012f\n\22\3\23\3\23\3\23\6\23\u0134\n\23\r\23\16\23\u0135\3\23"+
		"\3\23\3\24\3\24\5\24\u013c\n\24\3\25\3\25\3\25\6\25\u0141\n\25\r\25\16"+
		"\25\u0142\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u014c\n\27\3\27\3\27"+
		"\5\27\u0150\n\27\5\27\u0152\n\27\3\27\3\27\3\27\3\27\5\27\u0158\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0160\n\27\7\27\u0162\n\27\f\27\16\27"+
		"\u0165\13\27\3\30\3\30\3\30\3\31\3\31\3\31\5\31\u016d\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\7\31\u0174\n\31\f\31\16\31\u0177\13\31\5\31\u0179\n\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0185\n\31\f\31"+
		"\16\31\u0188\13\31\5\31\u018a\n\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0192\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01a7\n\31\f\31\16\31\u01aa\13"+
		"\31\5\31\u01ac\n\31\3\31\7\31\u01af\n\31\f\31\16\31\u01b2\13\31\3\32\3"+
		"\32\3\32\3\32\3\32\5\32\u01b9\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u01c0"+
		"\n\33\3\34\3\34\3\34\3\34\5\34\u01c6\n\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01d4\n\36\3\37\3\37\3 \3 \3 \2\4"+
		",\60!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"\2\5\4\2\32\34.\60\3\2\4\5\4\2\r\r\35\'\2\u0211\2a\3\2\2\2\4c\3\2\2\2"+
		"\6|\3\2\2\2\b~\3\2\2\2\n\u00b0\3\2\2\2\f\u00b2\3\2\2\2\16\u00c4\3\2\2"+
		"\2\20\u00c6\3\2\2\2\22\u00d0\3\2\2\2\24\u00da\3\2\2\2\26\u00eb\3\2\2\2"+
		"\30\u00ed\3\2\2\2\32\u00fd\3\2\2\2\34\u0104\3\2\2\2\36\u010c\3\2\2\2 "+
		"\u0114\3\2\2\2\"\u012e\3\2\2\2$\u0133\3\2\2\2&\u0139\3\2\2\2(\u013d\3"+
		"\2\2\2*\u0146\3\2\2\2,\u0151\3\2\2\2.\u0166\3\2\2\2\60\u0191\3\2\2\2\62"+
		"\u01b3\3\2\2\2\64\u01ba\3\2\2\2\66\u01c1\3\2\2\28\u01c7\3\2\2\2:\u01d3"+
		"\3\2\2\2<\u01d5\3\2\2\2>\u01d7\3\2\2\2@D\5\24\13\2AD\5\b\5\2BD\5\4\3\2"+
		"C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2\2\2"+
		"GE\3\2\2\2HJ\5\26\f\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2Lb\3\2\2"+
		"\2MK\3\2\2\2NP\5> \2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2"+
		"SQ\3\2\2\2TX\7\64\2\2UY\5\24\13\2VY\5\b\5\2WY\5\4\3\2XU\3\2\2\2XV\3\2"+
		"\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\26\f\2]\\"+
		"\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2aE\3\2\2\2aQ\3\2\2\2b"+
		"\3\3\2\2\2cd\7\21\2\2de\7-\2\2ef\7\t\2\2fg\7-\2\2gh\7\n\2\2hi\7\22\2\2"+
		"ij\7\64\2\2jk\7\65\2\2kl\5\6\4\2lm\7\66\2\2m\5\3\2\2\2np\7\23\2\2oq\5"+
		"> \2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2r}\7\64\2\2sv\5\24\13\2tv\5\b\5\2us"+
		"\3\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2y{\5> \2zy\3"+
		"\2\2\2z{\3\2\2\2{}\3\2\2\2|n\3\2\2\2|u\3\2\2\2}\7\3\2\2\2~\177\7\24\2"+
		"\2\177\u0080\7-\2\2\u0080\u0089\7\t\2\2\u0081\u0086\5\f\7\2\u0082\u0083"+
		"\7\16\2\2\u0083\u0085\5\f\7\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0089\u0081\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008e\7\n\2\2\u008c\u008d\7)\2\2\u008d\u008f\5\16\b\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\7\22\2\2\u0091"+
		"\u0093\5> \2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098"+
		"\7\64\2\2\u0098\u0099\7\65\2\2\u0099\u009a\5\n\6\2\u009a\u009b\7\66\2"+
		"\2\u009b\t\3\2\2\2\u009c\u00a1\5\20\t\2\u009d\u00a1\5\22\n\2\u009e\u00a1"+
		"\5\24\13\2\u009f\u00a1\5\b\5\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a7\5\26\f\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5> \2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b1\3\2\2\2\u00ad\u00af\5>"+
		" \2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00a2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\13\3\2\2\2\u00b2\u00b3\7-\2\2"+
		"\u00b3\u00b4\7\22\2\2\u00b4\u00b5\5\16\b\2\u00b5\r\3\2\2\2\u00b6\u00b8"+
		"\7-\2\2\u00b7\u00b9\5> \2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00c5\3\2\2\2\u00ba\u00bc\7.\2\2\u00bb\u00bd\5> \2\u00bc\u00bb\3\2\2"+
		"\2\u00bc\u00bd\3\2\2\2\u00bd\u00c5\3\2\2\2\u00be\u00bf\7\13\2\2\u00bf"+
		"\u00c0\5\16\b\2\u00c0\u00c2\7\f\2\2\u00c1\u00c3\5> \2\u00c2\u00c1\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4"+
		"\u00ba\3\2\2\2\u00c4\u00be\3\2\2\2\u00c5\17\3\2\2\2\u00c6\u00c7\7\25\2"+
		"\2\u00c7\u00cb\7-\2\2\u00c8\u00ca\5> \2\u00c9\u00c8\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\64\2\2\u00cf\21\3\2\2\2\u00d0\u00d1\7\26"+
		"\2\2\u00d1\u00d5\7-\2\2\u00d2\u00d4\5> \2\u00d3\u00d2\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00d9\7\64\2\2\u00d9\23\3\2\2\2\u00da\u00db\5\f\7"+
		"\2\u00db\u00dc\7\20\2\2\u00dc\u00de\5*\26\2\u00dd\u00df\5> \2\u00de\u00dd"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\64\2\2"+
		"\u00e1\25\3\2\2\2\u00e2\u00e4\5\"\22\2\u00e3\u00e5\5> \2\u00e4\u00e3\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\64\2\2\u00e7"+
		"\u00ec\3\2\2\2\u00e8\u00ec\5\30\r\2\u00e9\u00ec\5\36\20\2\u00ea\u00ec"+
		"\5 \21\2\u00eb\u00e2\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec\27\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5,\27"+
		"\2\u00ef\u00f1\7\22\2\2\u00f0\u00f2\5> \2\u00f1\u00f0\3\2\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\5(\25\2\u00f4\u00f6\5\34\17\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\5\32\16\2"+
		"\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\31\3\2\2\2\u00fd\u00fe"+
		"\7\7\2\2\u00fe\u0100\7\22\2\2\u00ff\u0101\5> \2\u0100\u00ff\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\5(\25\2\u0103\33\3\2\2"+
		"\2\u0104\u0105\7\b\2\2\u0105\u0106\5,\27\2\u0106\u0108\7\22\2\2\u0107"+
		"\u0109\5> \2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2"+
		"\2\u010a\u010b\5(\25\2\u010b\35\3\2\2\2\u010c\u010d\7\27\2\2\u010d\u010e"+
		"\5,\27\2\u010e\u0110\7\22\2\2\u010f\u0111\5> \2\u0110\u010f\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5(\25\2\u0113\37\3\2\2"+
		"\2\u0114\u0115\7\30\2\2\u0115\u0116\7-\2\2\u0116\u0117\7\31\2\2\u0117"+
		"\u0118\5,\27\2\u0118\u011a\7\22\2\2\u0119\u011b\5> \2\u011a\u0119\3\2"+
		"\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\5(\25\2\u011d"+
		"!\3\2\2\2\u011e\u0120\7\23\2\2\u011f\u0121\5> \2\u0120\u011f\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u012f\3\2\2\2\u0122\u0124\5,\27\2\u0123\u0125\5>"+
		" \2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012f\3\2\2\2\u0126"+
		"\u0128\5&\24\2\u0127\u0129\5> \2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2"+
		"\2\u0129\u012f\3\2\2\2\u012a\u012c\5$\23\2\u012b\u012d\5> \2\u012c\u012b"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u011e\3\2\2\2\u012e"+
		"\u0122\3\2\2\2\u012e\u0126\3\2\2\2\u012e\u012a\3\2\2\2\u012f#\3\2\2\2"+
		"\u0130\u0131\5:\36\2\u0131\u0132\7\20\2\2\u0132\u0134\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\5,\27\2\u0138%\3\2\2\2\u0139\u013b\7(\2\2\u013a"+
		"\u013c\5,\27\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\'\3\2\2\2"+
		"\u013d\u013e\7\64\2\2\u013e\u0140\7\65\2\2\u013f\u0141\5\26\f\2\u0140"+
		"\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\66\2\2\u0145)\3\2\2\2\u0146\u0147"+
		"\t\2\2\2\u0147+\3\2\2\2\u0148\u0149\b\27\1\2\u0149\u014b\5\60\31\2\u014a"+
		"\u014c\5> \2\u014b\u014a\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0152\3\2\2"+
		"\2\u014d\u014f\5.\30\2\u014e\u0150\5> \2\u014f\u014e\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0148\3\2\2\2\u0151\u014d\3\2\2\2\u0152"+
		"\u0163\3\2\2\2\u0153\u0154\f\4\2\2\u0154\u0155\t\3\2\2\u0155\u0157\5,"+
		"\27\2\u0156\u0158\5> \2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0162\3\2\2\2\u0159\u015a\f\3\2\2\u015a\u015b\7\6\2\2\u015b\u015c\5,"+
		"\27\2\u015c\u015d\7\7\2\2\u015d\u015f\5,\27\2\u015e\u0160\5> \2\u015f"+
		"\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u0153\3\2"+
		"\2\2\u0161\u0159\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163"+
		"\u0164\3\2\2\2\u0164-\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\3\2\2"+
		"\u0167\u0168\5,\27\2\u0168/\3\2\2\2\u0169\u016a\b\31\1\2\u016a\u016c\7"+
		"-\2\2\u016b\u016d\5> \2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0192\3\2\2\2\u016e\u0192\5*\26\2\u016f\u0178\7\13\2\2\u0170\u0175\5"+
		",\27\2\u0171\u0172\7\16\2\2\u0172\u0174\5,\27\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2"+
		"\2\2\u0177\u0175\3\2\2\2\u0178\u0170\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u0192\7\f\2\2\u017b\u017c\7\t\2\2\u017c\u017d\5,"+
		"\27\2\u017d\u017e\7\n\2\2\u017e\u0192\3\2\2\2\u017f\u0180\7-\2\2\u0180"+
		"\u0189\7\t\2\2\u0181\u0186\5,\27\2\u0182\u0183\7\16\2\2\u0183\u0185\5"+
		",\27\2\u0184\u0182\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186"+
		"\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u0181\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0192\7\n\2\2\u018c"+
		"\u0192\5\64\33\2\u018d\u0192\5\62\32\2\u018e\u0192\5\66\34\2\u018f\u0190"+
		"\7\r\2\2\u0190\u0192\5\60\31\3\u0191\u0169\3\2\2\2\u0191\u016e\3\2\2\2"+
		"\u0191\u016f\3\2\2\2\u0191\u017b\3\2\2\2\u0191\u017f\3\2\2\2\u0191\u018c"+
		"\3\2\2\2\u0191\u018d\3\2\2\2\u0191\u018e\3\2\2\2\u0191\u018f\3\2\2\2\u0192"+
		"\u01b0\3\2\2\2\u0193\u0194\f\4\2\2\u0194\u0195\58\35\2\u0195\u0196\5\60"+
		"\31\5\u0196\u01af\3\2\2\2\u0197\u0198\f\13\2\2\u0198\u0199\7\17\2\2\u0199"+
		"\u01af\7-\2\2\u019a\u019b\f\n\2\2\u019b\u019c\7\13\2\2\u019c\u019d\5,"+
		"\27\2\u019d\u019e\7\f\2\2\u019e\u01af\3\2\2\2\u019f\u01a0\f\t\2\2\u01a0"+
		"\u01a1\7\17\2\2\u01a1\u01a2\7-\2\2\u01a2\u01ab\7\t\2\2\u01a3\u01a8\5,"+
		"\27\2\u01a4\u01a5\7\16\2\2\u01a5\u01a7\5,\27\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\3\2"+
		"\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"\u01ad\3\2\2\2\u01ad\u01af\7\n\2\2\u01ae\u0193\3\2\2\2\u01ae\u0197\3\2"+
		"\2\2\u01ae\u019a\3\2\2\2\u01ae\u019f\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\61\3\2\2\2\u01b2\u01b0\3\2\2"+
		"\2\u01b3\u01b4\7+\2\2\u01b4\u01b5\7\t\2\2\u01b5\u01b6\5,\27\2\u01b6\u01b8"+
		"\7\n\2\2\u01b7\u01b9\5> \2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\63\3\2\2\2\u01ba\u01bb\7*\2\2\u01bb\u01bc\7\t\2\2\u01bc\u01bd\5,\27\2"+
		"\u01bd\u01bf\7\n\2\2\u01be\u01c0\5> \2\u01bf\u01be\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\65\3\2\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c3\7\t\2\2\u01c3"+
		"\u01c5\7\n\2\2\u01c4\u01c6\5> \2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2"+
		"\2\u01c6\67\3\2\2\2\u01c7\u01c8\t\4\2\2\u01c89\3\2\2\2\u01c9\u01d4\7-"+
		"\2\2\u01ca\u01cb\5\60\31\2\u01cb\u01cc\7\17\2\2\u01cc\u01cd\7-\2\2\u01cd"+
		"\u01d4\3\2\2\2\u01ce\u01cf\5\60\31\2\u01cf\u01d0\7\13\2\2\u01d0\u01d1"+
		"\5,\27\2\u01d1\u01d2\7\f\2\2\u01d2\u01d4\3\2\2\2\u01d3\u01c9\3\2\2\2\u01d3"+
		"\u01ca\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d4;\3\2\2\2\u01d5\u01d6\7\62\2\2"+
		"\u01d6=\3\2\2\2\u01d7\u01d8\7\61\2\2\u01d8?\3\2\2\2FCEKQXZ_apuwz|\u0086"+
		"\u0089\u008e\u0094\u00a0\u00a2\u00a8\u00ab\u00ae\u00b0\u00b8\u00bc\u00c2"+
		"\u00c4\u00cb\u00d5\u00de\u00e4\u00eb\u00f1\u00f7\u00fb\u0100\u0108\u0110"+
		"\u011a\u0120\u0124\u0128\u012c\u012e\u0135\u013b\u0142\u014b\u014f\u0151"+
		"\u0157\u015f\u0161\u0163\u016c\u0175\u0178\u0186\u0189\u0191\u01a8\u01ab"+
		"\u01ae\u01b0\u01b8\u01bf\u01c5\u01d3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}