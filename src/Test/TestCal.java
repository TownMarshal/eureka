package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 接口的应用实现
 */
interface Cal{
    public static final double PI=3.14;
    //求周长
    public double getLong();
    //求面积
    public double getArea();
}
//正方形
class Rect implements Cal{
    //边长
    double r;
    //构造器
    public Rect(double r){
        this.r=r;
    }
    public double getLong(){
        return 4*r;
    }
    public double getArea(){
        return r*r;
    }
}
//圆
class Circle implements Cal{
    //半径
    double r;
    //构造器
    public Circle(double r){
        this.r=r;
    }
    public double getLong(){
        return 2*Cal.PI*r;
    }
    public double getArea(){
        return Cal.PI*r*r;
    }
}
public class TestCal{
    public static void main(String[]args){
        //创建一个正方形
        Rect rect=new Rect(12.0);
        double rectLong=rect.getLong();
        double rectArea=rect.getArea();

        System.out.println("正方形的周长是"+rectLong);
        System.out.println("正方形的面积是"+rectArea);

        //创建一个圆
        Circle c=new Circle(10.0);
        double cLong=c.getLong();
        double cArea=c.getArea();

        System.out.println("圆的周长是"+cLong);
        System.out.println("圆的面积是"+cArea);

    }
}