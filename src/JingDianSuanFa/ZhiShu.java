package JingDianSuanFa;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class ZhiShu {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 2; i < 10000; i++) {
            boolean flag = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("计算一万之内的质数，花费了" + (end - start) + "毫秒");

    }
}
