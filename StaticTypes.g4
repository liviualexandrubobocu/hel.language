grammar StaticTypes;
// Keywords
TYPE: 'int' | 'string' | 'bool' | 'float'; // Extend with other types as needed

// Add types to variable assignments and function definitions
variableAssignment
    : LET VARIABLE ':' TYPE '=' (WORD | NUMBER | STRING) '.'
    ;

functionDefinition
    : FUNCTION WORD '(' (parameter (',' parameter)*)? ')' ':' TYPE '{' (statement)+ '}'
    ;

parameter
    : VARIABLE ':' TYPE
    ;