package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 * /**
 *          JAVA基本数据类型转换
 */
public class Demo4 {
    public static void main(String[] args) {
            //定义一个字节类型
            byte b=1;
            //基本数据类型在进行计算的时候，数值常量默认是int；
            int b1=b+1;
            short b2=12;
            //byte,short,int,char四种类型只要发生计算都会自动的把结果提升到int类型；
            int b3=b+b2;

            //定义一个char类型，字符和int类型可以自动的转换；
            char c='a';
            //int i2=c;
            int i1=c+1;
            System.out.println(i1);

            //如果两个int类型计算会不会自动的提升类型呢？
            int x=2147483647;
            int y=12;
            //int,long,float,double计算的时候没有类型的提升；
            int z=x+y;
            System.out.println(z);
            //int,long,float,double不同的类型来计算的时候没有类型的会向更大的表数范围提升；

            float f=1.3f;
            //int类型和float类型计算转换成float类型
            float f1=f+y;
            //小数的常量的默认值是double类型
            double d=f+1.3;
            double d1=12.3f;
            double d2=y;
            short s=5;
            //大的表数范围的值不能自动的赋值小的表数范围的变量
            //byte short int long float double char boolean
            //s=s+5;
        }
}
