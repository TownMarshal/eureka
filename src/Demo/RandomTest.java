package Demo;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/9 0009.
 */
public class RandomTest {
    public static void main(String[] args) {
        //要完成猜数字的游戏，首先要有一个要猜的数字，范围1到100
        Random r = new Random();
        int number = r.nextInt(100)+1;
        while (true){
            //使用程序实现猜数字，每次均要输入猜测的数字值，需要使用键盘录入实现
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            //比较输入的数字值和系统产生的数据，需要用到分支语句这里使用if else if 格式
            if(guessNumber > number){
                System.out.println("你猜得数字大了");
            }else if(guessNumber < number){
                System.out.println("你猜得数字小了");
            }else {
                System.out.println("恭喜你猜中了！");
            }
        }
    }
}
