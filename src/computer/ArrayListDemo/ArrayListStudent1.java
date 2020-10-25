package computer.ArrayListDemo;

import computer.Student;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/13 0013.
 * 场景：
 * 创建一个存储学生对象的集合，存储3个学生对象 ，使用程序在控制台遍历该集合
 * 学生的姓名和年龄来自于键盘录入
 * 思路：
 * 1.定义学生类，为了键盘录入方便，把学生类中的成员变量都定义为String类型
 */
public class ArrayListStudent1 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        addStudent(array);
        addStudent(array);
        addStudent(array);

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        array.add(s);
    }
}


