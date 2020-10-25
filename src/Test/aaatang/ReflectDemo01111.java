package Test.aaatang;

import java.lang.reflect.InvocationTargetException;

/*
    反射获取成员变量并使用
 */
public class ReflectDemo01111 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(Class.forName("computer.myReflect.ReflectDemo.Student").getConstructor().newInstance());

    }
}
