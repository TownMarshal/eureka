package ShangXueTang.MyJuc.ProductCustomer;

/**
 * 线程之间的通信问题：生产者消费者问题
 * 线程交替执行， A B操作同一个变量 num=0
 * A num+1
 * B num-1
 * 面试：
 * 单例模式，排序算法，生产者消费者
 * 问题存在：A ,B两个线程
 * 四个线程安全吗？不安全，if存在虚假唤醒问题
 * 防止虚假唤醒问题：while
 */
public class A1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data1.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data1.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data1.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data1.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();


    }
}

class Data1 {//数字，资源类

    private int num = 0;

    //+1
    public synchronized void increment() throws InterruptedException {
        while (num != 0) {
            //等待
            this.wait();
        }
        num++;
        System.out.println(Thread.currentThread().getName() + "=>" + num);
        this.notifyAll();
        //通知其他线程，我+1完了
    }


    //-1
    public synchronized void decrement() throws InterruptedException {
        while (num == 0) {
            //等待
            this.wait();
        }
        //通知其他线程，我-1完了
        num--;
        System.out.println(Thread.currentThread().getName() + "=>" + num);
        this.notifyAll();
    }

}
