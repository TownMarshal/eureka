package ShangXueTang.MyQueue;


import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by Administrator on 2021/3/30 0030.
 *
 */
public class QueueDeno {
    public static void main(String[] args) {
        Queue<Request> que =new ArrayDeque<Request>();
        //模拟排队情况
        for(int i=0;i<10;i++){
            final int num =i;
            que.offer(new Request(){

                @Override
                public void deposit() {
                    System.out.println("第"+num+"个人，办理存款业务，存款额度为:"+(Math.random()*10000));
                }
            });
        }

        dealWith(que);
    }
    //处理业务
    private static void dealWith(Queue<Request> que){
        Request req =null;
        while(null!=(req=que.poll())){
            req.deposit();
        }
    }

}
interface Request{
    //存款
    void deposit();
}


