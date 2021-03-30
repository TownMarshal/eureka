package ShangXueTang.MyCollection;
import java.util.*;

/**
 * Map:存放键值对，根据键对象找对应的值对象，键不能重复
 * Set:无序，不可重复
 */

public class MyMap {
    public static void main(String[] args) {
        Map<String,Object> map =new HashMap<String,Object>();
        map.put("高企",new Wife("王晶晶"));
        map.put("高味儿",new Wife("王晶额"));
        map.put("张三",new Wife("王五"));

        Wife w = (Wife) map.get("高企");
        map.remove("高企");
        System.out.println(w.name);
        System.out.println(map.containsKey("张三"));




    }
}
class Wife{
    String name;
    public Wife(String name){
        this.name=name;
    }
}
