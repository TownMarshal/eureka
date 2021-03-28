package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 */
public class TestObject {
    public static void main(String[] args) {
        Object o=new Object();
        Object o1=new Object();
        System.out.println(o.toString());
        System.out.println(o1.toString());
        System.out.println(o==o1);
        System.out.println(o.equals(o1));

        Student student = new Student();
        System.out.println(student.toString());
    }


}
