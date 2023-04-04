package com;

/**
 * Created by Administrator on 2020/2/11 0011.
 */
public class Math1 {
    public static void main(String[] args) {
        //public static int abs​(int a)：返回参数的绝对值
        System.out.println(Math.ceil(2.54));
        System.out.println(Math.ceil(2.34));
        System.out.println(Math.floor(2.11));
        System.out.println(Math.floor(2.77));
        System.out.println(Math.pow(2,4));



        //public static double ceil​(double a)：返回大于或等于参数的最小double值，等于一个整数

        //public static double floor​(double a)：返回小于或等于参数的最大double值，等于一个整数


        //public static int round​(float a)：按照四舍五入返回最接近参数的int


        //public static int max​(int a,int b)：返回两个int值中的较大值、较小值


        //public static double pow​(double a,double b)：返回a的b次幂的值


        //public static double random​()：返回值为double的正值，[0.0,1.0)取值
//
        System.out.println((int) (java.lang.Math.random() * 100) + 1);
        System.out.println(java.lang.Math.round(java.lang.Math.random()));
    }
}
