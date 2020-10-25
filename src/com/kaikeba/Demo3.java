package com.kaikeba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2020/7/17 0017.
 * 需求：通过java程序访问网络
 * 实现方式
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        URL u = new URL("https://zaixianke.com/yq/all");
        URLConnection conn = u.openConnection();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        br.close();

    }


}
