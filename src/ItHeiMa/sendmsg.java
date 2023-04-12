package ItHeiMa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Created by Administrator on 2020/7/17 0017.
 * 短信发送
 */
public class sendmsg {
    public static void main(String[] args) throws IOException {

        String para = URLEncoder.encode("15553523757", "UTF-8");
        //1.	创建一个URL类的对象url
        URL url = new URL("https://api.jisuapi.com/sms/send?appkey=62958a3a6ef3c56d&mobile=" + para + "&content=恭喜你，作业已完成！验证码是：123456。如非本人操作，请忽略本短信！【开课吧新职课】");
//        URL url = new URL("https://api.jisuapi.com/sms/send?appkey=62958a3a6ef3c56d&mobile="+para+"&content=恭喜你，作业已完成！验证码是：666666。如非本人操作，请忽略本短信！【开课吧新职课】");

        //2.	通过URL类的对象url打开网络连接 , 并得到连接对象conn
        URLConnection conn = url.openConnection();
        //3.	通过连接对象 , 得到用于读取网页内容的输入流 is
        InputStream is = conn.getInputStream();
        //4.	将上述的字节流is 装饰为字符流 , 将字符流再装饰为一次能读取一行的字符流br
        BufferedReader br = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
        //5.	通过字符流br,读取一行内容,并将内容存储到变量text中
        String text = br.readLine();
        //6.	可以将读取到的内容text 输出显示到控制台
        System.out.println(text);
    }

}
