package Test;

/**
 * Created by Administrator on 2020/2/16 0016.
 * 练习题14（Role）
 * 定义一个抽象的"Role"类
 * 有姓名 年龄 性别等成员变量
 * 1.要求尽可能隐藏所有变量(能私有就私有，能够保护就不要公有)
 * 再通过SetXXX()方法和GetXXX方法对各变量进行读写。具有一个抽象的play()方法
 * 该方法不返回任何值，同时至少定义两个构造方法。Role类中要体现出this的几种用法。
 * 2.从Role类中派生出一个"Enployee"类 该类具有Role类的所有成员
 * 构造方法除外  并拓展salary成员变量 同时增加一个静态成员变量"职工编号ID"
 * 同时至少有两个构造方法 要体现this和super的几种用法 还要求覆盖play()方法
 * 并提供一个final sing()方法
 * 3."Manager"类继承"Employee"类 有一个final成员变量"vehicle"
 * 4.在main()方法中制造Manager和Employee对象，并测试这些对象。
 */
abstract class Role{
    private String name;
    private int age;
    private int gender;
    public Role(){

    }
    public Role(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Role(String name,int age,int gender){
        this(name,age);
        this.gender = gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(int gender){
        this.gender = gender;
    }
    public int getGender(){
        return gender;
    }

    public abstract void play();
}

class Employee extends Role{
    static int id;
    public int salary;
    public Employee(){

    }
    public Employee(String name,int age,int gender,int salary){
        super(name,age,gender);
        this.salary = salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void play(){
        System.out.println("员工下班后打球");
    }
    public final void sing(){
        System.out.println("员工免费提供KTV唱歌");
    }
    public void info(){
        System.out.println("职工工号"+id+"姓名"+getName()+"年龄"+getAge()+"性别"+getGender()+"薪资"+salary);
    }
}
class Manager extends Employee{
    final String vehicle;
    public Manager(String name,int age,int gender,int salary,String vehicle){
        super(name,age,gender,salary);
        this.vehicle = vehicle;
    }
}
public class Test14{
    public static void main(String[]args){
        Employee e = new Employee("亮哥",24,1,1000);
        Employee.id++;

        e.info();
        e.play();
        e.sing();
        System.out.println("--------------------------");
        Manager m = new Manager("龙哥",25,2,3000,"汽车");
        Employee.id++;
        m.info();
        m.play();
        m.sing();
    }
}
