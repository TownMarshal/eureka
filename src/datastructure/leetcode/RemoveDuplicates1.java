package datastructure.leetcode;


/**
 *  https://leetcode.cn/problems/remove-linked-list-elements/
 *  * 203. 移除链表元素
 *  删除有序链表的重复节点，（重复节点全部删除）
 */
public class RemoveDuplicates1 {

    /**
     * 递归调用去重 （重复节点全部删除）
     *
     * @param p
     * @return
     */
    public ListNode removeDuplicates1(ListNode p) {

        if (p == null || p.next == null) {
            return p;
        }
        if (p.value == p.next.value) {
            ListNode x = p.next.next;
            while (x != null && x.value == p.value) {
                x = x.next;
            }
            //这里的x就是与p取值不同的节点，递归调用x之后的部分
            return removeDuplicates1(x);
        } else {
            //将p之后的节点去重了后重新指向去重后的部分
            p.next = removeDuplicates1(p.next);
            return p;
        }
    }

    /**
     * 非递归实现链表重复节点，（重复节点全部删除）
     *
     * @param head
     * @return
     */
    public ListNode removeDuplicates2(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2;
        ListNode p3;
        while ((p2 = p1.next) != null && (p3 = p2.next) != null) {
            if (p2.value == p3.value) {
                while ((p3 = p3.next) != null && p3.value == p2.value) {

                }
                //p3找到了不重复的值
                p1.next = p3;
            } else {
                p1 = p1.next;
            }
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode head = ListNode.of(1, 1, 2, 3, 3, 5, 5, 5);
//        ListNode head = ListNode.of(1, 2, 3, 4, 5, 5, 6, 6);
        System.out.println(head);
//        System.out.println(new RemoveDuplicates1().removeDuplicates1(head));
        System.out.println(new RemoveDuplicates1().removeDuplicates2(head));


    }
}
