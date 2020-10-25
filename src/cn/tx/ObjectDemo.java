package cn.tx;

/**
 * Created by Administrator on 2020/2/11 0011.
 * Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接等或间接继承自该类
 * 看方法的源码，选中方法，ctrl+b
 * 建议所有子类重写此方法
 * toString方法
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("唐帅");
        s.setAge("20");
        System.out.println(s);
        //System.out.println(s.toString());

        Student s1 = new Student();
        s1.setName("唐棋");
        s1.setAge("40");

        Student s2 = new Student();
        s1.setName("唐棋");
        s1.setAge("40");

        System.out.println(s1.equals(s));
        System.out.println(s1.equals(s2));


    }
}
