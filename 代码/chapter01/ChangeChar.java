package chapter01;

/**
 * Author: fang
 * Date:   2022-01-09 10:45 ������
 * Class:  ChangeChar
 **/
//��ʾת���ַ���ʹ��
public class ChangeChar {

    //��дһ��main����
    public static void main(String[] args) {

        //\t  ��һ���Ʊ�λ��ʵ�ֶ���Ĺ���
        System.out.println("����\t���\t�Ϻ�");
        // \n  �����з�
        System.out.println("jack\nsmith\nmary");
        // \\  ��һ��\  \\
        System.out.println("C:\\Windows\\System32\\cmd.exe");
        System.out.println("C:\\\\Windows\\\\System32\\\\cmd.exe");
        // \"  :һ��"
        System.out.println("����˵:\"������ˮ\"");
        // \'  ��һ��'
        System.out.println("����˵:\'������ˮ\'");

        // \r  :һ���س�  System.out.println("����\r��ˮ");
        // ���
        // 1. ���  ����
        // 2. \r��ʾ�س�
        System.out.println("����\r��ˮ"); //��ˮ
    }

}
