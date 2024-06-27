grammar GenericTypes;

// Extend the grammar to support generics
genericType
    : TYPE '<' TYPE '>'
    ;

listDeclaration
    : LIST VARIABLE ':' genericType '=' '[' (element (',' element)*)? ']'
    ;