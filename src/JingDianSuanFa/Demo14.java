package JingDianSuanFa;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 输入某年某月某日，判断这一天是这一年的第几天？
 */
public class Demo14 {
    public static void main(String[] args) {
        System.out.println("输入年,月,日");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int month = in.nextInt();
        int day = in.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        int sum = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("是这一年的第" + sum + "天");
    }
}
