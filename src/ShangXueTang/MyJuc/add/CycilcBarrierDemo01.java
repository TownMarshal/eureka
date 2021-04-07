package ShangXueTang.MyJuc.add;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CycilcBarrierDemo01 {
    public static void main(String[] args) {
        //集齐七颗龙珠召唤神龙
        //召唤龙珠的线程
        //8个就收不齐了
        CyclicBarrier cyclicBarrier = new CyclicBarrier(8,()-> {
            System.out.println("召唤神龙成功");
        });

        for (int i = 1; i <= 7; i++) {
            //lambda能操作到i吗
            final  int temp=i;
                new Thread(()->{
                    System.out.println(Thread.currentThread().getName()+"收集了"+temp+"个龙珠");
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                }).start();


        }
    }
}
