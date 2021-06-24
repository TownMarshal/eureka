package ItHeiMa.myMap.MapDemo3;

import java.util.HashMap;
import java.util.Set;

public class mapdemo {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("财务", "李会计");
        map.put("教务", "王会计");
        map.put("计算机", "张会计");
        StringBuilder sb = new StringBuilder();
        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Object o = map.get(s);
            sb.append("[").append(s).append(",").append(o).append("]");
        }
        System.out.println(sb);
    }
}
