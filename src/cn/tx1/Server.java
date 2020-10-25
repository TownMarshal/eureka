package cn.tx1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server extends Thread{


    public void run() {
        DatagramSocket s = null;
        //创建UDP接收端的服务套接字
        try {
            s = new DatagramSocket(10001);
            //创建一个字节数组
            byte[] bs = new byte[1024];
            //创建一个接受的数据包
            DatagramPacket dp = new DatagramPacket(bs, bs.length);
            System.out.println("服务启动");
            while(true){
                //接受数据
                s.receive(dp);
                //取出数据
                byte[] data = dp.getData();
                //获得接受的数据的长度
                int length = dp.getLength();
                //把接受到的数据转换成字符串
                String str = new String(data, 0, length);
                System.out.println("接收到的数据："+str);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(s != null){
                s.close();
            }
        }

    }
}
