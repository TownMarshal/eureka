package datastructure.leetcode;


/**
 *https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 * 82. 删除排序链表中的重复元素 II
 * 删除有序链表的重复节点，（重复节点保留唯一一个）
 */
public class RemoveDuplicates {
    /**
     * 使用两个相邻指针依次后移直到p2=null
     *
     * @param head
     * @return
     */
    public ListNode removeDuplicates1(ListNode head) {
        //当节点数小于2时
        if (head == null || head.next == null) {
            return head;
        }
        //节点数>=2时
        ListNode p1 = head;
        ListNode p2;
        while ((p2 = p1.next) != null) {
            if (p1.val == p2.val) {
                p1.next = p2.next;//p1指向p2的下一个节点，代表删除p2

            } else {
                //向后平移
                p1 = p1.next;
            }
        }
        return head;
    }

    /**
     * 使用递归  从当前节点（我）开始，若我与next重复，返回next
     * 若我与next不重复，返回我，但是next应当更新
     *
     * @param p
     * @return
     */
    public ListNode removeDuplicates2(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }
        if (p.val == p.next.val) {
            return removeDuplicates2(p.next);//返回下一个节点去重的结果
        } else {
            p.next = removeDuplicates2(p.next);
            return p;
        }

    }


    public static void main(String[] args) {
        ListNode head = ListNode.of(1, 1, 2, 3, 3, 5, 5, 5);
        System.out.println(head);
//        System.out.println(new RemoveDuplicates().removeDuplicates1(head));
        System.out.println(new RemoveDuplicates().removeDuplicates2(head));

    }
}
