package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题12
 * 构造方法与重载
 * 定义一个网络用户类 User
 * 要处理的信息有用户ID 、用户密码、 email地址 ，
 * 在建立类的实例时，把以上三个信息都作为构造函数的参数输入
 * 其中用户ID和用户密码时必须缺省的email地址是用户ID加上字符串"@gameschool.com"
 */
public class User {
    int id;
    String password;
    String email;
    public User(int id,String password){
        this.id=id;
        this.password=password;
        //eamil默认值
        email=id+"@gameschool.com";
    }

    public User(int id,String password,String email){
        this.id=id;
        this.password=password;
        this.email=email;
    }
    public void info(){
        System.out.println("id:"+id+"密码"+password+"邮箱"+email);
    }

}
