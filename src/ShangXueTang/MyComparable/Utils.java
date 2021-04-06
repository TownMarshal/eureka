package ShangXueTang.MyComparable;

import java.util.Arrays;
import java.util.List;

public class Utils {
    //容器排序
    public static <T extends Comparable<T>> void sort(List<T> list ){
        //第一步：转为数组
        Object []arr=list.toArray();
        //第二步：改变容器中对应的值
        for (int i = 0; i < arr.length; i++) {
            list.set(i,(T)(arr[i]));
        }
    }
    public static void sort(Object[] arr) {

        //从小到大排列日期数组
        boolean sorted = true;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) {
            sorted = true;
            for (int i = 0; i < len - 1 - j; i++) {
                if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {
                    Object temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static <T extends Comparable<T>> void sort1(T[] arr) {
        //从小到大排列日期数组
        boolean sorted = true;
        int len = arr.length;
        for (int j = 0; j < len - 1; j++) {
            sorted = true;
            for (int i = 0; i < len - 1 - j; i++) {
                if (((Comparable) arr[i]).compareTo(arr[i + 1]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
