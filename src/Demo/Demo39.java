package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
/**
 static关键字在方法上(类方法)
 类方法的特点：
 1.类方法的访问可以通过 类名.类方法，还可以通过对象来访问
 2.类方法的当前class文件加载进入jvm类方法就被初始化，jvm执行完毕Student.class文件出了jvm，类方法也就消失了
 3.对象方法和类方法都是被对象共享。类方法初始化很杂，jvm加载到这个类的时候，这个方法就初始化了。
 对象方法也是早早就进入了jvm了，但是不一定就启用了，只有先创建了对象，才有可能使用这个方法。
 4.类方法不能访问对象属性和对象方法（类方法只能访问类属性和类方法）。
 5.对象方法可以访问所有对象属性、对象方法、类属性、类方法。
 6.类方法最常见的应用场景就是工具类的定义。
 */
class Student1{
    String name;
    int age;
    int sNo;
    static int scount;
    public void learn(){
        System.out.println(name+"在学习");
    }
    public static int getScount(){
        return scount;
    }
}
public class Demo39 {
    public static void main(String[] args) {
        System.out.println(Student1.getScount());
        Student1 s=new Student1();
        int scount=s.getScount();
        System.out.println(scount);
    }
}
