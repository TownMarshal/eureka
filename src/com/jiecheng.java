package com;

import java.util.Scanner;

public class jiecheng {
    public static void main(String[] args) {
        //利用递归方式求n的阶乘
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您想计算的数的阶乘之和");
        int i = scanner.nextInt();
        System.out.println(f(i));
        //计算阶乘之和
        long sum = 0;
        for (int j = 1; j <= i; j++) {
            sum += f(j);
        }
        System.out.println(i+"的阶乘之和是：" + sum);


    }

    //  计算n的阶乘
    public static long f(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }
        long sum = 0;
        if (n > 1) {
            sum = n * f(n - 1);
        }
        return sum;

    }


}
