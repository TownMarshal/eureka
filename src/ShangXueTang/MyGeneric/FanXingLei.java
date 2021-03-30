package ShangXueTang.MyGeneric;

public class FanXingLei {
    public static void main(String[] args) {
        Generic<String> generic =new Generic<>();
        generic.setT("admin");
        String flag = generic.getT();
        System.out.println(flag);

        Generic<Integer> generic1=new Generic<>();
        generic1.setT(233);
        Integer  flag1= generic1.getT();
        System.out.println(flag1);


    }
}
