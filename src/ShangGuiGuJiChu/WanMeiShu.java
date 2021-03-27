package ShangGuiGuJiChu;

/**
 * Created by Administrator on 2021/3/27 0027.
 * 6=1+2+3等于他的因子之和
 */
public class WanMeiShu {
    public static void main(String[] args) {
        int factor=0;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= i/2; j++) {
                if(i%j==0){
                factor+=j;
                }
            }
            if (i==factor){
                System.out.println(i);
            }
            //重置factor
            factor=0;
        }
    }
}
