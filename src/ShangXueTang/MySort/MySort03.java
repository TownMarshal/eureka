package ShangXueTang.MySort;

import java.util.Arrays;
import java.util.Date;

public class MySort03 {
        public static void main(String[] args) {
            Date[] arr =new Date[3];
            arr[0] =new Date();
            arr[1] =new Date(System.currentTimeMillis()-1000*60*60);
            arr[2] =new Date(System.currentTimeMillis()+1000*60*60);
            //降序
            //从大到小排序 降序
            boolean sorted= true;
            int len =arr.length;
            for(int j=0;j<len-1;j++){ //趟数
                sorted =true; //假定有序
                for(int i=0;i<len-1-j;i++){ //次数
                    if(((Comparable)arr[i]).compareTo(arr[i+1])<0){
                        Date temp = arr[i];
                        arr[i] =arr[i+1];
                        arr[i+1] =temp;
                        sorted =false; //假定失败
                    }
                }
                if(sorted){ //减少趟数
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }





