package ShangXueTang.MyJuc.ProductCustomer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * signal
 */
public class A3 {
    public static void main(String[] args) {
        Data3 data3 = new Data3();
        new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                data3.printA();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                data3.printB();
            }
        }, "B").start();
        new Thread(() -> {

            for (int i = 0; i < 10; i++) {
                data3.printC();
            }
        }, "C").start();
    }
}

class Data3 {//数字，资源类

    private int num = 1;//num为1让A执行 ，num为B让A执行 ，num为3让C执行
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();

    void printA() {
        lock.lock();
        try {

            while (num != 1) {
                //等待
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "A在执行====================");
            //唤醒指定的人，B
            num = 2;
            condition2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printB() {
        lock.lock();
        try {

            while (num != 2) {
                //等待
                condition2.await();
            }
            System.out.println(Thread.currentThread().getName() + "B在执行========================");
            num = 3;
            condition3.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void printC() {
        lock.lock();
        try {

            while (num != 3) {
                //等待
                condition3.await();
            }
            System.out.println(Thread.currentThread().getName() + "C在执行========================");
            num = 1;
            condition1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}