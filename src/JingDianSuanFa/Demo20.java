package JingDianSuanFa;

/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和
 */
public class Demo20 {
    public static void main(String[] args) {
        float sum = 0;
        float fz = 2;
        float fm = 1;
        float temp = 0;
        for (int i = 1; i <= 20; i++) {
            sum += fz / fm;
            temp = fz;
            fz = fm + fz;
            fm = temp;
        }
        System.out.println(sum);

        double ss = 2 / 1;
        double m = 2;//定义分子
        double n = 1;//定义分母
        for (int i = 2; i <= 20; i++) {
            m = m + n;
            n = m - n;
            ss += (double) m / n;  //将分子的类型强制转换成double,否则两个int相除，结果还是int会将小数点后都舍弃。
        }
        System.out.println(ss);
    }


}
