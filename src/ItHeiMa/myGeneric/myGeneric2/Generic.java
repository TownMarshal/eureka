package ItHeiMa.myGeneric.myGeneric2;

/**
 * Created by Administrator on 2020/2/17 0017.
 * 泛型方法
 */
/*
public class Generic {
    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {
        System.out.println(i);
    }

    public void show(Boolean b) {
        System.out.println(b);
    }
}
*/

/*
泛型类改进
public class Generic<T> {
    public void show(T t) {
        System.out.println(t);
    }
}
*/

//泛型方法改进
public class Generic {
    public <T> void show(T t) {
        System.out.println(t);
    }
}