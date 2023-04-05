package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 * 这种方法是优化后的方法，耗时短
 * 找出0~100之间的质数
 * 149毫秒
 * 9592个质数
 */
public class ZhiShu {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        boolean flag = true;
        for (int i = 2; i < 10000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
                System.out.println(i);
            }
            flag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "毫秒");
        System.out.println(count + "个质数");

    }
}
