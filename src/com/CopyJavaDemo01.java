package com;

import java.io.*;

/*
    需求：
        把模块目录下的ConversionStreamDemo.java 复制到模块目录下的 Copy.java

    思路：
        1:根据数据源创建字符输入流对象
        2:根据目的地创建字符输出流对象
        3:读写数据，复制文件
        4:释放资源
 */
public class CopyJavaDemo01 {
    public static void main(String[] args)  {
        //根据数据源创建字符输入流对象
        InputStreamReader isr = null;
        try {
            isr = new InputStreamReader(new FileInputStream("D:\\Chrome\\aa\\b.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //根据目的地创建字符输出流对象
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(new FileOutputStream("D:\\Chrome\\cccccc"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //读写数据，复制文件
        //一次读写一个字符数据
//        int ch;
//        while ((ch=isr.read())!=-1) {
//            osw.write(ch);
//        }

        //一次读写一个字符数组数据
        char[] chs = new char[1024];
        int len = 0;
        while (true) {
            try {
                if (!((len=isr.read(chs))!=-1)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                osw.write(chs,0,len);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //释放资源
        try {
            osw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            isr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
