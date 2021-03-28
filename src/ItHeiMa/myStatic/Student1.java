package ItHeiMa.myStatic;

/**
 * Created by Administrator on 2020/2/18 0018.
 * static访问特点
 */
public class Student1 {
    //非静态成员变量
    private String name = "林青霞";
    //静态成员变量
    private static String university = "传智大学";

    //非静态成员方法
    public void show1() {

    }

    //非静态成员方法
    public void show2() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }

    //静态成员方法
    public static void show3() {

    }

    //静态成员方法
    public static void show4() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show3();
    }
}
