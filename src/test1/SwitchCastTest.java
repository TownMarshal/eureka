package test1;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class SwitchCastTest {
    public static void main(String[] args) {
        int number =2;
        switch (number){

            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");
            default:
                System.out.println("other");
        }
    }
}
