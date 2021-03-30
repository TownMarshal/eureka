package ShangXueTang.MyGeneric;

import java.io.Closeable;
import java.io.IOException;

/**
 * 泛型方法<>返回类型签名
 * 只能访问对象信息，不能修改信息
 */
public class TestMethod {
    public static void main(String[] args) {
        test("a");
    }
    public  static <T> void test(T a){
        System.out.println(a);
    }

    public  static <T extends Closeable> void test(T... a){
        for (T t : a) {
            try {
                if(null!=t){
                    t.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


}
