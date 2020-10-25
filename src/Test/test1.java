package Test;

/**
 * Created by Administrator on 2020/3/19 0019.
 */
public class test1 {
    public static void main(String[] args) {
        int i =1;
        i=i++;
        int j=i++;
        int k =i+ ++i*i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
