package ShangXueTang.singleton;

/**
 * 双重校验锁
 */
public class Singleton4 {

    private volatile static Singleton4 singleton = null;

    private Singleton4(){

    }

    private static Singleton4 getInstance(){
        if (singleton == null){
            //使用synchronized锁定类，就不会导致多线程
            synchronized (Singleton4.class){
                if (singleton == null){
                    return new Singleton4();
                }
            }
        }
        return singleton;
    }
}
