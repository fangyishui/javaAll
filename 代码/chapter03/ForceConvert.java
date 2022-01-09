package chapter03;

/**
 * Author: fang
 * Date:   2022-01-09 14:31 星期日
 * Class:  ForceConvert
 **/
public class ForceConvert {
    public static void main(String[] args) {
        //演示强制类型转换
        int n1 = (int)1.9;
        System.out.println("n1=" + n1);//1, 造成精度损失

        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1);//造成 数据溢出
    }
}
