package datastructure.leetcode;


/**
 * 合并两个有序链表  合并多个有序链表
 * Divide and Conquer 分而治之（分，治，合）
 * Decrease and conquer 减而治之
 */
public class MergeTwoLists {
    /**
     * 方法一  普通方法
     *
     * @param p1
     * @param p2
     * @return
     */
    public ListNode mergeTwoLists1(ListNode p1, ListNode p2) {
        ListNode sentinel = new ListNode(-1, null);
        ListNode p = sentinel;
        while (p1 != null && p2 != null) {
            if (p1.value < p2.value) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return sentinel.next;
    }

    /**
     * 递归解决合并两个有序链表
     *
     * @param p1
     * @param p2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode p1, ListNode p2) {
        if (p2 == null) {
            return p1;
        }
        if (p1 == null) {
            return p2;
        }
        if (p1.value < p2.value) {
            p1.next = mergeTwoLists2(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoLists2(p1, p2.next);
            return p2;
        }
    }


    /**
     * 合并多个有序链表
     *
     * @param lists
     * @return
     */
    public ListNode mergeManyLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return split(lists, 0, lists.length - 1);
    }

    /**
     * 返回合并后的链表
     *
     * @param lists 返回数组
     * @param i     左边界
     * @param j     右边界
     * @return
     */
    private ListNode split(ListNode[] lists, int i, int j) {
        if (i == j) {//表示数组内只有一个链表时，返回链表本身
            return lists[i];
        }
        int m = (i + j) >>> 1;
        ListNode left = split(lists, i, m);
        ListNode right = split(lists, m + 1, j);
        return mergeTwoLists1(left, right);
    }

    public static void main(String[] args) {
//        ListNode p1 = ListNode.of(1, 3, 8, 9);
//        ListNode p2 = ListNode.of(2, 4);
//        System.out.println(new MergeTwoLists().mergeTwoLists1(p1, p2));
//        System.out.println(new MergeTwoLists().mergeTwoLists2(p1, p2));
        ListNode[] lists = {
                ListNode.of(1, 4, 5),
                ListNode.of(1, 3, 4),
                ListNode.of(2, 6)
        };
        ListNode s = new MergeTwoLists().mergeManyLists(lists);
        System.out.println(s);

    }
}
