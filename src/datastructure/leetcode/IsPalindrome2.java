package datastructure.leetcode;

/*
https://leetcode.cn/problems/palindrome-linked-list/
234. 回文链表  选中方法右键 Refactor 中Inline Method
优化   .next在左边表示指向，在右边表示下一个
 */
public class IsPalindrome2 {
    public boolean isPalindrome(ListNode head) {
        ListNode p1 = head;//慢指针
        ListNode p2 = head;//快指针
        ListNode n1 = null;//新链表的头
        ListNode o1 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;

            //反转链表代码
//            ListNode o2 = o1.next;
            o1.next = n1;
            n1 = o1;
//            o1 = o2;
            o1 = p1;
        }

        if (p2 != null) {//奇数节点，让p1往后走一步，比较后面的节点
            p1 = p1.next;
        }
        while (n1 != null) {
            if (n1.value != p1.value) {
                return false;
            }
            n1 = n1.next;
            p1 = p1.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode node1 = ListNode.of(1, 2, 2, 1);
        System.out.println(new IsPalindrome2().isPalindrome(node1));
        ListNode node2 = ListNode.of(1, 2, 3, 1, 1);
        System.out.println(new IsPalindrome2().isPalindrome(node2));
    }
}
