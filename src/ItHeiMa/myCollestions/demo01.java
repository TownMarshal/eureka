package ItHeiMa.myCollestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        //返回在此collection的元素上进行迭代的迭代器
        for (Object o : c) {                            //集合中的迭代方法(遍历)
            System.out.println(o);
        }

    }

}
