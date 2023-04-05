package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 练习题18
 * Scanner的使用（APIDemo1）
 * （系统使用交互的方式）给三个数字进行排序
 * 从控制台输入三个数，例如：接受用户输入三个整数a,b,c
 * 输入完毕后通过程序对三个数进行排序（要使用API）
 */
public class APIDemo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        //创建一个数组
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        //给数组排序
        Arrays.sort(arr);
        //打印数组
        System.out.println(Arrays.toString(arr));

    }
}
