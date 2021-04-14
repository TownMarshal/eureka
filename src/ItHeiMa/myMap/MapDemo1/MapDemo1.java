package ItHeiMa.myMap.MapDemo1;

/**
 * Created by Administrator on 2020/2/18 0018.
 * Map集合概述
 *         Interface Map<K,V>	K：键的类型；V：值的类型
 *         将键映射到值的对象；不能包含重复的键；每个键可以映射到最多一个值
 *         举例：学生的学号和姓名
 *               itheima001	林青霞
 *               itheima002	张曼玉
 *               itheima003	王祖贤
 *
 *     创建Map集合的对象
 *         多态的方式
 *         具体的实现类HashMap
 */
import ItHeiMa.Sys;

import java.util.HashMap;
import java.util.Map;
public class MapDemo1 {

public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("001","电信");
    map.put("002","祖安");
    map.put("003","网通");
    System.out.println(map);

}
}


