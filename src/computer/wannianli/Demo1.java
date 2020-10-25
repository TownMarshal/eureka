package computer.wannianli;
import java.util.Scanner;
/**
 * Created by Administrator on 2020/2/10 0010.
 * 万年历
 */
public class Demo1 {
        public static int getMonthDay(int year, int month){
            int days = 0;
            switch (month){
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
                default:
                    System.out.println("输入月份不合法");
                    break;
            }

            return days;
        }
            //给定年月日如： 2019-4-5 ，计算这天是这一年的第多少天呢？
        public static int getYearDays(int year, int month, int day){
            int days = 0;
            for (int i = 1; i < month; i++) {
                days += getMonthDay(year, i);
            }
            days += day;
            return  days;
        }
        //计算指定年月日是星期几    如2018-11-1是星期几
        //int week = (year-1+(year-1)/4-(year-1)/100+(year-1)/400+days)%7;
        public static int getWeek(int year, int  month, int day){
            int days = getYearDays(year, month, day);
            //计算星期的公式
            int week = (year-1+(year-1)/4-(year-1)/100+(year-1)/400+days)%7;
            return week;
        }
        //打印日历
        public static void printData(int year, int month){
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            //获得这个年月的1号的星期
            int week = getWeek(year, month, 1);
            System.out.println();
            int count = 0;
            //打印空白
            for (int i = 0; i < week; i++) {
                count++;
                System.out.print("\t");
            }
            //打印数字，获得这个年月的天数
            int monthDay = getMonthDay(year, month);
            for (int i = 1; i <= monthDay ; i++) {
                count++;
                System.out.print(i+"\t");
                if(count%7 == 0){
                    System.out.println();
                    System.out.println();
                }
            }
        }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            while (true){

                System.out.println("请输入yyyy-MM格式的年月获得日历");
                String s1 = s.nextLine();
                if ("exit".equals(s1)){
                    break;
                }
                String[] data = s1.split("-");

                printData(new Integer(data[0]), new Integer(data[1]));

            }
            System.out.println("程序结束");
        }
}
