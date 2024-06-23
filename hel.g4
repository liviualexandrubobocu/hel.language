grammar HEL;

// Lexer Rules
WS: [ \t\r\n]+ -> skip; // Whitespace
WORD: [a-zA-Z]+; // Words
NUMBER: [0-9]+; // Numbers
TIME: NUMBER ':' NUMBER; // Time format
STRING: '"' ('\\' . | ~['\\])* '"'; // String literals

// Keywords
IF: 'If';
ELSE: 'Else';
EVERY: 'Every';
AT: 'at';
AM: 'AM';
PM: 'PM';
REMIND: 'remind';
FETCH: 'Fetch';
SCHEDULE: 'Schedule';
BOOK: 'Book';
SEND: 'Send';
USE: 'Use';
REMEMBER: 'Remember';
FAIL: 'fails';
NOTIFY: 'notify';
FOR: 'for';
OF: 'of';
AND: 'and';
TO: 'to';

// Parser Rules
command: simpleCommand | conditionalCommand | loopCommand | rememberCommand | errorHandlingCommand | interactiveCommand;

simpleCommand
    : FETCH WORD (WORD | STRING)* '.'
    | SCHEDULE WORD (WORD | STRING)* (AT TIME (AM | PM))? '.'
    | BOOK WORD (WORD | STRING)* (FOR TIME)? '.'
    | SEND WORD (WORD | STRING)* TO WORD '.'
    ;

conditionalCommand
    : IF condition ',' simpleCommand
    ;

loopCommand
    : EVERY TIME AM ',' simpleCommand
    ;

rememberCommand
    : REMEMBER WORD (WORD | STRING)* '.'
    ;

errorHandlingCommand
    : simpleCommand IF FAIL ',' NOTIFY WORD '.'
    ;

interactiveCommand
    : dialog
    ;

dialog
    : dialogStep+
    ;

dialogStep
    : WORD ':' (simpleCommand | STRING)
    ;

// Helper Rules
condition
    : WORD
    ;
