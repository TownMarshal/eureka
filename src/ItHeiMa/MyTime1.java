package ren.shuai;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
public class MyTime1 {
    //创建hour minute second
    private int hour;
    private int minute;
    private int second;

    public MyTime1(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void display() {
        System.out.println(hour + "时" + minute + "分" + second + "秒");
    }

    //加秒、减秒
    public void addSecond(int sec) {
        this.second += sec;
    }

    public void subSecond(int sec) {
        this.second -= sec;
    }

    //加分、减分
    public void addMinute(int min) {
        this.minute += min;
    }

    public void subMinute(int min) {
        this.minute -= min;
    }

    //加时、减时
    public void addHour(int hou) {
        this.hour += hou;
    }

    public void subHour(int hou) {
        this.hour -= hou;
    }
}

class Test {
    public static void main(String[] args) {
        //创建MyTime对象
        MyTime1 mt = new MyTime1(12, 45, 54);
        //调用display
        mt.display();
        //修改时间
        mt.addHour(3);
        mt.display();

        mt.addMinute(12);
        mt.display();
        mt.addHour(1);
        mt.display();
        //不会进制
        mt.addMinute(20);
        mt.display();
    }
}