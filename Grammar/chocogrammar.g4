grammar chocogrammar;


//Python official grammar indents handler
tokens { INDENT, DEDENT }

@lexer::members {
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
}

program :  (var_def | func_def | class_def )* stmt* | posible_line_comment* NEWLINE (var_def | func_def | class_def )+ stmt+ ;

class_def : CLASS ID TK_PAR_IZQ ID TK_PAR_DER TK_DOS_PUNTOS NEWLINE INDENT class_body DEDENT ;

class_body : PASS posible_line_comment? NEWLINE
             | (var_def | func_def)+ posible_line_comment?
             ;
func_def : DEF ID TK_PAR_IZQ (typed_var (TK_COMMA typed_var)*)? TK_PAR_DER (TK_FUNC_TYPE type)? ':' posible_line_comment* NEWLINE INDENT func_body DEDENT;

func_body : (global_decl | nonlocal_decl | var_def | func_def )* stmt+ posible_line_comment? | posible_line_comment?;

typed_var : ID TK_DOS_PUNTOS type;

type : ID posible_line_comment?
    | IDSTRING posible_line_comment?
    | TK_COR_IZQ type TK_COR_DER posible_line_comment?;

global_decl : GLOBAL ID posible_line_comment* NEWLINE;

nonlocal_decl : NONLOCAL ID posible_line_comment* NEWLINE;

var_def : typed_var TK_ASIG literal posible_line_comment? NEWLINE;

stmt : simple_stmt posible_line_comment? NEWLINE
    |  simple_stmt posible_line_comment? NEWLINE? EOF
    | if_expr
    | while_expr
    | for_expr
    ;

if_expr: IF expr TK_DOS_PUNTOS posible_line_comment? block elif_expr* else_expr?  ;
else_expr:ELSE TK_DOS_PUNTOS posible_line_comment? block;
elif_expr: ELIF expr TK_DOS_PUNTOS posible_line_comment? block;
while_expr: WHILE expr TK_DOS_PUNTOS posible_line_comment? block ;
for_expr: FOR ID IN expr TK_DOS_PUNTOS posible_line_comment? block ;

simple_stmt : PASS posible_line_comment?
    | expr posible_line_comment?
    | return_st posible_line_comment?
    | asig_stmt posible_line_comment?
    ;
asig_stmt: (target TK_ASIG)+ expr ;

return_st: RETURN expr? ;

block : NEWLINE INDENT stmt+ DEDENT  ;

literal : NONE
    | TRUE
    | FALSE
    | INTEGER
    | IDSTRING
    | STRING;
///
expr : cexpr posible_line_comment?
    | not_expr posible_line_comment?
    | expr (AND | OR) expr posible_line_comment?
    | expr IF expr ELSE expr posible_line_comment?
    ;

not_expr: NOT expr;


///
cexpr : ID posible_line_comment?
    | literal
    | TK_COR_IZQ (expr (TK_COMMA expr)*)? TK_COR_DER
    | TK_PAR_IZQ expr TK_PAR_DER
    | cexpr TK_PUNTO ID
    | cexpr TK_COR_IZQ expr TK_COR_DER
    | cexpr TK_PUNTO ID TK_PAR_IZQ (expr (TK_COMMA expr)*)? TK_PAR_DER
    | ID TK_PAR_IZQ (expr (TK_COMMA expr)*)? TK_PAR_DER
    | print
    | array_lenght
    | input
    | cexpr bin_op cexpr
    | TK_MENOS cexpr
    ;
array_lenght: LEN TK_PAR_IZQ expr TK_PAR_DER posible_line_comment?;
print : PRINT TK_PAR_IZQ expr TK_PAR_DER posible_line_comment?;
input: INPUT TK_PAR_IZQ  TK_PAR_DER posible_line_comment?;

bin_op : TK_MAS
    | TK_MENOS
    | TK_POR
    | TK_DIV
    | TK_MOD
    | TK_COMP
    | TK_DIF
    | TK_MENOR_IG
    | TK_MAYOR_IG
    | TK_MENOR
    | TK_MAYOR
    | TK_IS
    ;

target : ID
    | cexpr TK_PUNTO ID
    | cexpr TK_COR_IZQ expr TK_COR_DER
    ;

posible_comment: COMMENT;
posible_line_comment: LINE_COMMENT;

NOT : 'not';
AND : 'and';
OR : 'or';
IF : 'if';
ELSE : 'else';
ELIF : 'elif';
TK_PAR_IZQ : '(';
TK_PAR_DER : ')';
TK_COR_IZQ : '[';
TK_COR_DER : ']';
TK_MENOS : '-';
TK_COMMA : ',';
TK_PUNTO : '.';
TK_ASIG: '=';
CLASS : 'class';
TK_DOS_PUNTOS: ':';
PASS: 'pass';
DEF : 'def';
GLOBAL: 'global';
NONLOCAL: 'nonlocal';
WHILE: 'while';
FOR: 'for';
IN: 'in';
NONE: 'None';
TRUE: 'True';
FALSE: 'False';
TK_MAS: '+';
TK_POR: '*';
TK_DIV: '//';
TK_MOD: '%';
TK_COMP:'==';
TK_DIF: '!=';
TK_MENOR_IG: '<=';
TK_MAYOR_IG: '>=';
TK_MENOR: '<';
TK_MAYOR:'>';
TK_IS: 'is';
RETURN:'return';
TK_FUNC_TYPE: '->';
PRINT: 'print';
LEN:'len';
INPUT:'input';
// some lexer rules
ID:         [a-zA-Z][a-zA-Z0-9_]* ;
IDSTRING:   '"'[a-zA-Z][a-zA-Z0-9_]*'"' ;
//STRING:   '"'[a-zA-Z0-9_]*'"' ;
STRING:     '"' ('\\' ["\\] | ~["\\\r\n])* '"';
INTEGER:    [0-9]+ ; // match integers


//Python official grammar
//LINE_COMMENT 	: '#' ~[\r\n\f]* -> channel(2) ;
LINE_COMMENT 	: '#' ~[\r\n\f]*  ;
fragment SPACES
 : [ \t]+
 ;

COMMENT
 : '#' ~[\r\n\f]*
 ;

SKIP_
 : ( SPACES ) -> skip
 ;

NEWLINE
 : ( {atStartOfInput()}?   SPACES
   | ( '\r'? '\n' | '\r' | '\f' ) SPACES?
   )
   {
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
   }
 ;