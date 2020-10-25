package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
/**
 java中java.lang下面的多有类都不需要引入，可以直接来使用
 Math类
 自然对数：Math.E
 圆周率：Math.PI
 绝对值：Math.abs(-1.3)
 把小数去掉整数加一：Math.ceil(12.3)
 把小数位舍弃：Math.floor(122.3)
 比较两个数的大小：Math.max(12.3,66)
 比较两个数的大小：Math.min(12.3,6)
 计算某个数的n次幂：Math.pow(3,3)
 四舍五入：Math.round(4,5)
 开平方：Math.sqrt(16)
 */
public class Demo42 {
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);

        double r1 = Math.abs(-1);
        System.out.println("绝对值是"+r1);

        double r2 = Math.ceil(12.3);
        System.out.println("ceil向上取整"+r2);

        double r3 = Math.floor(12.3);
        System.out.println("floor向下取整"+r3);

        int r4 = Math.max(2,5);
        System.out.println("求最大值"+r4);

        int r5 = Math.min(2,5);
        System.out.println("求最小值"+r5);

        double r6 =Math.pow(3,2);
        System.out.println("3的2次幂"+r6);

        long r7 = Math.round(1.3);
        System.out.println("四舍五入"+r7);

        double r8 =Math.sqrt(16);
        System.out.println("16开平方"+r8);
    }
}
