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
 *          * 5！ = 5*4！
 *          * 4！ = 4*3！
 *          * 3！ = 3*2！
 *          * 2！ = 2*1！
 *          * 1！ = 1
 *          * fn(n) = n * fn(n-1)
 *          * fn(5) = 5 * 4 * 3 * 2 * 1
 *          * fn(4) = 4 * fn(3)
 *          * fn(3) = 3 * fn(2)
 *          * fn(2) = 2 * fn(1)
 *          * fn(1) = 1
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想计算谁的阶乘和：");
        int n = sc.nextInt();
        int result  = fn(n);
        System.out.println(result);
    }
    private static int fn(int n){
        int result = 1;
        if(n > 1){
            result = n * fn(n -1);
        }
        return result;
    }
}


