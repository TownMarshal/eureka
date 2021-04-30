package JingDianSuanFa;

/**
 * 求一个3*3矩阵主对角线元素之和
 */
public class Demo29 {
    public static void main(String[] args) {
        int[][] array = {{5,5,5},{4,5,6},{7,5,9}};
        int sum = 0, sum1 = 0;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (i==j){
                    sum += array[i][j];
                }
            }
        }
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (i+j == 3-1){
                    sum1 += array[i][j];
                }
            }
        }
        System.out.println("对角线之和为"+ sum + "\t" + sum1);
    }
}
