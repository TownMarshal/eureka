package ItHeiMa.myException.Exception;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 自定义异常 格式：
 * public class 异常类名 extends Exception{
 *     无参构造
 *     有参构造
 * }
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");

        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}