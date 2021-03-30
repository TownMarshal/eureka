package ShangXueTang.MyCollection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map =new HashMap<Integer,String>();
        map.put(1, "xiao");
        map.put(2, "chao");
        map.put(3, "shang");
        map.put(4, "xue");
        //方法一
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println("方法一：key ="+entry.getKey()+"---value="+entry.getValue());
        }

        //方法二
        for(Integer key:map.keySet()) {
            System.out.println("方法二：key = "+key);
        }

        for(String value:map.values()) {
            System.out.println("方法二：value = "+value);
        }
        //方法三
        Iterator<Map.Entry<Integer,String>> entries = map.entrySet().iterator();
        while(entries.hasNext()) {
            Map.Entry<Integer,String> entry = entries.next();
            System.out.println("方法三：key = "+entry.getKey()+"--value="+entry.getValue());
        }

        //方法四
        for(Integer key:map.keySet()) {
            String value = map.get(key);
            System.out.println("方法四：Key = " + key + ", Value = " + value);
        }
    }

}
