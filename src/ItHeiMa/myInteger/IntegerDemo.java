package ItHeiMa.myInteger;

/**
 * Created by Administrator on 2020/2/14 0014.
 * 装箱：把基本数据类型转换为对应的包装数据类型
 * 拆箱：把包装类类型转换为对应的基本数据类型
 */
public class IntegerDemo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转换为对应的包装数据类型
        Integer i = Integer.valueOf(1);
        Integer ii = 1;//Integer i = Integer.valueOf(100);

        //拆箱：把包装类类型转换为对应的基本数据类型
        //ii+=200;

        ii = ii.intValue() + 200;
        System.out.println(ii);
        ii += 200;
        System.out.println(ii);

        Integer iii = null;
        System.out.println(iii);
        if (iii != null) {
            iii += 300;
        }

    }
}
