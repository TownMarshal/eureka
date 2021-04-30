package JingDianSuanFa;

import java.util.Scanner;

/**
 * 读取7个数（1—50）的整数值，每读取一个值，程序打印出该值个数的
 */
public class Demo47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("输入7个1-50的值");
        for (int i=0; i<7; i++){
            int num = in.nextInt();
            if (num <1 || num > 50){
                System.out.println("输入错误" + "\t *");
            } else {
                System.out.println("*\t"+ num + "\t");
            }
        }
    }
}
