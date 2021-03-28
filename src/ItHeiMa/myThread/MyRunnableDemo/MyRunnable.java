package ItHeiMa.myThread.MyRunnableDemo;

public class MyRunnable implements Runnable {
//Thread.currentThread().getName()拿到当前的线程，在那名字
    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
