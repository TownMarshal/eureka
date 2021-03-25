package computer.AAAshenghuowenti;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/2/11 0011.
 * 使用二分法，ReverseArr方法，创建方法，使arrays.Sort()方法实现，从大到小排序
 */
public class erfenfapaixu {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 78, 94, 24};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ReverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ReverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            //获取i对称的
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }
}


 /*
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
            */
