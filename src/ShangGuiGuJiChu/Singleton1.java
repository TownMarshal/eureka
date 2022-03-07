package ShangGuiGuJiChu;

public class Singleton1 {

    /**
     * 方法二：使用静态代码块的饿汉模式
     */

        //1、私有化构造方法
        private Singleton1() {
        }
        //2、定义对象实例常量
        private final static Singleton1 instance;

        //3、使用静态代码块初始化常量
        static {
            instance = new Singleton1();
        }
        //4、返回对象实例
        public static Singleton1 getInstance() {
            return instance;
        }


}
