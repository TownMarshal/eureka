package ItHeiMa.myThread.MyThreadDemo4;
/*
    static void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数
    三分天下
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("曹操");
        ts2.setName("刘备");
        ts3.setName("孙权");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
//孙权:0
//        刘备:0
//        曹操:0
//        孙权:1
//        刘备:1
//        曹操:1
//        孙权:2
//        曹操:2
//        刘备:2