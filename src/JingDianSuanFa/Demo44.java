package JingDianSuanFa;

import java.util.Scanner;

/**
 * 一个偶数总能表示为两个素数之和
 * 注：哥德巴赫猜想是想证明对任何大于6的自然数n之内的所有偶数可以表示为两个素数之和
 */
public class Demo44 {
    public static void main(String[] args) {
        System.out.println("请输入一个偶数：");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 != 0) {
            System.out.println("输入的数字不为偶数");
            System.exit(0);
        }
        twoAdd(num);
    }

    //素数之和
    private static void twoAdd(int num) {
        for (int i = 2; i < num; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + "=\t" + i + "+\t" + (num - i));
            }
        }
    }

    //判断是否为素数
    private static boolean isPrime(int num) {
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
