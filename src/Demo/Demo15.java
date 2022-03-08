package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo15 {
    public static void main(String[] args) {
        /**
         for(i=0;1<100;1++){}打印5行5列的※号
         打印乘法口诀
         实例：
         1*1=1
         1*2=2 2*2=4
         1*3=3 2*3=6 3*3=9
         把*前面的作为列号
         把*后面的作为行号
         */
            int i;
            int j;
          //外层作为行循环
            for(i=1;i<=9;i++){
                //内层作为列循环
                for(j=1;j<=i;j++){
                    System.out.print(i+"*"+j+"="+i*j+"\t");
                }
                System.out.println();
            }
    }
}
