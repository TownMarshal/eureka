package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class JiuJiuChengFaBiao {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
