import java.util.Scanner;

/**
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 */
public class Demo26 {

    public static void main(String[] args) {
        System.out.println("请输入星期几的字母：");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char first = str.charAt(0);
        switch (first){
            case 'm':
            case 'M':
                System.out.println("星期一");
                break;
            case 't':
            case 'T':
                System.out.print("由于星期二(Tuesday)与星期四(Thursday)均以字母T开头，故需输入第二个字母才能正确判断：");
                str = in.nextLine();
                if (str.length() > 1){
                    char second = str.charAt(0);
                    if (second == 'u' || second == 'U'){
                        System.out.println("星期二");
                    } else if (second == 'h' || second == 'H'){
                        System.out.println("星期四");
                    }
                } else {
                    System.out.println("只能输入一个字符");
                }
                break;
            case 'W':
            case 'w':
                System.out.println("星期三");
                break;
            case 'S':
            case 's':
                System.out.print("由于星期六(Saturday)与星期日(Sunday)均以字母S开头，故需输入第二个字母才能正确判断：");                str = in.nextLine();
                if (str.length() == 1){
                    char second = str.charAt(0);
                    if (second == 'u' || second == 'U'){
                        System.out.println("星期日");
                    } else if (second == 'a' || second == 'A'){
                        System.out.println("由于星期六");
                    }
                } else {
                    System.out.println("只能输入一个字符");
                }
                break;
            case 'F':
            case 'f':
                System.out.println("星期五");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
