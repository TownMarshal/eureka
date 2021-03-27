package test1;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class Swictch1 {

    public static void main(String[] args) {
        int a =3;
        int x=100;
        switch (a){
            case 1:
               x+=5;
               break;
            case 2:
               x+=10;
                break;
            case 3:
               x+=16;
               break;
            default:
               x+=34;
//               return;
        }
    }


}
