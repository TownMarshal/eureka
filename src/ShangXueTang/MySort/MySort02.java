package ShangXueTang.MySort;

import java.util.Arrays;

public class MySort02 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] arr = {"a", "abcd", "abc", "def"};
        //从到小排序 降序
        boolean sorted = true;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) { //趟数
            sorted = true; //假定有序
            for (int i = 0; i < len - 1 - j; i++) { //次数
                if (((Comparable) arr[i]).compareTo(arr[i + 1]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false; //假定失败
                }
            }
            if (sorted) { //减少趟数
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}




