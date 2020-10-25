package computer.DuoTai.duotai1;

/**
 * Created by Administrator on 2020/2/14 0014.
 * 多态
 * 同一个对象，在不同的时刻表现出来的不同形态
 * 举例：猫
 * 我们可以说猫是猫，猫cat= new猫();
 * 我们也可以说猫是动物，动物animal= new猫();
 * 这里猫不同的时刻表现出来了不同的形态，这就是多态
 *
 * 多态的前提和体现
 * 有继承/实现关系
 * 有方法重写
 * 有父类引用指向子类对象
 *
 */
public class AnimalDemo {
    public static void main(String[] args) {
        //有父类引用指向子类对象
        Animal a = new Animal();

    }
}
