package com;

/**
 * Created by Administrator on 2021/3/29 0029.
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[]a=new int[]{8,2,1,0,3};
        int[]index= new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel ="";
        for (int i = 0; i < index.length; i++) {
            tel+=a[index[i]];

        }
        System.out.println("联系方式："+tel);
    }
}
