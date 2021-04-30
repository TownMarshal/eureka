package JingDianSuanFa;

import java.util.Arrays;

/**
 * 字符串排序
 */
public class Demo40 {
    public static void main(String[] args) {
        String[] arr = { "ghi", "def", "mno", "jkl", "pqr", "abc" };
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));
    }
}
