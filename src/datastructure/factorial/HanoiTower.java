package datastructure.factorial;

import java.util.LinkedList;

public class HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    //3 2 1顶部
    static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    /**
     *
     * @param n 圆盘个数
     * @param a 原来的柱子
     * @param b 借助的柱子
     * @param c 目标的柱子
     */
    static void move(int n,LinkedList<Integer>a,
                     LinkedList<Integer>b,
                     LinkedList<Integer>c){
        if (n==0){
            return;
        }
        move(n-1,a,c,b);//将n-1个盘子先移动到c,再移动到b
        c.addLast(a.removeLast());//将a中剩余的最大的盘子移动到c
        print();
        move(n-1,b,a,c);//将b中剩余的n-1个盘子借助a，移动到c

    }

    public static void main(String[] args) {
        init(3);
        print();
        move(3,a,b,c);



    }

    private static void print() {
        System.out.println("======================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
