package datastructure.binarysearch;
//平衡版二分查找
public class binarysearch3 {
    public static int search1(int[] arr, int target) {
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
        return arr[i] == target ? i : -1;
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
