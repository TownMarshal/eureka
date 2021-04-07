package ShangXueTang.MyJuc.unsafe;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
        //map是这样用的吗 ？默认等价的什么？ 不是，工作不用这个，默认等价
//        HashMap<String, String> map = new HashMap<>(16,0.75);
//        HashMap<String, String> map = new HashMap<>();
         Map<String, String> map = new ConcurrentHashMap<>();
        //加载因子，初始化容量
        //java.util.ConcurrentModificationException
        for (int i = 0; i < 20; i++) {
            new  Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
