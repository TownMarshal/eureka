package com;

import java.io.*;
import java.util.ArrayList;

public class arraylistToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("nihao");
        list.add("tangning");
        list.add("wanshanghao");
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\git\\a.txt"));
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        bw.close();


    }
}
