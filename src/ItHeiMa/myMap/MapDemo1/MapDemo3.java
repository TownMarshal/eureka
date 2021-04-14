package ItHeiMa.myMap.MapDemo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2020/2/18 0018.
 * Map集合的获取功能：
 *         V get(Object key):根据键获取值
 *         Set<K> keySet():获取所有键的集合
 *         Collection<V> values():获取所有值的集合
 */
public class MapDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //V get(Object key):根据键获取相对应的值
        System.out.println(map.get("张无忌"));
        //获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        //获取所有值得集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

    }
}
