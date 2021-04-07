package ShangXueTang.MyJuc.add;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo01 {
    public static void main(String[] args) {
        //线程数量：停车位!限流（LOL冠军之夜排队）
        Semaphore semaphore = new Semaphore(3);
        for (int i = 1; i <=6 ; i++) {
            new  Thread(()->{
                //acquire等待获得
                //release释放
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName()+"拿到了停车位 ");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName()+"离开车位 ");


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();//release释放车位
                }
            },String.valueOf(i)).start();
        }
    }
}
