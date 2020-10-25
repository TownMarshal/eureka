package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题8
 * （1）编写一个矩形类Rectangle (Test8)包含
 * 矩形的宽width 矩形的高height
 * 两个构造方法：
 * 1.一个带有两个参数的构造方法，用于将width和height 属性初始化
 * 2.一个不带有参数的构造方法，将矩形初始化为宽和高都为10
 * 两个方法：
 * 求矩形面积的方法area();
 * 求矩形周长的方法perimeter();
 */
public class Test8 {
    int width;
    int height;
    public Test8(int width,int height){
        this.width=width;
        this.height=height;
    }
    public Test8(){
        this.width=10;
        this.height=20;
    }

    public int area(){
        return width*height;
    }
    public int perimeter(){
        return width*2+height*2;
    }

}
