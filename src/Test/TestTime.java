package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题3类的成员变量（属性）与方法、在程序中要对时间进行操作但是没有时间类型的数据，那么我们可以自己实现一个时间类来满足程序中的需要。
 * 定义名为MyTime的类其中应有三个整型成员 时hour 分minute 秒second 为了保证数据的安全性这三个成员变量应声明为私有。
 * 创建MyTime 类对象并且初始化成员变量。再定义display方法用于将时间信息打印出来，为MyTime类对象添加以下方法
 * addSecond(int sec) addMinute(int min) addHour(int hou) subSecond(int sec) subMinue(int min) subHour(int hou)
 * 分别对时、分、秒进行加减运算。
 * #注意：运行完后有两个类（class）文件，运行哪一个？ 运行java Test
 */
public class TestTime {
    //创建 时hour 分minute 秒second
    int  hour;
    int minute;
    int second;

    public  void setHour(int hour){
        this.hour=hour;
    }
    public int getHour(){
        return hour;
    }

    public  void setMinute(int minute){
        this.minute=minute;
    }
    public int getMinute(){
        return minute;
    }

    public  void setSecond(int second){
        this.second=second;
    }
    public int getSecond(){
        return second;
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
