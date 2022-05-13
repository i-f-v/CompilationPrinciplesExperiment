parser grammar MIDLParser;

options {
    tokenVocab = MIDLLexer;
}
specification: definition+;

definition
    : type_decl SEMI_COLON
    | module SEMI_COLON
    ;

module: K_MODULE ID LEFT_BRACE definition+ RIGHT_BRACE;

type_decl
    : struct_type
    | (K_STRUCT ID)
    ;

struct_type: K_STRUCT ID LEFT_BRACE member_list RIGHT_BRACE;

member_list: member*;

member: type_spec declarators SEMI_COLON;

declarators: declarator (COMMAS declarator)*;

declarator
    : simple_declarator
    | array_declarator
    ;

array_declarator: ID LEFT_SQUARE_BRACKET or_expr RIGHT_SQUARE_BRACKET (EQUAL exp_list)?;

or_expr
    : xor_expr (OR xor_expr)?
    | or_expr (OR xor_expr)
    ;

xor_expr
    : and_expr (POWER and_expr)?
    | xor_expr (POWER and_expr)
    ;

and_expr
    : shift_expr (AMP shift_expr)?
    | and_expr (AMP shift_expr)
    ;

shift_expr
    : add_expr ((GT2 | LT2) add_expr)?
    | shift_expr ((GT2 | LT2) add_expr)
    ;

add_expr
    : multi_expr ((PLUS | MINUS) multi_expr)?
    | add_expr ((PLUS | MINUS) multi_expr)
    ;

multi_expr
    : unary_expr ((STAR | SLASH | PERCENT) unary_expr)?
    | multi_expr (STAR | SLASH | PERCENT) unary_expr
    ;

unary_expr: op = (MINUS | PLUS | WAVE)? literal;

literal
    : INTEGER
    | FLOATING_PT
    | CHAR
    | STRING
    | BOOLEAN
    ;

exp_list: LEFT_SQUARE_BRACKET or_expr (COMMAS or_expr)* RIGHT_SQUARE_BRACKET;

simple_declarator: ID (EQUAL or_expr)?;

type_spec
    : scoped_name
    | base_type_spec
    | struct_type
    ;

base_type_spec
    : float_pt_type
    | integer_type
    | K_CHAR
    | K_STRING
    | K_BOOLEAN
    ;

integer_type
    : signed_int
    | unsigned_int
    ;

unsigned_int
    : (K_UNSIGNED K_SHORT | K_UINT16)
    | (K_UNSIGNED K_LONG | K_UINT32)
    | (K_UNSIGNED K_LONG K_LONG | K_UINT64)
    | K_UINT8
    ;

signed_int
    : (K_SHORT | K_INT16)
    | (K_LONG | K_INT32)
    | (K_LONG K_LONG | K_INT64)
    | K_INT8
    ;
    
float_pt_type
    : K_FLOAT
    | K_DOUBLE
    | (K_LONG K_DOUBLE)
    ;

scoped_name: (COLON_2)? ID ((COLON_2) ID)* ;

