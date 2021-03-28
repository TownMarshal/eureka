package ItHeiMa.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2020/2/14 0014.
 * 构造方法：
 * public SimpleDateFormat():构造一个SimpleDateFormat，使用默认模式和日期格式
 * public SimpleDateFormat(String pattern):构造一个SimpleDateFormat使用给定的模式和默认的日期格式
 * 格式化：从Date到String
 * public final String format(Date date):将日期格式化为日期/时间字符串
 * 解析：从String到Date
 * public Date parse
 * public Date parse(String source):给定字符串的开始解析文本以生成日期
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        /*//默认方法
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
*/
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String s = sdf.format(d);
        System.out.println(s);

        System.out.println("--------------------");
        String ss = "2020-02-14 15:31:07";
        //SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");ParseException
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf.parse(ss);
        System.out.println(dd);


    }
}
