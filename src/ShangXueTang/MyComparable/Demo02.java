package ShangXueTang.MyComparable;

import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        //从小到大排列字符串数组
        String[]arr={"a","abcd","abc","def"};
        boolean sorted =true;
        int len =arr.length;
        for (int j = 0; j < len-1; j++) {
            sorted=true;
            for (int i = 0; i <len-1-j; i++) {
                if (((Comparable) arr[i]).compareTo(arr[i+1])>0){
                    String temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    sorted=false;
                }
            }
            if (sorted){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
