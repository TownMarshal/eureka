package JingDianSuanFa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 1.程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 */
public class Demo30 {
    public static void main(String[] args) {
        System.out.println("请输入要排序的个数：");
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arrays = new int[count+1];
        Random random = new Random();
        for (int i=0; i<count; i++){
            arrays[i] = random.nextInt(100) + 1;
        }
        Arrays.sort(arrays);
        System.out.println("输入你要插入的数字");
        int num = in.nextInt();

        arrays[count] = num;
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
