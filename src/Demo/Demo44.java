package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */

import java.util.Scanner;

/**
 扫描器Scanner
 扫描器就是让我们运行程序时可以从控制台输入数据
 我们使用的构造器：
 Scanner(InputStream source)
 构造一个新的Scanner,他生成的值是从指定的输入流扫描的
 */
public class Demo44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        System.out.println("输入的数据是"+line);
    }
}
