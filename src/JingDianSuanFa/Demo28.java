package JingDianSuanFa;

import java.util.Arrays;
import java.util.Random;

/**
 * 对10个数进行排序
 */
public class Demo28 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i=0; i<10; i++){
            nums[i] = random.nextInt(100) + 1;
        }
        Arrays.sort(nums);
        for (int i=0; i<10; i++){
            System.out.print(nums[i] + "\t");
        }
    }

}
