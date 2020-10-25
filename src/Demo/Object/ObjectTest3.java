package Demo.Object;

/**
 * Created by Administrator on 2020/2/15 0015.
 */
/**
 toString 的重写
 */


public class ObjectTest3{
    public static void main(String[]args){
        Student s = new Student();
        s.sNo = 20142238;
        s.name = "帅哥";
        s.age = 24;
        System.out.println(s);
        System.out.println("----------------------------------------");
        System.out.println(s.toString());
    }
}