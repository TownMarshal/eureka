package ShangXueTang.singleton;

/**
 * 懒汉模式
 */
public class Singleton2 {

//    private static Singleton2 singleton = null;
//
//    private Singleton2(){
//
//    }
//
//    private static Singleton2 getInstance(){
//        if (singleton == null){
//            return new Singleton2();
//        }
//        return singleton;
//    }

    /**
     * 懒汉模式的懒加载很明显，但是无法适应多线程
     */

    private static Singleton2 singleton = null;

    private Singleton2(){

    }

    private static synchronized Singleton2 getInstance(){
        if (singleton == null){
            return new Singleton2();
        }
        return singleton;
    }

    /**
     * 该方式的懒加载很明显，同时也可以适应多线程，但是效率太低
     */
}
