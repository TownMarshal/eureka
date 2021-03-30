package ShangXueTang.MyCollection;
import ItHeiMa.myMap.MapDemo3.Student;
import java.util.HashMap;
import java.util.Set;

public class MyMapTest {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<String, Student> hm = new HashMap<String, Student>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);

        //把学生添加到集合
        hm.put("001", s1);
        hm.put("002", s2);
        hm.put("003", s3);
        //方式1：键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+value.getAge());
        }

    }
}
