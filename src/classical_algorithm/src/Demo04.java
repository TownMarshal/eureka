import java.util.Scanner;

/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 1.程序分析：对n进行分解质因数，应先找到一个最小的质数i，然后按下述步骤完成：
 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
 * (2)如果n > i，但n能被i整除，则应打印出i的值，并用n除以i的商,作为新的正整数你,重复执行第一步。
 * (3)如果n不能被i整除，则用i+1作为i的值,重复执行第一步。
 */
public class Demo04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入N的值");
        int n = in.nextInt();
        System.out.print("分解质因数：" + n + "=");
        fenjie(n);
    }

    public static void fenjie(int n){
        for (int i=2; i<=n; i++){
            if (n%i == 0){
                System.out.print(i);
                if (n != i){
                    System.out.print("*");
                }
                fenjie(n/i);
            }
        }
        System.exit(0);
    }
}
