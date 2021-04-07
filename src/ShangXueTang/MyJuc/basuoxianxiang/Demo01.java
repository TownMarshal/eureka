package ShangXueTang.MyJuc.basuoxianxiang;

import java.util.concurrent.TimeUnit;

/**
 * 八锁：关于锁的八个问题
 * 1.标准情况下，两个线程先打印，发短信还是打电话？ 1、发短信2.打电话
 * 2.sendMsg()方法延迟四秒，情况下，两个线程先打印，发短信还是打电话？ 1、发短信2.打电话
 */
public class Demo01 {
    public static void main(String[] args) {
        Phone phone=new Phone();

        //锁的存在，
        new Thread(()->{
            phone.sendMsg();
        },"A").start();

        //捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone.call();
        },"B").start();

    }

}
class Phone{

    //synchronized 的对象是方法的调用者！两个方法用的是同一个锁（phone），谁先拿到谁先执行
    public synchronized void sendMsg(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("发短信");
    }
    public synchronized void call(){
        System.out.println("打电话");
    }
}
