package Demo;
import java.util.ArrayList;
import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("唐");
        s.add("帅");
        s.add("嘴");
        s.add("帅啊");
        s.add(4,"王");
        s.remove(5);
        System.out.println(s);
        System.out.println(s.size());

    }





}
