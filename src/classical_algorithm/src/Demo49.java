/**
 * 计算字符串中子串出现的次数
 */
public class Demo49 {
    public static void main(String[] args) {
        String str = "I come from County DingYuan Province AnHui.";
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i=0; i<chars.length; i++){
            if (chars[i] == 32){
                count++;
            }
        }
        System.out.println("总共有" + count+1 + "个子串");
    }
}
