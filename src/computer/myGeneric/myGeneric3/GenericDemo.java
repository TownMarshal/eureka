package computer.myGeneric.myGeneric3;

/**
 * Created by Administrator on 2020/2/17 0017.
 * 泛型接口的定义和使用
 */
public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new GenericImpl<String>();
        g1.show("林青霞");

        Generic<Integer> g2 = new GenericImpl<Integer>();
        g2.show(30);
    }
}
