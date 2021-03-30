package ShangXueTang.MyCollection1;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws Exception {
        Employee e=new Employee(222,"唐帅",1000,"项目部","2020-2");
        Employee e1=new Employee(223,"唐是",1022,"组织部","2020-1");
        Employee e2=new Employee(224,"唐试试",1023,"组织部","2020-3");

        List<Employee> list=new ArrayList<Employee>();
        list.add(e);
        list.add(e1);
        list.add(e2);
        
        printEmpName(list);
    }

    private static void printEmpName(List<Employee> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
