package ShangXueTang.MySort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  使用Collections对容器的比较
 *  * 1、 public static <T> void sort(List<T> list, Comparator<? super T> c)
 *  * 2、public static <T extends Comparable<? super T>> void sort(List<T> list)
 *  * void sort(List<T> list)
 *  * @author Administrator
 *  *
 */
public class MySort05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("abcd");
        list.add("abc");
        list.add("def");
        Collections.sort(list, new StringComp());
        System.out.println(list);


        list = new ArrayList<String>();
        list.add("a");
        list.add("abcd");
        list.add("abc");
        list.add("def");
        Collections.sort(list);
        System.out.println(list);


    }
}



