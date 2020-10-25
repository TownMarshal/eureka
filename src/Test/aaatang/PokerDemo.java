package Test.aaatang;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2020/2/19 0019.
 */
public class PokerDemo  {
    public static void main(String[] args)  throws IOException{
        FileInputStream fis = new FileInputStream("E:\\itcast\\窗里窗外.txt");
        FileOutputStream fos = new FileOutputStream("E:\\itcast\\林青霞\\窗里窗外.txt");
        /*int by;
        while ((by = fis.read())!= -1){
            fos.write(by);
        }*/
        byte [] bys = new byte[2048];
        int len;
        while ((len= fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
