package com.demo;

public class jiaohuanshuzuyuansu1 {
    //方法交换两个数组，需要参数及返回值，提供两个数组，数组里面的值实际没有发生改变，所以要定义返回值
    public int[][] changeTwoArrray(int[]a,int[]b){
        int[]temp=a;
        a=b;
        b=temp;
        int[][]result={a,b};
        return result;
    }

    public static void main(String[] args) {
        int[]x={1,2,3,4};
        int[]y={5,6,7,8,99};


        jiaohuanshuzuyuansu1 j = new jiaohuanshuzuyuansu1();
      int[][]value=  j.changeTwoArrray(x,y);
      x=value[0];
      y=value[1];

        for (int v : x) {
            System.out.println(v);
        }
        for (int v : y) {
            System.out.println(v);

        }
    }
}
