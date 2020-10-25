package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo11 {
    public static void main(String[] args) {
        /**
         打印100到1000之间的水仙花数
         234=2（3）+3（3）+4（3）
         分析：
         循环条件：判断计数器是否大于等于100小于1000
         循环操作：更新计数器，判断是否是水仙花数
         */
            int i=100;
            do{
                int x=i%10;
                int y=(i/10)%10;
                int z=(i/100)%10;
                /*	int m=i/10;*/
                if((x*x*x+y*y*y+z*z*z)==i){
                    System.out.println(i);
                }
                i++;
            }
            while(i<=1000);
            System.out.println("程序结束");
        }
}
