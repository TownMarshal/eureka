package ShangXueTang;

public class singleton1 {
    private singleton1() {
    }

    private static singleton1 singleton1 = new singleton1();

    public static singleton1 getInstance() {
        return singleton1;
    }
}
