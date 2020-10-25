package cn.tx.homework;

/**
 * Created by Administrator on 2019/12/2 0002.
 */
public class Demo1 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42/a;
            int c [] = {1};
            c[42] = 99;                                   //10
            System.out.println("b="+b);
        }catch (ArithmeticException e){
            System.out.println("除0异常"+e);                  //12
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组超越边界异常"+e);            //14
        }
    }
}
