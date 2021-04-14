package ShangXueTang.function;

public class test2 {

    //寻找极值问题
    public int findMaxOrMin(int[] arr, boolean flag) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (flag && arr[i] > temp) {
                temp = arr[i];
            } else if (!flag && arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        //创建一个对象
        test2 t = new test2();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 78, 9, 10};

        int max = t.findMaxOrMin(a, true);
        int min = t.findMaxOrMin(a, false);
        System.out.println(max);
        System.out.println("======================");
        System.out.println(min);



    }
}
