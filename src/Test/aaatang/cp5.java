package Test.aaatang;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Administrator on 2020/2/20 0020.
 */
public class cp5 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bys = new byte[1024];
        DatagramPacket dp =new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        byte[] datas = dp.getData();
        String dateString = new String(datas);
        System.out.println("数据是："+dateString);
        ds.close();


    }

}

