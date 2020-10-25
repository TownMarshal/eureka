package computer.DuoTai.duotai4;

/**
 * Created by Administrator on 2020/2/14 0014.
 */
public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
