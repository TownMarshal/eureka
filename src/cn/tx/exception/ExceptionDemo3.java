package cn.tx.exception;

/**
 * Created by Administrator on 2019/11/16 0016.
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {


        int result = 0;
        try {
            //接受异常对象
            result = divide(10,0);
        } catch (Exception e) {
            //处理异常
            //获得异常信息
            String message = e.getMessage();
            System.out.println(message);
            //获得异常的详细信息
            String s = e.toString();
            //打印异常的详细信息
            System.out.println(s);
            e.printStackTrace();

        }
        System.out.println(result);
    }
    public static int divide(int a,int b){
        int c = 0;
        //抛出运行时异常
        //在没有任何处理的情况下异常对象会自动的抛给调用端，调用端接收到异常对象，
        // 由于调用端也没有任何处理，会继续向上抛，抛给jvm,jvm会打印这个异常信息
        c = a/b;
        return c;
    }
}
