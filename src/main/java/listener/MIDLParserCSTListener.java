
package listener;

import astnodes.ASTNode;
import gen.MIDLParser;
import gen.MIDLParserBaseListener;

import java.util.Stack;

public class MIDLParserCSTListener extends MIDLParserBaseListener {

    Stack<ASTNode> stack = new Stack<>();

    ASTNode root;

    ASTNode currentNode;

    @Override
    public void enterSpecification(MIDLParser.SpecificationContext ctx) {
        //���˽ڵ㣬�޲ι��죬ֻѹջ
        root = new ASTNode();
        stack.push(root);
    }

    @Override
    public void exitSpecification(MIDLParser.SpecificationContext ctx) {

        stack.pop();
    }

    @Override
    public void enterDefinition(MIDLParser.DefinitionContext ctx) {
        //��Ч�ڵ��޲���
        super.enterDefinition(ctx);
    }

    @Override
    public void exitDefinition(MIDLParser.DefinitionContext ctx) {
        //��Ч�ڵ��޲���
        super.exitDefinition(ctx);
    }

    @Override
    public void enterModule(MIDLParser.ModuleContext ctx) {
        //�����ڵ㣬module���µ�
        ASTNode moduleNode = new ASTNode(ctx.K_MODULE().getText());
        moduleNode.addChild(new ASTNode(ctx.ID().getText()));
        stack.push(moduleNode);
    }

    @Override
    public void exitModule(MIDLParser.ModuleContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterType_decl(MIDLParser.Type_declContext ctx) {
        if (ctx.getChildCount() == 2) { //ʹ�ù���2��������ջ����
            ASTNode structNode = new ASTNode(ctx.K_STRUCT().getText());
            structNode.addChild(new ASTNode(ctx.ID().getText()));
            stack.push(structNode);
        }
        //else super.enterType_decl(ctx);
    }

    @Override
    public void exitType_decl(MIDLParser.Type_declContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterStruct_type(MIDLParser.Struct_typeContext ctx) {

        ASTNode structNode = new ASTNode(ctx.K_STRUCT().getText());
        structNode.addChild(new ASTNode(ctx.ID().getText()));
        stack.push(structNode);
    }

    @Override
    public void exitStruct_type(MIDLParser.Struct_typeContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterMember_list(MIDLParser.Member_listContext ctx) {
        stack.push(new ASTNode());
    }

    @Override
    public void exitMember_list(MIDLParser.Member_listContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterDeclarators(MIDLParser.DeclaratorsContext ctx) {
        super.enterDeclarators(ctx);
    }

    @Override
    public void exitDeclarators(MIDLParser.DeclaratorsContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterDeclarator(MIDLParser.DeclaratorContext ctx) {
        super.enterDeclarator(ctx);
    }

    @Override
    public void exitDeclarator(MIDLParser.DeclaratorContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        super.enterArray_declarator(ctx);
    }

    @Override
    public void exitArray_declarator(MIDLParser.Array_declaratorContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);//todo
    }

    @Override
    public void enterOr_expr(MIDLParser.Or_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.OR().toString()));
        }
        //else super.enterOr_expr(ctx);
    }

    @Override
    public void exitOr_expr(MIDLParser.Or_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterXor_expr(MIDLParser.Xor_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.POWER().toString()));
        }
        //else super.enterXor_expr(ctx);

    }

    @Override
    public void exitXor_expr(MIDLParser.Xor_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterAnd_expr(MIDLParser.And_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.AMP().toString()));
        }
        //else super.enterAnd_expr(ctx);
    }

    @Override
    public void exitAnd_expr(MIDLParser.And_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterShift_expr(MIDLParser.Shift_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.getChild(1).toString()));
            // 1 Ϊ'<<'��'>>'���±�
        }
        //else super.enterShift_expr(ctx);
    }

    @Override
    public void exitShift_expr(MIDLParser.Shift_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterAdd_expr(MIDLParser.Add_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.getChild(1).toString()));
            // 1 Ϊ'+'��'-'���±�
        }
        //else super.enterAdd_expr(ctx);
    }

    @Override
    public void exitAdd_expr(MIDLParser.Add_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterMulti_expr(MIDLParser.Multi_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.getChild(1).toString()));
            // 1 Ϊ'*'��'/'���±�
        }
        //else super.enterMulti_expr(ctx);
    }

    @Override
    public void exitMulti_expr(MIDLParser.Multi_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterUnary_expr(MIDLParser.Unary_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // �ӽڵ㲻ֹһ��
            stack.push(new ASTNode(ctx.getChild(0).toString()));
            // 0 Ϊ'-'��'+'��'~'���±�
        }
        //else super.enterShift_expr(ctx);
    }

    @Override
    public void exitUnary_expr(MIDLParser.Unary_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
    }

    @Override
    public void enterLiteral(MIDLParser.LiteralContext ctx) {
        stack.push(new ASTNode(ctx.getText()));
    }

    @Override
    public void exitLiteral(MIDLParser.LiteralContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterExp_list(MIDLParser.Exp_listContext ctx) {
        super.enterExp_list(ctx);
    }

    @Override
    public void exitExp_list(MIDLParser.Exp_listContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        super.enterSimple_declarator(ctx);
    }

    @Override
    public void exitSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterType_spec(MIDLParser.Type_specContext ctx) {
        super.enterType_spec(ctx);
    }

    @Override
    public void exitType_spec(MIDLParser.Type_specContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        super.enterBase_type_spec(ctx);
    }

    @Override
    public void exitBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterInteger_type(MIDLParser.Integer_typeContext ctx) {
        super.enterInteger_type(ctx);
    }

    @Override
    public void exitInteger_type(MIDLParser.Integer_typeContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        super.enterUnsigned_int(ctx);
    }

    @Override
    public void exitUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterSigned_int(MIDLParser.Signed_intContext ctx) {
        super.enterSigned_int(ctx);
    }

    @Override
    public void exitSigned_int(MIDLParser.Signed_intContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterFloat_pt_type(MIDLParser.Float_pt_typeContext ctx) {
        super.enterFloat_pt_type(ctx);
    }

    @Override
    public void exitFloat_pt_type(MIDLParser.Float_pt_typeContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterScoped_name(MIDLParser.Scoped_nameContext ctx) {
        super.enterScoped_name(ctx);
    }

    @Override
    public void exitScoped_name(MIDLParser.Scoped_nameContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }


}
