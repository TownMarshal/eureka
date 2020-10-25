package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo12 {
    public static void main(String[] args) {
        /**
         打印100到1000之间个位数和百位数相同的数
         191
         个位数和百位数相同
         */
            int i=100;
            do{
                int x=i%10;
                int y=(i/10)%10;
                int z=(i/100)%10;
                /*	int m=i/10;*/
                if(x==z){
                    System.out.println(i);
                }
                i++;
            }
            while(i<1000);
            System.out.println("程序结束");

        }
}
