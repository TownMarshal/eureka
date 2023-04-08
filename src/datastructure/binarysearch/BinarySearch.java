package datastructure.binarysearch;

import java.util.Arrays;

//https://www.bilibili.com/video/BV1Lv4y1e7HL/?p=20&spm_id_from=pageDriver&vd_source=f6261d999398afc890f3b76856b41a03
public class BinarySearch {
    /**
     * 二分查找基础版
     * i 跟j是数组的边界，可能是i或者j
     * 左闭右闭
     */
    public static int binarySearch(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m - 1;
            } else if (target > arr[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找改进版
     * *i 跟j是数组的边界，可能是i，但是肯定不是j
     * 左闭右开
     */
    public static int binarySearch1(int[] arr, int target) {
        int i = 0;
        int j = arr.length;//j设定为有边界外面的数
        while (i < j) {   //
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m;  //
            } else if (target > arr[m]) {
                i = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }

    /**
     * 二分查找平衡版
     * 左闭右开，i指向的可能是目标，j指向的不是目标
     * 不在循环内查找，等循环内只剩i时，退出循环，在循环外比较arr[i]和target的大小
     * 循环内的比较次数减少了
     * 时间复杂度O(log(n))
     * 二分查找平衡版
     * Arrays Ctrl+左键 找到源码，Ctrl+F12 找到JDK中的binarySearch方法
     */
    public static int binarySearch3(int[] arr, int target) {
        int i = 0;
        int j = arr.length;//j设定为有边界外面的数
        while (1 < j - i) {   //
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m;  //
            } else {
                i = m;
            }
        }
//        if (arr[i] == target) {
//            return i;
//        } else {
//            return -1;
//        }
        return arr[i] == target ? i : -1;

    }

    /**
     * 二分查找如果有多个数相同的情况下，查找最左边的那个数的索引
     * LeftMost
     */
    public static int binarySearchLeftMost(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        int candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m - 1;
            } else if (target > arr[m]) {
                i = m + 1;
            } else {
                //记录候选位置
                candidate = m;
                j = m - 1;
            }
        }
        return candidate;
    }

    /**
     * 二分查找如果有多个数相同的情况下，查找最右边的那个数的索引
     * RightMost
     */
    public static int binarySearchRightMost(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        int candidate = -1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m - 1;
            } else if (target > arr[m]) {
                i = m + 1;
            } else {
                //记录候选位置
                candidate = m;
                i = m + 1;
            }
        }
        return candidate;
    }

    //返回一个大于等于目标的最靠左的索引位置
    public static int binarySearchLeftMost2(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target <= arr[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i;
    }

    //返回一个小于等于目标的最靠右的索引位置
    public static int binarySearchLeftMost3(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int m = (i + j) >>> 1;
            if (target < arr[m]) {
                j = m - 1;
            } else {
                i = m + 1;
            }
        }
        return i - 1;
    }

    public static void main(String[] args) {
//        int[] arr = new int[10];
        int[] arr = new int[]{2, 4, 6, 8, 9, 11, 23, 435, 666};
//        int i = binarySearch(arr, 2);
//        int i = binarySearch(arr, 666);
//        int i = binarySearch(arr, 11);
//        int i = binarySearch(arr, 1);

//        int i = binarySearch(arr, 2);
//        int i = binarySearch(arr, 666);
//        int i = binarySearch1(arr, 11);
//        int i = binarySearch(arr, 1);
//        System.out.println(i);


        /**
         * 二分查找JAVA版本
         *
         * @param args
         */
/*
        [2,5,8]         a
        [2,0,0,0]       b
        [2,4,0,0]       b
        [2,4,5,8]       b

 */
        int[] a = {2, 5, 8};
        int key = 4;
        int i1 = Arrays.binarySearch(a, key);
        System.out.println(i1);
        //-2=-插入点 - 1
        //-2 +1= -插入点
        if (i1 < 0) {
            int insertIndex = Math.abs(i1 + 1);//插入点索引
            int[] b = new int[a.length + 1];
            System.arraycopy(a, 0, b, 0, insertIndex);
            b[insertIndex] = key;
            System.arraycopy(a, insertIndex, b, insertIndex + 1, a.length - insertIndex);
            System.out.println(Arrays.toString(b));


        }

    }
}
