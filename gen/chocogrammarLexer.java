// Generated from C:/Users/Mike/IdeaProjects/Chocopy-to-Javascript-translator/Grammar\chocogrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chocogrammarLexer extends Lexer {
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
		SKIP_=49, NEWLINE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NOT", "AND", "OR", "IF", "ELSE", "ELIF", "TK_PAR_IZQ", "TK_PAR_DER", 
			"TK_COR_IZQ", "TK_COR_DER", "TK_MENOS", "TK_COMMA", "TK_PUNTO", "TK_ASIG", 
			"CLASS", "TK_DOS_PUNTOS", "PASS", "DEF", "GLOBAL", "NONLOCAL", "WHILE", 
			"FOR", "IN", "NONE", "TRUE", "FALSE", "TK_MAS", "TK_POR", "TK_DIV", "TK_MOD", 
			"TK_COMP", "TK_DIF", "TK_MENOR_IG", "TK_MAYOR_IG", "TK_MENOR", "TK_MAYOR", 
			"TK_IS", "RETURN", "TK_FUNC_TYPE", "PRINT", "LEN", "INPUT", "ID", "IDSTRING", 
			"STRING", "INTEGER", "LINE_COMMENT", "SPACES", "COMMENT", "SKIP_", "NEWLINE"
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
			"STRING", "INTEGER", "LINE_COMMENT", "COMMENT", "SKIP_", "NEWLINE"
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


	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;
	  // The most recently produced token.
	  private Token lastToken = null;
	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      // First emit an extra line break that serves as the end of the statement.
	      this.emit(commonToken(chocogrammarParser.NEWLINE, "\n"));

	      // Now emit as much DEDENT tokens as needed.
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }

	      // Put the EOF back on the token stream.
	      this.emit(commonToken(chocogrammarParser.EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      // Keep track of the last token on the default channel.
	      this.lastToken = next;
	    }
	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(chocogrammarParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  // Calculates the indentation of the provided spaces, taking the
	  // following rules into account:
	  //
	  // "Tabs are replaced (from left to right) by one to eight spaces
	  //  such that the total number of characters up to and including
	  //  the replacement is a multiple of eight [...]"
	  //
	  //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          // A normal space char.
	          count++;
	      }
	    }

	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  }


	public chocogrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "chocogrammar.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 50:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n\f]+", "");
			     String spaces = getText().replaceAll("[\r\n\f]+", "");

			     // Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
			     // satisfy the final newline needed by the single_put rule used by the REPL.
			     int next = _input.LA(1);
			     int nextnext = _input.LA(2);
			     if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
			       // If we're inside a list or on a blank line, ignore all indents,
			       // dedents and line breaks.
			       skip();
			     }
			     else {
			       emit(commonToken(NEWLINE, newLine));
			       int indent = getIndentationCount(spaces);
			       int previous = indents.isEmpty() ? 0 : indents.peek();
			       if (indent == previous) {
			         // skip indents of the same size as the present indent-size
			         skip();
			       }
			       else if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(chocogrammarParser.INDENT, spaces));
			       }
			       else {
			         // Possibly emit more than 1 DEDENT token.
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 50:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u014d\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"#\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3"+
		")\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\7,\u0108\n,\f,\16,\u010b"+
		"\13,\3-\3-\3-\7-\u0110\n-\f-\16-\u0113\13-\3-\3-\3.\3.\3.\3.\7.\u011b"+
		"\n.\f.\16.\u011e\13.\3.\3.\3/\6/\u0123\n/\r/\16/\u0124\3\60\3\60\7\60"+
		"\u0129\n\60\f\60\16\60\u012c\13\60\3\61\6\61\u012f\n\61\r\61\16\61\u0130"+
		"\3\62\3\62\7\62\u0135\n\62\f\62\16\62\u0138\13\62\3\63\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\5\64\u0141\n\64\3\64\3\64\5\64\u0145\n\64\3\64\5\64\u0148"+
		"\n\64\5\64\u014a\n\64\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\2c\62e\63g\64\3\2\t\4\2C\\c|\6\2\62;C\\aac|\4\2$$^^\6\2\f\f"+
		"\17\17$$^^\3\2\62;\4\2\f\f\16\17\4\2\13\13\"\"\2\u0157\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\3i\3\2\2\2\5m\3\2\2\2\7q\3\2\2\2\tt\3\2\2\2\13w\3\2\2\2\r"+
		"|\3\2\2\2\17\u0081\3\2\2\2\21\u0083\3\2\2\2\23\u0085\3\2\2\2\25\u0087"+
		"\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2\33\u008d\3\2\2\2\35\u008f\3"+
		"\2\2\2\37\u0091\3\2\2\2!\u0097\3\2\2\2#\u0099\3\2\2\2%\u009e\3\2\2\2\'"+
		"\u00a2\3\2\2\2)\u00a9\3\2\2\2+\u00b2\3\2\2\2-\u00b8\3\2\2\2/\u00bc\3\2"+
		"\2\2\61\u00bf\3\2\2\2\63\u00c4\3\2\2\2\65\u00c9\3\2\2\2\67\u00cf\3\2\2"+
		"\29\u00d1\3\2\2\2;\u00d3\3\2\2\2=\u00d6\3\2\2\2?\u00d8\3\2\2\2A\u00db"+
		"\3\2\2\2C\u00de\3\2\2\2E\u00e1\3\2\2\2G\u00e4\3\2\2\2I\u00e6\3\2\2\2K"+
		"\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00f2\3\2\2\2Q\u00f5\3\2\2\2S\u00fb\3\2"+
		"\2\2U\u00ff\3\2\2\2W\u0105\3\2\2\2Y\u010c\3\2\2\2[\u0116\3\2\2\2]\u0122"+
		"\3\2\2\2_\u0126\3\2\2\2a\u012e\3\2\2\2c\u0132\3\2\2\2e\u0139\3\2\2\2g"+
		"\u0149\3\2\2\2ij\7p\2\2jk\7q\2\2kl\7v\2\2l\4\3\2\2\2mn\7c\2\2no\7p\2\2"+
		"op\7f\2\2p\6\3\2\2\2qr\7q\2\2rs\7t\2\2s\b\3\2\2\2tu\7k\2\2uv\7h\2\2v\n"+
		"\3\2\2\2wx\7g\2\2xy\7n\2\2yz\7u\2\2z{\7g\2\2{\f\3\2\2\2|}\7g\2\2}~\7n"+
		"\2\2~\177\7k\2\2\177\u0080\7h\2\2\u0080\16\3\2\2\2\u0081\u0082\7*\2\2"+
		"\u0082\20\3\2\2\2\u0083\u0084\7+\2\2\u0084\22\3\2\2\2\u0085\u0086\7]\2"+
		"\2\u0086\24\3\2\2\2\u0087\u0088\7_\2\2\u0088\26\3\2\2\2\u0089\u008a\7"+
		"/\2\2\u008a\30\3\2\2\2\u008b\u008c\7.\2\2\u008c\32\3\2\2\2\u008d\u008e"+
		"\7\60\2\2\u008e\34\3\2\2\2\u008f\u0090\7?\2\2\u0090\36\3\2\2\2\u0091\u0092"+
		"\7e\2\2\u0092\u0093\7n\2\2\u0093\u0094\7c\2\2\u0094\u0095\7u\2\2\u0095"+
		"\u0096\7u\2\2\u0096 \3\2\2\2\u0097\u0098\7<\2\2\u0098\"\3\2\2\2\u0099"+
		"\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b\u009c\7u\2\2\u009c\u009d\7u\2\2"+
		"\u009d$\3\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7h\2"+
		"\2\u00a1&\3\2\2\2\u00a2\u00a3\7i\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7"+
		"q\2\2\u00a5\u00a6\7d\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7n\2\2\u00a8("+
		"\3\2\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7p\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7c\2\2"+
		"\u00b0\u00b1\7n\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2"+
		"\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7,\3\2"+
		"\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7t\2\2\u00bb.\3"+
		"\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7p\2\2\u00be\60\3\2\2\2\u00bf\u00c0"+
		"\7P\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3"+
		"\62\3\2\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7g\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\7H\2\2\u00ca\u00cb\7c\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\66\3\2\2\2\u00cf"+
		"\u00d0\7-\2\2\u00d08\3\2\2\2\u00d1\u00d2\7,\2\2\u00d2:\3\2\2\2\u00d3\u00d4"+
		"\7\61\2\2\u00d4\u00d5\7\61\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7"+
		">\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00da@\3\2\2\2\u00db\u00dc"+
		"\7#\2\2\u00dc\u00dd\7?\2\2\u00ddB\3\2\2\2\u00de\u00df\7>\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0D\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3\7?\2\2\u00e3F\3"+
		"\2\2\2\u00e4\u00e5\7>\2\2\u00e5H\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7J\3\2"+
		"\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7u\2\2\u00eaL\3\2\2\2\u00eb\u00ec"+
		"\7t\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7t\2\2\u00f0\u00f1\7p\2\2\u00f1N\3\2\2\2\u00f2\u00f3\7/\2\2\u00f3"+
		"\u00f4\7@\2\2\u00f4P\3\2\2\2\u00f5\u00f6\7r\2\2\u00f6\u00f7\7t\2\2\u00f7"+
		"\u00f8\7k\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2\u00faR\3\2\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7g\2\2\u00fd\u00fe\7p\2\2\u00feT\3\2\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7r\2\2\u0102\u0103\7w\2\2"+
		"\u0103\u0104\7v\2\2\u0104V\3\2\2\2\u0105\u0109\t\2\2\2\u0106\u0108\t\3"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010aX\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7$\2\2\u010d"+
		"\u0111\t\2\2\2\u010e\u0110\t\3\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7$\2\2\u0115Z\3\2\2\2\u0116\u011c\7$\2\2\u0117"+
		"\u0118\7^\2\2\u0118\u011b\t\4\2\2\u0119\u011b\n\5\2\2\u011a\u0117\3\2"+
		"\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7$"+
		"\2\2\u0120\\\3\2\2\2\u0121\u0123\t\6\2\2\u0122\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125^\3\2\2\2\u0126"+
		"\u012a\7%\2\2\u0127\u0129\n\7\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b`\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012f\t\b\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131b\3\2\2\2\u0132\u0136\7%\2\2\u0133"+
		"\u0135\n\7\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137d\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a"+
		"\5a\61\2\u013a\u013b\3\2\2\2\u013b\u013c\b\63\2\2\u013cf\3\2\2\2\u013d"+
		"\u013e\6\64\2\2\u013e\u014a\5a\61\2\u013f\u0141\7\17\2\2\u0140\u013f\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\7\f\2\2\u0143"+
		"\u0145\4\16\17\2\u0144\u0140\3\2\2\2\u0144\u0143\3\2\2\2\u0145\u0147\3"+
		"\2\2\2\u0146\u0148\5a\61\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u014a\3\2\2\2\u0149\u013d\3\2\2\2\u0149\u0144\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014c\b\64\3\2\u014ch\3\2\2\2\17\2\u0109\u0111\u011a\u011c"+
		"\u0124\u012a\u0130\u0136\u0140\u0144\u0147\u0149\4\b\2\2\3\64\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}