package ItHeiMa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

/**
 * Created by Administrator on 2020/7/17 0017.
 * 需求：通过java程序访问网络
 */
public class img {
    public static void main(String[] args) throws IOException {
        URL u = new URL("https://www.aliyundrive.com/drive/folder/6333c6f1f60aab1a0f8b4017af20e07756f45d6c");
        URLConnection conn = u.openConnection();
        InputStream is = conn.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.print(new String(chs, 0, len));
        }

        br.close();

    }


}
