package ShangXueTang;

public class ZengQiangFor {
    public static void main(String[] args) {
        int[]a={13,24,5523,76,241};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("==========================");

        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("==========================");
        for (int i:a
             ) {
            System.out.println(i);
        }
    }
}
