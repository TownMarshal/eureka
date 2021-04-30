/**
 * 打印出杨辉三角形（要求打印出10行如下图）
 * 1
 * 1   1
 * 1   2   1
 * 1   3   3   1
 * 1   4   6   4   1
 * 1   5   10   10   5   1
 */
public class Demo33 {
     public static void main(String[] args) {
        int i, j;
         int n = 10;
        int[][] a = new int[n][n];
        for (i = 0; i < n; i++) {
            a[i][i] = 1;
            a[i][0] = 1;
        }
        for (i = 2; i < n; i++) {
            for (j = 1; j <= i - 1; j++) {
                a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
            }
        }

         for (i = 0; i < n; i++) {
             for (j = 0; j <= i; j++) {
                 System.out.print(a[i][j] + "\t");
             }
             System.out.println();
         }

         int[][] arr = new int[10][10];
         for(i=2; i<10; i++){
             for (j=1; j<i-1; j++){
                 arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
             }
         }

        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
     }
}
