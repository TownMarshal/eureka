package ShangXueTang.MyGeneric;

/**
 *
 */
public class TestFanXingJieKou {
    public static void main(String[] args) {
        FanXingJieKouImpl i=new FanXingJieKouImpl();
        String name = i.getName("oldlu");
        System.out.println(name);

        FanXingJieKou<String> i1=new FanXingJieKouImpl();
        String name1 = i1.getName("laozhang");
        System.out.println(name1);


    }
}
