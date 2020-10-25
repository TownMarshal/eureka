package cn.tx.exception;

/**
 * Created by Administrator on 2019/11/16 0016.
 */
public class ExceptionDemo9 {
    public static void main(String[] args) {
        int result = divide(10,2);
        System.out.println(result);
    }
    public static int divide(int a,int b){
        int c = 0;
        c = a/b;
        System.out.println("代码后面的被执行了");
        return c;


    }
}
