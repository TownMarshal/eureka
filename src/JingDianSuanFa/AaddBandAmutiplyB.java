package JingDianSuanFa;

import java.util.HashMap;
import java.util.Map;


/**
 * 腾讯 把1-20的中的两个数，两数之和告诉A，积告诉B，A说不知道是多少,B也说不知道是多少，
 * 这时A说我知道了，B接着说我也知道了，问这两个数是多少？
 * https://www.it610.com/article/1296129818278043648.htm
 */

public class AaddBandAmutiplyB {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map sumDatas = new HashMap<>();
        Map mulDatas = new HashMap<>();
        int tempsum;
        //和个数
        for (int i = 1; i < 21; i++) {
            for (int j = i + 1; j < 21; j++) {
                tempsum = i + j;
                if (sumDatas.containsKey(tempsum)) {
                    int parseInt = Integer.parseInt(String.valueOf(sumDatas.get(tempsum)));
                    sumDatas.put(tempsum, parseInt + 1);
                } else {
                    sumDatas.put(tempsum, 1);
                }
            }
        }
        //乘积个数
        for (int i = 1; i < 21; i++) {
            for (int j = i + 1; j < 21; j++) {
                tempsum = i * j;
                if (mulDatas.containsKey(tempsum)) {
                    int parseInt = Integer.parseInt(String.valueOf(mulDatas.get(tempsum)));
                    mulDatas.put(tempsum, parseInt + 1);
                } else {
                    mulDatas.put(tempsum, 1);
                }
            }
        }

        //B->A
        /*
         * A明白手中数的组合中当且仅有一对组合的积有多个组合
         * */
        int count1 = 0;
        for (Object key : sumDatas.keySet()) {
            int target = Integer.parseInt(String.valueOf(sumDatas.get(key)));
            int k = Integer.parseInt(String.valueOf(key));
            //A不知道
            if (target > 1) {
                for (int i = 1; i < k / 2 + 1; i++) {
                    if (k - i > i && k - i < 21) {
                        int mul = (k - i) * i;
                        int m = Integer.parseInt(String.valueOf(mulDatas.get(mul)));
                        if (m > 1) {
                            count1++;
                        }
                    }
                }
                //因为A知道了，所以在A手中的数下面应当当且仅有一对组合数的积有多个组合
                if (count1 == 1) {
                    //找出为一对，他们的积有多个组合的那个
                    for (int i = 1; i < k / 2 + 1; i++) {
                        if (k - i > i && k - i < 21) {
                            int mul = (k - i) * i;
                            int m = Integer.parseInt(String.valueOf(mulDatas.get(mul)));
                            if (m > 1) {
                                System.out.println(i + "和" + (k - i));
                            }
                        }
                    }
                }
            }
            count1 = 0;
        }
    }
}

