package Test.aaatang;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Administrator on 2020/2/20 0020.
 */
public class cp2 {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        //      myLoad();

    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("001","林青霞");
        prop.setProperty("002","张曼玉");
        prop.setProperty("003","王祖贤");

        //void store(Writer writer, String comments)：
        FileWriter fw = new FileWriter("E:\\itcast\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
