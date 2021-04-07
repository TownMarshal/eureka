package ShangXueTang.MyJuc.ReadWriteLock;

import java.util.HashMap;
import java.util.Map;

public class ReadWriteLockDemo {
    public static void main(String[] args) {
        MyCache myCache=new MyCache();
        //写入操作
        for (int i = 1; i <= 5; i++) {
            final int temp=i;
            new Thread(()->{
        myCache.put(temp+"",temp+"");
            },String.valueOf(i)).start();
        }

        //读取操作
        for (int i = 1; i <= 5; i++) {
            final int temp=i;
            new Thread(()->{
                myCache.get(temp+"");
            },String.valueOf(i)).start();
        }

    }

}
class MyCache{
    private volatile Map<String,Object> map=new HashMap<>();
    //存,写
    public void put(String key,Object value){
        System.out.println(Thread.currentThread().getName()+"写入"+key);
        map.put(key,value);
        System.out.println(Thread.currentThread().getName()+"写入成功"+key);

    }
    //取,读
    public void get(String key){
        System.out.println(Thread.currentThread().getName()+"读取"+key);
        Object o = map.get(key);
        System.out.println(Thread.currentThread().getName()+"读取成功"+key);

    }
}