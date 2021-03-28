package JingDianSuanFa;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Administrator on 2021/3/15 0015.
 */
public class DateFormat {
    public static void fun() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String newDate;
        try {
            newDate = sdf.format(new SimpleDateFormat("yyyyMMdd")
                    .parse("20121115"));
            System.out.println(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        fun();
    }
}
