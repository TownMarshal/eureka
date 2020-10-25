package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo13 {
    public static void main(String[] args) {
        /**
         for(i=0;i<100;i++){}计算0-100之间偶数和
         */
            int sum=0;
            int i;
            for(i=0;i<=100;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
            System.out.println("0到100之间的偶数和是"+sum);
    }
}
