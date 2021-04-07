package ShangXueTang.MyJuc.unsafe;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//java.util.ConcurrentModificationException 并发修改异常
public class ListTest {
    public static void main(String[] args) {
        //并发下，ArrayList是不安全的,解决方案1.将ArrayList换为 Vector
//      List<String> list1 = new ArrayList<>();
//      List<String> list1 = new Vector<>();

        //CopyOnWrite写入时复制 COW 计算机设计领域的一种优化策略
        //多了线程调用的时候，list,读取的时候，固定的写入（覆盖）
        //在写入的时候，避免覆盖，造成数据问题，读写分离
        //CopyOnWriteArrayList比Vector厉害在哪里，只要有synchronized ()方法相对来讲就效率低
        List<String> list1 = new CopyOnWriteArrayList<>(new ArrayList<>());

        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                list1.add(UUID.randomUUID().toString().substring(0, 5));
                System.out.println(list1);
            }, String.valueOf(i)).start();

        }
    }
}
