package ShangXueTang.MyIO;

import java.io.File;

/**
 * 两个常量
 * 1、路径分隔符  ;
 * 2、名称分隔符 /(windows)  /(linux 等)
 *
 *
 * @author Administrator
 *
 */
public class Demo02 {
    /**
     * 相对路径与绝对路径构造 File对象
     * 1、相对路径
     File(String parent, String child)  ==>File("E:/xp/test","2.jpg")
     File(File parent, String child)     ==> File(new File("E:/xp/test"),"2.jpg")
     2、绝对路径
     File(String name);
     * @author Administrator
     *
     */

        public static void main(String[] args) {
            String parentPath ="D:/Chrome/a.txt";
            String name ="2.jpg";
            //相对路径
            File src =new File(parentPath,name);
            src =new File(new File(parentPath),name);
            //输出
            System.out.println(src.getName());
            System.out.println(src.getPath());
            //绝对路径
            src =new File("D:/Chrome/a.txt");
            System.out.println(src.getName());
            System.out.println(src.getPath());
            //没有盘符: 以 user.dir构建
            src =new File("D:/Chrome/a.txt");
            src =new File(".");
            System.out.println(src.getName());
            System.out.println(src.getPath());
            System.out.println(src.getAbsolutePath());
        }

    }

