package computer.wannianli;

/**
 * Created by Administrator on 2020/2/10 0010.
 */
public class Demo2 {
        /**
         * 给定年和月，求这个月份有多少天
         *  31:    1  3 5  7  8  10 12
         *  30:    4 6 9  11
         *  28:    2(平年)
         *  29：   2（闰年）  能被400整除，能被4整除但是不能被100整除
         *
         */
        public static int getMonthDays(int year, int month){
            //定义一个天数的变量
            int days = 0;
            switch (month){
                case 1 :
                case 3 :
                case 5 :
                case 7 :
                case 8 :
                case 10 :
                case 12 :
                    days = 31;
                    break;
                case 4 :
                case 6 :
                case 9 :
                case 11 :
                    days = 30;
                    break;
                case 2:
                    if(year % 400 == 0 || (year % 4 == 0 && year %100 != 0)){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
            }
            return days;
        }

        /**
         * 给定年月日，求这个日期是这一年的第多少天
         * 2019-4-13
         *
         *  1   2   3    4
         *
         *
         *  31  28   31  13
         *
         * @param args
         */


        public static int getYearDays(int year, int month, int day){
            //定义一个天数变量
            int totalDays = 0;
            for (int i = 1; i < month; i++) {
                //求出每一个月有多少天
                int monthDay = getMonthDays(year, i);
                totalDays += monthDay;
            }
            //加上当前日期的天数
            totalDays += day;
            return totalDays;
        }


        /**
         * 给定年月日  求这个天是星期几
         * @param args
         */
        public static int getWeek(int year, int month, int day){
            //定义一个星期的变量
            int week = -1;

            int days = getYearDays(year, month, day);
            //这个公式days， 给定年月日问这个是这一年的第多少天
            week = (year-1+(year-1)/4-(year-1)/100+(year-1)/400+days)%7;
            return week;
        }


        /**
         *
         * 给定年月
         日	一	二	三	四	五	六

         1	2

         3	4	5	6	7	8	9

         10	11	12	13	14	15	16

         17	18	19	20	21	22	23

         24	25	26	27	28	29	30

         31
         * @param args
         */

        public static void printDate(int year, int month){
            //定义星期头
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            System.out.println();
            //求出这个月份有多少天
            int monthDays = getMonthDays(year, month);
            //我们发现这个月份1号是星期几那么就在第一行前面打印几个空白
            int week = getWeek(year, month, 1);
            //定义一个计数器
            int count = 0;
            //打印空白
            for (int i = 0; i < week; i++) {
                System.out.print("\t");
                count++;
            }
            for (int i = 1; i <= monthDays ; i++) {
                System.out.print(i+"\t");
                count++;
                if(count % 7 == 0){
                    System.out.println();
                    System.out.println();
                }
            }
        }
        public static void main(String[] args) {
            printDate(2019,2);
        }
}
