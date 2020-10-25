package com.rl;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 2有一个已经排好的数组。现在输入一个数，要求按着原来的规律将它插入数组中。

         * 20
         * [3, 7, 9, 23, 57]
         *
         * 分析：
         * 	（1）定义一个有顺序的数组
         * 	（2）现在输入一个数
         * 	（3） 要求按着原来的规律将它插入数组中。
         * 			a. 数组的长度是不可变的
         * 			b. 创建一个新的数组，这个数组的长度是原数组的长度+1
         *
         *
         * arr    [3,  7,  9,  23, 57]            20
         * arr1   [3,  7,  9,  23, 57,  0]
         *
         * arraycopy(arr, 0, arr1, 0, arr.length)
         */
        int[] arr = {3, 7, 9, 23, 57};
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个数插入数组中，排序");
        int num = s.nextInt();
        System.out.println("你输入的数是："+num);

        int[] arr1 = insertNum(arr, num);
        System.out.println("输入排序完了的数组是："+Arrays.toString(arr1));
    }

    public static int[] insertNum(int[] arr, int num){
        int[] arr1 = new int[arr.length+1];
        //把源数组的内容拷贝到目的数组中
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        //把输入的这个数加到新数组的末尾
        arr1[arr.length] = num;
        //排序新数组
        sort(arr1);
        return arr1;
    }
    /**
     * 排序
     * @param arr
     */
    public static  void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j +1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
