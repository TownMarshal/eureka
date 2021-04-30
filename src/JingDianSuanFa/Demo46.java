package JingDianSuanFa;

import java.util.Scanner;

/**
 * 两个字符串连接程序
 */
public class Demo46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入两个字符串");
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println("两个字符串连接的结果为: " + str1 + str2);
    }
}
