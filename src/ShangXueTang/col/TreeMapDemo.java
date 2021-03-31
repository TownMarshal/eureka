package ShangXueTang.col;

import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * TreeSet在使用过程中不要修改数据，否则会可能重复
 * 解决办法：给实体类加final修饰符
 */

public class TreeMapDemo {
    public static void main(String[] args) {
        Person p1=new Person("唐",100);
        Person p2=new Person("唐宁",50);
        Person p3=new Person("唐琪",70);
        Person p4=new Person("唐的",1000);

        //依次存入TreeSet容器中，使用排序的业务类（匿名内部类）
        //比较器的使用
        TreeMap<Person,String> map=new TreeMap<>(new java.util.Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getHandsome() - o2.getHandsome();
            }
        });

        map.put(p1,"唐帅");
        map.put(p2,"唐帅");
        map.put(p3,"唐帅");
        map.put(p4,"唐帅");

        //查看键
        Set<Person> set = map.keySet();
        System.out.println(set);


    }
}
