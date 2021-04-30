package JingDianSuanFa;

import java.util.Scanner;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数
 */
public class Demo06 {

    public static void main(String[] args) {
        int a, b, c, d;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        a = in.nextInt();
        System.out.println("再输入一个正整数：");
        b = in.nextInt();
        CommonDivisor commonDivisor = new CommonDivisor();
        c = commonDivisor.commonDivisor(a, b);
        d = a*b/c;
        System.out.println("最大公约数："+ c);
        System.out.println("最小公倍数："+ d);
    }

    static class CommonDivisor{
        public int commonDivisor(int x, int y){
            if (x > y){
                int t = x;
                x = y;
                y = t;
            }
            while (y != 0){
                if (x == y)
                    return x;
                else {
                    int k = x % y;
                    x = y;
                    y = k;
                }
            }
            return x;
        }
    }
}
