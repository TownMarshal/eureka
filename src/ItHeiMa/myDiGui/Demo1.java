package ItHeiMa.myDiGui;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/10 0010.
 *         /**使用递归方法计算阶乘和
 *          * 1! + 2! + 3! + 4! +....+ 10!
 *          * 1. 求出每一个数的阶乘
 *          * 2. 把每一个数的阶乘求和
 *          * 递归：就是方法自身调用自身, 必须要有终止条件
 *          * 求出一个数的阶乘
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想计算谁的阶乘和：");
        int n = sc.nextInt();
        int result  = fn(n);
        System.out.println(result);
        int sum=0;
        for (int i = 1; i <= n; i++) {
            sum+=fn(i);
        }
        System.out.println(sum);
    }
    private static int fn(int n){
        int result = 1;
        if(n > 1){
            result = n * fn(n -1);
        }
        return result;
    }
}


