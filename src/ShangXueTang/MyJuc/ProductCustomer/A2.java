package ShangXueTang.MyJuc.ProductCustomer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程之间的通信问题：生产者消费者问题
 * 线程交替执行， A B操作同一个变量 num=0
 * A num+1
 * B num-1
 * 面试：
 * 单例模式，排序算法，生产者消费者
 * 问题存在：A ,B两个线程
 * 四个线程安全吗？不安全，if存在虚假唤醒问题
 * 防止虚假唤醒问题：while
 * 老版： synchronized wait notifyAll
 * 新版JUC：
 */
public class A2 {
    public static void main(String[] args) {
        Data2 data2 = new Data2();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data2.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data2.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data2.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data2.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();




    }
}

class Data2 {//数字，资源类

    private int num = 0;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    //+1
    public void increment() throws InterruptedException {


        try {
            lock.lock();
            while (num != 0) {
                //等待
                condition.await();
            }
            num++;
            System.out.println(Thread.currentThread().getName() + "=>" + num);
            condition.signalAll();
            //通知其他线程，我+1完了
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


    //-1
    public void decrement() throws InterruptedException {

        try {
            lock.lock();
            while (num == 0) {
                //等待
                condition.await();
            }
            //通知其他线程，我-1完了
            num--;
            System.out.println(Thread.currentThread().getName() + "=>" + num);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }


    }

}
