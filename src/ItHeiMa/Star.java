package ItHeiMa;
import java.util.Scanner;
/**
 * Created by Administrator on 2020/2/10 0010.
 * 打印n行星号*
 * 空白=n-*号
 * *=2n-1
 */
public class Star {
    public static void main(String[] args) {
        int i;
        int j;
        int z;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n的数值");
        int n = sc.nextInt();
        //外层循环是第几行，i 表示
        for (i =1;i <= n;i++){
            //打印空格
            for (j = 1;j <= n-i;j++){
                System.out.print(" ");
            }
            //打印*号
            for (z = 1;z <= 2*i-1;z++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

        for (i = n-1;i >= 1;i--){
            // 打印空格
            for(j = 1;j <=n-i;j++){
                System.out.print(" ");
            }
            //打印*号
            for(z = 1;z <= 2*i-1;z++){
                System.out.print("*");
            }
            //换行
            System.out.println();
        }

        //提示程序结束
        System.out.println("程序结束");
    }
}
