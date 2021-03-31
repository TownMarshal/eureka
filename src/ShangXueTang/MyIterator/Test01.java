package ShangXueTang.MyIterator;

import java.util.*;

/**
 * 1.迭代器：
 * 1）java.utils.Iterator+hasNext() next() remove()
 * 2)foreach:java.lang.Iterable+iterator()
 * 2.比较器
 * 1）实体类可以排序：java.lang.Comparable+compareTo
 * 2)排序比较器：（解耦，多种排序规则） java.util.Comparator+compare
 *List+Collections.sort();
 * TreeSet,TreeMap
 * 3.泛型类<>泛型类，泛型方法，泛型接口，泛型擦除通配符 ？extends super 泛型嵌套</>
 * 六个接口：Collections Set List Map Iterator Comparable
 * ArrayList  HashSet HashMap 添加，修改，删除，查看，遍历
 * ArrayList数组：查看多于修改
 * add(元素) add(索引，元素) remove（元素） remove(索引) set (索引，元素) get(索引)
 * for+get foreach()Iterator ListIterator
 HashSet 重写hashcode +equals
 add(元素) remove（元素）
 foreach ()Iterator
 TreeSet    元素可以排序或者提供排序的业务类
 HashMap 键不能重复 必须重写hashcode 和equals
 put(k,v) get(k)remove(k)containsKey containsValue

 *
 *
 */

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
