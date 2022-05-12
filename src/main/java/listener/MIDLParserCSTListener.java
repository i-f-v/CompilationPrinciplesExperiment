
package listener;

import gen.MIDLParser;
import gen.MIDLParserBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;



public class MIDLParserCSTListener extends MIDLParserBaseListener {
    @Override
    public void enterSpecification(MIDLParser.SpecificationContext ctx) {
        super.enterSpecification(ctx);
    }

    @Override
    public void exitSpecification(MIDLParser.SpecificationContext ctx) {
        super.exitSpecification(ctx);
    }

    @Override
    public void enterDefinition(MIDLParser.DefinitionContext ctx) {
        super.enterDefinition(ctx);
    }

    @Override
    public void exitDefinition(MIDLParser.DefinitionContext ctx) {
        super.exitDefinition(ctx);
    }

    @Override
    public void enterModule(MIDLParser.ModuleContext ctx) {
        super.enterModule(ctx);
    }

    @Override
    public void exitModule(MIDLParser.ModuleContext ctx) {
        super.exitModule(ctx);
    }


    @Override
    public void enterType_decl(MIDLParser.Type_declContext ctx) {
        super.enterType_decl(ctx);
    }

    @Override
    public void exitType_decl(MIDLParser.Type_declContext ctx) {
        super.exitType_decl(ctx);
    }

    @Override
    public void enterStruct_type(MIDLParser.Struct_typeContext ctx) {
        super.enterStruct_type(ctx);
    }

    @Override
    public void exitStruct_type(MIDLParser.Struct_typeContext ctx) {
        super.exitStruct_type(ctx);
    }

    @Override
    public void enterMember_list(MIDLParser.Member_listContext ctx) {
        super.enterMember_list(ctx);
    }

    @Override
    public void exitMember_list(MIDLParser.Member_listContext ctx) {
        super.exitMember_list(ctx);
    }

    @Override
    public void enterDeclarators(MIDLParser.DeclaratorsContext ctx) {
        super.enterDeclarators(ctx);
    }

    @Override
    public void exitDeclarators(MIDLParser.DeclaratorsContext ctx) {
        super.exitDeclarators(ctx);
    }

    @Override
    public void enterDeclarator(MIDLParser.DeclaratorContext ctx) {
        super.enterDeclarator(ctx);
    }

    @Override
    public void exitDeclarator(MIDLParser.DeclaratorContext ctx) {
        super.exitDeclarator(ctx);
    }

    @Override
    public void enterArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        super.enterArray_declarator(ctx);
    }

    @Override
    public void exitArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        super.exitArray_declarator(ctx);
    }

    @Override
    public void enterOr_expr(MIDLParser.Or_exprContext ctx) {
        super.enterOr_expr(ctx);
    }

    @Override
    public void exitOr_expr(MIDLParser.Or_exprContext ctx) {
        super.exitOr_expr(ctx);
    }

    @Override
    public void enterXor_expr(MIDLParser.Xor_exprContext ctx) {
        super.enterXor_expr(ctx);
    }

    @Override
    public void exitXor_expr(MIDLParser.Xor_exprContext ctx) {
        super.exitXor_expr(ctx);
    }

    @Override
    public void enterAnd_expr(MIDLParser.And_exprContext ctx) {
        super.enterAnd_expr(ctx);
    }

    @Override
    public void exitAnd_expr(MIDLParser.And_exprContext ctx) {
        super.exitAnd_expr(ctx);
    }

    @Override
    public void enterShift_expr(MIDLParser.Shift_exprContext ctx) {
        super.enterShift_expr(ctx);
    }

    @Override
    public void exitShift_expr(MIDLParser.Shift_exprContext ctx) {
        super.exitShift_expr(ctx);
    }

    @Override
    public void enterAdd_expr(MIDLParser.Add_exprContext ctx) {
        super.enterAdd_expr(ctx);
    }

    @Override
    public void exitAdd_expr(MIDLParser.Add_exprContext ctx) {
        super.exitAdd_expr(ctx);
    }

    @Override
    public void enterMulti_expr(MIDLParser.Multi_exprContext ctx) {
        super.enterMulti_expr(ctx);
    }

    @Override
    public void exitMulti_expr(MIDLParser.Multi_exprContext ctx) {
        super.exitMulti_expr(ctx);
    }

    @Override
    public void enterUnary_expr(MIDLParser.Unary_exprContext ctx) {
        super.enterUnary_expr(ctx);
    }

    @Override
    public void exitUnary_expr(MIDLParser.Unary_exprContext ctx) {
        super.exitUnary_expr(ctx);
    }

    @Override
    public void enterLiteral(MIDLParser.LiteralContext ctx) {
        super.enterLiteral(ctx);
    }

    @Override
    public void exitLiteral(MIDLParser.LiteralContext ctx) {
        super.exitLiteral(ctx);
    }

    @Override
    public void enterExp_list(MIDLParser.Exp_listContext ctx) {
        super.enterExp_list(ctx);
    }

    @Override
    public void exitExp_list(MIDLParser.Exp_listContext ctx) {
        super.exitExp_list(ctx);
    }

    @Override
    public void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        super.enterSimple_declarator(ctx);
    }

    @Override
    public void exitSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        super.exitSimple_declarator(ctx);
    }

    @Override
    public void enterType_spec(MIDLParser.Type_specContext ctx) {
        super.enterType_spec(ctx);
    }

    @Override
    public void exitType_spec(MIDLParser.Type_specContext ctx) {
        super.exitType_spec(ctx);
    }

    @Override
    public void enterBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        super.enterBase_type_spec(ctx);
    }

    @Override
    public void exitBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        super.exitBase_type_spec(ctx);
    }

    @Override
    public void enterInteger_type(MIDLParser.Integer_typeContext ctx) {
        super.enterInteger_type(ctx);
    }

    @Override
    public void exitInteger_type(MIDLParser.Integer_typeContext ctx) {
        super.exitInteger_type(ctx);
    }

    @Override
    public void enterUint16(MIDLParser.Uint16Context ctx) {
        super.enterUint16(ctx);
    }

    @Override
    public void exitUint16(MIDLParser.Uint16Context ctx) {
        super.exitUint16(ctx);
    }

    @Override
    public void enterUint32(MIDLParser.Uint32Context ctx) {
        super.enterUint32(ctx);
    }

    @Override
    public void exitUint32(MIDLParser.Uint32Context ctx) {
        super.exitUint32(ctx);
    }

    @Override
    public void enterUint64(MIDLParser.Uint64Context ctx) {
        super.enterUint64(ctx);
    }

    @Override
    public void exitUint64(MIDLParser.Uint64Context ctx) {
        super.exitUint64(ctx);
    }

    @Override
    public void enterUint8(MIDLParser.Uint8Context ctx) {
        super.enterUint8(ctx);
    }

    @Override
    public void exitUint8(MIDLParser.Uint8Context ctx) {
        super.exitUint8(ctx);
    }

    @Override
    public void enterInt16(MIDLParser.Int16Context ctx) {
        super.enterInt16(ctx);
    }

    @Override
    public void exitInt16(MIDLParser.Int16Context ctx) {
        super.exitInt16(ctx);
    }

    @Override
    public void enterInt32(MIDLParser.Int32Context ctx) {
        super.enterInt32(ctx);
    }

    @Override
    public void exitInt32(MIDLParser.Int32Context ctx) {
        super.exitInt32(ctx);
    }

    @Override
    public void enterInt64(MIDLParser.Int64Context ctx) {
        super.enterInt64(ctx);
    }

    @Override
    public void exitInt64(MIDLParser.Int64Context ctx) {
        super.exitInt64(ctx);
    }

    @Override
    public void enterInt8(MIDLParser.Int8Context ctx) {
        super.enterInt8(ctx);
    }

    @Override
    public void exitInt8(MIDLParser.Int8Context ctx) {
        super.exitInt8(ctx);
    }

    @Override
    public void enterFloat(MIDLParser.FloatContext ctx) {
        super.enterFloat(ctx);
    }

    @Override
    public void exitFloat(MIDLParser.FloatContext ctx) {
        super.exitFloat(ctx);
    }

    @Override
    public void enterDouble(MIDLParser.DoubleContext ctx) {
        super.enterDouble(ctx);
    }

    @Override
    public void exitDouble(MIDLParser.DoubleContext ctx) {
        super.exitDouble(ctx);
    }

    @Override
    public void enterLongDouble(MIDLParser.LongDoubleContext ctx) {
        super.enterLongDouble(ctx);
    }

    @Override
    public void exitLongDouble(MIDLParser.LongDoubleContext ctx) {
        super.exitLongDouble(ctx);
    }

    @Override
    public void enterScoped_name(MIDLParser.Scoped_nameContext ctx) {
        super.enterScoped_name(ctx);
    }

    @Override
    public void exitScoped_name(MIDLParser.Scoped_nameContext ctx) {
        super.exitScoped_name(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
