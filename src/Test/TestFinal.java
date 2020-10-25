package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * Final
 * fianl修饰在变量上，这个变量不能修改
 * final修饰在属性上，要么直接给初始值，要么在构造器中初始化。
 * 如果存在多个构造器，都要有final这个属性的初始化。
 * final修饰在方法上，不能被复写（还是可以被调用）
 * final修饰在类上，如果一个雷被final修饰，那么这个类就不能被继承。
 */
class Teacher{
    String name;
    final int age;
    /*如果final在属性上，要么直接给初始值，要么在构造器中初始化

     */
    public Teacher(){
        age=11;
    }
    public Teacher(String name){
        this.name=name;
        this.age=10;
    }

    String type;
    public  void teach(){
        System.out.println(name+"在教课");
    }
}
class JavaTeacher extends Teacher{
    boolean isGlass;
    public JavaTeacher(){
        super();
    }
}
public class TestFinal{
    public static void main(String[]args){
	/*报错
	final int i=10;
	i=11;
	*/
    }
}