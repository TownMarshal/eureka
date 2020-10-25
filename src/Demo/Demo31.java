package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
/**
 属性和方法，以及数据类型划分
 类里面的属性：
 属性就是这个类共有的特征，用变量定义的方式来表示，可以没有初始值，jvm给属性默认值。
 八种基本数据类型：                                默认值
 基本数据类型：整数类型：byte,short,int,long      0,0,0,0
 小数类型：float,double             0.0,0.0
 布尔数据类型：Boolean               false
 字符类型：char                      ' '
 引用数据类型： 数组                               null
 类                                 null
 接口                               null
 方法：（行为）
 狗的行为：
 public <static> 返回值类型 方法名（数据类型 参数名，数据类型，参数名..）{//方法体}
 return 返回值;
 */
class Dog{
    //名字，公母，品种
    String name;
    //1,公，2，母
    int gender;
    //品种
    String type;
    //体重
    double weight;
    public void sleep(){
        System.out.println(name+"狗在睡觉");
    }
    public void lookhome(){
        System.out.println(name+"狗在看家");
    }
}

public class Demo31 {
    public static void main(String[] args) {
        //创建一个对象，类名 变量=new类名();
        Dog dog=new Dog();
        //通过对象可以访问属性     引用.属性="";
        //把这只狗的属性赋值
        dog.name="毛毛";
        dog.gender=1;
        dog.type="秋田犬";
        dog.weight=10.0;
        //打印这些属性
        System.out.println(dog.name);
        System.out.println(dog.gender);
        System.out.println(dog.type);
        System.out.println(dog.weight);
//调用方法
        dog.lookhome();
        System.out.println("...................");
        Dog dog1=new Dog();
        dog1.name="花花";
        dog1.gender=2;
        dog1.type="金毛";
        dog1.weight=101.1;
        System.out.println(dog1.name);
        System.out.println(dog1.gender);
        System.out.println(dog1.type);
        System.out.println(dog1.weight);
        dog1.sleep();
    }
}
