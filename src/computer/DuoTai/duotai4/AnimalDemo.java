package computer.DuoTai.duotai4;

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
        //创建猫类对象进行测试
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

        a = new Cat("加菲", 5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();

    }
}
