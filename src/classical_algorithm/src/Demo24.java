import java.util.Scanner;

/**
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class Demo24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入不多于5位的正整数：");
        String str = in.nextLine();
        if (str.trim().length() > 5 || Integer.parseInt(str) < 0){
            System.out.println("请输入5位正整数");
            System.exit(0);
        }
        System.out.println(str + "是" + str.trim().length() +"位数");
        char[] chars = str.toCharArray();
        for (int i=chars.length-1; i>=0; i--){
            System.out.print(chars[i]);
        }
    }


}
