package datastructure.factorial;
//使用二维数组记忆法优化杨辉三角
public class PascalTriangle1 {
    public static int element(int[][] triangle, int i, int j) {
        if (triangle[i][j] > 0) {
            return triangle[i][j];
        }
        if (j == 0 || i == j) {
            triangle[i][j] = 1;
            return 1;
        }
        triangle[i][j] = element(triangle, i - 1, j - 1) + element(triangle, i - 1, j);
        return triangle[i][j];
    }

    public static void printSpace(int n, int i) {
        int num = (n - 1 - i) * 2;
        for (int j = 0; j < num; j++) {
            System.out.print(" ");
        }
    }

    public static void print(int n) {
        int[][] triangle = new int[n][];
        for (int i = 0; i < n; i++) {//行
            triangle[i] = new int[i + 1];
            printSpace(n, i);
            for (int j = 0; j <= i; j++) {
                System.out.printf("%-4d", element(triangle, i, j));
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
//        System.out.println(element(4, 2));//第四行第二列
        print(11);
    }
}
