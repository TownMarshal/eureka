package ItHeiMa.myString.itheima_02;

/*
            使用 == 做比较：
        基本类型：比较的是数据值是否相同
        引用类型：比较的是地址值是否相同
        ==与 equals区别    ==比较的是变量的值，变量分为基本数据类型和引用数据类型
        基本数据类型比较的是变量的值是否相等，引用数据类型比较的是对应的引用的内存的首地址

        equals比较的是两个对象长得是否一样，判断两个对象的某些特征是否一样，实际上就是调用对象的equals方法进行比较

     public boolean equals​(Object anObject)：
        将此字符串与指定对象进行比较。由于我们比较的是字符串对象，所以参数直接传递一个字符串
 */
public class StringDemo02 {
    public static void main(String[] args) {
        //构造方法的方式得到对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);


        //直接赋值的方式得到对象
        String s3 = "abc";
        String s4 = "abc";

        //比较字符串对象地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("--------");

        //比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
