package ShangXueTang.MyJuc.basuoxianxiang;


import java.util.concurrent.TimeUnit;

/**
 * 八锁：关于锁的八个问题
 * 1.标准情况下，两个线程先打印，发短信还是打电话？ 1、发短信2.打电话
 * 2.sendMsg()方法延迟四秒，情况下，两个线程先打印，发短信还是打电话？ 1、发短信2.打电话
 * 3.增加了一个普通方法，先执行发短信还是hello？  1.hello  2.发短信
 */
//4.两个对象，先执行发短信还是hello？   1.打电话  2.发短信
//    5.增加两个静态的同步方法,只有一个对象，先打印发短信还是打电话？
//public class Demo03 {
//    public static void main(String[] args) {
//        Phone3 phone =new Phone3();
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
//            phone.call();
//        },"B").start();
//
//    }
//
//}
////Phone只有唯一的   class对象
//class Phone3{
//
//    //synchronized 的对象是方法的调用者！两个方法用的是同一个锁（phone），谁先拿到谁先执行
//    //static是静态方法，类一加载就有了，class模板，锁的是class
//    public static synchronized void sendMsg(){
//        try {
//            TimeUnit.SECONDS.sleep(4);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("发短信");
//    }
//    public static synchronized void call(){
//        System.out.println("打电话");
//    }
//
//
//}
//6.两个对象，增加两个静态的同步方法,只有一个对象，先打印发短信还是打电话？  1.发短信  2.打电话
public class Demo03 {
    public static void main(String[] args) {
        //两个对象的class模板只有一个，static,锁的是class
        Phone3 phone1 =new Phone3();
        Phone3 phone2 =new Phone3();

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
//Phone只有唯一的   class对象
class Phone3{

    //synchronized 的对象是方法的调用者！两个方法用的是同一个锁（phone），谁先拿到谁先执行
    //static是静态方法，类一加载就有了，class模板，锁的是class
    public static synchronized void sendMsg(){
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("发短信");
    }
    public static synchronized void call(){
        System.out.println("打电话");
    }


}
