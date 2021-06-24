package ItHeiMa.myDiGui;

/**
 * Created by Administrator on 2020/2/9 0009.
 * 不死神兔
 * 斐波那契数列
 * 1,1,2,3,5...n(n<=1000)
 */
public class Demo2 {
    public static void main(String[] args) {
     //为了存储多个月的兔子对数，定义一个数组，用动态初始化完成数组元素的初始化，长度为20；
        int[]arr =  new int[20];

        //因为第一个月，第二个月的兔子对数的已知的，都是1，多以数组的第一个元素和第二个元素都是1；
        arr[0] = 1;
        arr[1] = 1;
        for (int x=2;x<arr.length;x++){
            arr[x] = arr[x-2] + arr[x-1];
        }
        //输出数组中的最后一个元素的值。也就是地20个月的兔子的总数；
        System.out.println("第20个月的兔子的总数是："+arr[19]);
    }
}
