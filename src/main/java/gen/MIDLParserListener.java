// Generated from C:/Users/IFV/Desktop/programming projects/Idea/CompilationPrinciplesExperiment/g4\MIDLParser.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MIDLParser}.
 */
public interface MIDLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(MIDLParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(MIDLParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(MIDLParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(MIDLParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(MIDLParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexStruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterComplexStruct(MIDLParser.ComplexStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexStruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitComplexStruct(MIDLParser.ComplexStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStruct(MIDLParser.EmptyStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStruct}
	 * labeled alternative in {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStruct(MIDLParser.EmptyStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void enterStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#struct_type}.
	 * @param ctx the parse tree
	 */
	void exitStruct_type(MIDLParser.Struct_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#member_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_list(MIDLParser.Member_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void enterDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarators}.
	 * @param ctx the parse tree
	 */
	void exitDeclarators(MIDLParser.DeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(MIDLParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void enterArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#array_declarator}.
	 * @param ctx the parse tree
	 */
	void exitArray_declarator(MIDLParser.Array_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(MIDLParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(MIDLParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(MIDLParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(MIDLParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(MIDLParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_expr(MIDLParser.Multi_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_expr(MIDLParser.Multi_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expr(MIDLParser.Unary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MIDLParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MIDLParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(MIDLParser.Exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#simple_declarator}.
	 * @param ctx the parse tree
	 */
	void exitSimple_declarator(MIDLParser.Simple_declaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(MIDLParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void enterBase_type_spec(MIDLParser.Base_type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#base_type_spec}.
	 * @param ctx the parse tree
	 */
	void exitBase_type_spec(MIDLParser.Base_type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(MIDLParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uint16}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUint16(MIDLParser.Uint16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint16}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUint16(MIDLParser.Uint16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint32}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUint32(MIDLParser.Uint32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint32}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUint32(MIDLParser.Uint32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint64}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUint64(MIDLParser.Uint64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint64}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUint64(MIDLParser.Uint64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code uint8}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUint8(MIDLParser.Uint8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code uint8}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUint8(MIDLParser.Uint8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int16}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterInt16(MIDLParser.Int16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int16}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitInt16(MIDLParser.Int16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int32}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterInt32(MIDLParser.Int32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int32}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitInt32(MIDLParser.Int32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int64}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterInt64(MIDLParser.Int64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int64}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitInt64(MIDLParser.Int64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code int8}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterInt8(MIDLParser.Int8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code int8}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitInt8(MIDLParser.Int8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat(MIDLParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat(MIDLParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double}
	 * labeled alternative in {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterDouble(MIDLParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double}
	 * labeled alternative in {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitDouble(MIDLParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longDouble}
	 * labeled alternative in {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterLongDouble(MIDLParser.LongDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longDouble}
	 * labeled alternative in {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitLongDouble(MIDLParser.LongDoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void enterScoped_name(MIDLParser.Scoped_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#scoped_name}.
	 * @param ctx the parse tree
	 */
	void exitScoped_name(MIDLParser.Scoped_nameContext ctx);
}