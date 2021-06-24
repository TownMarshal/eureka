package JingDianSuanFa;

/**
 * 求0—7所能组成的奇数个数
 */
public class Demo43 {
    public static void main(String[] args) {
        //奇数，尾数只能为1,3,5,7四种
        int count = 4;
        //2位,十位7中，个位4种
        int second = 7 * 4;
        System.out.println(2 + " count " + second);
        //3位，7x8x4
        for (int i = 2; i < 8; i++) {
            second = 8 * second;
            System.out.println(i + 1 + " count " + second);
        }
    }
}
