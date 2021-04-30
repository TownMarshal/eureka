package JingDianSuanFa;

/**
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3。编程找出1000以内的所有完数。
 */
public class wanshu {
    public static void main(String[] args) {
        for (int i=0; i<=1000; i++){
            isWanshu(i);
        }
    }

    static void isWanshu(int i){
        int sum = 0;
        for (int j=1; j<i/2; j++){
            if (i % j == 0){
                sum += j;
            }
        }
        if (sum == i){
            System.out.print(i+" its factors are:   ");
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                    System.out.print(j+", \n");
            }
        }
    }
}
