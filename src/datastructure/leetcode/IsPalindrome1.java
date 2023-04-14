package datastructure.leetcode;

/*
https://leetcode.cn/problems/palindrome-linked-list/
234. 回文链表  选中方法右键 Refactor 中Inline Method
 */
public class IsPalindrome1 {
    public boolean isPalindrome(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
            p2 = p2.next;
        }
        ListNode middle = p1;

        ListNode n1 = null;
        while (middle != null) {
            ListNode o2 = middle.next;
            middle.next = n1;
            n1 = middle;
            middle = o2;
        }
        ListNode reverse = n1;

        while (reverse != null) {
            if (reverse.value != head.value) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = ListNode.of(1, 2, 2, 1);
        System.out.println(new IsPalindrome1().isPalindrome(node1));
        ListNode node2 = ListNode.of(1, 2, 3, 1, 1);
        System.out.println(new IsPalindrome1().isPalindrome(node2));
    }
}
