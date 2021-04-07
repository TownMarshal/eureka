package ShangXueTang.MyIO;

import java.io.File;

/**
 * 两个常量
 * 1、路径分隔符  ;
 * 2、名称分隔符 /(windows)  /(linux 等)
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        //路径表示形式
        String path ="D:\\git\\a.jpg";
//        path="D:"+File.separator+"git"+File.separator+"a.jpg";
        //推荐方式
//        path="D:/Chrome/微信图片_20210331153230";
    }

}
