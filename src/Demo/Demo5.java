package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo5 {
    public static void main(String[] args) {
        /**
         JAVA基本数据类型的强制转换
         */
            int i=999;
//数值类型转换的前提是精度不会损失
            byte b=(byte)i;
            System.out.println(b);

//定义long类型
            long l=10000;
            int j=(int)l;
            System.out.println(j);

//小数类型的转换
            float f=1.3f;
//转换成int，小数转换成整数，就是去掉小数
            short i1=(short)f;
            System.out.println(i1);

//double向float类型转换
            double d=10.4;
            float f1=(float)d;
            System.out.println(f1);

//字符的转换
            char c='a';
            int x=c;
            System.out.println(x);

            int y=98;
            char c1=(char)y;
            System.out.println(c1);

        }
}
