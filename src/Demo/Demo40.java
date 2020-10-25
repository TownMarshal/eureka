package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */

/**
 * 1.静态代码块：主要用于初始化资源
 * 2.静态代码块在main之前执行
 * 3.静态代码块可以访问范围类属性(类属性必须先定义)和类方法
 */
public class Demo40 {
    //类属性
    static int age;

    //静态代码块不能访问对象属性和对象方法
    static {
        System.out.println("静态代码块执行");
        System.out.println(age);
        method1();
    }

    public static void method1(){
        System.out.println("方法一被静态方法调用了！");
    }

    public static void main(String[]args){
        System.out.println("主方法执行");
    }
}
