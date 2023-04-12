package ItHeiMa;

/**
 * Created by Administrator on 2020/2/10 0010.
 * 求极值
 */
public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 78, 94, 24};
        int result = max(arr);
        System.out.println("数组的最大值是：" + result);
    }

    public static int max(int[] arr) {
        int maxValue = -1;
        if (arr != null) {
            for (int j : arr) {
                if (j > maxValue) {
                    maxValue = j;
                }
            }
        }
        return maxValue;
    }
}


