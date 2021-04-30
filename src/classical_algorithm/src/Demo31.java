import java.util.Arrays;
import java.util.Random;

/**
 * 将一个数组逆序输出。
 */
public class Demo31 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i=0; i<10; i++){
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i] + "\t");
        }
    }
}
