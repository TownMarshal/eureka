package Demo;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/11/12 0012.
 * 查询成绩是否合格
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的成绩");
        int i = sc.nextInt();
        if (i >= 60){
            System.out.println("恭喜你，及格啦！");
        }else {
            System.out.println("不及格，还需要努力！");
        }
        System.out.println("程序结束");
    }
}
