package ShangXueTang;

/**
 * Created by Administrator on 2021/3/28 0028.
 * 方法的重载
 * 类型，个数，顺序不同都可以构成重载
 * 构造方法也可以重载
 */
public class ChongZai {
    public static void main(String[] args) {
        MyMath m=new MyMath();
        int add = m.add(2, 3);
        int add1 = m.add(2.2, 3);
        int add2 = m.add(2, 3, 4);
        System.out.println(add);
        System.out.println(add1);
        System.out.println(add2);
    }

}
class MyMath{
    //构造器重载
    int a;
    int b;
    public MyMath(){}
    public MyMath(int a){
        this.a=a;
    }
    public MyMath(int a,int b){
        this.a=a;
        this.b=b;
    }

    //方法重载
    public  int add(int a,double b){
        return (int) (a+b) ;
    }

    public  int add(double a,int b){
        return (int) (a+b) ;
    }
    public  int add(int a,int b){
         return a+b;
    }

    public  int add(int a,int b,int c){
        return a+b+c;
    }
}
