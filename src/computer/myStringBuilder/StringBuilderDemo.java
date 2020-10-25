package computer.myStringBuilder;

/**
 * Created by Administrator on 2020/2/12 0012.
 * StringBuilder构造方法
 *public StringBuilder append(任意类型)：添加数据，并返回对象本身
 *public StringBuilder reverse()：返回相反的字符序列
 *
 *  String StringBuilder StringBuffer区别
 *  string 类型不能拆分，底层被final修饰，其他两个可以进行字符串的拼接
 *  StringBuilder StringBuffer区别
 *  StringBuilder线程是不安全的，但是效率高，
 *  StringBuffer是线程安全的，效率低
 *
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append("world").append("java").append(100);
        System.out.println("sb：\t"+sb);
        sb.reverse();
        System.out.println("sb：\t"+sb);
    }
}
