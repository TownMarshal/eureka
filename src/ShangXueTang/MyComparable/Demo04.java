package ShangXueTang.MyComparable;

import java.util.Arrays;

public class Demo04 {
    public static void main(String[] args) {
        //从小到大排列字符串数组
        String[]arr={"a","abcd","abc","def"};
        Utils.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
