package ShangXueTang.WanNianLi;

/**
 * 可视化日历
 */
public class WanNianLi {
    public static void main(String[] args) {
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int j=0;
        for (int i = 0; i <= 31; i++) {
            System.out.println(i+"\t");
            j++;
            if (i%7==0){
                System.out.println('\n');
            }
        }
    }
}
