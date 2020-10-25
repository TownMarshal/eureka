package cn.tx.exception;

/**
 * Created by Administrator on 2019/11/16 0016.
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {


        int result = divide(10,0);
        System.out.println("调用端后面的一场代码被执行了");
        System.out.println(result);
    }
    public static int divide(int a,int b){
        int c = 0;
        //抛出运行时异常
        //在没有任何处理的情况下异常对象会自动的抛给调用端，调用端接收到异常对象，
        // 由于调用端也没有任何处理，会继续向上抛，抛给jvm,jvm会打印这个异常信息

        try {
            c = a/b;
            System.out.println("try内部发生异常");
        } catch (Exception e) {
            System.out.println("发生异常");
            e.printStackTrace();
        }
        System.out.println("被调用端后面的一场代码被执行了");
        return c;


    }
}
