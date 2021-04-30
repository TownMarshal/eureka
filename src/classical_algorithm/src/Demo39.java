import java.util.Scanner;

/**
 * 编写一个函数，输入n为偶数时，调用函数求1/2+1/4+...+1/n,当输入n为奇数时，调用函数1/1+1/3+...+1/n(利用指针函数)
 */
public class Demo39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int num = in.nextInt();
        if (num%2==0){
            System.out.println("偶数和为" + even(num));
        } else {
            System.out.println("奇数和为" + odd(num));
        }
    }

    private static double even(int n){
        double sum = 0;
        for (int i=2; i<=n; i=i+2){
            sum += 1.0/i;
        }
        return sum;
    }

    private static double odd(int n){
        double sum = 0;
        for (int i=1; i<n; i=i+2){
            sum += 1.0/i;
        }
        return sum;
    }
}
