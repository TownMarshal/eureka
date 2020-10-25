package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
/**
 设计模式：一共有23种设计模式，设计模式就是有经验的前人通过实践总结下来被大家公认的代码设计思想。
 单例模式：（举例：ctrl+alt+delete打开任务管理器，只能打开一个任务管理器，我们就叫他单例模式，相应的，网页就可以打开很多）
 步骤：
 1.私有化构造器
 2.定义一个类方法用于获得单例的对象,返回值是这个类的类型
 3.在类中提供一个Singleton类型的类属性
 4.实现getInstance这个方法
 */
class Singleton{
    private static  Singleton s;

    private Singleton(){

    }
    //懒汉模式，不调用不会初始化，调用时才开始初始化
    public static Singleton getInstance(){
        if(s==null){
            s=new Singleton();
        }
        return s;
    }
}
public class Demo41 {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s);

        Singleton s1 = Singleton.getInstance();
        System.out.println(s1);

        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);

        Singleton s3 = Singleton.getInstance();
        System.out.println(s3);

    }
}