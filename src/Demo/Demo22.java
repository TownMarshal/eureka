package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo22 {
    public static void main(String[] args) {
        /**
         编写一个java程序在屏幕上输出1!+2!+3！+...+10！的和
         1.求一个数的阶乘
         2.把从1到10每一个数的阶乘求和
         */

            int total=0;
            for(int i=1;i<=10;i++){
                total+=fn(i);
            }
            System.out.println(total);
        }
        public static int fn(int num){
            //定义一个结果变量
            int result=1;
            //变量参数这个数字
            for(int i=num;i>0;i--){
                //累乘
                result*=i;
            }
            return result;
    }
}
