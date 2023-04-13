package datastructure.algorithm;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class javaoverload {
    public static void main(String[] args) {
        /**
         方法的重载：
         在同一个类中函数（方法）的名字，参数列表不一样（1参数个数不一样，或者对应索引位类型不一样）的两个方法是重载关系，跟返回值一点关系没有
         目的：为了节约方法的功能命名和提高代码的可读性
         */
            //定义两个整数类型变量
            int a=18;
            int b=20;
            int c=32;

            int result=add(a,b);
            System.out.println("调用的是2个参数求和的方法"+result);
            int result1=add(a,b,c);
            System.out.println("调用的是3个参数求和的方法"+result1);
            double result2=add(a,12.3);
            System.out.println("调用的是2个参数(第二个参数是double类型)求和的方法"+result2);
        }
        public static int add(int a,int b){
            return a+b;
        }
        public static int add(int a,int b,int c){
            return a+b+c;
        }
        public static double add(int a,double b){
            return a+b;
    }
}
