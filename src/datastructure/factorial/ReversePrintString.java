package datastructure.factorial;

//字符串反转后打印
public class ReversePrintString {
    public static void main(String[] args) {
        f(0, "abcd");
    }

    public static void f(int n, String str) {
        if (n == str.length()) {
            return;
        }
        f(n + 1, str);
        System.out.println(str.charAt(n));
    }
}
