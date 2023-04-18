package datastructure.leetcode;


/**
 * https://leetcode.cn/problems/remove-linked-list-elements/
 * 203. 移除链表元素
 * 根据给的值删除节点
 */
public class RemoveElements {
    /**
     * @param head  链表头
     * @param val 目标值
     * @return 删除后的链表头
     */
    public ListNode removeElement1(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
        ListNode p2 = sentinel.next;
        while (p2 != null) {//p2指针一直指向最后一个节点指向的null结束循环
            if (p2.val == val) {
                //p1,p2指针找到了与p2相等的值，p1暂停向下，p2执行删除操作
                p1.next = p2.next;
                p2 = p2.next;
            } else {
                //p1,p2没有找到需要删除的节点
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return sentinel.next;
    }

    /**
     * 将给p2统一赋值的动作放到循环开始处
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElement2(ListNode head, int val) {
        ListNode sentinel = new ListNode(-1, head);
        ListNode p1 = sentinel;
//        ListNode p2 = sentinel.next;//等价于下面代码
//        ListNode p2 = p1.next;
        ListNode p2;
        while ((p2 = p1.next) != null) {//p2指针一直指向最后一个节点指向的null结束循环
            if (p2.val == val) {
                //p1,p2指针找到了与p2相等的值，p1暂停向下，p2执行删除操作
                p1.next = p2.next;
//                p2 = p2.next;
            } else {
                //p1,p2没有找到需要删除的节点
                p1 = p1.next;
//                p2 = p2.next;
            }
        }
        return sentinel.next;
    }

    /**
     * 使用递归根据值删除节点
     *
     * @param p     链表头
     * @param val 目标值
     * @return 删除后的链表头
     */
    public ListNode removeElement3(ListNode p, int val) {
        if (p == null) {
            return null;
        }
        if (p.val == val) {
            return removeElement3(p.next, val);
        } else {
            p.next = removeElement3(p.next, val);
            return p;
        }
    }

    public static void main(String[] args) {
        ListNode head = ListNode.of(1, 2, 6, 3, 6);
//        ListNode head = ListNode.of(7, 7, 7, 7);
        System.out.println(head);
//        System.out.println(new removeElements().removeElement1(head, 6));
//        System.out.println(new removeElements().removeElement2(head, 6));
        System.out.println(new RemoveElements().removeElement3(head, 6));
//        System.out.println(new removeElements().removeElement1(head, 7));
    }
}
