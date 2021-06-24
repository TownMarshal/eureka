package com;

import java.util.ArrayList;
import java.util.HashSet;

public class listtoset {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(12345);
        list.add(12345);

        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(list);
        System.out.println(set);

    }
}
