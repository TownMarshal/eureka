package JingDianSuanFa;

import java.util.Scanner;

/**
 * 有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数 int t=(i+m)%arr.length;
 */
public class Demo36 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int[] arr={3,12,22,45,51,73,86,99};
            int[] temp=new int[arr.length];
            System.out.println("移动前数组为：");
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
                System.out.print(arr[i]+"  ");
            }
            System.out.println();
            System.out.println("请输入需要后移几个位置：");
            int m=sc.nextInt();
            for(int i=0;i<arr.length;i++){
                int t=(i+m)%arr.length;
                arr[t]=temp[i];
            }
            System.out.println("移动后数组为：");
            for(int i:arr){
                System.out.print(i+"  ");
            }
            System.out.println();
        }
}
