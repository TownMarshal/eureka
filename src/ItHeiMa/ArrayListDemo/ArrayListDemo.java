package ItHeiMa.ArrayListDemo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2020/2/13 0013.
 * ArrayList构造方法和添加方法
 */
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> arr=new ArrayList<String>();
        //System.out.println(array.add("adc"));  判断调用是否成功
        arr.add("hello");
        arr.add("world");
        arr.add("java");
        //在此集合中的指定位置插入指定的元素
        arr.add(1,"javase");
        arr.add(4,"javaee");
        //IndexOutOfBoundsException  集合越界
       // arr.add(5,"javaee");
        System.out.println("arr"+arr);
        }
}
