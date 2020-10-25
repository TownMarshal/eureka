package Test.aaatang;

import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作：
        Student s = new Student("林青霞",30,"西安");
        System.out.println(s);
        computer.myReflect.ReflectDemo.Student
 */
public class ReflectDemo02111111111111 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object o = Class.forName("computer.myReflect.ReflectDemo.Student").getConstructor(String.class, int.class, String.class).newInstance("林青霞",30,"西安");
        System.out.println(o);
    }
}
