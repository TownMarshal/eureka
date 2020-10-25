package Demo.Object;

/**
 * Created by Administrator on 2020/2/15 0015.
 */

public class ObjectTest2{
    public static void main(String[]args)throws Exception{
        // Class c = Class.forName("student");
        Student s = new Student();

        //调用从父类里面继承下来的getCLass()方法获得类的对象
        Class c = s.getClass();
        System.out.println(c.getName());
    }
}