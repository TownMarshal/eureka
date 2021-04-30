package JingDianSuanFa;

import java.util.Scanner;

/**
 * 某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5，然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
 */
public class Demo48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入四位数的整数：");
        String str = in.nextLine();
        if (str.length() < 4){
            System.out.println("请输入4位数");
            System.exit(0);
        }
        char[] chars = str.toCharArray();
        int[] arr = new int[chars.length];
        for (int i=0; i<chars.length; i++){
            //字符串转数字，字符先转字符串在转int
            int num = Integer.parseInt(String.valueOf(chars[i])) + 5;
            arr[i] = num % 10;
        }
        int temp;
        temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        for(int i : arr){
            System.out.print(i);
        }
    }
}
