package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo10 {
    public static void main(String[] args) {
        /**
         while（）{}
         do{}while()
         实例：打印1到100之间所有偶数的和；
         */
            int i=0;
            int sum=0;
            do{
                if(i%2==0){
                    sum+=i;
                }
                i++;
            }
            while(i<=100);
            System.out.println("总和是"+sum);
    }
}
