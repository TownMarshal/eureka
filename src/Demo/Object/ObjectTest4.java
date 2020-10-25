package Demo.Object;

/**
 * Created by Administrator on 2020/2/15 0015.
 */
/**
 equals 的重写
 */
public class ObjectTest4{
    public static void main(String[]args){
        int i = 10;
        int j = 10;
        System.out.println(i == j);
        Student s = new Student();
        s.sNo = 1;
        s.name = "帅哥";
        s.age = 25;

        Student s1 = new Student();
        s1.sNo = 1;
        s1.name = "帅哥";
        s1.age = 25;
        //System.out.println(s == s1);
        //boolean equals(Object obj)
        boolean e = s.equals(s1);
        System.out.println(e);

    }
}