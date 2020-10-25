package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题10
 * 构造方法与重载
 * 为“无名的粉”写一个类classWuMingFen
 * 要求：
 * 1.有三个属性
 * 面码String theMa 粉的分量int quantity 是否带汤boolean likeSoup
 * 2.写一个构造方法以便于简化初始化过程
 * 例如：WuMingFen f1=new WuMingFen("牛肉"，3，true);
 * 3.重载构造方法 使得初始化过程可以多样化WuMingFen f2=new WuMingFen("牛肉"，2,);
 * 4.如何使得下列语句构造出来的粉对象是酸辣粉面码、2两、带汤的WuMingFen f3=new WuMingFen();
 * 5.写一个普通的方法check()用于查看粉是否符合要求，即，将对象得到三个属性打印在控制台上
 */
public class WuMingFen {
    //面码
    String theMa;
    //粉的分量
    int quantity;
    //是否带粉
    boolean likeSoup;
    public WuMingFen(){

    }

    public WuMingFen(String theMa,int quantity,boolean likeSoup){
        this(theMa,quantity);
        this.likeSoup=likeSoup;
    }
    //重载
    public WuMingFen(String theMa,int quantity){
        this.theMa=theMa;
        this.quantity=quantity;
    }

    public void check(){
        System.out.println("面码"+theMa+"分量"+quantity+"是否带汤"+likeSoup);
    }
}
