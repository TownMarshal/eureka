package ShangXueTang.MyGeneric;



public class Test4 {
    public static void main(String[] args) {
        MethodGeneric.setFlag("LAOWANG");
        MethodGeneric.setFlag(123);

        String flag = MethodGeneric.getFlag("BSDSD");
        Integer flag1 = MethodGeneric.getFlag(1313);
        System.out.println(flag);
        System.out.println(flag1);

    }
}
