package com.kaikeba;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/7/17 0017.
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //用于创建用户输入的变量
        Scanner sc = new Scanner(System.in);
        System.out.println("提示用户输入");
        int s1 = sc.nextInt();
        //接收用户输入
        System.out.println("您要关闭电脑的时间是："+s1+"秒后");
        // 自动开关机程序
        //关机
       // Runtime.getRuntime().exec("shutdown -s -t s1");
        //取消关机
        Runtime.getRuntime().exec("shutdown -a");
    }

}
