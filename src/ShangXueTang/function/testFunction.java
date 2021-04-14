package ShangXueTang.function;

public class testFunction {
    //是否需要参数和返回值，需要一个数组，需要一个
    public int[] changeArrElement(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

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
        testFunction t = new testFunction();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 78, 9, 10};
        int[] result = t.changeArrElement(a);
        int max = t.findMaxOrMin(a, true);
        int min = t.findMaxOrMin(a, false);
        System.out.println(max);
        System.out.println("======================");
        System.out.println(min);
//        for (int v : result) {
//            System.out.println(v);
//        }


    }

}
