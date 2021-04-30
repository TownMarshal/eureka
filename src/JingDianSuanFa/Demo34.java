package JingDianSuanFa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 输入3个数a,b,c，按大小顺序输出
 */
public class Demo34 {
    public static void main(String[] args) {
        System.out.println("请输入三个数");
        int[] arr = new int[3];
        Scanner in = new Scanner(System.in);
        for (int i=0; i<3; i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
