package cn.tx;

/**
 * Created by Administrator on 2019/11/11 0011.
 * 学生系统
 *
 * alt+insert自动生成
 */
public class Student {
        private  String sid;
        private  String name;
        private  String age;
        private  String address;

    public Student() {
    }

    public Student(String sid, String name, String age, String address) {
            this.sid = sid;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }



    @Override
    public String toString() {
        return super.toString();
    }



}


