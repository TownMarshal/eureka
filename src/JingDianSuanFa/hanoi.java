package JingDianSuanFa;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/10 0010.
 * 算法描述：
 * 汉诺塔主要是有三个塔座X，Y，Z，要求将三个大小不同，依小到大编号为1，2…n的圆盘从A移动到塔座Z上，要求
 * （1）：每次只能移动一个圆盘
 * （2）：圆盘可以插到X，Y，Z中任一塔座上
 * （3）：任何时候不能将一个较大的圆盘压在较小的圆盘之上
 * 程序实现逻辑：
 * 汉诺塔的算法就3个步骤：
 * 【1】把a上的n-1个盘通过c移动到b。
 * 【2】把a上的最下面的盘移到c。
 * 【3】因为n-1个盘全在b上了，所以把b当做a重复以上步骤就好了
 */
public class hanoi {
    static long count;

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("请输入盘子的个数：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi hanoi = new hanoi();
        hanoi.move(n, 'A', 'B', 'C');
        System.out.println(count);
    }

    public void move(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
            count++;
        } else {
            move(n - 1, a, c, b);
            System.out.println("盘 " + n + " 由 " + a + " 移至 " + c);
            count++;
            move(n - 1, b, a, c);
        }
    }
}
