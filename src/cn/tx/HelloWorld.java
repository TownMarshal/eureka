package cn.tx;

/**
 * Created by Administrator on 2019/11/11 0011.
 */
public class HelloWorld {
    public static void main(String[] args) {
        String [] arrs = {"aaa","bbb","ccc"};
        for (int i = 0; i < arrs.length ; i++) {
            System.out.println(arrs[i]);

        }
        System.out.println("----------------");
        for (String str : arrs){
            System.out.println(str);
        }
        System.out.println("----------------");

        for (String arr : arrs) {
            System.out.println(arr);
        }
    }
}
