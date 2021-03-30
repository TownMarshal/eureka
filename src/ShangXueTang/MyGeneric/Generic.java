package ShangXueTang.MyGeneric;

/**
 * Created by Administrator on 2020/2/17 0017.
 * 泛型类
 */
public class Generic<T> {
    //静态方法是无法使用类上面定义的泛型的
//    public static  T demo(T name){
//        return null;
//    }

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
