package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo6 {
    public static void main(String[] args) {
        /**
         根据不同的工资等级打印不同的※：
         1                     2                   3                      4
         ※                    ※※               ※※※                    ※※※※
         */
            //定义一个等级的变量grade
            int grade=3;
            if(grade==1){
                System.out.println("※");
            }
            if(grade==2){
                System.out.println("※※");
            }
            if(grade==3){
                System.out.println("※※※");
            }
            if(grade==4){
                System.out.println("※※※※");
            }

        }
}
