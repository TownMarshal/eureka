package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDemo {

    public static void main(String[] args)    {
        LocalDate date = LocalDate.of(2022, 5, 21);
        LocalDate.parse("2022-02-22");
        System.out.println(date);

        LocalTime time = LocalTime.of(9, 34, 22);
        LocalTime.parse("12:12:22");
        System.out.println(time);





        //一周后的日期


    }


    public void oldFormat() {
        Date now = new Date();
        //format yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(now);
        System.out.println(String.format("date format : %s", date));

        //format HH:mm:ss
        SimpleDateFormat sdft = new SimpleDateFormat("HH:mm:ss");
        String time = sdft.format(now);
        System.out.println(String.format("time format : %s", time));

        //format yyyy-MM-dd HH:mm:ss
        SimpleDateFormat sdfdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = sdfdt.format(now);
        System.out.println(String.format("dateTime format : %s", datetime));
    }

    public void newFormat() {
        //format yyyy-MM-dd
        LocalDate date = LocalDate.now();
        System.out.println(String.format("date format : %s", date));

        //format HH:mm:ss
        LocalTime time = LocalTime.now().withNano(0);
        System.out.println(String.format("time format : %s", time));

        //format yyyy-MM-dd HH:mm:ss
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateTimeStr = dateTime.format(dateTimeFormatter);
        System.out.println(String.format("dateTime format : %s", dateTimeStr));
    }


}
