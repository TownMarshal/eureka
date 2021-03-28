package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 */
public class test2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "唐帅";
        s1.age = 22;

        Computer c = new Computer();
        c.brand = "联想";
        c.cpuSpeed = 11;

        s1.computer = c;
        c.brand="戴尔";
        System.out.println(s1.computer.brand);
    }
}
