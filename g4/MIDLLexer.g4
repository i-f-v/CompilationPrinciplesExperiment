lexer grammar MIDLLexer;

//忽略大小写
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

//关键字
K_MODULE  : M O D U L E;
K_STRUCT  : S T R U C T;
K_BOOLEAN : B O O L E A N;
K_SHORT   : S H O R T;
K_LONG    : L O N G;
K_UNSIGNED: U N S I G N E D;
K_INT8    : I N T '8';
K_INT16   : I N T '1' '6';
K_INT32   : I N T '3' '2';
K_INT64   : I N T '6' '4';
K_UINT8   : U I N T '8';
K_UINT16  : U I N T '1' '6';
K_UINT32  : U I N T '3' '2';
K_UINT64  : U I N T '6' '4';
K_CHAR    : C H A R;
K_STRING  : S T R I N G;
K_FLOAT   : F L O A T;
K_DOUBLE  : D O U B L E;
K_TRUE    : T R U E;
K_FALSE   : F A L S E;


//专用符号
LEFT_BRACE : '{';
LEFT_SQUARE_BRACKET : '[';
RIGHT_BRACE : '}';
RIGHT_SQUARE_BRACKET : ']';
SEMI_COLON : ';';
COMMAS : ',';
PLUS : '+';
MINUS : '-';
SLASH : '/';
STAR : '*';
PERCENT : '%';
GT2 : '>' '>';
LT2 : '<' '<';
EQUAL : '=';
AMP : '&';
OR : '|';
WAVE : '~';
POWER : '^';
COLON : ':';
COLON_2 : ':' ':';

//转义符号
fragment SINGLE_QUOTE : '\'';
fragment BACK_SLASH : '\\';
fragment DOUBLE_QUOTE : '"';

FORMATER: [ \t\n\r]+ -> skip;


//标识符
LETTER
    : 'A'..'Z'
    | 'a'..'z' ;
DIGIT : '0'..'9';
UNDERLINE : '_';
INTEGER_TYPE_SUFFIX : L;
INTEGER : ('0' | ('1'..'9' DIGIT*)) INTEGER_TYPE_SUFFIX?;
EXPONENT : E ('+' | '-') (DIGIT)+;
FLOAT_TYPE_SUFFIX : F | D;
FLOATING_PT
    : DIGIT+ '.' DIGIT* EXPONENT? FLOAT_TYPE_SUFFIX?
    | '.' DIGIT+ EXPONENT? FLOAT_TYPE_SUFFIX?
    | DIGIT+ EXPONENT FLOAT_TYPE_SUFFIX?
    | DIGIT+ EXPONENT? FLOAT_TYPE_SUFFIX;
ESCAPE_SEQUENCE : BACK_SLASH ('b' | 't' | 'n' | 'f' | 'r' | DOUBLE_QUOTE | SINGLE_QUOTE | BACK_SLASH);
CHAR : SINGLE_QUOTE (ESCAPE_SEQUENCE | (~'\\' | ~'\'')) SINGLE_QUOTE;
STRING : DOUBLE_QUOTE (ESCAPE_SEQUENCE | (~'\\' | ~'\''))* DOUBLE_QUOTE;
BOOLEAN : (T R U E) | (F A L S E);
ID : LETTER (UNDERLINE? (LETTER | DIGIT))*;