package ShangXueTang.MyCollection;

import java.util.*;

/**
 * collection容器
 * ArrayList插入和修改效率比较低，但是查询，遍历效率比较高
 * LinkedList插入，修改，删除快，查询慢
 * Vector:线程安全，效率低，前面两个，线程不安全，效率高
 *
 * jdk1.8之后：
 * 1.ArrayList初始集合不初始化数组容量的时候，默认值为0
 * 2.添加元素后，扩容为10，之后每次扩容为原来的0.5倍
 * List:有序，可重复
 * Set:无序，不可重复
 */

public class MyList {
    public static void main(String[] args) {
        List l=new ArrayList();//右边实现类，左边是接口，多态写法

        l.add("aaa");
        l.add(new Date());////java.util.Date cannot be cast to java.lang.String
        l.add(new dog());
        l.add(123);

        System.out.println(l.size());
//        System.out.println(l.isEmpty());
//        l.remove(123);//java.lang.IndexOutOfBoundsException: Index: 123, Size: 4
//        l.remove("aaa");//hashcode和equals
        System.out.println(l.size());
        System.out.println("=============================");
        List l2=new ArrayList();
        l2.add("ccc");
        l2.add("ddd");
        System.out.println(l2.size());
        System.out.println("=================================");

        l.add(l2);//add操作4 2 5 为什么两个ArrayList相加长度减一
        System.out.println(l.size());

        //跟顺序的操作
        String str= (String) l.get(0);
        System.out.println(str);
        l.set(1,"alibaba");
        l.remove(0);
        System.out.println(l.size());

    }
}
class dog{
    String name;
    int age;

}
