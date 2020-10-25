package computer.ArrayListDemo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2020/2/13 0013.
 * ArrayList常用方法
 * public boolean remove(Object o); 删除指定的元素，返回删除是否成功
 * public E remove(int index)删除指定索引处的元素，返回删除是否成功
 * public set(int index,E element);修改指定索引处的元素，返回被修改的元素
 * public get(int index);返回指定索引处的元素
 * public int size();返回集合中元素的个数
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //删除指定的元素，返回删除是否成功
//        System.out.println(array.remove("world"));
        // System.out.println(array.remove("javaee"));false

        //删除指定索引处的元素，返回删除是否成功
        //System.out.println(array.remove(1));
        //System.out.println(array.remove(5));//IndexOutOfBoundsException

        //修改指定索引处的元素，返回被修改的元素
        // System.out.println(array.set(1,("javaee")));//替代
        // System.out.println(array.set(5,("javaee")));//IndexOutOfBoundsException

        //返回指定索引处的元素
        //System.out.println(array.get(0));
        //System.out.println(array.get(5));//IndexOutOfBoundsException

        //返回集合中元素的个数
        System.out.println(array.size());

        //输出集合
        System.out.println("array"+array);
    }
}
