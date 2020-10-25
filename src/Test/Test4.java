package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题4
 * 编写java程序模拟简单的计算器。定义名为Number的类中有两个整型数据n1 n2应声明为私有，再为该类定义为
 *  加addition 减suntration 乘multiplication 除division
 * 等公有成员变量方法分别对两个成员变量执行加减乘除运算
 * 在main方法中创建Number类的对象赋予n1 n2初始值调用各个方法并显示计算结果
 */
public class Test4 {
    //创建n1 n2
    private int n1;
    private int n2;
    public void setN1(int n1){
        this.n1=n1;
    }
    public int getN1(){
        return n1;
    }

    public void setN2(int n2){
        this.n2=n2;
    }
    public int getN2(){
        return n2;
    }

    public  int addition(){
        return n1+n2;
    }
    public  int suntration(){
        return n1-n2;
    }
    public  int multiplication(){
        return n1*n2;
    }
    public  int division(){
        return n1/n2;
    }

}
