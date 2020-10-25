package computer.ArrayListDemo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2020/2/13 0013.
 * 遍历集合的通用格式
 *
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();

        //往集合中添加字符串对象
        array.add("唐帅");
        array.add("唐琪");
        array.add("唐你");
//        System.out.println(array.get(0));
//        System.out.println(array.get(1));
//        System.out.println(array.get(2));
        //遍历集合的通用格式
        for (int i = 0; i <array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
