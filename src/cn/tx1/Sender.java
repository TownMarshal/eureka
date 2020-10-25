package cn.tx1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Sender extends Thread{

    private String ip;

    public Sender(String ip) {
        super(ip);
        this.ip = ip;

    }

    public  void run() {
        DatagramSocket s = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //定义一个UDP的套接字
        try {
            s = new DatagramSocket();

            String line = null;
            while((line = br.readLine()) != null){
                //把字符串转换成字节
                byte[] bs = line.getBytes();
                //组装一个数据包
                DatagramPacket dp = new DatagramPacket(bs, bs.length, InetAddress.getByName(ip), 10000);
                //发送数据包
                s.send(dp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(s != null){
                s.close();
            }
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
