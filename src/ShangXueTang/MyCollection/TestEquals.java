package ShangXueTang.MyCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 如果equals为true，则hashcode一定相等，但是，，如果hashcode相等，那么equals不见得相等
 */

public class TestEquals {
    public static void main(String[] args) {
        List list=new ArrayList();
        String s1=new String("aaa");
        String s2=new String("aaa");
        list.add(s1);
        list.add(s2);
        System.out.println(list.size()  );


        Map map=new HashMap();
        //键不能重复
        map.put(s1,"aaaaa");
        map.put(s2,"bbbbbb");
        System.out.println(map.get("aaa"));//s2就把s1覆盖了  2   bbbbbb

        System.out.println("================================================");
        List list1=new ArrayList();
        Integer s3= new Integer(233);
        Integer s4= new Integer(233);

        list.add(s3);
        list.add(s4);
        System.out.println(list.size()  );


        Map map1=new HashMap();
        //键不能重复
        map.put(s3,"aaaaa");
        map.put(s4,"bbbbbb");
        System.out.println(map.get(233));//s2就把s1覆盖了  2   bbbbbb




    }
}
