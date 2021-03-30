package ShangXueTang.MySort;

public class StringComp  implements java.util.Comparator<String>{

    /**
     * * 排序规则的业务类
     * 按长度比较大小
     * 正数 >
     * 负数 <
     * 0 ==
     */
    @Override
    public int compare(String o1, String o2) {
        int len1 =o1.length();
        int len2 =o2.length();
//        return (len1-len2);
        return -(len1-len2);
    }


}
