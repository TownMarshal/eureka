package datastructure.binarysearch;
// 二分查找查找相同元素最左边的索引
public class binarysearch4 {
    private static int search1(int[] arr, int target) {
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
                candidate = m;
                j = m - 1;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 3, 5, 5, 5, 5, 7, 9};
        System.out.println(search1(arr, 2));
        System.out.println(search1(arr, 3));
        System.out.println(search1(arr, 5));

    }
}
