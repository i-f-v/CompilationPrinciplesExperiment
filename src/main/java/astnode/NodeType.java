
package astnode;

/**
 * 节点类型枚举
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


    // scoped_name 另外讨论
}
