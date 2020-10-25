package Test.aaatang;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    通过反射实现如下的操作：
        Student s = new Student("林青霞");
        System.out.println(s);
        "computer.myReflect.ReflectDemo.Student"
 */
public class ReflectDemo03111111111111111 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> declaredConstructor = Class.forName("computer.myReflect.ReflectDemo.Student").getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance("林青霞");
        System.out.println(o);

    }
}
