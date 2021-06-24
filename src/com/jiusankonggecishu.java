package com;

public class jiusankonggecishu {
    public static void main(String[] args) {
        String s="i am very like you so much and do you love me?";
        char[] chars = s.toCharArray();
        int count=0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==32){
                count++;
            }
        }
        System.out.println("空格的个数是："+count);
    }
}
