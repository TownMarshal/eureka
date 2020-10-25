package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题5
 * 累的成员变量与方法、构建方法 在程序中经常对时间进行操作但是并没有时间类型的数据。那么我们可以自己实现一个时间类型来满足程序中的需要定义名为MyTime的类其中应有三个整型成员时hour 分minute 秒second
 * 为了保证数据的安全性这三个成员变量应声明为私有。为MyTime类定义构造方法以方便创建时对象初始化成员变量。再定义display方法用于将时间打印出来。为MyTime类添加以下方法：
 * addSecond(int set) addMinute(int min) addHour(int hou) subSecond(int sec) subMinute(int min)
 * subHour(int hou)分别对时、分、秒进行加减运算。
 * 不想使用封装初始化
 */
public class Test5 {
    //创建hour minute second
    private int hour;
    private int minute;
    private int second;
    public Test5(int hour,int minute,int second){
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
