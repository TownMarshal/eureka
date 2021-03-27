package computer;

/**
 * Created by Administrator on 2020/2/11 0011.
 */
public class Sys {
    public static void main(String[] args) {
        /*
        //终止当前运行的Java虚拟机。
        //该参数作为状态代码; 按照惯例，非零状态码表示异常终止。
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");
        */
        /*
        public static long currentTimeMillis()返回当前时间（以毫秒为单位）。 请注意，虽然返回值的时间单位为毫秒，但该值的粒度取决于底层操作系统，并且可能较大。 例如，许多操作系统以几十毫秒为单位测量时间。
        有关“计算机时间”和协调世界时间（UTC）之间可能出现的轻微差异的讨论，请参阅类别Date的说明。

        结果
        在1970年1月1日UTC之间的当前时间和午夜之间的差异，以毫秒为单位。
        */
        //System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365+"年");
        long start = System.currentTimeMillis();


        for (int i = 0; i <10000; i++) {
            System.out.println(i);
        }
        long end= System.currentTimeMillis();
        System.out.println("耗时："+(end- start)+"毫秒");
    }
}
