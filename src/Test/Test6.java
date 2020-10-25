package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题6
 * 构造方法 编写java程序模拟简单的计算器。
 * 定义名为Number 的类，其中有两个整型数据成员 n1和n2声明为私有。
 * 编写构造方法赋予n1 n2初始值再为该类定义
 * 加addition 减substration 乘multiplication 除division等公式
 * 在main方法中创建Number类的对象调用各个方法并显示计算结果。
 */
public class Test6 {
    //创建hour minute second
    private int hour;
    private int minute;
    private int second;
    public Test6(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }

    //定义方法打印出来
    public void display(){
        System.out.println(hour+"时"+minute+"分"+second+"秒");
    }


    //加秒、减秒
    public void addSecond(int sec){
        this.second+=sec;
    }
    public void subSecond(int sec){
        this.second-=sec;
    }

    //加分、减分
    public void addMinute(int min){
        this.minute+=min;
    }
    public void subMinute(int min){
        this.minute-=min;
    }

    //加时、减时
    public void addHour(int hou){
        this.hour+=hou;
    }
    public void subHour(int hou){
        this.hour-=hou;
    }

}
