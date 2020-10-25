package computer.wannianli;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/7 0007.
 * 判断年月闰年还是平年
 */
public class Demo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = s.nextInt();
        System.out.println("请输入月份");
        int month = s.nextInt();
        int day = -1;
        switch (month){
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
                if (year%400 == 0 || (year%4 == 0 && year%100 != 0)){
                    day = 29;
                }else {
                    day = 28;
                }
                break;
                default:
                    System.out.println("月份不合理，请重新输入");
                    break;
        }
        if (day != -1){
            System.out.println(year+"年"+month+"月"+"有"+day+"天");
        }
    }
}
