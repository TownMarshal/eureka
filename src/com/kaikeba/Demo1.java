package com.kaikeba;

import java.io.IOException;

/**
 * Created by Administrator on 2020/7/17 0017.
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        // 自动开关机程序
        //关机
//        Runtime.getRuntime().exec("shutdown -s -t 6000");
        //取消关机
         Runtime.getRuntime().exec("shutdown -a");
    }

}
