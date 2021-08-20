package ShangXueTang.MyThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * synchronized是一个内置的关键字，Lock是一个java类
 */
public class Demo02 {
    public static void main(String[] args) {
        Ticket ticket2 = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket2.sale();
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket2.sale();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 60; i++) {
                ticket2.sale();
            }
        }, "C").start();
    }
}

class Ticket2 {
    //现在有100张票
    private int num = 100;

    private Lock lock = new ReentrantLock();


    public void sale() {

        try {
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了" + (num--) + "张票，剩余" + num + "张票");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}