package ItHeiMa.myMethod.itheima_01;

import java.util.Scanner;

/*
    方法：是将具有独立功能的代码块组织成为一个整体，使其具有特殊功能的代码集

    定义格式：
        public static void 方法名 ( ) {
	        //方法体
	    }

	调用格式：
	    方法名();
 */
public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("你输入你要检验的数：");

        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        iseven(i);
    }
    private static String  iseven(int n){
        if (n%2==0){
            String s = "n是偶数";
            return s;
        }
        String s1 = "n是奇数";
        return s1;

    }
}
