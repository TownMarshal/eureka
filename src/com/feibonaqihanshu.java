package com;

import java.util.Scanner;

public class feibonaqihanshu {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();

        if (a>=2){
            int[]arr=new int[a];
            arr[0]=1;
            arr[1]=1;
            for (int i = 2; i <a ; i++) {
                arr[i]=arr[i-1]+arr[i-2];
            }
            System.out.println(arr[a-1]);

        }



    }
}
