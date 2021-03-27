package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 * 找出0~100之间的质数
 */
public class ZhiShu {
    public static void main(String[] args) {
        boolean isFlag = true;
//获取当前时间距离1970.1.1.0:0:0之间的的毫秒数
        long start = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
//            for (int j = 2; j < i; j++) {//优化二
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;//优化一：只对本身非质数是有效的
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
            isFlag = true;
        }
        long end = System.currentTimeMillis();
        System.out.println("所花费的时间为：" + (end - start));
    }
}
