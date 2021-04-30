package ShangGuiGuJiChu;

import java.util.Scanner;

public class yanghuisanjiao {


    public static int num(int x, int y) {
        if (y == 1 || y == x) {
            return 1;
        }
        int c = num(x - 1, y - 1) + num(x - 1, y);
        return c;
    }

    static void calculate(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { // 打印空格后面的字符, 从第1 列开始往后打印
                System.out.print(num(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("打印杨辉三角形的行数：");
        int row = scan.nextInt();
        calculate(row);
    }
}


