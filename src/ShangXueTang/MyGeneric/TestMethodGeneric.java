package ShangXueTang.MyGeneric;

/**
 * 非静态泛型方法
 */
public class TestMethodGeneric {
    public static void main(String[] args) {
        MethodGeneric mg = new MethodGeneric();
        mg.setName("李明");
        mg.setName(23424);
        System.out.println("====================");
        MethodGeneric mg1 = new MethodGeneric();
        String name = mg1.getName("tswwww");

        Integer name1 = mg1.getName(12212);

        System.out.println(name);
        System.out.println(name1);


    }
}
