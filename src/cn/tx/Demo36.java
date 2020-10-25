package cn.tx;

/**
 * Created by Administrator on 2019/11/14 0014.
 */

/**
 * 面向对象特征之封装中this关键字的作用
 * 目的：提高数据安全性，通过封装，可以实现对属性的访问权限，同时增加了程序的可维护性
 * 封装：
 * 将属性私有化，使用private关键字完成属性私有化，这种属性只有本类能访问。
 * 我们一般对每一个私有属性提供公共public的set和get这种方法供外界来访问我们的私有属性。
 * this在封装中用于区分同名的属性和局部变量的名字
 * 参考Demo34
 */
class Girl1 {
    private String name;
    private int age;
    private String tel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void introduce() {
        System.out.println("我的名字是" + name + "我的电话是" + tel + "我芳龄" + age);

    }
}

public class Demo36 {
    public static void main(String[] args) {
        Girl1 g = new Girl1();
         /*
  g.name="晓丽";
  g.age=24;
  g.tel="17854257144";
  Systemout.println(g.name);
  System.out.println(g.age);
  System.out.println(g.tel);
  */
        //通过公有的方法来设置私有属性
        g.setName("小红");
        g.setAge(25);
        g.setTel("17864228308");

        g.introduce();
        String name = g.getName();
        int age = g.getAge();
        String tel = g.getTel();

        System.out.println(name);
        System.out.println(age);
        System.out.println(tel);
    }
}
