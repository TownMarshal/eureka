package com.kaikeba;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            int result = reversed(input);
            System.out.println("result = " + result);
        }
    }

    private static int reversed(int input) {
        int r = 0;
        while (input != 0) {
            int temp = input % 10;
            input = input / 10;
            if (r > Integer.MAX_VALUE / 10) {
                return 0;
            }
            if (r < Integer.MIN_VALUE / 10) {
                return 0;
            }
            r = r * 10 + temp;
        }
        return r;
    }
}


