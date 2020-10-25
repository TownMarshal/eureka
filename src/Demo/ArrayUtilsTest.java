package Demo;

/**
 * Created by Administrator on 2019/11/14 0014.
 */
public class ArrayUtilsTest {
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"\t");
        }
    }

    public static void main(String[] args) {
        printArr(new int[]{1,2,3,644,787});
    }
}
