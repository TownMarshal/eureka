package ShangXueTang.function;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class test6 {



    public static void main(String[] args) {
//        ArrayList<Object> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        for (Object o : list) {
//            System.out.println(o);
//        }
//        System.out.println("=========================================");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        HashSet<Object> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        for (Object o : set) {
            System.out.println(o);
        }

//        Iterator<Object> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }

}
