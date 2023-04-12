package JingDianSuanFa;

import java.util.Arrays;

/**
 * Created by Administrator on 2020/2/11 0011.
 * 使用二分法，ReverseArr方法，创建方法，使arrays.Sort()方法实现，从大到小排序
 */
public class erfenfapaixu {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 78, 94, 24};
        Arrays.sort(arr);//
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            //获取i对称的
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }
}


