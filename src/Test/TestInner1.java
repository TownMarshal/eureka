package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 */
class Outter{
    int num;
    public void outMethod(){
        System.out.println("外部类方法");
    }

    class Inner{
        int innerNum;
        public void inMethod(){
            System.out.println("内部类方法");
        }
        public void inMethod1(){
            //内部类的方法可以访问外部类的属性
            System.out.println(num);
            outMethod();
        }
    }

    public void method(){
        //创建内部类对象
        Inner i = new Inner();
        i.innerNum = 10;
        i.inMethod();
    }
}
public class TestInner1{
    public static void main(String[]args){
        Outter.Inner i = new Outter().new Inner();
        i.inMethod1();
    }
}