grammar hel;

@header {
package com.hel.language;
}

// Lexer Rules
WS      : [ \t\r\n]+ -> skip;
WORD    : [a-zA-Z]+;
NUMBER  : [0-9]+;
TIME    : NUMBER (':' NUMBER)?;
STRING  : '"' (~["\r\n])* '"';

// Keywords
IF          : 'If';
EVERY       : 'Every';
REMEMBER    : 'Remember';
USE         : 'Use';
FAILS       : 'If fails, notify';
NOTIFY      : 'notify';
AT          : 'at';
FOR         : 'for';
TO          : 'to';
ME          : 'me';
MORNING     : 'morning';
AM          : 'AM';
PM          : 'PM';
AND         : 'AND';
OR          : 'OR';
NOT         : 'NOT';
CREATE      : 'Create';
READ        : 'Read';
UPDATE      : 'Update';
DELETE      : 'Delete';
WITH        : 'with';
HAVING      : 'having';

// Parser Rules
program
    : statement+ EOF
    ;

statement
    : basicCommand
    | conditionalCommand
    | loopCommand
    | rememberCommand
    | errorHandlingCommand
    | interactiveCommand
    | complexTask
    | contextAwareCommand
    | modularTaskDefinition
    | modularTaskExecution
    | crudCommand
    ;

basicCommand
    : WORD+ '.'
    ;

conditionalCommand
    : IF conditionExpr ',' basicCommand
    ;

conditionExpr
    : condition (('AND' | 'OR') condition)*
    | 'NOT' condition
    ;

condition
    : WORD+
    ;

loopCommand
    : EVERY interval ',' basicCommand
    ;

interval
    : NUMBER? 'minutes' | NUMBER? 'hours' | TIME_SPEC
    ;

TIME_SPEC
    : NUMBER (':' NUMBER)? ('AM' | 'PM')?
    ;

rememberCommand
    : REMEMBER thatStatement '.'
    ;

errorHandlingCommand
    : basicCommand FAILS ',' (NOTIFY ME | customErrorHandling)
    ;

customErrorHandling
    : WORD+ (',' WORD+)*
    ;

interactiveCommand
    : dialog (dialogStep)+
    ;

complexTask
    : WORD+ ':' (subtask)+
    ;

subtask
    : '-' WORD+ '.'
    ;

contextAwareCommand
    : contextCommand
    ;

modularTaskDefinition
    : 'Define' WORD+ ':' (subtask)+
    ;

modularTaskExecution
    : 'Execute' WORD+ '.'
    ;

timeSpecification
    : MORNING TIME? AM
    | NUMBER AM
    | NUMBER PM
    ;

thatStatement
    : WORD+ STRING
    ;

dialog
    : 'User:' userCommand
    ;

dialogStep
    : 'Agent:' agentCommand
    | 'User:' userCommand
    ;

contextCommand
    : WORD+ '.'
    ;

userCommand
    : WORD+ '.'
    ;

agentCommand
    : WORD+ '?'
    ;

crudCommand
    : CREATE entity
    | READ entity
    | UPDATE entity
    | DELETE entity
    ;

entity
    : WORD+ (ATTRIBUTE STRING)*
    ;

ATTRIBUTE
    : WITH | HAVING
    ;
