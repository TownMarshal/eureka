package datastructure.factorial;

public class Sum {
    public static long sum(long n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;

    }

    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(sum(10000));
        System.out.println(sum(20000));

    }
}
