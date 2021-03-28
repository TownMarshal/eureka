package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 以类的方式组织代码，以对象的方式组织数据
 */
public class Student1 {

    String name;
    int id;

    public Student1(String name, int id) {
        this(name);//通过this调用其他构造方法，必须位于第一句
        this.name = name;
        this.id = id;
    }

    public Student1(String name) {
        this.name = name;
    }

    public Student1() {
        System.out.println("构造爱一个对象");
    }

    public void setName(String name) {
        this.name = name;
    }
}
