package ShangXueTang.Pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        Properties pro=new Properties();

        //读取绝对路径
        pro.load(new FileReader("D:\\MyStudy\\db.properties"));
        System.out.println(pro.getProperty("user","tangshuai"));
        //读取相对路径
        pro.load(new FileReader("db.properties"));
        System.out.println(pro.getProperty("user","tangshuai"));

        pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));

    }
}
