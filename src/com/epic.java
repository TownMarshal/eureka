package com;


public class epic {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 7, 8};
        int[] arr2 = new int[]{2, 3, 4, 5, 8, 9};
        epic epic = new epic();
        int i = epic.maxUncrossedLines(arr1, arr2);
        System.out.println(i);

    }

    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            int num1 = nums1[i - 1];
            for (int j = 1; j <= n; j++) {
                int num2 = nums2[j - 1];
                if (num1 == num2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}

