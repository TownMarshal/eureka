package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo16 {
    public static void main(String[] args) {
        /**
         for(i=0;1<100;1++){}
         运动会上跑5000米，跑到第三圈的时候，腿抽筋了，退赛

         */

            int i=1;
            while(i<=10){
                //跑到第三圈岔气了
                if(i==3){
                    System.out.println("岔气了，终止比赛");
                    //终止当前的循环
                    break;
                }
                System.out.println("我跑到了第"+i+"圈");
                i++;
            }
            System.out.println("程序结束");
    }
}
