package ItHeiMa.myCollestions;

import java.util.ArrayList;
import java.util.Collection;

public class demo01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        for (Object o : c) {
            System.out.println(o);
        }

    }

}
