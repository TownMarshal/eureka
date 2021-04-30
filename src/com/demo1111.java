package com;


import java.util.Scanner;

public class demo1111 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();

            int result = reversed(input);
            System.out.println("result = " + result);
        }
    }

    private static int reversed(int input) {
        // TODO Auto-generated method stub
        int rev = 0;

        while (input != 0) {
            int temp = input % 10;
            input = input / 10;
            //大致思想：
            //1、只要大于Integer.MAX_VALUE/10,
            //2、或者是等于Integer.MAX_VALUE/10，并且最后一位是大于Integer.MAX_VALUE最后一位，但是实际中是不会发生
            if (rev > Integer.MAX_VALUE / 10 /* || ((rev == Integer.MAX_VALUE/10)&&temp> Integer.MAX_VALUE%10)*/) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 /* || ((rev == Integer.MIN_VALUE/10) && temp < Integer.MIN_VALUE%10) */) {
                return 0;
            }
            rev = rev * 10 + temp;
        }
        return rev;
    }

}

