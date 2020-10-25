package computer.Date;

import java.util.Calendar;

/**
 * Calendar日期类
 * Created by Administrator on 2020/2/15 0015.
 * public long getTime():获取的是日期对象从1970年1月1日 00:00:00到现在的毫秒值
 * public void setTime(long time):设置时间，给的是毫秒值
 * Calendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
 * Calendar提供了一个类方法getInstance用于获取Calendar对象，其日历字段已使用当前日期和时间初始化
 * Calendar rightNow = Calendar.getInstance();
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();//多态的形式
       /* //System.out.println(c);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;//月是从0开始的，所以我们要加个1
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
        System.out.println("------------------------");*/
        /*//3年后的今天
        c.add(Calendar.YEAR,+3);
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH)+1;//月是从0开始的，所以我们要加个1
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1+"年"+month1+"月"+date1+"日");
        System.out.println("------------------------");*/
        /*//10年后的5天前
        c.add(Calendar.YEAR,+10);
        c.add(Calendar.DATE,-5);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH)+1;//月是从0开始的，所以我们要加个1
        int date2 = c.get(Calendar.DATE);
        System.out.println(year2+"年"+month2+"月"+date2+"日");
        System.out.println("------------------------");*/

        /*c.set(2020,4,15);//注意，月是从0开始的，写的4，其实就是5月
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH)+1;//月是从0开始的，所以我们要加个1
        int date2 = c.get(Calendar.DATE);
        System.out.println(year2+"年"+month2+"月"+date2+"日");
        System.out.println("------------------------");*/
    }
}
