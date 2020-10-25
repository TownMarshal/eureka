package cn.tx.homework;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/12/2 0002.
 * 21. 计算圆的面积，通过自定义异常来设计，半径不能为零或者负数，采用异常机制除处理
 */
public class Demo3 {
    public static double getArea(double r){
        double area = 0;
        if(r<=0){
            throw new ValidDataException("半径不可以是零或者负数");
        }
        area = Math.PI*r*r;
        return area;
    }
    public static void inputR(){
        //定义扫描器
        Scanner s = new Scanner(System.in);
        //获得输入的值
        int r = s.nextInt();
        //定义面积变量
        double area = 0;
        try {
            //计算结果
            area = getArea(r);
            //输出结果
            System.out.println("圆的面积是"+area);
        } catch (Exception e) {
            //发生异常
            if(e instanceof ValidDataException){
                //提示错误信息
                System.out.println("传递的参数错误,请重新输入");
                //递归的方式来调用
                inputR();
                /*r = s.nextInt();
                area = getArea(r);
                System.out.println("圆的面积是"+area);*/
            }
        }
    }
    public static void main(String[] args) {
        inputR();
    }
}
