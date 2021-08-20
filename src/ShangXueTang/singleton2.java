package ShangXueTang;

public class singleton2 {
    private singleton2() {
    }

    private static singleton2 s;

    public static synchronized singleton2 getInstance() {
        if (s == null) {
            s = new singleton2();

        }
        return s;
    }
}
