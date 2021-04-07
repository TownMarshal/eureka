package ShangXueTang.MyJuc.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 抛出异常：
Exception in thread "main" java.lang.IllegalStateException: Queue full
Exception in thread "main" java.util.NoSuchElementException
 */
public class Test1 {
    public static void main(String[] args) {
        test();
        test2();
    }

    public static void test() {
        //<>()里面填写队列最多能放几个元素,队列是FIFO先进先出
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.add("a"));
        System.out.println(blockingQueue.add("b"));
        System.out.println(blockingQueue.add("c"));

        //Exception in thread "main" java.lang.IllegalStateException: Queue full
//        System.out.println(blockingQueue.add("d"));

        System.out.println("================================");
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());
        System.out.println(blockingQueue.remove());

//        Exception in thread "main" java.util.NoSuchElementException
//        System.out.println(blockingQueue.remove());


    }
    public static void test2() {
        //<>()里面填写队列最多能放几个元素,队列是FIFO先进先出
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));


        System.out.println(blockingQueue.offer("c"));

    }
}
