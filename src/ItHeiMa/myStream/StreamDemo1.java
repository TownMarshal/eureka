package ItHeiMa.myStream;

import java.util.ArrayList;

/*
    需求：按照下面的要求完成集合的创建和遍历
        1:创建一个集合，存储多个字符串元素
        2:把集合中所有以"张"开头的元素存储到一个新的集合
        3:把"张"开头的集合中的长度为3的元素存储到一个新的集合
        4:遍历上一步得到的集合
 */
//public class StreamDemo1 {
//    public static void main(String[] args) {
//        //创建一个集合，存储多个字符串元素
//        ArrayList<String> list = new ArrayList<String>();
//
//        list.add("林青霞");
//        list.add("张曼玉");
//        list.add("王祖贤");
//        list.add("柳岩");
//        list.add("张敏");
//        list.add("张无忌");
//
//        //把集合中所有以"张"开头的元素存储到一个新的集合
//        ArrayList<String> zhangList = new ArrayList<String>();
//
//        for(String s : list) {
//            if(s.startsWith("张")) {
//                zhangList.add(s);
//            }
//        }
//
////        System.out.println(zhangList);
//
//        //把"张"开头的集合中的长度为3的元素存储到一个新的集合
//        ArrayList<String> threeList = new ArrayList<String>();
//
//        for(String s : zhangList) {
//            if(s.length() == 3) {
//                threeList.add(s);
//            }
//        }
//
////        System.out.println(threeList);
//
//        //遍历上一步得到的集合
//        for(String s : threeList) {
//            System.out.println(s);
//        }
//        System.out.println("--------");
//
//        //Stream流来改进
////        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
//        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
//    }
//}
public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> array =new ArrayList<>();
        array.add("张无忌");
        array.add("赵敏");
        array.add("林青霞");
        array.add("王祖贤");
        array.add("张贤");
        array.add("张曼玉");
        array.add("柳岩");

//        ArrayList<String>zhangarr=new ArrayList<>();
//        for (String string:array){
//            if (string.startsWith("张")){
//                zhangarr.add(string);
//            }
//        }
////        System.out.println(zhangarr);
//        ArrayList<String>three = new ArrayList<>();
//        for (String s:zhangarr){
//            if (s.length()==3){
//                three.add(s);
//            }
//        }
////        System.out.println(three);
//        for (String ss:three){
//            System.out.println(ss);
//        }
//        array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
        array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(System.out::println);

    }
}