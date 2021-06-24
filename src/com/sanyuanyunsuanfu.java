package com;

import java.util.Scanner;

public class sanyuanyunsuanfu {
    public static void main(String[] args) {
        System.out.println("请输入您想计算的成绩成绩分");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("你输入的时候成绩属于等级：");
        System.out.println(num >= 90 ? 'A' : (num < 60 ? 'C' : 'B'));

    }
}
