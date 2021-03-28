package JingDianSuanFa;

/**
 * Created by Administrator on 2020/2/6 0006.
 * 求解：一筐鸡蛋：一个个拿，正好拿完。
 * 两个两个拿还剩一个，三个三个拿刚好拿完，
 * 四个四个拿，还剩一个，五个五个拿还剩4个，
 * 6个6个拿还剩三个，7个7个拿刚好拿完，
 * 8个8个拿还剩一个，9个9个拿刚好拿完，问框里有多少鸡蛋？
 */
public class najidan {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            if (i % 2 == 1
                    && i % 3 == 0
                    && i % 4 == 1
                    && i % 5 == 4
                    && i % 6 == 3
                    && i % 7 == 0
                    && i % 8 == 1
                    && i % 9 == 0) {
                System.out.println(i);
                return;
            }
        }
    }
}