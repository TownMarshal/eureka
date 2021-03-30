package ShangXueTang.MyGeneric;

public class ShowMsg {
     public void showFlag(Generic<?> generic){
    //通配符的上限限定
//     public void showFlag(Generic<? extends Number> generic){

         //通配符的下限限定
//     public void showFlag(Generic<? super Integer> generic){


         System.out.println(generic.getT());

     }
}
