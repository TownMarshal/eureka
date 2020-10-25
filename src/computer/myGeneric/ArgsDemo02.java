package computer.myGeneric;

/**
 * Created by Administrator on 2020/2/17 0017.
 *  Arrays工具类中有一个静态方法：
 * public static <T> List<T> asList​(T... a)：返回由指定数组支持的固定大小的列表
 *
 * List接口中有一个静态方法：
 *  public static <E> List<E> of​(E... elements)：返回包含任意数量元素的不可变列表
 *
 * Set接口中有一个静态方法：
 *   public static <E> Set<E> of​(E... elements) ：返回一个包含任意数量元素的不可变集合
 */
public class ArgsDemo02 {
    public static void main(String[] args) {
        //public static <T> List<T> asList​(T... a)：返回由指定数组支持的固定大小的列表
     /*   List<String> list = Arrays.asList("hello", "world", "java");

//        list.add("javaee"); //UnsupportedOperationException
//        list.remove("world"); //UnsupportedOperationException
        list.set(1,"javaee");
       System.out.println(list);*/

        //public static <E> List<E> of​(E... elements)：返回包含任意数量元素的不可变列表
     /*   List<String> list = List.of("hello", "world", "java", "world");

//        list.add("javaee");//UnsupportedOperationException
//        list.remove("java");//UnsupportedOperationException
//        list.set(1,"javaee");//UnsupportedOperationException*/
//
//        System.out.println(list);

        //public static <E> Set<E> of​(E... elements) ：返回一个包含任意数量元素的不可变集合
      /* //不能给重复的元素，返回的集合不能做增删操作，没有修改的方法
       Set<String> set = Set.of("hello", "world", "java","world"); //IllegalArgumentException
        Set<String> set = Set.of("hello", "world", "java");

        set.add("javaee");//UnsupportedOperationException
        set.remove("world");//UnsupportedOperationException

        System.out.println(set);*/
    }
}
