package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 */
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
//                break;//结束当前循环1,2,3
                continue;//结束当前循环123567910
            }
            System.out.print(i);
        }
    }

//    public static void main(String[] args) {
//       label:for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (j % 4 == 0) {
////                break;//结束当前循环1,2,3
////                    continue;//结束当前循环123567910
//                    break label;
//                }
//                    System.out.print(j);
//
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        label:for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 10; j++) {
//                if (j % 4 == 0) {
////                break;//结束当前循环1,2,3
////                    continue;//结束当前循环123567910
//                    continue label;
//                }
//                System.out.print(j);
//            }
//            System.out.println("\t");
//        }
//    }


}
