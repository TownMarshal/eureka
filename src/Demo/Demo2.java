package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         实例：打印员工的薪水，大于3000是D级别，大于5000是C级别，大于8000是B级别，大于10000是A级别
         D                       C                      B                   A
         3000-5000          5000-8000              8000-10000           10000以上
         */
        //定义一个工资变量salary;
        int salary=5500;
        if(salary>3000&&salary<=5000){
            System.out.println("您的工资水平是D级别");
        }
        if(salary>5000&&salary<=8000){
            System.out.println("您的工资水平是C级别");
        }
        if(salary>8000&&salary<=10000){
            System.out.println("您的工资水平是B级别");
        }
        if(salary>10000){
            System.out.println("您的工资水平是A级别");
        }
        System.out.println("程序结束");
    }
}
