package JingDianSuanFa;

import java.util.Scanner;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示
 */
public class Demo05 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(num >=90 ? 'A' : (num < 60 ? 'C' : 'B'));
    }
}
