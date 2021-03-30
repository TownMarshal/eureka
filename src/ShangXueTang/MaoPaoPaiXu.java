package ShangXueTang;
import java.util.Arrays;
public class MaoPaoPaiXu {
    public static void sort(int[] values) {
        int temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] values = {12, 32, 424, 5325, 34, 324, 33};
        sort(values);
        System.out.println(Arrays.toString(values));
    }
}
