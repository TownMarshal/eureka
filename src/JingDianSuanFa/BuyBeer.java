package JingDianSuanFa;

import java.util.Scanner;

/**
 * Created by Administrator on 2020/2/10 0010.
 * 一个算法题：
 * 啤酒2块钱1瓶，
 * 4个瓶盖换1瓶
 * 2个空瓶换1瓶
 * 问：10块钱可以喝几瓶？
 */
public class BuyBeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要花多少钱");
        int i = sc.nextInt();
        int a = result(i);
        System.out.println(i + "块钱总共得到了" + a + "瓶啤酒");
    }

    public static int result(int money) {
        // 当前总共得到的啤酒数量
        int buy = money / 2;
        // 当前拥有的瓶盖的数量
        int cover = money / 2;
        // 当前拥有的空瓶的数量
        int bottle = money / 2;

        while (cover >= 4 || bottle >= 2) {
            // 计算出当前可兑换的啤酒数量
            int number = cover / 4 + bottle / 2;
            // 总啤酒数量相应的增加
            buy += number;
            // 兑换后拥有的瓶盖数量：兑换的啤酒数量number+不足以兑换而剩余的瓶盖数量cover%4
            cover = number + cover % 4;
            // 兑换后拥有的空瓶数量：兑换的啤酒数量number+不足以兑换而剩余的瓶盖数量bottle%2
            bottle = number + bottle % 2;
            System.out.println("本次循环兑换了" + number + "瓶啤酒");
            System.out.println("本次兑换后当前盖子数量：" + cover + " " + "当前瓶子数量：" + bottle);
            System.out.println("---------------------------------------");
        }
        return buy;
    }
}