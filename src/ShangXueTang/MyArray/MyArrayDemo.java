package ShangXueTang.MyArray;

import java.util.Arrays;

public class MyArrayDemo {
    public static void main(String[] args) {
        int[] a = {1, 22, 323, 23, 543, 12, 40};
        Arrays.asList(a);
        System.out.println(Arrays.toString(a));
        System.out.println("该元素的索引是：" + Arrays.binarySearch(a, 12));


    }

}
