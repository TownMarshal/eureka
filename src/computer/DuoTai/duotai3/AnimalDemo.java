package computer.DuoTai.duotai3;

/**
 * Created by Administrator on 2020/2/14 0014.
 *向上转型
 *         从子到父
 *         父类引用指向子类对象
 *
 *     向下转型
 *         从父到子
 *         父类引用转为子类对象
 *
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //向上转型
        Animal a = new Cat();
        a.eat();

        //向下转型
        Cat c = (Cat) a;
        c.eat();
        c.playGame();

        //向上转型
        a = new Dog();
        a.eat();

        //向下转型
        //ClassCastException 类型转换异常
        Cat cc = (Cat) a;
        cc.eat();
        cc.playGame();
    }
}
