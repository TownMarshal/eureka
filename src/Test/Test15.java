package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题15
 * Test15（Addition）
 * 构造方法和重载、包 编写Addition类 该类中应包含一组实现两数相加运算的重载方法。
 * 实现加法运算的方法 应接受两个参数 即加数和被加数 方法将两个参数进行加减运算 返回相加结果。
 * 考虑可能针对不同的数据类型进行计算 重载一组方法 包含整型、长整型、浮点型、双精度浮点型、还有字符串。
 * 在main()方法中创建Addition类的实例 分别调用重载方法测试其结果。
 * 应将Addition类打入到包中 以自己的名字的拼音为包名。
 * D:\code> javac -d . Test15.java
 * D:\code>java ren.shuai.Test15
 * 帅哥1233333
 */
public class Test15{
    public int add(int a,int b){
        return a + b;
    }
    public float add(float a,int b){
        return a + b;
    }
    public double add(double a,int b){
        return a + b;
    }
    public double add(double a,long b){
        return a + b;
    }
    public String add(String a,int b){
        return a + b;
    }
    public static void main(String[]args){
        Test15 a = new Test15();
        String str = a.add("帅哥",1233333);
        System.out.println(str);

    }
}