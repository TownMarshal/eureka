package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 */
public class Animal {
    String eye;

    public void run() {
        System.out.println("跑");
    }
}
class mammal extends Animal {
    public void taisheng() {
        System.out.println("我是胎生");
    }

}
class bird extends Animal {
    String eye;
    //方法的重写
    @Override
    public void run() {
        super.run();
        System.out.println("小鸟飞啊飞");
    }

}
