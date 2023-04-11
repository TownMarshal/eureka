package datastructure.factorial;

public class FactorialBinarySearch {


    public static int search(int[] arr, int target) {
        return f(arr, target, 0, arr.length - 1);
    }

    private static int f(int[] arr, int target, int i, int j) {
        if (i > j) {
            return -1;
        }
        int m = (i + j) >>> 1;
        if (target < arr[m]) {
            return f(arr, target, i, m - 1);
        } else if (target > arr[m]) {
            return f(arr, target, m + 1, j);
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 10};
        System.out.println(search(arr, 1));
        System.out.println(search(arr, 2));
        System.out.println(search(arr, 6));
        System.out.println(search(arr, 10));
        System.out.println(search(arr, 11));
    }
}
