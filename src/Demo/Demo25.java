package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo25 {
    public static void main(String[] args) {
        /**
         数组的三种定义方式
         第一种：
         数组类型[]数组名=new数据类型[整数]；
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
         第二种：
         数组类型[]数组名={值1，值2，...}；
         char[]arr={'d','g','y','i'}
         //打印数组的长度
         System.out.println(arr.length);
         第三种：
         数组类型[]数组名=new数据类型[]{值1，值2，...}；
         int[]arr=new int{1,4,6,2}
         System.out.println(arr.length);
         第三种数组适合传递匿名的常量数组
         printArr(new int[]{12,5,6});
         */

            char[]arr=new char[3];
            arr[0]='r';
            arr[1]='b';
            arr[2]='t';
            printArr(arr);
        }
//这个方法接收一盒数组的引用数组类型
        public static void printArr(char[]arr){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
    }
}
