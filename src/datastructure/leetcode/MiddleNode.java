package datastructure.leetcode;

/**
 * https://leetcode.cn/problems/middle-of-the-linked-list/
 * 876. 链表的中间结点
 * 快慢指针
 * p1 一次跑一个单位
 * p2一次跑两个单位
 * 当p2等于null 或者p2.next=null 停止循环
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        ListNode haed1 = ListNode.of(1, 2, 3, 4, 5);
        System.out.println(new MiddleNode().middleNode(haed1));
        ListNode haed2 = ListNode.of(1, 2, 3, 4, 5, 6);
        System.out.println(new MiddleNode().middleNode(haed2));


    }
}
