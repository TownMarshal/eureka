package datastructure.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/merge-sorted-array/
 * 88. 合并两个有序数组
 */

public class MergeSortedArray {
    public static void main(String[] args) {
//        int[] a1 = {1, 5, 6, 7, 8, 13, 2, 4, 10, 11, 15};
        int[] a1 = {1, 5, 6, 2, 4, 10, 11};
        int[] a2 = new int[a1.length];
        merge1(a1, 0, 2, 3, 6, a2);
//        merge2(a1, 0, 2, 3, 6, a2, 0);
        System.out.println(Arrays.toString(a2));
        System.arraycopy(a2, 0, a1, 0, a2.length);
        System.out.println(Arrays.toString(a1));

    }

    /**
     * 非递归版本
     * @param a1   未合并的数组
     * @param i    左区间索引起始值
     * @param iEnd 左区间索引结束值
     * @param j    右区间索引起始值
     * @param jEnd 右区间索引结束值
     * @param a2   合并后的数组
     */

    public static void merge1(int[] a1, int i, int iEnd, int j, int jEnd, int[] a2) {
        int k = 0;
        while (i <= iEnd && j <= jEnd) {
            if (a1[i] < a1[j]) {
                a2[k] = a1[i];
                i++;
            } else {
                a2[k] = a1[j];
                j++;
            }
            k++;
        }
        if (i > iEnd) {
            System.arraycopy(a1, j, a2, k, jEnd - j + 1);
        }
        if (j > jEnd) {
            System.arraycopy(a1, i, a2, k, iEnd - i + 1);
        }
    }


    /**
     * 递归思路实现合并两个数组
     *
     * @param a1   未合并的数组
     * @param i    左区间索引起始值
     * @param iEnd 左区间索引结束值
     * @param j    右区间索引起始值
     * @param jEnd 右区间索引结束值
     * @param a2   合并后的数组
     * @param k    合并后数组的索引
     */
    public static void merge2(int[] a1, int i, int iEnd, int j, int jEnd, int[] a2, int k) {
        if (i > iEnd) {//左边区间没有元素了
            System.arraycopy(a1, j, a2, k, jEnd - j + 1);
            return;
        }
        if (j > jEnd) {
            System.arraycopy(a1, i, a2, k, iEnd - i + 1);
            return;
        }
        if (a1[i] < a1[j]) {
            a2[k] = a1[i];
            merge2(a1, i + 1, iEnd, j, jEnd, a2, k + 1);
        } else {
            a2[k] = a1[j];
            merge2(a1, i, iEnd, j + 1, jEnd, a2, k + 1);
        }
    }
}
