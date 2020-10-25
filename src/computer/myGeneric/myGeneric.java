package computer.myGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Administrator on 2020/2/17 0017.
 *   需求：Collection集合存储字符串并遍历
 */
public class myGeneric {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);

        //遍历集合
//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//            String s = (String)it.next(); //ClassCastException
            String s = it.next();
            System.out.println(s);
        }
    }
}
