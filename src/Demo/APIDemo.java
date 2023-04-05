package Demo;
import java.util.Arrays;

/**
 * Created by Administrator on 2019/11/14 0014.
 */

/**
 练习题17
 API的使用（APIDemo）(Application Programming Interface引用程序编程接口)
 给定一个数组int[] arr = {15,5,32,63,3,9,27,4,79};使用API完成以下操作
 （1）给上面的数组做升序排列
 （2）快速打印数组
 （3）通过二分法查找，找出27这个数的索引
 提示：使用java.util.Arrays这个类
 */
public class APIDemo {
        public static void main(String[]args){
            int[] arr = {15,5,32,63,3,9,27,4,79};
            //使用工具类Arrays来做排序
//            Sort(arr);
            //快速打印数组
            printArr(arr);
            //调用Arrays的API来二分法查找数组中的一个数的索引
            myBinarySearch(arr,27);

        }
        //排序方法
        public static void sort(int[] arr){
            //使用Arrays工具类排序
            Arrays.sort(arr);
        }

        public static void printArr(int[] arr){
            //使用Arrays工具类把数组变成字符串形式
            String result = Arrays.toString(arr);
            System.out.println(result);
        }

        public static void myBinarySearch(int[] arr,int value){
            int index = Arrays.binarySearch(arr,27);
            System.out.println(index);
        }
    }



