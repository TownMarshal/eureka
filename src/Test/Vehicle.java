package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题11
 * 构造方法的重载
 * 定义一个名为Vehicle交通工具 的基类 该类中应包含String类型的成员属性brand 商标 和color 颜色
 * 还应包含成员方法run 行驶 在控制台显示"我已经开动了"和showInfo 显示信息 在控制台 显示商标和颜色
 *  并编写构造方法初始化其成员属性。编写Car小汽车 类继承于Vehicle类 增加int行成员属性seats座位
 * 还应增加成员方法showCar 在控制台显示小汽车想的信息并编写构造方法。
 * 编写Truck卡车 类继承于Vehicle类 增加float型成员属性 load载重 还应增加方法showTruck在控制台显示卡车的信息
 * 并编写构造方法。在main方法中测试以上各类。
 */
public class Vehicle {
    //商标
    String brand;
    //颜色
    String color;
    public Vehicle(){

    }

    public Vehicle(String brand,String color){
        this.brand=brand;
        this.color=color;
    }
    public void run(){
        System.out.println("我已经启动了");
    }
    public void showInfo(){
        System.out.println("品牌是"+brand+"颜色"+color);
    }
}

class Car extends Vehicle{
    int seats;
    public Car(String brand,String color,int seats){
        super(brand,color);
        this.seats=seats;
    }
    public void showCar(){
        System.out.println("品牌是"+brand+"颜色"+color+"座位的数量"+seats);

    }
}

class Truck extends Vehicle{
    float load;
    public Truck(String brand,String color,float load){
        super(brand,color);
        this.load=load;
    }
    public void showTruck(){
        System.out.println("品牌是"+brand+"颜色"+color+"载重量"+load+"吨");

    }
}
