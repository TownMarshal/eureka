package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo29 {
    public static void main(String[] args) {
        /**
         二维数组
         二维数组就是集合中套集合
         数据类型[][]数组名=new数据类型[整数][整数]
         注意：必须明确外围数组名
         数据类型[][]数组名={{值1，值2，值3}，{值4，值5，值6}，...}
         int[][]array1=new int[3][4];
         int[][]array={{1,2,3},{4,5,6},...}
         */
            int[][]arr=new int[3][4];
            arr[0][0]=12;
            arr[0][1]=13;
            arr[0][2]=14;

            arr[1][0]=15;
            arr[1][1]=16;
            arr[1][2]=17;

            arr[2][0]=18;
            arr[2][1]=19;
            arr[2][2]=20;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+"\t");
                }
                System.out.println();
            }
    }
}
