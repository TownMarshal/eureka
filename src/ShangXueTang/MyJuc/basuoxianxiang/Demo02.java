package ShangXueTang.MyJuc.basuoxianxiang;


import java.util.concurrent.TimeUnit;

/**
 * 八锁：关于锁的八个问题
 * 1.标准情况下，两个线程先打印，发短信还是打电话？ 1、发短信2.打电话
 * 2.sendMsg()方法延迟四秒，情况下，两个线程先打印，发短信还是打电话？ 1、发短信2.打电话
 * 3.增加了一个普通方法，先执行发短信还是hello？  1.hello  2.发短信
 */
//public class Demo02 {
//    public static void main(String[] args) {
//        Phone2 phone=new Phone2();
//
//        //锁的存在，
//        new Thread(()->{
//            phone.sendMsg();
//        },"A").start();
//
//        //捕获
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        new Thread(()->{
//            phone.hello();
//        },"B").start();
//
//    }
//
//}
//class Phone2{
//
//    //synchronized 的对象是方法的调用者！两个方法用的是同一个锁（phone），谁先拿到谁先执行
//    public synchronized void sendMsg(){
//        try {
//            TimeUnit.SECONDS.sleep(4);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("发短信");
//    }
//    public synchronized void call(){
//        System.out.println("打电话");
//    }
//
//    //这里没有锁，不是同步方法，不受锁的影响
//    public void hello(){
//        System.out.println("hello");
//    }
//}
//4.两个对象，先执行发短信还是hello？   1.打电话  2.发短信
public class Demo02 {
    public static void main(String[] args) {
        //两个对象，两个不同的调用者，两把锁
        Phone2 phone1=new Phone2();
        Phone2 phone2=new Phone2();

        //锁的存在，
        new Thread(()->{
            phone1.sendMsg();
        },"A").start();

        //捕获
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            phone2.call();
        },"B").start();

    }

}
class Phone2{

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

    //这里没有锁，不是同步方法，不受锁的影响
    public void hello(){
        System.out.println("hello");
    }
}
