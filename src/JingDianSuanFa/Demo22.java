package JingDianSuanFa;

import java.util.Scanner;

/**
 * 利用递归方法求5!
 */
public class Demo22 {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n + "的阶乘是" + fac(n));
    }

    public static long fac(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        long sum = 0;
        if (n > 1){
            sum = n * fac(n-1);
        }
        return sum;
    }
}
