grammar HEL;

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
    ;

basicCommand
    : WORD+ '.'
    ;

conditionalCommand
    : IF condition ',' basicCommand
    ;

loopCommand
    : EVERY timeSpecification ',' basicCommand
    ;

rememberCommand
    : REMEMBER thatStatement '.'
    ;

errorHandlingCommand
    : basicCommand FAILS ',' NOTIFY ME '.'
    ;

interactiveCommand
    : dialog (dialogStep)+
    ;

complexTask
    : WORD+ ':' (subtask)+
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

condition
    : WORD+
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

subtask
    : '-' WORD+ '.'
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
