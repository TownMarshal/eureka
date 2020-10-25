package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo20 {
    public static void main(String[] args) {
        /**
         函数调用比较两个数的大小
         */

            //定义两个整数类型变量
            int a=18;
            int b=20;
          //调用函数compareNum
            int result= compareNum(a,b);
            System.out.println(result+"大");

            int c=999;
            int d=99;
          //调用函数compareNum
            int result1= compareNum(c,d);
            System.out.println(result1+"大");
        }
        public static int compareNum(int a,int b){
            //定义一个结果变量c
            int c;
            if(a>b){
                c=a;
            }else{
                c=b;
            }
            //方法返回值是c，
            return c;
    }
}
