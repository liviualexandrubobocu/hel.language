/**
 * This grammar defines the syntax and rules for the "hel" language.
 * The "hel" language is used for communication between humans and AI agents, as well as communication between AI agents themselves.
 * It provides features for basic commands, conditional commands, loop commands, error handling, interactive commands,
 * complex tasks, context-aware commands, modular task definition and execution, CRUD commands, function definition and calls,
 * list and dictionary declarations.
 *
 * Features:
 * 1. Basic Commands: Allows executing a sequence of words as a command.
 * 2. Conditional Commands: Allows executing a basic command based on a condition.
 * 3. Loop Commands: Allows executing a basic command repeatedly or based on a condition.
 * 4. Error Handling: Allows specifying actions to be taken if a command fails.
 * 5. Interactive Commands: Allows creating a dialog between a user and an agent.
 * 6. Complex Tasks: Allows defining and executing a sequence of subtasks.
 * 7. Context-Aware Commands: Allows executing a command based on the current context.
 * 8. Modular Task Definition and Execution: Allows defining and executing modular tasks.
 * 9. CRUD Commands: Allows creating, reading, updating, and deleting entities.
 * 10. Function Definition and Calls: Allows defining and calling functions.
 * 11. List and Dictionary Declarations: Allows declaring and initializing lists and dictionaries.
 */

grammar Hel;
import StaticTypes, GenericTypes, PatternMatching;

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
FUNCTION    : 'function';
LIST        : 'List';
DICT        : 'Dict';
LET         : 'let';
WHILE       : 'while';
IMMUTABLE  : 'const';

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
    | functionDefinition
    | listDeclaration
    | dictionaryDeclaration
    | variableAssignment
    ;

basicCommand
    : WORD+ '.' // Represents a basic command consisting of one or more words followed by a period.
    ;

conditionalCommand
    : IF conditionExpr ',' basicCommand // Represents a conditional command with an if condition and a basic command.
    ;

variableAssignment
    : (LET | IMMUTABLE) VARIABLE ':' TYPE '=' (WORD | NUMBER | STRING) '.'
    ;

conditionExpr
    : condition (('AND' | 'OR') condition)* // Represents a condition expression with logical operators AND and OR.
    | 'NOT' condition // Represents a negation of a condition.
    ;

condition
    : WORD+ // Represents a condition consisting of one or more words.
    ;

loopCommand
    : EVERY interval ',' basicCommand // Represents a loop command that executes a basic command at a specified interval.
    | FOR '(' variableAssignment ';' conditionExpr ';' variableAssignment ')' '{' (statement)+ '}' // Represents a loop command with a for loop structure.
    | WHILE '(' conditionExpr ')' '{' (statement)+ '}' // Represents a loop command with a while loop structure.
    ;

interval
    : NUMBER? 'minutes' | NUMBER? 'hours' | TIME_SPEC // Represents an interval of time.
    ;

TIME_SPEC
    : NUMBER (':' NUMBER)? ('AM' | 'PM')? // Represents a specific time.
    ;

rememberCommand
    : REMEMBER thatStatement '.' // Represents a command to remember a statement.
    ;

errorHandlingCommand
    : basicCommand FAILS ',' (NOTIFY ME | customErrorHandling) // Represents an error handling command with a basic command and optional custom error handling.
    ;

customErrorHandling
    : WORD+ (',' WORD+)* // Represents custom error handling actions.
    ;

interactiveCommand
    : dialog (dialogStep)+ // Represents an interactive command with a dialog between a user and an agent.
    ;

complexTask
    : WORD+ ':' (subtask)+ // Represents a complex task with a sequence of subtasks.
    ;

subtask
    : '-' WORD+ '.' // Represents a subtask within a complex task.
    ;

contextAwareCommand
    : contextCommand // Represents a context-aware command.
    ;

modularTaskDefinition
    : 'Define' WORD+ ':' (subtask)+ // Represents the definition of a modular task with a sequence of subtasks.
    ;

modularTaskExecution
    : 'Execute' WORD+ '.' // Represents the execution of a modular task.
    ;

timeSpecification
    : MORNING TIME? AM
    | NUMBER AM
    | NUMBER PM
    ;

thatStatement
    : WORD+ STRING // Represents a statement to be remembered.
    ;

dialog
    : 'User:' userCommand // Represents a dialog initiated by the user.
    ;

dialogStep
    : 'Agent:' agentCommand // Represents a dialog step initiated by the agent.
    | 'User:' userCommand // Represents a dialog step initiated by the user.
    ;

contextCommand
    : WORD+ '.' // Represents a context-aware command.
    ;

userCommand
    : WORD+ '.' // Represents a command initiated by the user.
    ;

agentCommand
    : WORD+ '?' // Represents a command initiated by the agent.
    ;

crudCommand
    : CREATE entity // Represents a CRUD command to create an entity.
    | READ entity // Represents a CRUD command to read an entity.
    | UPDATE entity // Represents a CRUD command to update an entity.
    | DELETE entity // Represents a CRUD command to delete an entity.
    ;

entity
    : WORD+ (ATTRIBUTE STRING)* // Represents an entity with optional attributes and values.
    ;

ATTRIBUTE
    : WITH | HAVING // Represents an attribute keyword.
    ;

functionDefinition
    : FUNCTION WORD '(' (parameter (',' parameter)*)? ')' ':' TYPE '{' (statement)+ '}'
    ;

functionCall
    : WORD '(' (argument (',' argument)*)? ')' // Represents a function call with arguments.
    ;

parameter
    : VARIABLE // Represents a parameter of a function.
    ;

argument
    : expression // Represents an argument of a function call.
    ;

VARIABLE
    : '$' WORD // Represents a variable.
    ;

expression
    : WORD // Represents a word expression.
    | NUMBER // Represents a number expression.
    | STRING // Represents a string expression.
    | functionCall // Represents a function call expression.
    ;

listDeclaration
    : LIST VARIABLE '=' '[' (element (',' element)*)? ']' // Represents the declaration and initialization of a list.
    ;

dictionaryDeclaration
    : DICT VARIABLE '=' '{' (keyValuePair (',' keyValuePair)*)? '}' // Represents the declaration and initialization of a dictionary.
    ;

element
    : expression // Represents an element in a list.
    ;

keyValuePair
    : STRING ':' expression // Represents a key-value pair in a dictionary.
    ;
