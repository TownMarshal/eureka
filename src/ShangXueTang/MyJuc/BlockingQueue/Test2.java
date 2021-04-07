package ShangXueTang.MyJuc.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 抛出异常：
Exception in thread "main" java.lang.IllegalStateException: Queue full
Exception in thread "main" java.util.NoSuchElementException
 */
public class Test2 {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        //<>()里面填写队列最多能放几个元素,队列是FIFO先进先出
        ArrayBlockingQueue blockingQueue = new ArrayBlockingQueue<>(3);
        System.out.println(blockingQueue.offer("a"));
        System.out.println(blockingQueue.offer("b"));
        System.out.println(blockingQueue.offer("c"));

        //
        System.out.println(blockingQueue.offer("c"));

    }
}
