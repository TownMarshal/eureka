package ItHeiMa.myMap.MapDemo2;

/**
 * Created by Administrator on 2020/2/18 0018.
 *  Map集合的遍历(方式2):
 *         1:获取所有键值对对象的集合
 *             Set<Map.Entry<K,V>> entrySet()：获取所有键值对对象的集合
 *         2:遍历键值对对象的集合，得到每一个键值对对象
 *             用增强for实现，得到每一个Map.Entry
 *         3:根据键值对对象获取键和值
 *             用getKey()得到键
 *             用getValue()得到值
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"==========="+entry.getValue());
        }

        System.out.println("==================================================================");
        //会打印三个一样的集合
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entries);
        }


    }
}
