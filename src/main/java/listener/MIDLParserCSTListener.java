package listener;

import astnode.ASTNode;
import gen.MIDLParser;
import gen.MIDLParserBaseListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Stack;

/**
 * 监听类，所有的遍历逻辑在每个exit和enter方法中完成。
 */
public class MIDLParserCSTListener extends MIDLParserBaseListener {

    //用于保存最终遍历结果的树
    static ASTNode root;
    Stack<ASTNode> stack;
    ASTNode currentNode;

    public MIDLParserCSTListener() {
        stack = new Stack<>();
    }

    @Override
    public void enterSpecification(MIDLParser.SpecificationContext ctx) {
        //顶端节点，无参构造，只压栈
        root = new ASTNode();
        stack.push(root);
    }

    @Override
    public void exitSpecification(MIDLParser.SpecificationContext ctx) {

        stack.pop();
    }

    @Override
    public void enterDefinition(MIDLParser.DefinitionContext ctx) {
        //无效节点无操作
        super.enterDefinition(ctx);
    }

    @Override
    public void exitDefinition(MIDLParser.DefinitionContext ctx) {
        //无效节点无操作
        super.exitDefinition(ctx);
    }

    @Override
    public void enterModule(MIDLParser.ModuleContext ctx) {
        //声明节点，module以下的
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
        if (ctx.getChildCount() == 2) { //使用规则2，进行入栈操作
            ASTNode structNode = new ASTNode(ctx.K_STRUCT().getText());
            structNode.addChild(new ASTNode(ctx.ID().getText()));
            stack.push(structNode);
        }
//        else super.enterType_decl(ctx);
    }

    @Override
    public void exitType_decl(MIDLParser.Type_declContext ctx) {
        if (ctx.getChildCount() == 2) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitType_decl(ctx);
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
        super.enterMember_list(ctx);
    }

    @Override
    public void exitMember_list(MIDLParser.Member_listContext ctx) {
        super.exitMember_list(ctx);
    }

    @Override
    public void enterMember(MIDLParser.MemberContext ctx) {
        super.enterMember(ctx);
    }

    @Override
    public void exitMember(MIDLParser.MemberContext ctx) {
        super.exitMember(ctx);
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

        ASTNode arrayDeclaratorNode = new ASTNode(ctx.ID().getText());


        stack.push(arrayDeclaratorNode);

    }

    @Override
    public void exitArray_declarator(MIDLParser.Array_declaratorContext ctx) {

        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterOr_expr(MIDLParser.Or_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.OR().toString()));
        }
//        else super.enterOr_expr(ctx);
    }

    @Override
    public void exitOr_expr(MIDLParser.Or_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitOr_expr(ctx);
    }

    @Override
    public void enterXor_expr(MIDLParser.Xor_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.POWER().toString()));
        }
//        else super.enterXor_expr(ctx);

    }

    @Override
    public void exitXor_expr(MIDLParser.Xor_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitXor_expr(ctx);
    }

    @Override
    public void enterAnd_expr(MIDLParser.And_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.AMP().toString()));
        }
//        else super.enterAnd_expr(ctx);
    }

    @Override
    public void exitAnd_expr(MIDLParser.And_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitAnd_expr(ctx);
    }

    @Override
    public void enterShift_expr(MIDLParser.Shift_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.getChild(1).toString()));
            // 1 为'<<'或'>>'的下标
        }
//        else super.enterShift_expr(ctx);
    }

    @Override
    public void exitShift_expr(MIDLParser.Shift_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitShift_expr(ctx);
    }

    @Override
    public void enterAdd_expr(MIDLParser.Add_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.getChild(1).toString()));
            // 1 为'+'或'-'的下标
        }
//        else super.enterAdd_expr(ctx);
    }

    @Override
    public void exitAdd_expr(MIDLParser.Add_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitAdd_expr(ctx);
    }

    @Override
    public void enterMulti_expr(MIDLParser.Multi_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.getChild(1).toString()));
            // 1 为'*'或'/'的下标
        }
//        else super.enterMulti_expr(ctx);
    }

    @Override
    public void exitMulti_expr(MIDLParser.Multi_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitMulti_expr(ctx);
    }

    @Override
    public void enterUnary_expr(MIDLParser.Unary_exprContext ctx) {
        if (ctx.getChildCount() > 1) { // 子节点不止一个
            stack.push(new ASTNode(ctx.getChild(0).toString()));
            // 0 为'-'或'+'或'~'的下标
        }
//        else super.enterUnary_expr(ctx);
    }

    @Override
    public void exitUnary_expr(MIDLParser.Unary_exprContext ctx) {
        if (ctx.getChildCount() > 1) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitUnary_expr(ctx);
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
        super.exitExp_list(ctx);
    }

    @Override
    public void enterSimple_declarator(MIDLParser.Simple_declaratorContext ctx) {
        ASTNode simpleDeclarator = new ASTNode(ctx.ID().getText());
        if (ctx.getChildCount() == 1) {
            //子节点只包含ID
            stack.push(simpleDeclarator);
        } else {
            simpleDeclarator.addChild(
                    new ASTNode(ctx.EQUAL().getText()));
            stack.push(simpleDeclarator);
        }
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
        super.exitType_spec(ctx);
    }

    @Override
    public void enterBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        if (ctx.getChild(0).getChildCount() == 0) {//子节点为终结符
            stack.push(new ASTNode(ctx.children.toString(), ctx.type.getText()));
        }
//        else super.enterBase_type_spec(ctx);
    }

    @Override
    public void exitBase_type_spec(MIDLParser.Base_type_specContext ctx) {
        if (ctx.getChild(0).getChildCount() == 0) {
            currentNode = stack.pop();
            stack.peek().addChild(currentNode);
        }
//        else super.exitBase_type_spec(ctx);
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
    public void enterUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        stack.push(new ASTNode(ctx.children.toString(), "uint"));
    }

    @Override
    public void exitUnsigned_int(MIDLParser.Unsigned_intContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterSigned_int(MIDLParser.Signed_intContext ctx) {
        stack.push(new ASTNode(ctx.children.toString(), "int"));
    }

    @Override
    public void exitSigned_int(MIDLParser.Signed_intContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterFloat_pt_type(MIDLParser.Float_pt_typeContext ctx) {
        stack.push(new ASTNode(ctx.children.toString(), "float"));
    }

    @Override
    public void exitFloat_pt_type(MIDLParser.Float_pt_typeContext ctx) {
        currentNode = stack.pop();
        stack.peek().addChild(currentNode);
    }

    @Override
    public void enterScoped_name(MIDLParser.Scoped_nameContext ctx) {
        //将每一个终结符挂载到当前栈顶
        StringBuilder val = new StringBuilder();
        val.append("[[");
        for (ParseTree child :
                ctx.children) {
            if (val.toString().equals("[[") && child.toString().equals("::")) {
                continue;
            }
            val.append(child.toString());
        }
        val.append("]]");
        stack.peek().addChild(new ASTNode(val.toString()));

    }

    @Override
    public void exitScoped_name(MIDLParser.Scoped_nameContext ctx) {
        super.exitScoped_name(ctx);
    }

    /**
     * 返回解析生成树的根节点
     *
     * @return 生成树的根节点
     */
    public ASTNode getRoot() {
        return root;
    }
}
