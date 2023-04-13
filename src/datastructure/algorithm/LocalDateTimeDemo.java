package datastructure.algorithm;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        System.out.println("LocalDateTime.now() = " + LocalDateTime.now());
        System.out.println("LocalDate.now() = " + LocalDate.now());
        System.out.println("LocalTime.now() = " + LocalTime.now());
        System.out.println("LocalDateTime.of(2022,2,22,11,11,11) = " +
                LocalDateTime.of(2022, 2, 22, 11, 11, 11));

        System.out.println("LocalDate.of(2022, 2, 1) = " + LocalDate.of(2022, 2, 1));
        System.out.println("LocalTime.of( 11, 11, 11) = " + LocalTime.of(11, 11, 11));
        LocalDateTime futureDateTime = LocalDateTime.now()
                .plusYears(2L)
                .plusMonths(3L)
                .plusDays(5L)
                .plusHours(3L)
                .plusMinutes(10L)
                .plusSeconds(10L);
        System.out.println(futureDateTime);
        LocalDateTime futureDateTime1 = LocalDateTime.now()
                .plus(1, ChronoUnit.YEARS)
                .plus(1, ChronoUnit.MONTHS)
                .plus(2, ChronoUnit.DAYS);
        System.out.println(futureDateTime1);

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = localDate.withDayOfYear(200);
        LocalDate localDate2 = localDate.withDayOfMonth(5);
        LocalDate localDate3 = localDate.withYear(2020);
        LocalDate localDate4 = localDate.withMonth(6);
        System.out.println(localDate + "\t" + localDate1 + "\t" + localDate2 + "\t" + localDate3 + "\t" + localDate4);

        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 2, 22, 11, 11, 11);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022, 2, 22, 11, 11, 11);
        System.out.println("localDateTime1.isBefore(localDateTime2) = " + localDateTime1.isBefore(localDateTime2));
        System.out.println("localDateTime1.isAfter(localDateTime2) = " + localDateTime1.isAfter(localDateTime2));


        //计算两个日期的日期间隔-年月日
        LocalDate date1 = LocalDate.of(2018, 2, 13);
        LocalDate date2 = LocalDate.of(2022, 3, 12);
//内部是用date2-date1，所以得到的结果是负数
        Period period = Period.between(date1, date2);
        System.out.println("相差年数 ： " + period.getYears());
        System.out.println("相差月数 ： " + period.getMonths());
        System.out.println("相差日数 ： " + period.getDays());
//还可以这样获取相差的年月日
        System.out.println("-------------------------------");
        long years = period.get(ChronoUnit.YEARS);
        long months = period.get(ChronoUnit.MONTHS);
        long days = period.get(ChronoUnit.DAYS);
        System.out.println("相差的年月日分别为 ： " + years + "," + months + "," + days);
//注意，当获取两个日期的间隔时，并不是单纯的年月日对应的数字相加减，而是会先算出具体差多少天，在折算成相差几年几月几日的

//计算两个时间的间隔
        System.out.println("-------------------------------");
        LocalDateTime date3 = LocalDateTime.now();
        LocalDateTime date4 = LocalDateTime.of(2024, 1, 13, 22, 30, 10);
        Duration duration = Duration.between(date3, date4);
        System.out.println(date3 + " 与 " + date4 + " 间隔  " + "\n"
                + " 天 :" + duration.toDays() + "\n"
                + " 时 :" + duration.toHours() + "\n"
                + " 分 :" + duration.toMinutes() + "\n"
                + " 毫秒 :" + duration.toMillis() + "\n"
                + " 纳秒 :" + duration.toNanos() + "\n"
        );
        //注意，并没有获得秒差的，但既然可以获得毫秒，秒就可以自行获取了

      /*  Instant start = Instant.now();
        for (int i = 0; i < 100000; i++) {
            System.out.println("你好");
        }
        Instant end = Instant.now();
        System.out.println("程序耗时" + Duration.between(start, end).toMillis() + "毫秒");*/

        System.out.println("自定义日期时间转换" + "\n" +
                DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss").format(LocalDateTime.now()) + "\n" +
                DateTimeFormatter.ofPattern("yyyy年MM月dd日").format(LocalDate.now()) + "\n" +
                DateTimeFormatter.ofPattern("HH:mm:ss").format(LocalTime.now())
        );

        //将时间字符串形式转化为日期对象,注：格式的写法必须与字符串的形式一样
        //2018-01-13 21:27:30 对应 yyyy-MM-dd HH:mm:ss
        //20180113213328 对应 yyyyMMddHHmmss  否则会报运行时异常！
        // 但要记住：得到的最终结果都是类似2018-01-13T21:27:30的格式，
        // 因为在输出LocalDateTime对象时，会调用其重写的toString方法。
        String datetime="2022-01-12 21:24:12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("将时间字符串形式转化为日期对象" + LocalDateTime.parse(datetime, dateTimeFormatter));

       // long毫秒值转换为日期
        String format = dateTimeFormatter.format(LocalDateTime.ofInstant(
                Instant.ofEpochMilli(System.currentTimeMillis()),
                ZoneId.of("Asia/Shanghai")
        ));
        System.out.println(format);

        //当前时区时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("当前时区时间: " + zonedDateTime);

//东京时间
        ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("JST"));
        ZonedDateTime tokyoTime = zonedDateTime.withZoneSameInstant(zoneId);
        System.out.println("东京时间: " + tokyoTime);

// ZonedDateTime 转 LocalDateTime
        LocalDateTime localDateTime = tokyoTime.toLocalDateTime();
        System.out.println("东京时间转当地时间: " + localDateTime);

//LocalDateTime 转 ZonedDateTime
        ZonedDateTime localZoned = localDateTime.atZone(ZoneId.systemDefault());
        System.out.println("本地时区时间: " + localZoned);


    }
}
