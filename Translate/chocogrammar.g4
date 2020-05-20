/******************************************************
 * A multi-line Javadoc-like comment about my grammar *
 ******************************************************/
grammar chocogrammar;

program: (var_def | func_def | class_def)* stmt* ;

class_def: 'class' ID '(' ID ')' ':' NEWLINE INDENT class_body DEDENT;

class_body:'pass' NEWLINE
            | (var_def | func_def)+
            ;
func_def : 'def' ID '(' (typed_var (',' typed_var)*)? ')' ('->' type)? ':' NEWLINE INDENT func_body DEDENT;

func_body : (global_decl | nonlocal_decl | var_def | func_def )* stmt+  ;

typed_var : ID ':' type;

type: ID | IDSTRING | '[' type ']';

global_decl : 'global' ID NEWLINE;

nonlocal_decl : 'nonlocal' ID NEWLINE;

var_def : typed_var '=' literal NEWLINE;

stmt : simple_stmt NEWLINE
        | 'if' expr ':' block ('elif' expr ':' block)* ('else' ':' block)?
        | 'while' expr ':' block
        | 'for' ID 'in' expr ':' block
;

simple_stmt: 'pass'
| expr
| 'return' (expr)?
| (target '=')+ expr
;

block : NEWLINE INDENT stmt+ DEDENT ;
literal: 'None'
        | 'True'
        | 'False'
        | INTEGER
        | IDSTRING | STRING
;

expr : cexpr
        | 'not' expr
        | expr ('and' | 'or') expr
        | expr 'if' expr 'else' expr
;
cexpr : ID
        | literal
        | '[' (expr (',' expr)*)? ']'
        | '(' expr ')'
        | cexpr '.' ID
        | cexpr '[' expr ']'
        | cexpr '.' ID  '(' (expr (',' expr)*)? ')'
        | ID '(' (expr (',' expr)*)? ')'
        | cexpr bin_op cexpr
        | '-' cexpr
;

bin_op : '+' | '-' | '*' | '//' | '%' | '==' | '!=' | '<=' | '>=' | '<' | '>' | 'is' ;
//member_expr: cexpr '.' ID ;
//index_expr: cexpr '[' expr ']' ;
target : ID
        | cexpr '.' ID
        | cexpr '[' expr ']'
;

// some lexer rules
ID:         [a-zA-Z][a-zA-Z0-9_]* ;
IDSTRING:   [a-zA-Z][a-zA-Z0-9_]* ;
STRING:     '"'[a-zA-Z0-9_]*'"' ;
INTEGER:    [0-9]+ ; // match integers
NEWLINE:    '\r'? '\n' ; // return newlines to parser
COMMENT:    '#' ~[\r\n]* -> skip ;

//skip spaces
WhiteSpace : (' '|'\t') -> skip;

// Following two lexer rules are imaginary, condition is never meet ... they are here just to suppress warnings
DEDENT:   ('\n');
INDENT:   ('\n');