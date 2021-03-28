package ItHeiMa.myGeneric.myGeneric3;

/**
 * Created by Administrator on 2020/2/17 0017.
 */
public class GenericImpl<T> implements Generic<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
