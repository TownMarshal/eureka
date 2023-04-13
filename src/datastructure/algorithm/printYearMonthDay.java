package datastructure.algorithm;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class printYearMonthDay {
    public static void main(String[] args) {
         /*
         打印指定年月的天数
         2019.8
         31天的月份有：1,3,5,7,8,10,12
         30天的月份有：4,6,9,11
         29 二月 闰年  如果年可以被400整除或者年可以被4整除但是不能被100整除就是闰年
         28 二月 平年
         */
        //定义年和月
        int year = 2019;
        int month = 9;
        int day = -1;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                System.out.println("月份不合理");
                break;
        }
        System.out.println(year + "年" + month + "月有" + day + "天");
    }
}
