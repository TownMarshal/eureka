package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 以类的方式组织代码，以对象的方式组织数据
 */
public class Student {
    static int ss;
    public  static void printss(){
        System.out.println(ss);
    }


    String name;
     int id;
     int age;
    String gender;
    int weight;

    Computer computer;
    private void study(){
        System.out.println(name+"在学习");
    }
    private   void sayHello(String sname){
        System.out.println(name+"向"+sname+"说你好");
    }

    public static void main(String[] args) {
        Student s=new Student();
        s.name="唐帅";
        s.study();
        s.sayHello("王五");

        Student s1=new Student();
        s1.name="老唐";
        s1.study();
        s1.sayHello("老赵");
    }
}
