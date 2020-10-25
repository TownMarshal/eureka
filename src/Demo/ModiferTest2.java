package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
/**
 权限修饰符：

 */

public class ModiferTest2 {
    public void publicMethod(){
        System.out.println("我是public方法");
    }

    protected void protectedMethod(){
        System.out.println("我是protected方法");
    }
    void defaultMethod(){
        System.out.println("我是默认方法");
    }
    private void privateMethod(){
        System.out.println("我是private方法");
    }
    public static void main(String[] args) {
        ModiferTest2 m = new ModiferTest2();
        m.publicMethod();
        m.protectedMethod();
        m.defaultMethod();
        m.privateMethod();
    }
}
