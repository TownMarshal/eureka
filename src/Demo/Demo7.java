package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo7 {
    public static void main(String[] args) {
        /**
         根据不同的工资等级打印不同的※：
         1                     2                   3                      4
         ※                    ※※               ※※※                    ※※※※
         */

            //定义一个等级的变量grade
            int grade=3;
            switch(grade){
                case 1:
                    System.out.println("※");
                    break;
                case 2:
                    System.out.println("※※");
                    break;
                case 3:
                    System.out.println("※※※");
                    break;
                case 4:
                    System.out.println("※※※※");
                    break;
                default:
                    System.out.println("无等级");
                    break;/*跳出switch,如果没有break就会穿透执行，后面的case即使不匹配也不会执行，直到遇到一个break才会跳出switch*/
            }
            System.out.println("程序结束");
    }
}
