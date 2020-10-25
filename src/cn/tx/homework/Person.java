package cn.tx.homework;

/**
 * Created by Administrator on 2019/12/4 0004.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws ValidPersonException {
        this.name = name;
        if(age > 0 && age < 200){
            this.age = age;
        }else{
            throw new ValidPersonException("未处理的人的年龄异常");
        }

    }

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
