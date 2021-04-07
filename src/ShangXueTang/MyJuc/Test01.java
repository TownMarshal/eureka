package ShangXueTang.MyJuc;

/**
 * wait:=>Object   会释放锁 ；必须在同步代码块中；不需要捕获异常
 * sleep=>Thread  sleep睡着了，抱着锁睡觉，不会释放；sleep可以在任何地方睡；必须要捕获异常
 *
 */
public class Test01 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
