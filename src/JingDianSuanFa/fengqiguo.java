package JingDianSuanFa;

/**
 * Created by Administrator on 2020/2/7 0007.
 * 逢7过：数字的尾数是7，或者这个数是7的倍数，就跳过
 */
public class fengqiguo {
    public static void main(String[] args) {
        int count = 0;

        for (int x = 1; x < 100; x++) {
            if (x % 10 == 7 || x / 10 % 10 == 7 || x % 7 == 0) {
                System.out.println(x);
                count++;
            }
        }
        System.out.println("总共有" + count + "个数");
    }
}

        