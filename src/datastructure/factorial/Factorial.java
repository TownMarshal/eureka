package datastructure.factorial;

//计算阶乘
public class Factorial {
    public static void main(String[] args) {
//        int val = f(5);
        int val = f(0);
        System.out.println(val);
    }

    public static int f(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }


}
