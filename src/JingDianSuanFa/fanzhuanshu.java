package JingDianSuanFa;

import java.util.Scanner;

/**
 * 给你一个 32 位的有符号整数 x ，返回 x 中每位上的数字反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 */
public class fanzhuanshu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();

            int result = reversed(input);
            System.out.println("result = " + result);
        }
    }

    private static int reversed(int input) {
        int rev = 0;
        while (input != 0) {
            int temp = input % 10;
            input = input / 10;
            //大致思想：
            //1、只要大于Integer.MAX_VALUE/10,
            //2、或者是等于Integer.MAX_VALUE/10，并且最后一位是大于Integer.MAX_VALUE最后一位，但是实际中是不会发生
            if (rev > Integer.MAX_VALUE / 10 /* || ((rev == Integer.MAX_VALUE/10)&&temp> Integer.MAX_VALUE%10)*/) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 /* || ((rev == Integer.MIN_VALUE/10) && temp < Integer.MIN_VALUE%10) */) {
                return 0;
            }
            rev = rev * 10 + temp;
        }
        return rev;
    }
}
