package computer.myStringBuilder;

/**
 * Created by Administrator on 2020/2/12 0012.
 * //StringBuilder转换为String
 * //String转换为StringBuilder
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //StringBuilder转换为String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        //String s =sb;错误做法
        String s = sb.toString();
        System.out.println(s);

        //String转换为StringBuilder
        String s1 = "hello world";
        //StringBuilder sb =s1;错误做法

        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(sb1);
    }
}
