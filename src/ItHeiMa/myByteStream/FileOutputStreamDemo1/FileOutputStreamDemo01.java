package ItHeiMa.myByteStream.FileOutputStreamDemo1;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    FileOutputStream：文件输出流用于将数据写入File
        FileOutputStream​(String name)：创建文件输出流以指定的名称写入文件
 */
public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\git\\fos.txt");
        fos.write(97);
        fos.close();
    }
}
