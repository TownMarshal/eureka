package JingDianSuanFa;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 有五个学生，每个学生有3门课的成绩，
 * 从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，
 * 况原有的数据和计算出的平均分数存放在磁盘文件"stud"中。
 */
public class Demo50 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("输入每个学生的学生号，姓名，三门课成绩");
        ArrayList<Student> students = new ArrayList<>();
        for (int i=0; i<3; i++){
            System.out.println("请输入第"+ (i+1) +"个学生的学生号");
            String studentId = in.nextLine();
            System.out.println("请输入第"+ (i+1) +"个学生的姓名");
            String name = in.nextLine();
            System.out.println("请输入第"+ (i+1) +"个学生的第一门成绩");
            String grade1 = in.nextLine();
            System.out.println("请输入第"+ (i+1) +"个学生的第二门成绩");
            String grade2 = in.nextLine();
            System.out.println("请输入第"+ (i+1) +"个学生的第三门成绩");
            String grade3 = in.nextLine();
            double averageGrade = (Double.parseDouble(grade1) + Double.parseDouble(grade2) + Double.parseDouble(grade3)) / 3;
            Student student = new Student(studentId,name, Double.parseDouble(grade1), Double.parseDouble(grade1), Double.parseDouble(grade3), averageGrade);
            students.add(student);
        }

        //写入数据
        File file = new File("student.txt");
        try {
            if (!file.exists()){
                file.createNewFile();
            } else {
                file.delete();
                file.createNewFile();
            }
            FileOutputStream fileWriter = new FileOutputStream(file);
            for (Student student : students){
                fileWriter.write(student.toString().getBytes());
            }
            fileWriter.close();
        } catch (IOException ignored){

        }

    }

    static class Student{
        private String studentId;
        private String name;
        private double grade1;
        private double grade2;
        private double grade3;
        private double averageGrade;

        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGrade1() {
            return grade1;
        }

        public void setGrade1(double grade1) {
            this.grade1 = grade1;
        }

        public double getGrade2() {
            return grade2;
        }

        public void setGrade2(double grade2) {
            this.grade2 = grade2;
        }

        public double getGrade3() {
            return grade3;
        }

        public void setGrade3(double grade3) {
            this.grade3 = grade3;
        }

        public double getAverageGrade() {
            return averageGrade;
        }

        public void setAverageGrade(double averageGrade) {
            this.averageGrade = averageGrade;
        }

        public Student(){

        }

        public Student(String studentId, String name, double grade1, double grade2, double grade3, double averageGrade) {
            this.studentId = studentId;
            this.name = name;
            this.grade1 = grade1;
            this.grade2 = grade2;
            this.grade3 = grade3;
            this.averageGrade = averageGrade;
        }

        @Override
        public String toString() {
            return
                    "学号：'" + studentId + '\'' +
                    ", 姓名：" + name + '\'' +
                    ", 成绩1：" + grade1 +
                    ", 成绩2：" + grade2 +
                    ", 成绩3：" + grade3 +
                    ", 平均成绩：" + averageGrade +
                    "\n";
        }
    }
}
