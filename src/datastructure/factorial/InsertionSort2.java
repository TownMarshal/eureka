package datastructure.factorial;

import java.util.Arrays;

//插入排序  （打扑克摸牌阶段将牌插入手牌）
public class InsertionSort2 {
    public static void sort(int[] arr) {
        //默认第一个索引是0的第一个元素是排好序的
        insertion2(arr, 1);
    }

    //low代表未排序区域的左边界（满老师版本插入排序）
    private static void insertion(int[] arr, int low) {
        if (low == arr.length) {
            return;
        }
        int temp = arr[low];
        int i = low - 1;//已排序区域的指针  i代表已排序区域的右边界
        while (i >= 0 && arr[i] > temp) {//没有找到插入位置就不断循环
            arr[i + 1] = arr[i];//空出插入位置
            i--;//继续向左找直到找到第一个比temp的小数，就插入到他后面
        }
        //找到插入位置
        if (i + 1 != low) {
            arr[i + 1] = temp;
        }
        insertion(arr, low + 1);
    }


    //同学版本插入排序
    private static void insertion2(int[] arr, int low) {
        if (low == arr.length) {
            return;
        }

        int i = low - 1;
        while (i >= 0 && arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;//
            i--;
        }

        insertion(arr, low + 1);
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 4, 8, 9, 10, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
//        bubble(arr, arr.length - 1);
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
