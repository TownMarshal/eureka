package Demo;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
/**
 OOP构造器详解
 构造器：用于创建对象的方法
 语法：权限修饰符 类名(数据类型 参数名，..){
 }
 */
/*
class Hero{
	String name;
	String horse;
	//显示的定义默认构造器
	//有参数的构造器可以给属性初始化
	//同一个类中构造器可以通过this相互调用
//this必须放在第一行
//如果在构造器中调用构造器时不创建对象，只初始化
	public Hero(String name,String horse){
		this.name=name;
		this.horse=horse;
	}

		public Hero(String name){
		this.name=name;
	}

	public void info(){
		System.out.println("名字:"+name+"..."+"坐骑:"+horse);
		}

	}
public class Demo37{
	public static void main(String[]args){
  //创建对象
  Hero h=new Hero("刘备","的卢马");
  h.info();
  Hero h1=new Hero("张飞");
  h1.info();
	}
}
*/
//同一个类中构造器可以通过this相互调用
//this必须放在第一行
//如果在构造器中调用构造器时不创建对象，只初始化

/*
class Hero{
	String name;
	String horse;
	int age;
		public Hero(String name){
		this.name=name;
	}

		public Hero(String name,String horse){
		this.name=name;
		this.horse=horse;
	}
		public Hero(String name,String horse,int age){
		this.name=name;
		this.horse=horse;
		this.age=age;
	}

	public void info(){
		System.out.println("名字:"+name+"坐骑:"+horse+"年龄："+age);
		}

	}
public class Demo37{
	public static void main(String[]args){
  Hero h=new Hero("刘备","的卢马");
  h.info();
  Hero h1=new Hero("张飞");
  h1.info();
	}
}
*/
class Hero{
    String name;
    String horse;
    int age;
    public Hero(String name){
        this.name=name;
    }

    public Hero(String name,String horse){
        this(name);
        this.horse=horse;
    }
    public Hero(String name,String horse,int age){
        this(name,horse);
        this.age=age;
    }

    public void info(){
        System.out.println("名字:"+name+"坐骑:"+horse+"年龄："+age);
    }

}
public class Demo37{
    public static void main(String[]args){
        Hero h=new Hero("刘备","的卢马",24);
        h.info();
        Hero h1=new Hero("张飞");
        h1.info();
    }
}