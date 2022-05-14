
package astnode;

/**
 * �ڵ�����ö��
 */
public enum NodeType {

    /**
     * list�ڵ㣬����ʱ���ص����ڵ�
     */
    LIST_NODE,
    //member_list
    //declarators
    //exp_list

    /**
     * �����ڵ㣬����ʱ��һ���ӽڵ㸳�����ڵ㣬ɾ����һ���ӽڵ�
     */
    DECLARATOR_NODE,
    //module
    //struct_type
    //array_declarator
    //simple_declarator
    // unary


    /**
     * ѡ��ڵ㣬����ʱ�Ƴ�
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
     * ����ڵ�
     */
    CALCULATE_NODE,
    //or
    //xor
    //and
    //shift
    //add
    //multi


    /**
     * �ս��������ʱֻ����ֵ
     */
    TERMINAL_NODE
    //literal


    // scoped_name ��������
}
