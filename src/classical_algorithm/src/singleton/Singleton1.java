package singleton;

/**
 * 饿汉模式
 */
public class Singleton1 {

    /** 方式1
     * private static Singleton1 singleton = new Singleton1();
     *
     *     private Singleton1(){
     *
     *     }
     *
     *     private static Singleton1 getInstance(){
     *         return singleton;
     *     }
     */

    private static Singleton1 singleton = null;

    /**
     * 在类加载的时候进行实例化
     */
    static {
        singleton = new Singleton1();
    }

    private Singleton1(){

    }

    private static Singleton1 getInstance(){
        return singleton;
    }

    /**
     * 单例的饿汉模式是在类加载的时候进行实例化，但是无法确保其他的类会不会导致该类多次加载，这个时候就没有提现懒加载（lazy loading）
     */
}
