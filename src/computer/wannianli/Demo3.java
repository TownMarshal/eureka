package computer.wannianli;

/**
 * Created by Administrator on 2020/2/11 0011.
 */
public class Demo3 {
        public static void main(String[] args) {
            printCal(2020, 2);
        }
        /**
         * 任意给定年月如：2018-11，计算这个月有多少天
         * 31 :  1 3 5 7  8 10 12
         * 30:   4 6 9 11
         * 28:   2平年
         * 29：  2闰年     year能被400整除    year能被4整除但是不能被100整除
         */
        public static int getMonthDay(int  year, int  month){
            //定义一个天数的变量
            int days = 0;
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    if(year % 400 == 0 || (year%4 == 0 && year % 100 != 0)){
                        days = 29;
                    }else{
                        days = 28;
                    }
                    break;
            }

            return days;


        }


        /**
         * 给定年月日 2019-5-15 这个日子是这一年的第多少天
         *
         *  1   2   3   4   5
         *
         *  31  28  31  30  15
         *
         *
         * @return
         */
        public static int getYearDay(int year, int month, int day){
            //定义一个而结果的变量
            int days = 0;
            for (int i = 1; i < month; i++) {
                //求出出了month，之前的每一个月的天数 求和
                days +=getMonthDay(year, i);
            }
            days += day;
            return days;
        }


        /**
         * 给定年月日2019-5-15 求是星期几
         *
         * int week = (year-1+(year-1)/4-(year-1)/100+(year-1)/400+days)%7;
         */
        public static int getWeek(int year, int month, int day){
            //根据年月日想求出是这一年的第多少天
            int days = getYearDay(year, month, day);
            //套用公式
            int week = (year-1+(year-1)/4-(year-1)/100+(year-1)/400+days)%7;
            return week;
     }



        /**
         *
         * 打印日历
         */
        public static void printCal(int year, int month){

            System.out.println("日\t一\t二\t三\t四\t五\t六");
            //获得这个年月有多少天
            int monthDay = getMonthDay(year, month);

            //获得这个年月的1号是星期几
            int week = getWeek(year, month, 1);

            //换行
            System.out.println();
            //定义一个计数器
            int count = 0;
            //打印空白
            for (int i = 0; i < week ; i++) {
                count++;
                //不要换行
                System.out.print("\t");
            }
            //把日的数据
            for (int i = 1; i <= monthDay ; i++) {
                count++;
                System.out.print(i+"\t");
                if(count % 7 == 0){
                    System.out.println();
                    System.out.println();
                }
            }
        }
    }

