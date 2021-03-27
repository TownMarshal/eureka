package computer.ArrayListDemo;

import computer.Student;

import java.util.ArrayList;

/**
 * Created by Administrator on 2020/2/13 0013.
 */
public class ArrayListStudent {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        //创建学生对象
        Student s1 = new Student("唐帅", "25");
        Student s2 = new Student("唐其", "23");
        Student s3 = new Student("唐您", "26");

        //添加学生对象到集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for  (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
