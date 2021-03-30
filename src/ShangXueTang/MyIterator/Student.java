package ShangXueTang.MyIterator;
/**
 *
 */
public class Student<T1,T2> {
    private T1 javaScore;
    private T2 oracleScore;



    public T1 getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(T1 javaScore) {
        this.javaScore = javaScore;
    }

    public T2 getOracleScore() {
        return oracleScore;
    }

    public void setOracleScore(T2 oracleScore) {
        this.oracleScore = oracleScore;
    }

    public static void main(String[] args) {
        //使用指定类型(引用类型),优点：类型自动检查，类型自动转换
        Student<String,Integer>stu =new Student<String,Integer>();
        stu.setJavaScore("优秀");
        Integer oracleScore = stu.getOracleScore();
    }
}
