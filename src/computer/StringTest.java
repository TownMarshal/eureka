package computer;

/**
 * Created by Administrator on 2020/2/15 0015.
 */
public class StringTest {
    public static void main(String[] args) {
        String str =   "ren";
        String str1 =   "ren";
        //双等号比较的是他俩的地址（不是他俩的值），如果是true，说明他俩是指向的同一地址
        System.out.println(str == str1);
        str += "liang";
        System.out.println(str);
    }
}
