package datastructure.factorial;

import java.util.Arrays;

//冒泡排序
public class BubbleSort {

    public static void sort(int[] arr) {
        bubble(arr, arr.length - 1);
    }


    //j代表的是未排序区域的右边界
    private static void bubble(int[] arr, int j) {
        if (j == 0) {
            return;
        }
        int x = 0;
        for (int i = 0; i < j; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                x = i;//X右边的都排好序了，不用再重复的比较排序了
            }
        }
//        bubble(arr, j - 1);
        bubble(arr, x);
    }

    public static void main(String[] args) {
//        int[] arr = {6, 5, 4, 3, 2, 1};
        int[] arr = {6, 5, 4, 8, 9, 10, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
//        bubble(arr, arr.length - 1);
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
