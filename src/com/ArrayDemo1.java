package com;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/29 0029.
 * 学生成绩与最高分的差值来计算等级
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int num=scanner.nextInt();
        int []scores=new  int[num];
        System.out.println("请分别输入这"+num+"个学生成绩");
        for (int i = 0; i < scores.length; i++) {
        scores[i]=scanner.nextInt();
        }
        int maxScore=0;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore<scores[i]){
                maxScore=scores[i];
            }
        }
        char level;
        for (int i = 0; i < scores.length; i++) {
            if (maxScore-scores[i]<=10){
                level='A';
            }else if (maxScore-scores[i]<=20){
                level='B';
            }else if (maxScore-scores[i]<=30){
                level='C';
            }else {
                level='D';
            }
            System.out.println("student"+i+"成绩是"+scores[i]+"等级是："+level);
        }
    }
}
