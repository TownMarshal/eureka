package ShangXueTang.WanNianLi;

/**
 * Created by Administrator on 2021/3/29 0029.
 */
public class WanNianLi {
    public static void main(String[] args) {
        String s = "2013-5-10";
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int j=  0;
        for (int i = 0; i <= 30; i++) {
            System.out.print(i+"\t");
            j++;
            if (j%7==0){
                System.out.println('\n');
            }
        }
    }
}
