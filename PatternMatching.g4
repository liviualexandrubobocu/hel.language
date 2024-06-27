grammar PatternMatching;

patternMatching
    : MATCH expression '{' (patternCase)+ '}'
    ;

patternCase
    : CASE pattern '=>' statement
    ;

pattern
    : WORD | NUMBER | STRING
    ;