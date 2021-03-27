package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class ZhiShu1 {
    public static void main(String[] args) {
        int count =0;

        long start = System.currentTimeMillis();
       label: for (int i = 2; i < 100000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                   continue label;
                }
            }
            count++;
//           System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
    }
}
