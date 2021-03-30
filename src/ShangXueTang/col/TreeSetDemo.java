package ShangXueTang.col;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Person p1=new Person("糖水",100);
        Person p2=new Person("唐宁",50);
        Person p3=new Person("唐琪",70);
        Person p4=new Person("唐的",1000);

        TreeSet<Person> persons=new TreeSet<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);



    }
}
