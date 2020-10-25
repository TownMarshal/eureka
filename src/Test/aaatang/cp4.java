package Test.aaatang;

import java.io.IOException;
import java.net.*;

/**
 * Created by Administrator on 2020/2/20 0020.
 */
public class cp4 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte bys []="hello,udp,我来了".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.0.101");
        int port = 10086;
        DatagramPacket dp =new DatagramPacket(bys,length,address,port);
        ds.send(dp);
        ds.close();
    }

}

