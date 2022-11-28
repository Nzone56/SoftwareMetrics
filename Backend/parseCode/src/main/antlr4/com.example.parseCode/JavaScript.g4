/**
 * This comes as part of minijs project https://github.com/frankdu/minijs
 * Modified by group of "Lenguajes de Programación 2022-2 "
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grammar JavaScript;

program
    :   statement+
    ;

statement
    :   'break' id? ';'?                          #breakStatement
    |   'continue' id? ';'?                       #continueStatement
    |   'return' expression? ';'?                         #returnStatement
    |   'throw' expression ';'?                           #throwStatement
    |   tryStatement                                      #tryStatement0
    |   variableDeclarators ';'?                          #variableDeclareStatement
    |   blockStatement                                    #blockStatement0
    |   'if' '(' expression ')' statement
        ('else' statement)?                               #ifStatement
    |   'for' '(' forControl ')' statement                #forStatement
    |   'for' '(' 'var'? id 'in' expression ')'
        statement                                         #forInStatement
    |   'while' '(' expression ')' statement              #whileStatement
    |   'do' statement 'while' '(' expression ')' ';'?    #doWhileStatement
    |   'switch' '(' expression ')'
        '{' caseClause* (defaultClause caseClause*)? '}'  #switchStatement
    |   id ':' statement                          #labelledStatement
    |   'function' IDENTIFIER '(' formalParameterList? ')'
        blockStatement                                    #functionDeclaration
    |   'function' 'main' '('')'
        blockStatement                                    #mainFunction
    |   expression ';'?                                   #expressionStatement
    |   ';'                                               #noopStatement
    |  'console' '.' 'log' '('expression ')'              #consoleLogStatement
    ;

tryStatement
    :   'try' blockStatement finallyClause
    |   'try' blockStatement catchClause+ finallyClause?
    ;

catchClause
    :   'catch' '(' id ('if' expression)? ')' blockStatement
    ;

finallyClause
    :   'finally' blockStatement
    ;

formalParameterList
    :   id (',' id)*
    ;

caseClause
    :   'case' expression ':' statement*
    ;

defaultClause
    :   'default' ':' statement*
    ;

blockStatement
    :   '{' statement* '}'
    ;

variableDeclarators
    : variableDeclaratorVar
    | 'let' variableDeclarator (',' variableDeclarator)*
    | 'const' variableDeclarator (',' variableDeclarator)*
    ;

variableDeclaratorVar
    :   'var' variableDeclarator (',' variableDeclarator)*
    ;


variableDeclarator
    :   id ('=' expression)?
    ;

forControl
    :   variableDeclarators? ';' expression? ';' expressionList?
    ;

parenthesizedExpression
    :   LPAREN expression RPAREN
    ;

expression
    :   'function' id? '(' formalParameterList? ')'
            blockStatement                                      #functionDeclarationExpression
    |   'new' id '(' expressionList? ')'                #newExpression
    |   expression '.' id                              #propertyExpression
    |   expression '[' expression ']'                           #indexorExpression
    |   expression '(' expressionList? ')'                      #functionCallExpression
    |   primaryExpression                                       #primaryExpression2
    |   expression (INC | DEC)                                  #postUpdateExpression
    |   unaryExpression                                         #unaryExpression2
    |   expression ('*' | '/' | '%') expression                 #mulExpression
    |   expression ('+' | '-') expression                       #plusExpression
    |   expression ('<<' | '>>' | '>>>') expression             #bitwiseShiftExpression
    |   expression ('<' | '<=' | '>' | '>=' |
                    'in' | 'instanceof') expression             #relationalExpression
    |   expression ('==' | '!=' | '===' | '!==') expression     #logicEqualityExpression
    |   expression ('&' | '^' | '|') expression                 #bitwiseLogicExpression
    |   expression '&&' expression                              #logicAndExpression
    |   expression '||' expression                              #logicOrExpression
    |   expression '?' expression ':' expression                #conditionalExpression
    |   expression
            (   <assoc=right>'='
            |   <assoc=right>'+='
            |   <assoc=right>'-='
            |   <assoc=right>'*='
            |   <assoc=right>'/='
            |   <assoc=right>'%='
            |   <assoc=right>'<<='
            |   <assoc=right>'>>='
            |   <assoc=right>'>>>='
            |   <assoc=right>'&='
            |   <assoc=right>'^='
            |   <assoc=right>'|='
            ) expression                                        #assignmentExpression
    ;

unaryExpression
    :   (INC | DEC | '!' | '~' | '+' | '-' | 'typeof' | 'void' | 'delete') expression
    ;

expressionList
    :   expression (',' expression)*
    ;

primaryExpression
    :   'this'
    |   id
    |   literal
    |   arrayLiteral
    |   parenthesizedExpression
    ;

arrayLiteral
    :   '[' expressionList? ']'
    ;

literal
    :   NUMBER
    |   BOOLEAN_LITERAL
    |   NULL_LITERAL
    |   UNDEFINED_LITERAL
    |   STRING_LITERAL
    ;
id
    : IDENTIFIER
    ;
BOOLEAN_LITERAL
    :   'true'
    |   'false'
    ;

STRING_LITERAL
    :   '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    |   '\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
    ;

UNDEFINED_LITERAL
    :   'undefined'
    ;

NULL_LITERAL
    :   'null'
    ;

// Keywords: reserved
BREAK:      'break';
CASE:       'case';
CATCH:      'catch';
CONTINUE:   'continue';
DEBUGGER:   'debugger';
DEFAULT:    'default';
DELETE:     'delete';
DO:         'do';
FINALLY:    'finally';
FOR:        'for';
FUNCTION:   'function';
IF:         'if';
IN:         'in';
INSTANCEOF: 'instanceof';
NEW:        'new';
RETURN:     'return';
SWITCH:     'switch';
THIS:       'this';
THROW:      'throw';
TRY:        'try';
TYPEOF:     'typeof';
VAR:        'var';
VOID:       'void';
WHILE:      'while';
WITH:       'with';

// Keywords: reserved for future use
CLASS:      'class';
ENUM:       'enum';
EXPORT:     'export';
EXTENDS:    'extends';
IMPORT:     'import';
SUPER:      'super';


IDENTIFIER
    :   [a-zA-Z$_] [a-zA-Z0-9$_]*
    ;

NUMBER
    :   SIGN? INT+ ('.' INT+)? EXPONENT?
    ;

// Separators
LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
QUESTION        : '?';
COLON           : ':';

// Operators
PLUS:       '+';
MINUS:      '-';
MUL:        '*';
DIV:        '/';
MOD:        '%';
ASSIGN:     '=';
AND:        '&&';
OR:         '||';
GT:         '>';
LT:         '<';
GE:         '>=';
LE:         '<=';
EQ:         '==';
NEQ:        '!=';
NOT:        '!';
INC:        '++';
DEC:        '--';
EXACT_EQ:   '===';
EXACT_NEQ:  '!==';
BITWISE_NOT: '~';


fragment
SIGN
    :   [+-]
    ;

fragment
INT
    :   [0-9]+
    ;

fragment
EXPONENT
    : ('e'|'E') ('+'|'-')? [0-9]+
    ;

fragment
ESC_SEQ
    : '\\' ('\\'|'/'|'b'|'f'|'n'|'r'|'t')
    | UNICODE_ESC
    ;

fragment
UNICODE_ESC
    : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

fragment
HEX_DIGIT
    : [0-9a-fA-F]
    ;

//
// Whitespace and comments
//

WS
    :   [ \t\r\n]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;