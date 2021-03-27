package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 * 找出0~100之间的质数
 */
public class ZhiShu {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isFlag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isFlag = false;
                }
            }
            if (isFlag == true) {
                System.out.println(i);
            }
        }

    }
}
