package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题13（）
 * 抽象类、继承、接口综合：
 * 设计一个系统 XXX门的实现过程流程
 * 设计一个抽象的门Door 那么对于这张门来说 就应该拥有所有门的共性
 * 开门openDoor()和关门closeDoor() 然后对门进行另外的功能设计，
 * 防盗theftproof() 防水waterproof() 防弹bulletproof() 防火fireproof()
 * 防锈 rustproof()
 * 要求利用继承、抽象类、接口的知识设计该门
 */
interface Door{
    public void openDoor();
    public void closeDoor();

}
abstract class AbsDoor implements Door{
    String brand;
    double price;
    public final void windproof(){
        System.out.println("这扇门有防风的功能");
    }
    public abstract void lock();
}
class TheftDoor extends AbsDoor{
    public void lock(){
        System.out.println("反锁十道门槛");
    }
    public void openDoor(){
        System.out.println("指纹开门");
    }
    public void closeDoor(){
        System.out.println("直接关闭");
    }
    //防盗功能
    public void theftproof(){
        System.out.println("我是一扇防盗门，正在保护中");
    }

}
class BulletDoor extends AbsDoor{
    public void lock(){
        System.out.println("反锁200道");
    }
    public void openDoor(){
        System.out.println("升上去开门");
    }
    public void closeDoor(){
        System.out.println("降下来关门");
    }
    //防弹功能
    public void bulletproof(){
        System.out.println("我是一扇防弹门，正在防弹中");
    }

}
public class Test13 {
    public static void main(String[] args) {
        //创建一个防盗门
        TheftDoor d = new TheftDoor();
        d.brand = "熊猫";
        d.price = 200.0;
        d.closeDoor();
        d.windproof();
        d.theftproof();
        d.lock();
        d.openDoor();
        System.out.println("-------------------------------");
        BulletDoor d1 = new BulletDoor();
        d1.brand = "唐门";
        d1.price =15135.0;
        d1.closeDoor();
        d1.windproof();
        d1.bulletproof();
        d1.lock();
        d1.openDoor();

    }

}
