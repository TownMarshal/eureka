package JingDianSuanFa;

import java.util.Scanner;

/**
 * 题目：（1）判断几个9能被一个素数整除。（2）判断一个整数能被几个9整除。（原题：一个素数能被几个9整除）
 */
public class Demo45 {

    private static boolean isPrime(int x){
        if (x ==1 || x == 0){
            return false;
        }
        for (int i=2; i<Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = 0, num = 0;
        while (n < 100){
            if (isPrime(num)){
                arr[n] = num;
                n++;
                num++;
            } else {
                num++;
            }
        }
        String str = "9";
        int index = 0;
        while (str.length() < 9){
            if (Integer.parseInt(str) % arr[index] == 0){
                System.out.println(str + "%" + arr[index] + "= 0") ;
                if (index < 100-1){
                    index++;
                } else {
                    index = 0;
                    str = str + "9";
                }
            } else {
                if (index < 100-1){
                    index++;
                } else {
                    index = 0;
                    str = str + "9";
                }
            }
        }


        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = in.nextInt();
        int tmp = number;
        int count = 0;
        for(int i = 0 ; tmp%9 == 0 ;){
            tmp = tmp/9;
            count ++;
        }
        System.out.println(number+" 能够被 "+count+" 个9 整除。");
    }
}
