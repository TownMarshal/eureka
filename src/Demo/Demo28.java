package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
public class Demo28 {
    public static void main(String[] args) {
        /**
         数组的倒置
         获取中间索引：length/2
         获取前半段的对称索引：length-1-i
         */

        int[]arr={12,4,5,78,94,24};
        reverseArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void reverseArr(int[]arr){
        for(int i=0;i<arr.length/2;i++){
            //获取i对称的
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }
    }
}
