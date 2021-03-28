package ItHeiMa;

/**
 * Created by Administrator on 2020/2/11 0011.
 */
public class Obc {
    public static void main(String[] args) {
        Stu s = new Stu();
        s.setName("唐帅");
        s.setAge(20);
        System.out.println(s);
        //System.out.println(s.toString());

        Stu s1 = new Stu();
        s1.setName("唐棋");
        s1.setAge(40);

        Stu s2 = new Stu();
        s2.setName("唐棋");
        s2.setAge(40);


        System.out.println(s.equals(s1));
        System.out.println(s1.equals(s2));



    }
}
