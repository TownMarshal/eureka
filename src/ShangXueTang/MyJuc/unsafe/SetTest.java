package ShangXueTang.MyJuc.unsafe;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetTest {
    public static void main(String[] args) {
        //HashSet的底层就是一个HashMap
        //add set本质就是map key是无法重复的
        //java.util.ConcurrentModificationException
        //解决方案一
         Set<String> set =   Collections.synchronizedSet(new HashSet<String>()) ;
        for (int i = 1; i <= 20; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set);
            },String.valueOf(i)).start();
        }

        System.out.println("==============================================");
        //解决方案二
        CopyOnWriteArraySet set2 =new  CopyOnWriteArraySet();
        for (int i = 1; i <= 20; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set);
            },String.valueOf(i)).start();
        }



    }
}
