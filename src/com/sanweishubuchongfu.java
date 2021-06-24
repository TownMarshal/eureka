package com;

public class sanweishubuchongfu {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        System.out.print(i * 100 + j * 10 + k + "\t");
                        count++;
                    }
                }
            }
        }

        System.out.println("总共有几个数：" + count);
    }
}
