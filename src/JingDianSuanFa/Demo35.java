package JingDianSuanFa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组
 */
public class Demo35 {
    public static void main(String[] args) {
        System.out.println("随机生成数组，请输入数组的长度");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        Random random = new Random();
        for (int i=0; i<n; i++){
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        int max = 0, min = 0, temp = 0, maxLength = 0, minLength = 0;
        for (int i=0; i<arr.length; i++){
            if (i==0){
                max = arr[0];
                min = arr[0];
            } else {
                if (max < arr[i]){
                    max = arr[i];
                    maxLength = i;
                }
                if (min > arr[i]){
                    min = arr[i];
                    minLength = i;
                }
            }
        }
        temp = arr[0];
        arr[0] = max;
        arr[maxLength] = temp;

        temp = arr[arr.length-1];
        arr[arr.length-1] = min;
        arr[minLength] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
