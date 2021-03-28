package ItHeiMa;

/**
 * Created by Administrator on 2020/2/13 0013.
 * 1.定义学生类
 * 2.创建集合对象
 * 3.创建学生对象
 * 4.添加学生对象到集合中
 * 5.遍历集合，采用通用遍历格式实现
 */
public class Student {
    private String name;
    private String age;
    //构造方法
    public Student(){}

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
