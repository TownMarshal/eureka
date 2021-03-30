package ItHeiMa.myArray;

/*
    索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
        ArrayIndexOutOfBoundsException

    空指针异常：访问的数组已经不再指向堆内存的数据，造成空指针异常
        NullPointerException

    null：空值，引用数据类型的默认值，表示不指向任何有效对象
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = new int[3];

        //System.out.println(arr[3]);
        //System.out.println(arr[2]);

        //把null赋值给数组
        arr = null;
//        System.out.println(arr[0]);

        /*
    静态初始化：
        初始化时指定每个数组元素的初始值，由系统决定数组长度

        格式：数据类型[] 变量名 =  new  数据类型[]{数据1, 数据2, 数据3, ……};
        范例：    int[]   arr =  new      int[]{1, 2, 3};

        简化格式：数据类型[] 变量名 = {数据1, 数据2, 数据3, ……};
        范例：       int[]    arr = {1, 2, 3};
 */

        //定义数组
        int[] arr1 = {1, 2, 3};
        System.out.println(arr1.length);
        System.out.println("================");

        //输出数组名
        System.out.println(arr1);

        //输出数组中的元素
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
