/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 */
public class Demo02 {

    public static void main(String[] args) {

        int count = 0;
        for (int i=101; i<=200; i++){
            //判断是否是素数
            boolean flag = true;
            for (int j=2; j<i; j++){
                if(i%j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.printf(" " + i);
                count++;
            }
        }
        System.out.println("\n" + count);
    }
}
