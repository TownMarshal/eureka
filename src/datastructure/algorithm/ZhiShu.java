package datastructure.algorithm;

/**
 * Created by Administrator on 2021/3/27 0027.
 * 求200以内所有的质数（素数）
 * 2327毫秒
 * 9592个质数
 */
public class ZhiShu {
    public static void main(String[] args) {
        boolean flag = true;
        for (int i = 2; i <= 40; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;
        }

    }
}
