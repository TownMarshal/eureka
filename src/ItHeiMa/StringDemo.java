package ItHeiMa;

/**
 * java.lang.String的intern()方法"abc".intern()方法的返回值还是字符串"abc"，
 * 表面上看起来好像这个方法没什么用处。
 * 但实际上，它做了个小动作：检查字符串池里是否存在"abc"这么一个字符串，
 * 如果存在，就返回池里的字符串；如果不存在，该方法会 把"abc"添加到字符串池中，然后再返回它的引用。
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = s2; // 引用传递
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s2 == s3); // true
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s2.equals(s3)); // true

        s2 = s2.intern();
        System.out.println(s1 == s2);       //  true
        System.out.println(s1.equals(s2));  //  true
    }
}
