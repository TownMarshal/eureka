package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 内部类
 *  内部类格式：
 *         public class 类名{
 *               修饰符 class 类名{
 *
 *               }
 *         }
 *
 *     内部类访问特点：
 *         内部类可以直接访问外部类的成员，包括私有
 *         外部类要访问内部类的成员，必须创建对象
 */

public class TestInner{
    public static void main(String[]args){
        //创建内部类的对象 外部类.内部类 变量名 = new外部类对象.new内部类对象
        Outter.Inner inner = new Outter().new Inner();
        inner.innerNum = 13;
        inner.inMethod();
    }
}