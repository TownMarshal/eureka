package cn.tx;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
public class ModiferTest3Client {
    public static void main(String[] args) {
        ModiferTest3 m = new ModiferTest3();
        m.publicMethod();
        m.protectedMethod();
        m.defaultMethod();
        //	m.privateMethod();
    }
}
