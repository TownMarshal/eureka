package computer.AAAshenghuowenti;

/**
 * Created by Administrator on 2020/8/6 0006.
 * 五子棋创建思路
 * 空指针异常处理
 */
public class sparsearray {
    public static void main(String[] args) {
        //创建原始的二维数组11*11
        //0表示没有棋子，1表示黑棋子，2表示白棋
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
//        chessArr1[3][4] = 2;
        //输出原始的二维数组
        System.out.println("输出原始的二维数组");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        //将二维数组转为稀疏数组
        //1.先遍历二维数组得到非零数组个数
        int sum = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum:" + sum);

        //2.创建对应的稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        //遍历二维数组，将非零的值存放到稀疏数组中
        int count = 0;//用于记录第几个非零数据
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }

        //输出稀疏数组的形式

        System.out.println();
        System.out.println("得到的稀疏数组是-------------------------------");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);

        }
//        System.out.println("这里可以将得到的稀疏数组存到dat文件");



        //将稀疏数组恢复成原始的二维数组
        int chessArr[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        //添加非零数据(从稀疏数组的第二行开始遍历)
        for (int i = 1; i < sparseArr.length; i++) {
            chessArr[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        //打印添加非零数据后的生成的二维数组
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }




    }
}

