package JingDianSuanFa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
public class Demo37 {
    /**
     *   A B C D E F
     *   A B D E
     *   A D E
     *   A D
     *   D
     */
    public static void main(String[] args) {
        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = str.toCharArray();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入人数");
        int n = in.nextInt();
        HashMap<Character, Boolean> hashMap = new HashMap<>();
        for (int i=0; i<n; i++){
            hashMap.put(chars[i], true);
        }
        System.out.println(hashMap);
        int length = hashMap.size();
        int count = 0;
        while (length > 1) {
            for (int i = 0; i < hashMap.size(); i++) {
                if (hashMap.get(chars[i])) {
                    count++;
                    if (count == 3) {
                        hashMap.put(chars[i], false);
                        count = 0;
                        length--;
                    }
                }
            }
        }
        System.out.println(hashMap);


        LinkedList<Integer> l = new LinkedList<>();
        System.out.println("请输入人数：");
        int len = in.nextInt();
        for (int i = 0; i < len; i++) {
            l.add(i + 1);
        }
        int sum = 0;
        int temp = 0;
        for (int i = 0; sum != len - 1;) {
            if (l.get(i) != 0) {
                temp++;
            }
            if (temp == 3) {
                l.remove(i);
                l.add(i, 0);
                temp = 0;
                sum++;
            }
            i++;
            if (i == l.size()) {
                i = 0;
            }
        }
        for (int t : l) {
            if (t != 0) {
                System.out.println("最后留下的人是" + t + "号");
            }
        }
    }
}
