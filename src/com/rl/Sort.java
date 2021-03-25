package com.rl;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/15 0015.
 */
public class Sort{
    public static void sort(){
        int temp;
        int sort[]=new int[10];
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入十个数据：");
        for (int i = 0; i < sort.length; i++) {
            sort[i]=scanner.nextInt();
        }
        for (int i = 0; i < sort.length-1; i++) {
            for (int j = 0; j < sort.length-1-i; j++) {
                if (sort[j]<sort[j+1]){
                    temp=sort[j];
                    sort[j]=sort[j+1];
                    sort[j+1]=temp;
                }
            }
        }
        System.out.println("排序后的数据是：");
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]+"");
        }
    }
    public static void main(String[] args) {
        sort();

    }
}
