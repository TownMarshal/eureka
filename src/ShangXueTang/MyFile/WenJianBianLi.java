package ShangXueTang.MyFile;
import java.io.File;

/**
 * Created by Administrator on 2021/3/29 0029.
 * 编写一个程序，在命令行中以树状结构展示特定的文件及其文件夹
 */
public class WenJianBianLi {
    public static void main(String[] args) {
        File f = new File("D:\\CloudMusic");
        printFile(f, 0);
    }

    private static void printFile(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file.isDirectory()){
            File[]files=file.listFiles();
            for (File temp : files) {
                printFile(temp,level+1);
            }
        }
    }
}
