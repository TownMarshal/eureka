package ShangXueTang.MyJuc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 真正的多线程开发，
 * synchronized和Lock区别、
 * synchronized=》内置关键字，无法判断锁的状态，会自动释放锁,可重入锁，不可以中断的，非公平
 * 适合锁少量的代码同步问题，Lock适合大量的同步代码
 * 有两个线程，（获得锁，阻塞），线程2（等待，傻傻的等）
 * Lock=>java类，可以判断是否获取了锁，必须要手动释放锁，如果不释放锁，会发生死锁，
 * 可重入锁，可以判断锁，非公平（可以自己设置）
 * 有两个线程，（获得锁，阻塞），Lock锁就不会一直等待下去， lock.tryLock()
 */
public class SaleTicketDemo02 {
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

    private int num = 100;

    Lock lock = new ReentrantLock();


    public synchronized void sale() {
        try {
            lock.lock();//加锁

            //业务代码
            if (num > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出了" + (num--) + "张票，还剩余" + num + "张票");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出了" + (num--) + "张票，还剩余" + num + "张票");

        }
    }
}


