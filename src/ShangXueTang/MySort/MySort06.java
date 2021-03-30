package ShangXueTang.MySort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class MySort06 {
        public static void main(String[] args) {
            Date[] arr =new Date[3];
            arr[0] =new Date();
            arr[1] =new Date(System.currentTimeMillis()-1000*60*60);
            arr[2] =new Date(System.currentTimeMillis()+1000*60*60);
             Utils.sort(arr);
            System.out.println(Arrays.toString(arr));


        }
    }





