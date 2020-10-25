package Demo.Object;

/**
 * Created by Administrator on 2020/2/15 0015.
 */
public class ObjectTest1{
    public static void main(String[]args){
        Student s = new Student();
        //如果我们打印一个对象时，实际上是调用的toString的返回值
		/*
		System.out.println(s);
		System.out.println(s.toString());
		*/
        //获取这个对象的hash值,每个对象的hashCode值是不一样的
        int hv = s.hashCode();
        System.out.println("十进制"+hv);
        //获取hash值的16进制
        String hvh = Integer.toHexString(hv);
        System.out.println("十六进制"+hvh);

        System.out.println("-------------------------------------------");

        s = new Student();
        hv = s.hashCode();
        System.out.println("十进制"+hv);
        //获取hash值的16进制
        hvh = Integer.toHexString(hv);
        System.out.println("十六进制"+hvh);

    }
}