package ShangXueTang.col;

import java.util.TreeSet;

/**
 * TreeSet在使用过程中不要修改数据，否则会可能重复
 * 解决办法：给实体类加final修饰符
 */

public class TreeSetDemo1 {
    public static void main(String[] args) {
        Worker w1=new Worker("垃圾回收员",12000);
        Worker w2=new Worker("农民",1000);
        Worker w3=new Worker("程序员",5000);
        TreeSet<Worker>employees=new TreeSet<>();
        employees.add(w1);
        employees.add(w2);
        employees.add(w3);

        System.out.println(employees);

    }

}
