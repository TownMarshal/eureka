import java.util.Scanner;

/**
 * 取一个整数a从右端开始的第4～7位数字
 */
public class Demo32 {
    public static void main(String[] args) {
        System.out.println("请输入至少7位的数字");
        Scanner in = new Scanner(System.in);
        long num  = in.nextInt();
        String str = String.valueOf(num);
        if (str.length() < 7){
            System.out.println("输入的数字格式错误");
            System.exit(0);
        }
        System.out.println("从右端开始的第4～7位数字" + str.substring(3,7));
        char[] chars = str.toCharArray();
        int length = chars.length;
        System.out.println("从右端开始的第4～7位数字" + chars[3] + chars[4] + chars[5] + chars[6]);
    }
}
