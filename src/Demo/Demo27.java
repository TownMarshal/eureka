package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo27 {
    public static void main(String[] args) {
        /**
         冒泡排序
         从大到小排序
         第0轮     第1轮   第2轮    第3轮       第4轮
         23         25       25       25         51
         25         23       23       51         25
         12         12       51       23         23
         7          51       12       12         12
         51         7        7        7          7
         相邻的两个数来做比较，如果前一个数比后一个数大，那么就交换位置，最终每一轮的比较会产生一个最小值
         轮数：数组的长度减一
         每一轮的次数比较：数组的长度-轮数（0，1，2,3）-1
         */

            int[]arr={12,4,5,78,94,24};
            sortPop(arr);
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
        }
        public static void sortPop(int[]arr){
            //我们为了程序的严谨性，一定要判断null和0长度的问题
            if(arr!=null&&arr.length!=0){
                //外层循环是轮数
                for(int i=0;i<arr.length-1;i++){
                    //内层循环是每一轮比较的次数
                    for(int j=0;j<arr.length-i-1;j++){
                        //定义一个临时变量
                        if(arr[j+1]>arr[j]){
                            int temp=arr[j];
                            arr[j]=arr[j+1];
                            arr[j+1]=temp;
                        }
                    }
                }
            }
    }
}
