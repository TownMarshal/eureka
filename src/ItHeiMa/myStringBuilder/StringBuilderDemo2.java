package ItHeiMa.myStringBuilder;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/12 0012.
 * 场景：
 * 定义一个方法，实现字符串反转，键盘录入一个字符串，调用该方法后
 * 在控制台输出结果
 * 例如：
 * 键盘录入abc，输出结果：cba
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        String result = MyReverse(line);
        System.out.println("最终结果是"+result);
    }
    //定义一个方法，实现字符串的反转，返回值类型String,参数String s
    public static String MyReverse(String s){
       /* //String---StringBuilder---reverse---String
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1 = sb.toString();
        return s1;*/
       return new StringBuilder(s).reverse().toString();
    }
}
