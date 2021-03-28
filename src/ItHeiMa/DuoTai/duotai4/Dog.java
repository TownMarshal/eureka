package ItHeiMa.DuoTai.duotai4;

/**
 * Created by Administrator on 2020/2/14 0014.
 */
public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
