import java.util.Scanner;

/**
 * 求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
 */
public class Demo08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入a的值");
        int a = in.nextInt();
        System.out.println("请输入n的值");
        int n = in.nextInt();
        int sum = 0, num = 0;
        for(int i=1; i<=n; i++){
            num += a;
            a = a*10;
            sum += num;
        }
        System.out.println("结果为:"+ sum);
    }
}
