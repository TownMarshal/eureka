package Test.aaatang.MyThreadDemo3;

//public class ThreadPriority extends Thread {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println(getName() + ":" + i);
//        }
//    }
//
//}
public class ThreadPriority extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}