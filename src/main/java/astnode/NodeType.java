/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: NodeType
 * Author:   IFV
 * Date:     2022/5/13 19:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package astnode;

/**
 * 节点类型枚举
 *
 * @author IFV
 * @create 2022/5/13
 * @since 1.0.0
 */
public enum NodeType {

    /**
     * list节点，遍历时挂载到父节点
     */
    LIST_NODE,
    //member_list
    //declarators
    //exp_list

    /**
     * 声明节点，遍历时第一个子节点赋给父节点，删除第一个子节点
     */
    DECLARATOR_NODE,
    //module
    //struct_type
    //array_declarator
    //simple_declarator
    // unary


    /**
     * 选择节点，遍历时移除
     */
    OPTION_NODE,
    //definition
    //type_decl
    //declarator
    //type_spec
    //base_type_spec
    //integer_type
    //unsigned_int
    //signed_int
    //float_pt_type

    /**
     * 运算节点
     */
    CALCULATE_NODE,
    //or
    //xor
    //and
    //shift
    //add
    //multi


    /**
     * 终结符，遍历时只返回值
     */
    TERMINAL_NODE
    //literal


    //TODO scoped_name 另外讨论
}
