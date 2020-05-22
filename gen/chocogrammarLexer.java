// Generated from D:/Documents/Tareas/NOVENA_MATRICULA/Lenguajes_de_programacion/Practicas/Chocopy-to-Javascript-translator/Translate/Grammar\chocogrammar.g4 by ANTLR 4.8
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NOT=27, AND=28, OR=29, IF=30, ELSE=31, ELIF=32, LEN=33, 
		INPUT=34, TK_PAR_IZQ=35, TK_PAR_DER=36, TK_COR_IZQ=37, TK_COR_DER=38, 
		TK_MENOS=39, TK_COMMA=40, TK_PUNTO=41, TK_ASIG=42, ID=43, IDSTRING=44, 
		STRING=45, INTEGER=46, LINE_COMMENT=47, SKIP_=48, NEWLINE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "NOT", "AND", "OR", "IF", "ELSE", "ELIF", "LEN", "INPUT", "TK_PAR_IZQ", 
			"TK_PAR_DER", "TK_COR_IZQ", "TK_COR_DER", "TK_MENOS", "TK_COMMA", "TK_PUNTO", 
			"TK_ASIG", "ID", "IDSTRING", "STRING", "INTEGER", "LINE_COMMENT", "SPACES", 
			"COMMENT", "SKIP_", "NEWLINE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "':'", "'pass'", "'def'", "'->'", "'global'", "'nonlocal'", 
			"'while'", "'for'", "'in'", "'return'", "'print'", "'None'", "'True'", 
			"'False'", "'+'", "'*'", "'//'", "'%'", "'=='", "'!='", "'<='", "'>='", 
			"'<'", "'>'", "'is'", "'not'", "'and'", "'or'", "'if'", "'else'", "'elif'", 
			"'len'", "'input'", "'('", "')'", "'['", "']'", "'-'", "','", "'.'", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NOT", "AND", "OR", "IF", "ELSE", "ELIF", "LEN", "INPUT", 
			"TK_PAR_IZQ", "TK_PAR_DER", "TK_COR_IZQ", "TK_COR_DER", "TK_MENOS", "TK_COMMA", 
			"TK_PUNTO", "TK_ASIG", "ID", "IDSTRING", "STRING", "INTEGER", "LINE_COMMENT", 
			"SKIP_", "NEWLINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u014e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\7,\u0108\n,\f,\16,\u010b\13,\3"+
		"-\3-\7-\u010f\n-\f-\16-\u0112\13-\3.\3.\3.\3.\7.\u0118\n.\f.\16.\u011b"+
		"\13.\3.\3.\3/\6/\u0120\n/\r/\16/\u0121\3\60\3\60\7\60\u0126\n\60\f\60"+
		"\16\60\u0129\13\60\3\60\3\60\3\61\6\61\u012e\n\61\r\61\16\61\u012f\3\62"+
		"\3\62\7\62\u0134\n\62\f\62\16\62\u0137\13\62\3\63\3\63\5\63\u013b\n\63"+
		"\3\63\3\63\3\64\3\64\3\64\5\64\u0142\n\64\3\64\3\64\5\64\u0146\n\64\3"+
		"\64\5\64\u0149\n\64\5\64\u014b\n\64\3\64\3\64\2\2\65\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\2c\2e\62g\63\3\2\n\4\2C\\c|\6\2\62;C\\aac|\4"+
		"\2$$^^\6\2\f\f\17\17$$^^\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\4\2\f\f\16"+
		"\17\2\u0158\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\3i\3\2\2\2\5o\3\2\2\2\7q\3\2\2\2\tv\3\2\2\2"+
		"\13z\3\2\2\2\r}\3\2\2\2\17\u0084\3\2\2\2\21\u008d\3\2\2\2\23\u0093\3\2"+
		"\2\2\25\u0097\3\2\2\2\27\u009a\3\2\2\2\31\u00a1\3\2\2\2\33\u00a7\3\2\2"+
		"\2\35\u00ac\3\2\2\2\37\u00b1\3\2\2\2!\u00b7\3\2\2\2#\u00b9\3\2\2\2%\u00bb"+
		"\3\2\2\2\'\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2-\u00c6\3\2\2\2"+
		"/\u00c9\3\2\2\2\61\u00cc\3\2\2\2\63\u00ce\3\2\2\2\65\u00d0\3\2\2\2\67"+
		"\u00d3\3\2\2\29\u00d7\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2?\u00e1\3\2"+
		"\2\2A\u00e6\3\2\2\2C\u00eb\3\2\2\2E\u00ef\3\2\2\2G\u00f5\3\2\2\2I\u00f7"+
		"\3\2\2\2K\u00f9\3\2\2\2M\u00fb\3\2\2\2O\u00fd\3\2\2\2Q\u00ff\3\2\2\2S"+
		"\u0101\3\2\2\2U\u0103\3\2\2\2W\u0105\3\2\2\2Y\u010c\3\2\2\2[\u0113\3\2"+
		"\2\2]\u011f\3\2\2\2_\u0123\3\2\2\2a\u012d\3\2\2\2c\u0131\3\2\2\2e\u013a"+
		"\3\2\2\2g\u014a\3\2\2\2ij\7e\2\2jk\7n\2\2kl\7c\2\2lm\7u\2\2mn\7u\2\2n"+
		"\4\3\2\2\2op\7<\2\2p\6\3\2\2\2qr\7r\2\2rs\7c\2\2st\7u\2\2tu\7u\2\2u\b"+
		"\3\2\2\2vw\7f\2\2wx\7g\2\2xy\7h\2\2y\n\3\2\2\2z{\7/\2\2{|\7@\2\2|\f\3"+
		"\2\2\2}~\7i\2\2~\177\7n\2\2\177\u0080\7q\2\2\u0080\u0081\7d\2\2\u0081"+
		"\u0082\7c\2\2\u0082\u0083\7n\2\2\u0083\16\3\2\2\2\u0084\u0085\7p\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7p\2\2\u0087\u0088\7n\2\2\u0088\u0089\7q\2\2"+
		"\u0089\u008a\7e\2\2\u008a\u008b\7c\2\2\u008b\u008c\7n\2\2\u008c\20\3\2"+
		"\2\2\u008d\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7g\2\2\u0092\22\3\2\2\2\u0093\u0094\7h\2\2\u0094\u0095"+
		"\7q\2\2\u0095\u0096\7t\2\2\u0096\24\3\2\2\2\u0097\u0098\7k\2\2\u0098\u0099"+
		"\7p\2\2\u0099\26\3\2\2\2\u009a\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d"+
		"\7v\2\2\u009d\u009e\7w\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\30\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6\32\3\2\2\2\u00a7\u00a8\7P\2\2\u00a8"+
		"\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7g\2\2\u00ab\34\3\2\2\2\u00ac"+
		"\u00ad\7V\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7w\2\2\u00af\u00b0\7g\2\2"+
		"\u00b0\36\3\2\2\2\u00b1\u00b2\7H\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7"+
		"n\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7g\2\2\u00b6 \3\2\2\2\u00b7\u00b8"+
		"\7-\2\2\u00b8\"\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba$\3\2\2\2\u00bb\u00bc"+
		"\7\61\2\2\u00bc\u00bd\7\61\2\2\u00bd&\3\2\2\2\u00be\u00bf\7\'\2\2\u00bf"+
		"(\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2\7?\2\2\u00c2*\3\2\2\2\u00c3\u00c4"+
		"\7#\2\2\u00c4\u00c5\7?\2\2\u00c5,\3\2\2\2\u00c6\u00c7\7>\2\2\u00c7\u00c8"+
		"\7?\2\2\u00c8.\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca\u00cb\7?\2\2\u00cb\60"+
		"\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\62\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf"+
		"\64\3\2\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7u\2\2\u00d2\66\3\2\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7v\2\2\u00d68\3\2\2\2\u00d7"+
		"\u00d8\7c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da:\3\2\2\2\u00db"+
		"\u00dc\7q\2\2\u00dc\u00dd\7t\2\2\u00dd<\3\2\2\2\u00de\u00df\7k\2\2\u00df"+
		"\u00e0\7h\2\2\u00e0>\3\2\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7n\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4\u00e5\7g\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7g\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7h\2\2\u00eaB\3\2\2\2\u00eb"+
		"\u00ec\7n\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00eeD\3\2\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1\u00f2\7r\2\2\u00f2\u00f3\7w\2\2"+
		"\u00f3\u00f4\7v\2\2\u00f4F\3\2\2\2\u00f5\u00f6\7*\2\2\u00f6H\3\2\2\2\u00f7"+
		"\u00f8\7+\2\2\u00f8J\3\2\2\2\u00f9\u00fa\7]\2\2\u00faL\3\2\2\2\u00fb\u00fc"+
		"\7_\2\2\u00fcN\3\2\2\2\u00fd\u00fe\7/\2\2\u00feP\3\2\2\2\u00ff\u0100\7"+
		".\2\2\u0100R\3\2\2\2\u0101\u0102\7\60\2\2\u0102T\3\2\2\2\u0103\u0104\7"+
		"?\2\2\u0104V\3\2\2\2\u0105\u0109\t\2\2\2\u0106\u0108\t\3\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"X\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\t\2\2\2\u010d\u010f\t\3\2\2"+
		"\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111"+
		"\3\2\2\2\u0111Z\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0119\7$\2\2\u0114\u0115"+
		"\7^\2\2\u0115\u0118\t\4\2\2\u0116\u0118\n\5\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7$\2\2\u011d"+
		"\\\3\2\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122^\3\2\2\2\u0123\u0127\7"+
		"%\2\2\u0124\u0126\n\7\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u012a\u012b\b\60\2\2\u012b`\3\2\2\2\u012c\u012e\t\b\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"b\3\2\2\2\u0131\u0135\7%\2\2\u0132\u0134\n\t\2\2\u0133\u0132\3\2\2\2\u0134"+
		"\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136d\3\2\2\2"+
		"\u0137\u0135\3\2\2\2\u0138\u013b\5a\61\2\u0139\u013b\5c\62\2\u013a\u0138"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\63\2\2"+
		"\u013df\3\2\2\2\u013e\u013f\6\64\2\2\u013f\u014b\5a\61\2\u0140\u0142\7"+
		"\17\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143"+
		"\u0146\7\f\2\2\u0144\u0146\4\16\17\2\u0145\u0141\3\2\2\2\u0145\u0144\3"+
		"\2\2\2\u0146\u0148\3\2\2\2\u0147\u0149\5a\61\2\u0148\u0147\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u013e\3\2\2\2\u014a\u0145\3\2"+
		"\2\2\u014b\u014c\3\2\2\2\u014c\u014d\b\64\3\2\u014dh\3\2\2\2\20\2\u0109"+
		"\u0110\u0117\u0119\u0121\u0127\u012f\u0135\u013a\u0141\u0145\u0148\u014a"+
		"\4\b\2\2\3\64\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}