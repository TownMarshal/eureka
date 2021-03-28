package JingDianSuanFa;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class ZuiDaGongYueShu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个正整数");
        int m = scanner.nextInt();

        System.out.println("请输入第二个正整数");
        int n = scanner.nextInt();

        //获取两个数其中最小的一个数
        int min = (m <= n) ? m : n;
        for (int i = min; i >= 1; i--) {
            if (m % i == 0 && n % i == 0) {
                System.out.println("最大公约数为：" + i);
                break;
            }
        }
    }
}
