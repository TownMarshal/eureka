package ShangGuiGuJiChu;

import java.util.Scanner;

public class dayintuxing {


    static Scanner sc = new Scanner(System.in);
    static int lines;

    public static void main(String[] args) {
        System.out.println("请输入需要打印的图形形的行数：");
        lines = sc.nextInt();
        rightTriangle();            // 直角三角形
        System.out.println("===================================");
        isoscelesTriangle();         // 等腰三角形
        System.out.println("===================================");
        hollowIsoscelesTriangle1();  //空心等腰三角形
        System.out.println("===================================");
        solidRhombus();              //实心菱形
        System.out.println("===================================");
        hollowRhombus();               //实心菱形
        System.out.println("===================================");
        demo5_9X9();                // 9,9乘法表5
    }

    // 9,9乘法表
    private static void demo5_9X9() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d x %d = %d \t", j, i, j * i);
            }
            System.out.println();
        }
    }

    // 直角三角形
    private static void rightTriangle() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    // 等腰三角形
    private static void isoscelesTriangle() {
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //空心等腰三角形
    private static void hollowIsoscelesTriangle1() {
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < lines - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                if (i < lines) {
                    if (m == 1 || m == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    //实心菱形
    private static void solidRhombus() {
        //正
        for (int i = 1; i <= (lines + 1) / 2; i++) {
            for (int j = 0; j < (lines + 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //倒
        for (int i = (lines + 1) / 2 - 1; i >= 0; i--) {
            for (int j = (lines + 1) / 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //空心菱形
    private static void hollowRhombus() {
        //正
        for (int i = 1; i <= (lines + 1) / 2; i++) {
            for (int j = 0; j < (lines + 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                if (m == 1 || m == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //倒
        for (int i = (lines + 1) / 2 - 1; i >= 1; i--) {
            for (int j = (lines + 1) / 2 - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) {
                if (m == 1 || m == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}

