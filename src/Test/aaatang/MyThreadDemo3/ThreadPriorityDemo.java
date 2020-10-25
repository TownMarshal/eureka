package Test.aaatang.MyThreadDemo3;

/*
    Thread类中设置和获取线程优先级的方法
        public final void setPriority(int newPriority)：更改此线程的优先级
        public final int getPriority()：返回此线程的优先级
 */
//public class ThreadPriorityDemo {
//    public static void main(String[] args) {
//        ThreadPriority tp1 = new ThreadPriority();
//        ThreadPriority tp2 = new ThreadPriority();
//        ThreadPriority tp3 = new ThreadPriority();
//
//        tp1.setName("高铁");
//        tp2.setName("飞机");
//        tp3.setName("汽车");
//
//
//        tp1.setPriority(5);
//        tp2.setPriority(10);
//        tp3.setPriority(1);
//
//
//        tp1.start();
//        tp2.start();
//        tp3.start();
//    }
//}
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority a1 = new ThreadPriority();
        ThreadPriority a2 = new ThreadPriority();
        ThreadPriority a3 = new ThreadPriority();

        a1.setName("飞机");
        a2.setName("汽车");
        a3.setName("轮船");

        a1.setPriority(5);
        a2.setPriority(10);
        a3.setPriority(1);

        a1.start();
        a2.start();
        a3.start();

    }
}
