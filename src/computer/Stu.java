package computer;

import java.util.Objects;

/**
 * Created by Administrator on 2020/2/11 0011.
 */
public class Stu {
        private String name;
        private int age;
        public Stu(){

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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Stu stu = (Stu) o;
        return age == stu.age &&
                Objects.equals(name, stu.name);
    }


}
