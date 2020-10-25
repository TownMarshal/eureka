package Demo;



/**
 * Created by Administrator on 2019/11/12 0012.
 */

/**
 this 关键字
 this关键字有两种用法，我们现在学的是第一种用法，以后构造器学第二种
 this关键字只能在对象方法内使用（重要）
 this就是调用方法的引用
 */
class Person{
    String name;
    int  age;
    //this=p
    public void PlayGame(){
        //System.out.println(this.name+"在玩游戏");
        System.out.println(name+"在玩游戏");
        //本类的对象方法可以直接调用对象方法，隐藏this，this就是调用PlayGame的p
        sleep();
    }
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
}
public class Demo35 {
    public static void main(String[] args) {
        //创建一个人的对象
        Person p=new Person();
        p.name="唐帅";
        //System.out.println(p);
        //通过对象来调用对象方法
        p.PlayGame();
        Person p1=new Person();
        p1.name="胡港";
        p1.PlayGame();
    }
}
