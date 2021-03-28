package ItHeiMa;

/**
 * Created by Administrator on 2020/2/12 0012.
 * 基本类型包装类                           int 和String的相互转换
 *  * 场景：我们要判断一个数是否在int范围内?
 *  *
 *  * Integer对象
 *  * 构造方法：
 *  * 静态方法获取对象
 *  *
 *  * int 和String的相互转换
 */
public class StringInteger {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        /*
        Integer i1 = new Integer(100);
        System.out.println(i1);
        Integer i2= new Integer("100");
        System.out.println(i2);
        */

        //Integer i3 = new Integer("abc");NumberFormatException
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);

        Integer i2 = Integer.valueOf("100");
        System.out.println(i2);

        //Integer i3 = Integer.valueOf("abc");
        // System.out.println(i3);

        //int转为String
        int num = 100;
        //方式1
        String s1 = ""+num;
        System.out.println(s1);
        //方式2
        String s2 = String.valueOf(100);
        System.out.println(s2);
        System.out.println("----------------");

        //String转为Integer再转为int
        //方式1
        String s = "100";
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方式2
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
