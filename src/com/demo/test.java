package com.demo;

import java.util.ArrayList;
import java.util.List;

public class test {


    /**
     * for循环打印List中的值
     *
     * @param list
     */
    private static void printFor(List<String> list) {
        System.out.println("-----for循环开始-----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----for循环结束-----");
    }

    /**
     * forEach打印List中的值
     *
     * @param list
     */
    private static void printForEach(List<String> list) {
        System.out.println("-----forEach开始-----");
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println("-----forEach结束-----");
    }

    /**
     * forEach+Lambda打印List中的值
     *
     * @param list
     */
    private static void printForEachLambda(List<String> list) {
        System.out.println("-----forEach+Lambda开始-----");
        list.forEach(str -> System.out.println(str));
        System.out.println("-----forEach+Lambda结束-----");
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("第1个值");
        list.add("第2个值");
        list.add("第3个值");
        // for循环打印List中的值
        printFor(list);
        // forEach打印List中的值
        printForEach(list);
        // forEach+Lambda打印List中的值
        printForEachLambda(list);
    }
}

