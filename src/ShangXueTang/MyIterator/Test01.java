package ShangXueTang.MyIterator;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //通过索引遍历List,以下方法只适用于List，不适合Set，因为Set是无序的
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //通过迭代器遍历List
        for(Iterator iterator2 = list.iterator();iterator2.hasNext();){
            String s = (String) iterator2.next();
            System.out.println(s);
        }

        Set set=new HashSet();
        set.add("高1");
        set.add("高2");
        set.add("高3");
//通过索引遍历Set
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()){
//            String s = (String) iterator.next();
//            System.out.println(s);
//        }
//通过迭代器遍历Set
        for(Iterator iterator = set.iterator();iterator.hasNext();){
            String s = (String) iterator.next();
            System.out.println(s);
        }

    }
}
