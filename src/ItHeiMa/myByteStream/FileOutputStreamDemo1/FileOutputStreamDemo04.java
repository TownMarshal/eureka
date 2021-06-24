package ItHeiMa.myByteStream.FileOutputStreamDemo1;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流写数据加入异常处理
 */
public class FileOutputStreamDemo04 {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\git\\fos.txt");
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
