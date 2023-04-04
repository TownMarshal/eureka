package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */


/**
 * 局部变量(需要返回去学习)
 * //局部变量必须要在使用前给值
 * 	//定义在语句块内部的是局部变量
 * 	//静态代码块
 * 	//局部变量定义在方法中或语句块中
 */
public class Demo32 {
    static {
        int a = 13;
    }
    public static void main(String[] args) {
        int a=195;
        //p也是局部变量
        Person p=new Person();
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static void test(){
        //for循环也是一个语句块，i的使用范围在for的大括号内
        for(int i=0;i<12;i++){

        }
    }
    public static void test1(){
        {
            //普通语句块
            int b=13;
        }
    }
}
