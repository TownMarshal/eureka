package JingDianSuanFa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入三个整数x,y,z，请把这三个数由小到大输出
 */
public class Demo15 {
    public static void main(String[] args) {
        System.out.println("请输入三个数");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
