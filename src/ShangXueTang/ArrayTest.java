package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 1.数组是相同数据类型(数据类型可以是任意类型)的有序集合
 * 2.数组也是对象，数组元素相当于成员变量
 * 3.数组长度是确定的，不可变的，不可越界
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[]arr=new int[3];
        arr[0]=12;
        arr[1]=33;
        arr[2]=42;
        System.out.println(arr.toString());

    }
}
