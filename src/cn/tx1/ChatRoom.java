package cn.tx1;

public class ChatRoom {


    public static void main(String[] args) {
        //创建发送线程
        Sender s = new Sender("192.168.0.13");
        //创建接受线程
        Server ss = new Server();

        s.start();
        ss.start();
    }
}
