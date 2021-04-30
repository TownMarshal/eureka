package ItHeiMa.myCollestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo02 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1","aaa");
        map.put("2","bbb");
        map.put("3","ccc");

        //迭代遍历Map集合的第一种方式
        Set set = map.keySet();
        for (Object o : set) {
            String key = (String) o;
            String value = (String) map.get(key);
            System.out.println(key + "=" + value);
        }

        //增强型for循环遍历Map集合

        for(Object obj : map.keySet()) {
            String key = (String) obj;//取到每一个key值
            String value = (String) map.get(key);
            System.out.println(key + "=" + value);
        }

        //增强型for循环遍历Map集合

        for(Object obj : map.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + "=" + value);
        }




    }
}
