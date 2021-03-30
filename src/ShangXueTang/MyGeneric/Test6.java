package ShangXueTang.MyGeneric;

public class Test6 {
    public static void main(String[] args) {
        ShowMsg showMsg=new ShowMsg();
        Generic<Integer> generic=new Generic<>();
        generic.setT(20);
        showMsg.showFlag(generic);

        Generic<Number> generic1=new Generic<>();
        generic1.setT(55);
        showMsg.showFlag(generic1);

        Generic<String> generic2=new Generic<>();
        generic2.setT("adasd");
        showMsg.showFlag(generic2);
    }
}
