package cn.tx.homework;

/**
 * Created by Administrator on 2019/12/2 0002.
 */
public class Demo {
    public static int divide(){
        int i = 3;
        try {
            int a = 10/0;
            return i;
        }catch (Exception e){
            i = 4;
            return i;
        }finally {
            i = 5;
            //return i;
        }

    }
    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }
}
