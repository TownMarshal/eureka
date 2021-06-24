package ShangXueTang.Date;

import ItHeiMa.Date.SimpleDateFormatDemo;
import JingDianSuanFa.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日,属于本年的第几周w");
//        SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date d = new Date(1323131241412L);
        String s = sdf.format(d);
        System.out.println(s);
        System.out.println("=================");

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy,MM,dd");
        String s2 = "1977,1,1";//字符串和日期格式要保持一致
        try {
            Date parse = sdf2.parse(s2);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
