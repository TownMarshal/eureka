package com;

public class sort1111 {
    public static void main(String[] args) {
        int[]arr=new int[]{1,2,33,4,5,6,56,77};
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
