package ShangXueTang.Pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * 资源配置文件的读写
 * 1.，key和value只能是字符串只能存储字符串
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        pro.setProperty("driver", "com.mysql.cj.jdbc.Driver");
//        pro.setProperty("url","jdbc:mysql://192.168.31.135:3306/zmg?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC");
        pro.setProperty("user", "scott");
        pro.setProperty("pwd", "tiger");
        String url = pro.getProperty("url", "test");
        System.out.println(url);
        //绝对路径，带盘符
//        pro.store(new FileOutputStream(new File("D:\\MyStudy\\db.properties")), "db配置");
//        pro.storeToXML(new FileOutputStream(new File("D:\\MyStudy\\db.xml")), "db配置xml文件");

        //默认路径是相对我们当前工程,project
        pro.store(new FileOutputStream(new File("db.properties")), "db配置");

    }
}
