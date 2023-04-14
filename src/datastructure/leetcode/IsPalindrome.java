package datastructure.leetcode;

/*
https://leetcode.cn/problems/palindrome-linked-list/
234. 回文链表
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middle(head);
//        System.out.println(middle);
        ListNode reverse = reverse(middle);
//        System.out.println(reverse);
        while (reverse != null) {
            if (reverse.value != head.value) {
                return false;
            }
            reverse = reverse.next;
            head = head.next;
        }
        return true;
    }

    private ListNode middle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
            p2 = p2.next;
        }
        return p1;
    }

    private ListNode reverse(ListNode o1) {
        ListNode n1 = null;
        while (o1 != null) {
            ListNode o2 = o1.next;
            o1.next = n1;
            n1 = o1;
            o1 = o2;
        }
        return n1;
    }

    public static void main(String[] args) {
        ListNode node1 = ListNode.of(1, 2, 2, 1);
        System.out.println(new IsPalindrome().isPalindrome(node1));
        ListNode node2 = ListNode.of(1, 2, 3, 1, 1);
        System.out.println(new IsPalindrome().isPalindrome(node2));
    }
}
