package cn.tx.homework;

/**
 * Created by Administrator on 2019/12/4 0004.
 * 22.打印一个人的正常信息，年龄不能是0-200之间，自定义编译期异常
 */
public class Demo4 {
    public static void main(String[] args) {
        try {
            Person p = new Person("帅哥",18);
            System.out.println(p);
        } catch (ValidPersonException e) {
            e.printStackTrace();
        }

    }

}
