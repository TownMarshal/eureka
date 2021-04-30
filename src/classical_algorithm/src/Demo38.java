import java.util.Scanner;

/**
 * 写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度
 */
public class Demo38 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("长度为：" + length(str));
    }

    private static int length(String str){
        return str.length();
    }
}
