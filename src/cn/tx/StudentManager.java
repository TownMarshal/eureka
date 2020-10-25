package cn.tx;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/7 0007.
 * 学生管理系统
 * 1.用输出语句完成主界面的编写
 * 2.用scanner实现键盘录入数据
 * 3.用switch语句完成操作的选择
 * 4，用循环完成再次回到主界面
 */

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            System.out.println("========欢迎来到学生管理系统========");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择");
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                   // break;
                    System.exit(0);//jvm退出

            }
        }

    }
    /**
     //定义方法判断学号是否被占用
     public static boolean isUsed(ArrayList<Student> array,String sid){
     //如果与集合中的学号相同，返回true,如果不相同，返回false
     boolean flag = false;
     for (int i = 0;i<array.size();i++){
     Student s = array.get(i);
     if (s.getSid().equals(sid)){
     flag = true;
     break;
     }
     }
     return flag;

     }
     /
     //定义方法查找所有学生
     /**
     public static void findAllStudent(ArrayList<Student> array){
     //显示表头信息
     //\t就是tab键的位置
     System.out.println("学号\t姓名\t年龄\t居住地");
     for (int i = 0;i<array.size();i++){
     Student s = array.get(i);
     System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
     }

     }
     */
    //定义方法判断学号是否被占用
    public static boolean isUsed(ArrayList<Student> array,String sid){
        //如果与集合中的学号相同，返回true,如果不相同，返回false
        boolean flag = false;
        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;

    }
    //定义方法添加学生
    public static void addStudent(ArrayList<Student> array){
        //键盘录入学生对象所需要的数据，显示提示信息，提示要录入何种信息
        Scanner sc = new Scanner(System.in);
        //为了让sid在while循环外被访问到，我们把他定义在了循环外
        String sid;

        //为了让程序能够回到这里，我们使用循环实现
        while(true){
            System.out.println("请输入学号：");
             sid = sc.nextLine();

            boolean flag = isUsed(array,sid);
            if (flag){
                System.out.println("你的学号已经被占用，请重新输入");
            }else {
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住的：");
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //将学生对象添加到集合中
        array.add(s);
        //给出成功录入信息
        System.out.println("添加学生成功");
    }
    //查看学生升级版
    public static void findAllStudent(ArrayList<Student> array){
        //判断集合中是否有数据，如果没有显示提示信息
        if (array.size() == 0){
            System.out.println("无信息，请添加后查看");
            //为了让程序不再往下执行
            return;
        }
        //显示表头信息
        //\t就是tab键的位置
        System.out.println("学号\t姓名\t年龄\t居住地");
        //将集合中数据提取出按照对应格式显示学生信息，年龄显示补充岁
        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
        }

    }
    /**
    //删除学生
    public static void deleteStudent(ArrayList<Student> array){
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号");
        String sid = sc.nextLine();
        //遍历集合将对应学生 对象从集合中删除
        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                array.remove(i);
                break;
            }
        }
        //给出删除成功提示信息
        System.out.println("删除学生成功");

    }
     */
    //删除学生，之前判断是否存在，在进行其他操作
    public static void deleteStudent(ArrayList<Student> array){
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号");
        String sid = sc.nextLine();
        //在删除学生之前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行添加/删除操作
        //遍历集合将对应学生 对象从集合中删除
        int index = -1;

        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
               // int index = i;
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else {
            array.remove(index);
            //给出删除成功提示信息
            System.out.println("删除学生成功");
        }


    }
    /**
    //修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        //键盘录入要修改的学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid = sc.nextLine();
        //键盘录入新的学生信息
        System.out.println("请输入你要修改的学生的新姓名");
        String name = sc.nextLine();
        System.out.println("请输入你要修改的学生的新年龄");
        String age = sc.nextLine();
        System.out.println("请输入你要修改的学生的新居住地");
        String address = sc.nextLine();
        //创建学生对象
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        //遍历集合修改对应的学生信息
        for(int i = 0;i<array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s);
                break;
            }

        }
        //给出修改成功提示
        System.out.println("修改学生信息成功");
    }
     */
    //修改学生信息,之前判断是否存在，在进行其他操作
    public static void updateStudent(ArrayList<Student> array){
        //键盘录入要修改的学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid = sc.nextLine();
        int index = -1;

        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                // int index = i;
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("该信息不存在，请重新输入");
        }else {
            //键盘录入新的学生信息
            System.out.println("请输入你要修改的学生的新姓名");
            String name = sc.nextLine();
            System.out.println("请输入你要修改的学生的新年龄");
            String age = sc.nextLine();
            System.out.println("请输入你要修改的学生的新居住地");
            String address = sc.nextLine();
            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            //遍历集合修改对应的学生信息
            for(int i = 0;i<array.size();i++){
                Student student = array.get(i);
                if (student.getSid().equals(sid)){
                    array.set(i,s);
                    break;
                }
            }
            //给出删除成功提示信息
            System.out.println("修改学生成功");
        }
    }

}
