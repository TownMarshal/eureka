package ItHeiMa.AAAshenghuowenti;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/10 0010.
 * 数组插入一个数，升序排序
 * 2有一个已经排好的数组。现在输入一个数，要求按着原来的规律将它插入数组中。
 * * 20
 * * [3, 7, 9, 23, 57]
 */
public class shuzuchashu {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 9, 23, 57};
        System.out.println("现有数组" + "\t" + Arrays.toString(arr1) + "请填一个数字插入其中，并排序");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要插入的数组");
        int i = sc.nextInt();

        int[] arr2 = {3, 7, 9, 23, 57, i};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
