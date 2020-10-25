package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题2类的成员变量（属性）
 * 请定义一个交通工具（Vehicle）的类其中有：
 * 属性 速度（speed）体积（size）等等
 * 方法 移动（move（）） 设置速度（setSpeed(int speed)） 加速（speedUp()） 减速（speedDown）等等
 * 最后测试类Vehicle中的main（）中实例化一个交通工具对象并通过方法对他初始化speed，size的值并且打印出来。
 * 另外加速减速的方法对速度进行改变
 */
public class TestVehicle {
    int  speed;
    int size;
    public void move(){
        System.out.println("车开动了");
    }
    //逐步加速
    public void setSpeed(int sp){
        speed=sp;
    }
    public void speedUp(){
        speed++;
    }
    //自定义加速
    public void speedUp(int sp){
        speed+=sp;
    }
    public void speedDown(int sp){
        speed-=sp;
    }
    public void inf(){
        System.out.println("速度"+speed+"大小"+size);
    }
}
