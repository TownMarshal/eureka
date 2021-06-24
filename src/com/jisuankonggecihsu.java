package com;

public class jisuankonggecihsu {
    public static void main(String[] args) {
        String s="i am a boy an do you love me now";
        int count=0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==32){
                count++;
            }
        }
        System.out.println(count);
    }
}
