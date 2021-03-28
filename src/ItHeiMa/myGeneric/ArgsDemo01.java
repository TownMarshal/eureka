package ItHeiMa.myGeneric;

/**
 * Created by Administrator on 2020/2/17 0017.
 * 通过可变参数实现多个参数的求和
 */
public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));

        System.out.println(sum(10,20,30,40,50));
        System.out.println(sum(10,20,30,40,50,60));
        System.out.println(sum(10,20,30,40,50,60,70));
        System.out.println(sum(10,20,30,40,50,60,70,80,90,100));

    }

//    public static int sum(int b,int... a) {
//        return 0;
//    }
    public static int sum(int... a) {
//        System.out.println(a);
//        return 0;

        //数组求和
        int sum = 0;
        for(int i : a) {
            sum += i;
        }
        return sum;
    }

/*    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }*/
}
