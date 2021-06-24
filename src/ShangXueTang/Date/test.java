package ShangXueTang.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String[] args) {
        long date = new Date().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(date));
        Date d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format.format(d);
        System.out.println("................................");
        System.out.println(s);
        long time = d.getTime();
        System.out.println(time);
        System.out.println(".......................");
        String s1 = format.format(time);
        System.out.println(s1);

    }
}
