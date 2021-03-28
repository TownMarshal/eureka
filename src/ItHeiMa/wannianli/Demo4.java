package ItHeiMa.wannianli;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/13 0013.
 * 此方法需要改进，很多方法过时了
 * 求出指定的 年 月的天数，例如 2019-10，告诉我这个月有多少天
 * 给定 年 月 日 判断这个日子是这一年的第多少天，例如 2019-2-20    是这年的第51天
 * 给定年 月 日 求这个日子是星期几  例如：2019-11-14  星期四
 */
public class Demo4 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            while(true){
                System.out.println("请输入年月：例如 2019-11");
                //输入字符串
                String s1 = s.nextLine();
                String[] data = s1.split("-");
                int year = new Integer(data[0]);
                int month = new Integer(data[1]);
                printCal(year, month);

                System.out.println("请输入年月：例如 2019-11");
                String s2 = new String();
                String[] data1 = s2.split("-");
                int year1 = new Integer(data[0]);
                int month1 = new Integer(data[1]);
                int day1 = new Integer(data[2]);
                int yearDays = getYearDays(year1, month1, day1);
                System.out.println(yearDays);


            }
        }
        /**
         * 求出指定的 年 月的天数，例如 2019-10，告诉我这个月有多少天
         * <p>
         * 31天    1 3 5 7 8 10 12
         * 30天    4 6 9 11
         * 28天    2 （平年）
         * 29天    2 （闰年）  年能被400整除，    年能被4整除但是不能被100整除
         */

        public static int getMonthDay(int year, int month) {
            //定义一个返回值的变量
            int days = -1;

            //switch适合这个题
            switch (month) {
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
                    if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
            }
            return days;

        }

        /**
         * 给定 年 月 日 判断这个日子是这一年的第多少天，例如 2019-2-20    是这年的第51天
         * 2019-5-20
         * <p>
         * 1    2    3    4     5
         * <p>
         * 31   28   31   30    20
         * <p>
         * 思路就是求出当前的月的前面的每一个月的整月天数之和再加上day
         */

        public static int getYearDays(int year, int month, int day) {
            //定义一个结果变量
            int totalDays = 0;
            for (int i = 1; i < month; i++) {
                //求出当前的月的前面的每一个月的整月天数之和
                totalDays += getMonthDay(year, i);
            }
            //把day也加上
            totalDays += day;
            return totalDays;
        }


        /**
         * 给定年 月 日 求这个日子是星期几  例如：2019-11-14  星期四
         * year:年份, days：当前这个年月日是这一年的第多少天
         * (year-1+(year-1)/4-(year-1)/100+(year-1)/400+days)%7;
         */

        public static int getWeek(int year, int month, int day) {
            //调用上一步我们写好的程序求出当前这个年月日是这一年的第多少天
            int days = getYearDays(year, month, day);
            //求出了这个指定的年月日的星期
            int week = (year - 1 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 + days) % 7;
            return week;
        }


        /**
         * 打印日历：周日在前面的
         * @param year
         * @param month
         */
        public static void printCal(int year, int month){
            System.out.println("\t\t<"+year+"年"+month+"月"+">");
            System.out.println();
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            //打印当前的月份的数字

            //打印1号前面的空格，1号是星期几，前面就有几个空格
            int week = getWeek(year, month, 1);
            System.out.println();
            //定义一个计数器
            int count = 0;
            //打印空格
            for (int i = 0; i < week; i++) {
                System.out.print("\t");
                count++;
            }
            //打印数字day
            int monthDay = getMonthDay(year, month);
            for (int i = 1; i <= monthDay ; i++) {
                System.out.print(i+"\t");
                count++;
                if(count % 7 == 0){
                    System.out.println();
                    System.out.println();
                }
            }

            System.out.println();

        }


        /**
         * 打印日历  周日在后面的
         * @param year
         * @param month
         */
        public static void printCal1(int year, int month){
            System.out.println("\t\t<"+year+"年"+month+"月"+">");
            System.out.println();
            System.out.println("一\t二\t三\t四\t五\t六\t日");
            //打印当前的月份的数字

            //打印1号前面的空格，1号是星期几，前面就有几个空格
            int week = getWeek(year, month, 1);
            System.out.println();
            //定义一个计数器
            int count = 0;
            //打印空格
            for (int i = 0; i < week-1; i++) {
                System.out.print("\t");
                count++;
            }
            //打印数字day
            int monthDay = getMonthDay(year, month);
            for (int i = 1; i <= monthDay ; i++) {
                System.out.print(i+"\t");
                count++;
                if(count % 7 == 0){
                    System.out.println();
                    System.out.println();
                }
            }

        }
    }

