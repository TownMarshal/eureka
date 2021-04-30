package ShangXueTang.singleton;

/**
 * 静态内部类
 */
public class Singleton3 {

    private static class SingletonFactory{
        private static final Singleton3 SINGLETON = new Singleton3();
    }

    private Singleton3(){

    }

    private static Singleton3 getInstance(){
        return SingletonFactory.SINGLETON;
    }

    /**
     * 利用了classloder的机制来保证初始化instance时只有一个线程,与饿汉模式不一样
     * 是只要Singleton1类被装载了，那么instance就会被实例化（没有达到lazy loading效果），
     * 而这种方式是Singleton3类被装载了，instance不一定被初始化。
     * 因为SingletonFactory类没有被主动使用，只有显示通过调用getInstance方法时，
     * 才会显示装载SingletonFactory类，从而实例化SINGLETON。
     */
}
