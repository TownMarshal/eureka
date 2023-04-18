package datastructure.leetcode;



/**
 * 阶段一：
 * 龟一次走一步，兔一次走两步
 * 当兔子能走到终点时，不存在环
 * 当兔子能追上龟时，可以判断存在环
 * 阶段二：
 * 从他们的第一次相遇开始，龟回到起点，兔子保持原位不变
 * 龟和兔一次都走一步
 * 当龟兔再次相遇，地点就是环的入口
 * https://leetcode.cn/problems/linked-list-cycle/
 * https://leetcode.cn/problems/linked-list-cycle-ii/
 */
public class HasCircle {
    public boolean hasCircle(ListNode head) {
        ListNode h = head;//兔子
        ListNode t = head;//龟
        while (h != null && h.next != null) {
            t = t.next;
            h = h.next.next;
            if (h == t) {
                return true;
            }
        }
        return false;
    }


    public ListNode detectCircle(ListNode head) {
        ListNode h = head;//兔子
        ListNode t = head;//龟
        while (h != null && h.next != null) {
            t = t.next;
            h = h.next.next;
            if (h == t) {
                //进入第二阶段
                t = head;
                while (true) {
                    if (t == h) {
                        return t;
                    }
                    t = t.next;
                    h = h.next;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode n12 = new ListNode(12, null);
        ListNode n11 = new ListNode(11, n12);
        ListNode n10 = new ListNode(10, n11);
        ListNode n9 = new ListNode(9, n10);
        ListNode n8 = new ListNode(8, n9);
        ListNode n7 = new ListNode(7, n8);
        ListNode n6 = new ListNode(6, n7);
        ListNode n5 = new ListNode(5, n6);
        ListNode n4 = new ListNode(4, n5);
        ListNode n3 = new ListNode(3, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        n12.next = n8;
//        n12.next = n1;
//        System.out.println(new HasCircle().hasCircle(n1));
        System.out.println(new HasCircle().detectCircle(n1).val);
    }
}
