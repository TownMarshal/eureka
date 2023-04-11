package datastructure.factorial;

import java.util.Arrays;

//斐波那契数列 0 1 2 3 5 8 13 21 34 55 89 144
public class Fibonacci {
    //f(3)=>5   调用次数
    //f(4)=>9
    //f(5)=>15
    //f(n)调用次数     2*f(n+1)-1
    //时间复杂度 Θ 1.618^n
    //使用Memorization(记忆法，也称备忘录) 改进


    public static int fibonacci(int n) {
        int[] cache = new int[n + 1];
        Arrays.fill(cache, -1);//[-1,-1,-1,-1,-1,-1]
        cache[0] = 0;
        cache[1] = 1;//[0,1,-1,-1,-1,-1]
        return f(n, cache);
    }

    public static int f(int n, int[] cache) {
   /*     if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }*/
        if (cache[n] != -1) {
            return cache[n];
        }
        int x = f(n - 1, cache);
        int y = f(n - 2, cache);
        cache[n] = x + y;//[0,1,?,-1,-1,-1] 存入数组
        return cache[n];
    }

    public static void main(String[] args) {
//        System.out.println(f(8));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(13));
    }

}
