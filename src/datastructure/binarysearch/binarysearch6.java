package datastructure.binarysearch;

//// 二分查找查找 插入位置的索引
public class binarysearch6 {
    public static int search1Insert(int[] arr, int target) {
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
        return i;
    }

    public static int search2Insert(int[] arr, int target) {
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
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 22};
        System.out.println(search1Insert(arr, 2));
        System.out.println(search1Insert(arr, 8));
        System.out.println(search1Insert(arr, 12));

        System.out.println(search2Insert(arr, 2));
        System.out.println(search2Insert(arr, 8));
        System.out.println(search2Insert(arr, 12));

    }
}
