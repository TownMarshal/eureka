package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
/**
 类属性
 特点：
 1.类属性的访问可以通过 类名.类属性，还可以通过对象来访问。
 2.类属性的当前class文件家在进入jvm类属性就初始化
 3.类属性可以被这个类的每一个对象共享
 */
class Student{
    //对象属性
    String name;
    int age;
    int sNo;
    //学生的数量，类属性
    static int scount;

}

public class Demo38{
    public static void main(String[]args){
        Student s=new Student();
        System.out.println(Student.scount);
        System.out.println(s.scount);
        s.scount++;
        System.out.println(Student.scount);

    }
}