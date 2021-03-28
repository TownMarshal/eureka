package ShangXueTang.MyAbstract;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 抽象方法抽象类
 * 通过抽象类避免子类的随意性，严格设计子类（必须重写父类方法）
 */
public  abstract class Animal {
    private String name;
    public abstract void    run();
    public void bresth(){
        System.out.println("呼吸");
        run();
    }

}

class Cat extends Animal{
    @Override
    public void run(){
        System.out.println("猫步小跑");
    }
}
class Dog extends Animal{
    @Override
    public void run(){
        System.out.println("狗刨，游泳   ");
    }
}
