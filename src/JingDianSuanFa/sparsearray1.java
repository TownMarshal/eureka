package JingDianSuanFa;

import java.io.*;

/**
 * Created by Administrator on 2020/8/6 0006.
 * 五子棋创建思路
 * 空指针异常处理
 */
public class sparsearray1 {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11 * 11
        // 0: 表示没有棋子， 1 表示 黑子 2 表蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[4][5] = 2;
        chessArr1[2][4] = 1;
        // 输出原始的二维数组
        System.out.println("原始的二维数组~~");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        // 将二维数组 转 稀疏数组的思
        // 1. 先遍历二维数组 得到非0数据的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }

        // 2. 创建对应的稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        // 给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        // 遍历二维数组，将非0的值存放到 sparseArr中
        int count = 0; //count 用于记录是第几个非0数据
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        //打印稀疏数组
        System.out.println("打印稀疏数组");
        for (int[] row : sparseArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

        System.out.println("文件读出");
        DataOutputStream out = null;
        DataInputStream in = null;
        try {
            out = new DataOutputStream(new FileOutputStream("./sparsearray.txt"));
            for (int[] row : sparseArr) {
                for (int data : row) {
                    out.writeInt(data);
                }
            }
            //写出去的文件打开是乱码。jbc打开文本类型  所以乱码  数据流在流动的时候有明确的数据类型
            in = new DataInputStream(new FileInputStream("./sparsearray.txt"));
            for (int i = 0; i < sparseArr.length; i++) {
                System.out.print(in.readInt() + "\t");
                System.out.print(in.readInt() + "\t");
                System.out.println(in.readInt() + "\t");
            }


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //将读出来的数组还原成棋盘
        //将稀疏数组 --》 恢复成 原始的二维数组
				/*
				 *  1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组，比如上面的  chessArr2 = int [11][11]
					2. 在读取稀疏数组后几行的数据，并赋给 原始的二维数组 即可.
				 */

        //1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组

        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

        //2. 在读取稀疏数组后几行的数据(从第二行开始)，并赋给 原始的二维数组 即可

        for (int i = 1; i < sparseArr.length; i++) {
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        // 输出恢复后的二维数组
        System.out.println();
        System.out.println("恢复后的二维数组");

        for (int[] row1 : chessArr2) {
            for (int data : row1) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

    }

}

