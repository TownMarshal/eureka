package cn.tx.exception;

/**
 * Created by Administrator on 2019/11/16 0016.
 */
public class ExceptionDemo7 {
    public static void main(String[] args) {
        int result = divide(10,2);
        System.out.println(result);
    }
    public static int divide(int a,int b){
        int c = 0;
        int []arr = {1,3,434,34,4};
        try {
            System.out.println(arr[1000]);
            c = a/b;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
        return c;


    }
}
