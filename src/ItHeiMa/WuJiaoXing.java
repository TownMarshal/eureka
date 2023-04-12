package ItHeiMa;

/**
 * Created by Administrator on 2021/3/27 0027.
 ******
 *****
 ****
 ***
 **
 *
外层控制行数，内层控制列数
 */
public class WuJiaoXing {
    public static void main(String[] args) {
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <= 7-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
