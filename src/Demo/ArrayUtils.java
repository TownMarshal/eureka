package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
/**
 包的使用详解：
 包：就是文件夹。(包的名字一定是英文小写)
 作用：对类做分类管理，可以区分同名不同包的类
 语法：package包名(不同级别用"."来分隔)；如package com.rl; 位置放置文件的有效代码第一行(注释不算)
 如何编译：javac -d.源文件
 */
public class ArrayUtils {
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        printArr(new int[]{1,2,3,644,787});
    }
}
