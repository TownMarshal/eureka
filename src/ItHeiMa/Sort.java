package ItHeiMa;

/**
 * Created by Administrator on 2020/2/10 0010.
 * 冒泡排序
 */
public class Sort {
    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 78, 94, 24};
        sortPop(arr);
        for (int value : arr) {
            System.out.println(value + "\t");
        }
    }

    private static void sortPop(int[] arr) {
        //我们为了程序的严谨性，一定要判断null和0长度的问题
        if (arr != null && arr.length != 0) {
            //外层循环是轮数
            for (int i = 0; i < arr.length - 1; i++) {
                //内层循环是每一轮比较的次数
                for (int j = 0; j < arr.length - i - 1; j++) {
                    //定义一个临时变量temp
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
}
