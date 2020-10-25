package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo14 {
    public static void main(String[] args) {
        /**
         for(i=0;1<100;1++){}打印5行5列的※号
         ※※※※※
         ※※※※※
         ※※※※※
         ※※※※※
         ※※※※※
         */
            int i;
            int j;
          //外层是打印5行
            for(i=0;i<5;i++){
                //内层的循环式打印一行
                for(j=0;j<5;j++){
                    //打印一个※不换行
                    System.out.print("※");
                }
                System.out.println( );
            }
    }
}
