package ItHeiMa.Date;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Administrator on 2020/2/14 0014.
 * public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
 * public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //public Date()：分配一个 Date对象，并初始化，以便它代表它被分配的时间，精确到毫秒
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        System.out.println("----------------------");
        //public Date(long date)：分配一个 Date对象，并将其初始化为表示从标准基准时间起指定的毫秒数
        long date1 = 1000 * 60 * 60;
        Date date2 = new Date(date1);
        System.out.println(date2);
        System.out.println("----------------------");
        long time = 1000 * 60 * 60;
        d.setTime(time);
        System.out.println(d);
        System.out.println("----------------------");
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        System.out.println("----------------------");
        //DateUtils工具
        String s1 = ItHeiMa.Date.DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = ItHeiMa.Date.DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);
        System.out.println("----------------------");
        String s = "2020-02-15 10:43:55";
        Date dd = ItHeiMa.Date.DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);


    }
}
