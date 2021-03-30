package ShangXueTang.MyCollection;
import java.util.HashSet;
import java.util.Set;

public class MyTestSet {
    public static void main(String[] args) {
        Set set=new HashSet();

        set.add("aa");
        set.add("bb");
        set.add(new java.lang.String("aa"));
        System.out.println(set.size());
        System.out.println(set.contains("aa"));
        set.clear();
        System.out.println(set.size());
    }
}
