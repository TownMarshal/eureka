package ShangXueTang.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * calender用来计算日期加减计算
 */
public class MyCalender {
    public static void main(String[] args) {
        Calendar c = new GregorianCalendar();
        c.set(2021, 1, 10, 12, 22, 34);
//        c.set(Calendar.YEAR,2020);

        Date time = c.getTime();
        System.out.println(time);
        System.out.println(c.get(Calendar.YEAR));

        //测试计算日期
        c.setTime(new Date());
        c.add(Calendar.YEAR, 30);
        c.add(Calendar.MONTH, -1);
        System.out.println(c);

    }
}
