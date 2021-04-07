package ShangXueTang.MyJuc.add;

import java.util.concurrent.CountDownLatch;

//计数器
public class CountDownLatchDemo01 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        //总数是6，在必须要执行一些任务的时候去使用
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "走了");
                countDownLatch.countDown();//数量减一
            }, String.valueOf(i)).start();
        }
        countDownLatch.await();//等待计数器归零
        System.out.println("关门");
    }
}
