package ShangXueTang.col;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 * TreeSet在使用过程中不要修改数据，否则会可能重复
 * 解决办法：给实体类加final修饰符
 */

public class TreeMapDemo1 {
    public static void main(String[] args) {
        Worker w1 = new Worker("垃圾回收员", 12000);
        Worker w2 = new Worker("农民", 1000);
        Worker w3 = new Worker("程序员", 5000);
        TreeMap<Worker,String> employees = new TreeMap();
        employees.put(w1,"asdasd");
        employees.put(w2,"asdasd");
        employees.put(w3,"asdasd");

        System.out.println(employees.keySet());

    }
}
