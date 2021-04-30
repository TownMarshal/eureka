package JingDianSuanFa;

import java.util.Scanner;

/**
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class Demo25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入5位数：");
        long num = in.nextInt();
        if (num < 0 || num > 99999){
            System.out.println("输入的数字要5位数");
            System.exit(0);
        }
        long wan = num / 10000;
        long qian = num % 10000 / 1000;
        long bai = num % 10000 % 1000 / 100;
        long shi = num % 10000 % 1000 % 100 / 10;
        long ge = num % 10000 % 1000 % 100 % 10;

        if (wan != ge || qian != shi){
            System.out.println("这不是一个回文");
            System.exit(0);
        }
        System.out.println("这是一个回文数");
    }
}
