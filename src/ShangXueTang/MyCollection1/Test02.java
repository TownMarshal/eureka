package ShangXueTang.MyCollection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 一个Map对象记录一行数据
 */
public class Test02 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("id",2020);
        map.put("name","唐帅");
        map.put("department","项目部");
        map.put("hireDate","2020-2");

        Map map1=new HashMap();
        map1.put("id",2022);
        map1.put("name","唐棋");
        map1.put("department","组织部");
        map1.put("hireDate","2020-3");

        Map map2=new HashMap();
        map2.put("id",2024);
        map2.put("name","唐rr");
        map2.put("department","组织部");
        map2.put("hireDate","2020-3");

        List<Map> list=new ArrayList<Map>();
        list.add(map);
        list.add(map1);
        list.add(map2);

        printEmpName(list);
    }

    private static void printEmpName(List<Map> list) {
        for (int i = 0; i < list.size(); i++) {
            Map map = list.get(i);
            System.out.println(map.get("name"));
        }

    }


}
