package JingDianSuanFa;

public class xishushuzu {
    public static void main(String[] args) {
        //二维数组，11*11
        int[][] arr1 = new int[11][11];
        arr1[1][2] = 1;
        arr1[2][3] = 2;
        System.out.println("原始的数组时：");
        for (int[] ints : arr1) {
            for (int i : ints) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        //转换稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (arr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数是：" + sum);

        //创建一个稀疏数组
        int[][] arr2 = new int[sum + 1][3];
        arr2[0][0] = 11;
        arr2[0][1] = 11;
        arr2[0][2] = sum;

        //遍历二维数组存放稀疏数组中
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != 0) {
                    count++;
                    arr2[count][0] = i;
                    arr2[count][1] = j;
                    arr2[count][2] = arr1[i][j];
                }
            }
        }
        //输出稀疏数组
        for (int[] ints : arr2) {
            System.out.println(ints[0] + "\t"
                    + ints[1] + "\t"
                    + ints[2] + "\t"
            );
        }
        //还原稀疏数组
        //读取稀疏数组的值
        int[][] arr3 = new int[arr2[0][0]][arr2[0][1]];
        //给其中的元素还原值

        for (int i = 1; i < arr2.length; i++) {
            arr3[arr2[i][0]][arr2[i][1]] = arr2[i][2];
        }
        //打印还原后的数组
        for (int[] ints : arr3) {
            for (int i : ints) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

    }
}
