package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo17 {
    public static void main(String[] args) {
        /**
         一周上五天班，周三请假  continue 终止本次比赛，但是下面的继续执行
         */

            int i;
            for(i=1;i<=5;i++){
                if(i==3){
                    System.out.println("请假");
                    continue;
                }
                System.out.println("星期"+i+"上班");
            }
    }
}
