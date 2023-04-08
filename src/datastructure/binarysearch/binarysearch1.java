package datastructure.binarysearch;
//基础版二分查找
public class binarysearch1 {
    private static int search1(int[] arr, int target) {
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

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 5, 7, 9};
        System.out.println(search1(arr, 1));
        System.out.println(search1(arr, 2));
        System.out.println(search1(arr, 4));
        System.out.println(search1(arr, 9));
        System.out.println(search1(arr, 10));
    }
}
