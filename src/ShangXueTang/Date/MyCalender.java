package ShangXueTang.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyCalender {
    public static void main(String[] args) {
        Calendar c=new GregorianCalendar();
        c.set(2021,1,10,12,22,34);
        c.set(Calendar.YEAR,2020);
        Date time = c.getTime();
        System.out.println(time);

    }
}
