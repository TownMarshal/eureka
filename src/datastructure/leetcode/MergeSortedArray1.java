package datastructure.leetcode;



/**
 * https://leetcode.cn/problems/merge-sorted-array/
 * 88. 合并两个有序数组
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，
 * 分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。
 * 为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，
 * 后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */

public class MergeSortedArray1 {
    public static void main(String[] args) {

        int[] a1 = {1, 5, 6, 7, 8, 13};
        int[] a2 = {2, 4, 10, 11, 15};
        int[] a3 = new int[a1.length + a2.length];
        System.arraycopy(a1, 0, a3, 0, a1.length);
        merge(a3, a1.length, a2, a2.length);
        for (int i : a3) {
            System.out.print(i + " ");
        }

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);


    }

}
