package Test;

import java.io.*;

public class SparseArray {

    public static void main(String[] args) {
        //创建一个原始的二维数组11*11
        //0表示没有棋子，1表示黑棋，2表示白棋
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始二维数组：");
        //遍历二维数组
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //统计原始二维数组不为0的的个数
        int count = 0;
        for (int[] row : chessArr1) {
            for (int data : row) {
                if(data != 0) {
                    count++;
                }
            }
        }
        System.out.println("原始二维数组不为0的的个数为："+count);

        //定义稀疏数组
        int[][] sparseArr = new int[count+1][3];

        //稀疏数组第一行的值
        sparseArr[0][0] = chessArr1.length;
        sparseArr[0][1] = chessArr1[0].length;
        sparseArr[0][2] = count;


        //为稀疏数组其他行赋值
        int count2 = 0;//记录是第几个非零的数据
        for (int i = 1;i<chessArr1.length;i++) {
            for (int j = 0;j<chessArr1[0].length;j++) {
                if (chessArr1[i][j]!=0) {
                    count2++;
                    sparseArr[count2][0] = i;
                    sparseArr[count2][1] = j;
                    sparseArr[count2][2] = chessArr1[i][j];
                }
            }
        }

        System.out.println("");
        System.out.println("稀疏数组为：");
        //遍历稀疏数组
        for (int i =0;i<sparseArr.length;i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        System.out.println("开始写入文件<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        //将稀疏数组保存到磁盘E:\java\repos\idea_repos\DataStructures\src\sparsearray\data.txt，文件名为data.txt
        BufferedWriter out =null;
        try {
            out = new BufferedWriter(new FileWriter("./map.data",true));  //文件写入流
            //将数组中的元素写入文件，每个用tab隔开
            for(int i = 0;i<sparseArr.length;i++) {
                for (int j=0;j<sparseArr[0].length;j++) {
                    out.write(sparseArr[i][j]+"\t");
                }
                out.newLine();
//                out.write("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("写入文件成功<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        /**
         * 读取map.data文件
         */
        BufferedReader br = null;
        int readRow = 0;//记录行数
//        String[] temp =null;//读取的数组
        //建新的稀疏数组
        int[][] sparseArr2 = new int[count+1][3];
        try {
            br = new BufferedReader(new FileReader("./map.data"));
            String line = null;
            //统计行数
            while ((line = br.readLine()) !=null) {
                String[] temp = line.split("\t");
                for (int j = 0;j<temp.length;j++) {
                    sparseArr2[readRow][j] = Integer.parseInt(temp[j]);
                }
                readRow++;
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /**
         * 遍历读取的稀疏数组
         */
        System.out.println("从磁盘读取的稀疏数组为：");
        for (int i = 0;i<sparseArr2.length;i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr2[i][0],sparseArr2[i][1],sparseArr2[i][2]);
        }

        /**
         * 将稀疏数组转为二维数组
         */
        //根据稀疏数组创建二维数组
        int[][] chessArr2 = new int[sparseArr2[0][0]][sparseArr2[0][1]];

        //为二维数组赋值
        for(int i = 1; i < sparseArr2.length; i++) {
            chessArr2[sparseArr2[i][0]][sparseArr2[i][1]] = sparseArr2[i][2];
        }
        System.out.println();
        System.out.println("转换后的新的二维数组为：");
        //输出新的二维数组
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}

