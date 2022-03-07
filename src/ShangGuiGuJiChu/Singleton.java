package ShangGuiGuJiChu;

public class Singleton {
    /**
     * 方法1：使用静态变量的饿汉式单例模式
     */
    //1、私有化构造参数，防止外界使用new初始化
    private Singleton() {
    }

    //2、使用静态变量方式初始化对象实例
    private final static Singleton instance = new Singleton();

    //3、提供方法供外部获取单例instance
    public static Singleton getInstance() {
        return instance;
    }
}
