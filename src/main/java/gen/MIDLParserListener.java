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
	 * Enter a parse tree produced by {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void enterType_decl(MIDLParser.Type_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#type_decl}.
	 * @param ctx the parse tree
	 */
	void exitType_decl(MIDLParser.Type_declContext ctx);
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
	 * Enter a parse tree produced by {@link MIDLParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(MIDLParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(MIDLParser.MemberContext ctx);
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
	 * Enter a parse tree produced by the {@code UINT16}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUINT16(MIDLParser.UINT16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UINT16}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUINT16(MIDLParser.UINT16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UINT32}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUINT32(MIDLParser.UINT32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UINT32}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUINT32(MIDLParser.UINT32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UINT64}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUINT64(MIDLParser.UINT64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UINT64}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUINT64(MIDLParser.UINT64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code UINT8}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void enterUINT8(MIDLParser.UINT8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code UINT8}
	 * labeled alternative in {@link MIDLParser#unsigned_int}.
	 * @param ctx the parse tree
	 */
	void exitUINT8(MIDLParser.UINT8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code INT16}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterINT16(MIDLParser.INT16Context ctx);
	/**
	 * Exit a parse tree produced by the {@code INT16}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitINT16(MIDLParser.INT16Context ctx);
	/**
	 * Enter a parse tree produced by the {@code INT32}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterINT32(MIDLParser.INT32Context ctx);
	/**
	 * Exit a parse tree produced by the {@code INT32}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitINT32(MIDLParser.INT32Context ctx);
	/**
	 * Enter a parse tree produced by the {@code INT64}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterINT64(MIDLParser.INT64Context ctx);
	/**
	 * Exit a parse tree produced by the {@code INT64}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitINT64(MIDLParser.INT64Context ctx);
	/**
	 * Enter a parse tree produced by the {@code INT8}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void enterINT8(MIDLParser.INT8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code INT8}
	 * labeled alternative in {@link MIDLParser#signed_int}.
	 * @param ctx the parse tree
	 */
	void exitINT8(MIDLParser.INT8Context ctx);
	/**
	 * Enter a parse tree produced by {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void enterFloat_pt_type(MIDLParser.Float_pt_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MIDLParser#float_pt_type}.
	 * @param ctx the parse tree
	 */
	void exitFloat_pt_type(MIDLParser.Float_pt_typeContext ctx);
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