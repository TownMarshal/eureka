package ShangXueTang.MyComparable;

import java.beans.JavaBean;

/**
 * 内置引用数据类型，内置类比较大小：
 * 1.整数，小数，Integer Float Double直接比较数据类型的大小
 * 2.字符：比较unicode码之差
 * 3.字符串：如果其中一个是另外一个起始开始的子串，返回长度之差，否则，返回第一个不相等的unicode码之差
 * 4.java.util
 */
public class Demo01 {
    public static void main(String[] args) {
        Integer a;//根据基本数据类型比较大小
        Character ch;//根据Unicode编码顺序
        //字符串比较大小，如果其中一个是另外一个起始开始的子串，返回长度之差，否则，返回第一个不相等的unicode码之差
        String str = "abc";
        String str2 = "abcd123";
        System.out.println(str.compareTo(str2));

        String str3 = "abc";
        String str4 = "aac";
        System.out.println(str3.compareTo(str4));

        java.util.Date date;//日期返回的是，根据日期的长整型数比较


    }
}
