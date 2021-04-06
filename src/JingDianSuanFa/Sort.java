package JingDianSuanFa;

import java.util.Scanner;

/**
 * Created by Administrator on 2021/3/15 0015.
 */
public class Sort {
    public static void sort() {
        //导入scanner，并初始化
        Scanner input = new Scanner(System.in);
        int sort[] = new int[10];
        //定义一个常数
        int temp;
        //提示：请输入十个将要进行排序的数
        System.out.println("请输入10个排序的数据：");
        //遍历打印你输入的十个数都是啥
        for (int i = 0; i < sort.length; i++) {
            sort[i] = input.nextInt();
        }

        //排序实现
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - i - 1; j++) {
                if (sort[j] < sort[j + 1]) {
                    temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        //打印排序后的数组
        System.out.println("排列后的顺序为：");
        for (int i = 0; i < sort.length; i++) {
            System.out.print(sort[i] + "   ");
        }
    }
    //主方法。调用排序方法
    public static void main(String[] args) {
        sort();
    }
}


