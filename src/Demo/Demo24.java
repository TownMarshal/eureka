package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo24 {
    public static void main(String[] args) {
        /**
         数组的定义和使用
         */
     //定义一个整数类型的数组
     //数组类型[]数组名=new数据类型[整数]；
            int[]arr=new int[8];
     //给数据里面的数据来设置值
            arr[0]=155;
            arr[1]=165;
            arr[2]=175;
            arr[3]=185;
            arr[4]=195;
            arr[5]=205;
            arr[6]=215;
            arr[7]=225;
      //使用for循环来打印数组,数组的遍历
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

     //数组的下标不要越界使用，否则报错
            /*arr[8]=44;*/
/*
//访问数组中的每一个数
System.out.println(arr[0]);
System.out.println(arr[2]);
System.out.println(arr[3]);
System.out.println(arr[4]);
System.out.println(arr[5]);
System.out.println(arr[6]);
System.out.println(arr[7]);
*/

//获取数组的长度
            int len=arr.length;
            System.out.println("数组的长度是："+len);
    }
}
