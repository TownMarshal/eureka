package com;

public class Demo02 {
    public static void main(String[] args) {
        int a=10;
        int b=a;
        b=100;
        System.out.println(a);

        int[]x={10,20,30};
        int[]y=x;
        y[0]=100;
        System.out.println(x[0]);
    }
}
