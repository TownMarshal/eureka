import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数
 */
public class Demo07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一行字符串");
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        count(chars);
    }

    static void count(char[] chars){
        int digital=0,character=0,blank=0,other=0;
        for (int i=0; i<chars.length; i++){
            if (chars[i] >= '0' && chars[i] <= '9'){
                digital++;
            } else if((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z')){
                character++;
            //判断是否是空字符使用ASCII值
            } else if (chars[i]==32){
                blank++;
            } else {
                other++;
            }
        }
        System.out.println("数字个数："+digital);
        System.out.println("英文字母个数："+character);
        System.out.println("空格个数："+blank);
        System.out.println("其他字符个数："+other);
    }
}
