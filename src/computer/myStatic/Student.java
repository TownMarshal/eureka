package computer.myStatic;

/**
 * Created by Administrator on 2020/2/18 0018.
 */
public class Student {
    public String name; //姓名
    public int age; //年龄
    //    public String university; //学校
    public static String university; //学校

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}
