package ShangXueTang;

import org.omg.PortableInterceptor.INACTIVE;

public class MyInteger {
    private int a = 123;
    private Integer i = 999;

    public static void main(String[] args) {
        Integer i=new Integer(122);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Integer.toHexString(i));

        Integer i2=Integer.parseInt("222");
        Integer i3=new Integer("223");
        System.out.println(i2.intValue());
        String s = 234 + "";
        System.out.println(s);

//        Integer a= new Integer(111);
//        Integer i=1;
//        int ii =i;
        Integer x = 1;
//        Integer i =null;//Exception in thread "main" java.lang.NullPointerException
        int y = x;//自动拆箱编译器改进 i.intvalue();
        System.out.println(x);

        Integer d = 1000;
        Integer f = 1000;
        System.out.println(d == f);
        System.out.println(d.equals(f));
        //-128~127之间的数仍然会当作基本数据类型处理，没有装箱拆箱过程
        System.out.println("===================");
        Integer d1 = -129;
        Integer f1 = -129;
        System.out.println(d1 == f1);
        System.out.println(d1.equals(f1));
    }
}

