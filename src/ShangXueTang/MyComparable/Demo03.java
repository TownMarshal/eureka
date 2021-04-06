package ShangXueTang.MyComparable;

import java.util.Arrays;
import java.util.Date;

public class Demo03 {
    public static void main(String[] args) {
        Date []arr=new Date[3];
        arr[0]=new Date();
        arr[1]=new Date(System.currentTimeMillis()-1000*60*60);
        arr[2]=new Date(System.currentTimeMillis()+1000*60*60);

        //从小到大排列日期数组
        boolean sorted =true;
        int len =arr.length;
        for (int j = 0; j < len-1; j++) {
            sorted=true;
            for (int i = 0; i <len-1-j; i++) {
                if (((Comparable) arr[i]).compareTo(arr[i+1])>0){
                    Date temp=arr[i];
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
