package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
    class Girl{
    String name;
    int age;
    String tel;
    public void introduce(){
        System.out.println("我的名字是"+name+"我的电话是"+tel+"我芳龄"+age);

    }
}
public class Demo33 {
    public static void main(String[] args) {
        Girl g=new Girl();
        g.name="晓丽";
        g.age=24;
        g.tel="17854257144";
        System.out.println(g.name);
        System.out.println(g.age);
        System.out.println(g.tel);
    }
}
