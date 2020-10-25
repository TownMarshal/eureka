package com.rl;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo3 {
    public static void main(String[] args) {
        /**
         *打印菱形
         */

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();


        for (int i = 1; i <= num; i++) {
            //打印空格
            for (int j = 1; j <= num - i ; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int j = 1; j <= 2*i - 1; j++) {
                if(j == 1 || j == 2*i -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            //输出换行符
            System.out.println();

        }

        for (int i = num-1; i >= 1; i--) {
            //打印空格
            for (int j = 1; j <= num - i ; j++) {
                System.out.print(" ");
            }
            //打印*
            for (int j = 1; j <= 2*i - 1; j++) {
                if(j == 1 || j == 2*i -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //输出换行符
            System.out.println();
        }
    }

}

