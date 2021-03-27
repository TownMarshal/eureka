package test1;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class zuixiaogonbeishu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int n=scanner.nextInt();

        int max = (m>n)?m : n;

        for (int i = max; i < m*n; i++) {
            if (i%m==0&&i%n==0){
                System.out.println("m和n的最小公倍数是："+i);
                break;
            }

        }
    }
}
