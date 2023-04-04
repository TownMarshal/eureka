package Demo.Object;

/**
 * Created by Administrator on 2020/2/15 0015.
 */
public class ObjectTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j+"\t");
            }
            System.out.println();
        }
    }
}