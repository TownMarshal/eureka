/**
 * 打印出所有的 水仙花数 ，所谓 水仙花数 是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 水仙花数 ，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Demo03 {

    public static void main(String[] args) {
        for (int i=100; i<999; i++){
            if (isShuiXianHua(i)){
                System.out.print("\n" + i);
            }
        }
    }

    private static boolean isShuiXianHua(int i) {
        int baiwei = i / 100;
        int shiwei = i % 100 / 10;
        int gewei = i % 10;
        if ((baiwei*baiwei*baiwei + shiwei*shiwei*shiwei + gewei*gewei*gewei) == i){
            return true;
        }
        return false;
    }
}
