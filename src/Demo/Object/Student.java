package Demo.Object;

/**
 * Created by Administrator on 2020/2/15 0015.
 */
public class Student {
    String name;
    int age;
    int sNo;
    public void learn(){
        System.out.println(name+"在学习");
    }
    public String toString(){
        return "学号"+sNo+"姓名"+name+"年龄"+age;
    }
    //我们认为学号、名字、年龄相等就是学生相等
    public boolean equals (Object obj){
        //判断的标识
        boolean flag = false;
        if(obj instanceof Student){
            //把Obj转换为子类的真身
            Student s = (Student)obj;
            if(this.sNo == s.sNo && this.age == s.age && this.name !=null && s.name != null && this.name.equals(s.name)){
                flag = true;
            }
        }
        return flag;
    }
}
