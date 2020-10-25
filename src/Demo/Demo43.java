package Demo;

import java.util.Scanner;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
public class Demo43 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //这个就是指从控制台扫描一个int的数值
        //程序运行到下面，程序会阻塞等待我们输入一个int的值，回车后程序会向下走
        int score = s.nextInt();
        if(score>=90){
            System.out.println("优秀");
        }
        if(score>=60&&score<90){
            System.out.println("合格");
        }
        if(score<60){
            System.out.println("不及格");
        }

    }
}
