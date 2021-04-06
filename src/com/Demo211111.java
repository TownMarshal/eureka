package com;

/**
 * Created by Administrator on 2021/3/31 0031.
 */
public class Demo211111 {
    public static void main(String[] args) {
        int temp;

        int[]arr=new int[]{1,33,45,6,67,45,2};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

}
