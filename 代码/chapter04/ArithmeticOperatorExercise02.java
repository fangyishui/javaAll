package chapter04;

/**
 * Author: fang
 * Date:   2022-01-09 21:17 ������
 * Class:  ArithmeticOperatorExercise02
 **/
public class ArithmeticOperatorExercise02 {

    public static void main(String[] args) {

        //1.����:
        //���绹��59��ż٣��ʣ���xx��������xx��
        //2.˼·����
        //(1) ʹ��int ���� days ���� ����
        //(2) һ��������7�� ������weeks�� days / 7 ��xx��leftDays days % 7
        //(3) ���
        int days = 14;
        int week = (int)(days / 7) ;
        int last = days % 7 ;
        System.out.println(days +"�� �ϼ� "+ week +"���� �� " + last + " ��" );

        //1.����
        //����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ
        //��5/9*(�����¶�-100),����������¶ȶ�Ӧ�������¶�
        //
        //2˼·����
        //(1) �ȶ���һ��double huaShi �������� �����¶�
        //(2) ���ݸ����Ĺ�ʽ�����м��㼴��5/9*(�����¶�-100)
        //    ������ѧ��ʽ��java���Ե�����
        //(3) ���õ��Ľ�����浽double sheShi
        double huashi = 111.2;
        double sheshi = 5.0 / 9 * (huashi - 100);

        System.out.println( "�����¶� "+ huashi +" ��Ӧ�������¶�Ϊ ��" + sheshi);
    }
}
