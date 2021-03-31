package ShangXueTang.col;

import Demo.Object.ObjectTest1;
import Demo.Object.ObjectTest2;
import java.util.Comparator;

/**
 * Created by Administrator on 2021/3/30 0030.
 */
public class Worker implements Comparable<Worker> {

    private String type;
    private double salary;

    public Worker() {
    }

    Worker(String type, double salary) {
        this.type = type;
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        //按工资升序



    @Override
    public String toString() {
        return "Worker{" +
                "type='" + type + '\'' +
                ", salary=" + salary +
                '}';
    }



    @Override
    public int compareTo(Worker o) {
        return this.salary>o.salary?1:(this.salary==o.salary?0:-1);
    }
}
