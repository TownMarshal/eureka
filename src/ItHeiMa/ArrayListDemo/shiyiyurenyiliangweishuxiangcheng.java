package ItHeiMa.ArrayListDemo;

import ItHeiMa.Sys;

import java.util.Scanner;

public class shiyiyurenyiliangweishuxiangcheng {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int b = scanner.nextInt();
        int a=11;
//        int b=88;//b是23
        int i = b  % 10;//个位数
        int i1 = b / 10% 10;//十位数
        int i2 = i + i1;//个位与十位相加，，，，大于10要进一

        if (i2<10){
            System.out.println(a*b);
            System.out.println("a*b="+(i+i1*100+i2*10));
        }else {
            int i3 = i2 % 10;//中间数相加取得个位数，十位数进一位
            System.out.println(a*b);
            System.out.println("a*b="+(i+(i1+1)*100+i3*10));
        }


    }
}
