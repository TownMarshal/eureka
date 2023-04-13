package datastructure.leetcode;

//删除链表的倒数第二个节点，倒数第N个节点
public class RemoveSecondToLast {
    /**
     * 递归删除倒数第二个节点
     *
     * @param head 链表头
     * @param n    目标值
     * @return 删除后的链表头
     */
    public ListNode removeSecondToLast1(ListNode head, int n) {
        //第一个节点删除不了，加个哨兵解决
        ListNode sentinel = new ListNode(-1, head);
        recursion(sentinel, n);
        return sentinel.next;
    }

    private int recursion(ListNode p, int n) {
        if (p == null) {
            return 0;
        }
        //下一个节点的倒数位置
        int nth = recursion(p.next, n);
        System.out.println(p.value + " " + nth);
        if (nth == n) {
            //p=3  p.next=4 p.next.next=5
            p.next = p.next.next;
        }
        return nth + 1;
    }

    /**
     * 利用快慢指针删除倒数第二个节点
     * 快指针走三步，慢指针不动，然后快慢指针各向前一步一步走，
     * 直到快指针指向null，删除慢指针指向节点的下一个节点，就是倒数第二个节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeSecondToLast2(ListNode head, int n) {
        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2 = sentinel;
        for (int i = 0; i < n + 1; i++) {
            p2 = p2.next;
        }
        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return sentinel.next;
    }


    public static void main(String[] args) {
        ListNode head = ListNode.of(1, 2, 3, 4, 5);
        System.out.println(head);
//        System.out.println(new RemoveSecondToLast().removeSecondToLast1(head, 5));
        System.out.println(new RemoveSecondToLast().removeSecondToLast2(head, 5));
    }
}
