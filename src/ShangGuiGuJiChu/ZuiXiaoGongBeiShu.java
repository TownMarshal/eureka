package ShangGuiGuJiChu;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/27 0027.
 * 输入两个数，计算他们的最小公倍数
 * break关键字的使用
 */
public class ZuiXiaoGongBeiShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数m:");
        int m = scanner.nextInt();
        System.out.println("请输入一个正整数n:");
        int n = scanner.nextInt();
        int max = Math.max(m, n);
        for (int i = max; i < m * n; i++) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("m和n的最小公倍数是：" + i);
                break;
            }

        }
    }
}
