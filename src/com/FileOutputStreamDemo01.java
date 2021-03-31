package com;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //创建字节输出流对象
        //FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
//        FileOutputStream fos = new FileOutputStream("D:\\git\\fos.txt");
        FileOutputStream fos =new FileOutputStream("D:\\git\\fos.txt");
        //void write​(int b)：将指定的字节写入此文件输出流
        fos.write(97);
        fos.write(97);
        fos.write(Integer.parseInt("22"));

        fos.close();
    }
}
