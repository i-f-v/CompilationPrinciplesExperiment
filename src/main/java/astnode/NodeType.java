/**
 * Copyright (C), 2015-2022, XXX���޹�˾
 * FileName: NodeType
 * Author:   IFV
 * Date:     2022/5/13 19:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * ��������           �޸�ʱ��           �汾��              ����
 */
package astnode;

/**
 * �ڵ�����ö��
 *
 * @author IFV
 * @create 2022/5/13
 * @since 1.0.0
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


    //TODO scoped_name ��������
}
