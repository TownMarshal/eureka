package cn;

import ItHeiMa.myMap.MapDemo3.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2020/2/18 0018.
 * 需求：
 *         创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历
 *
 *     思路：
 *         1:定义学生类
 *         2:创建HashMap集合对象
 *         3:创建学生对象
 *         4:把学生添加到集合
 *         5:遍历集合
 *             方式1：键找值
 *             方式2：键值对对象找键和值
 */
public class HashMapDemo {
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

        Set<String> keys = hm.keySet();
        for (String key : keys) {
            Student student = hm.get(key);
            System.out.println(key+student.getName()+student.getAge());
        }


    }
}
