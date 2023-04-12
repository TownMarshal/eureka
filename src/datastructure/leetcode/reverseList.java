package datastructure.leetcode;

//反转单向链表
public class reverseList {
    //方法一  复制一份新的节点，将原来的节点的值一一赋值给新节点
    public ListNode reverse(ListNode o1) {
        ListNode n1 = null;
        ListNode p = o1;
        while (p != null) {
            n1 = new ListNode(p.value, n1);
            p = p.next;
        }
        return n1;
    }

    //方法二 直接将原来节点的值一一修改为反转后的值再拼接好
    public ListNode reverse2(ListNode head) {
        List list1 = new List(head);
        List list2 = new List(null);
        while (true) {
            ListNode first = list1.removeFirst();
            if (first == null) {
                break;
            }
            list2.addFirst(first);
        }
        return list2.head;
    }

    static class List {
        ListNode head;

        public List(ListNode head) {
            this.head = head;
        }

        public void addFirst(ListNode first) {
            first.next = head;
            head = first;
        }

        public ListNode removeFirst() {
            ListNode first = head;
            if (first != null) {
                head = first.next;
            }
            return first;
        }
    }

    public static void main(String[] args) {
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);
        System.out.println(o1);
//        ListNode reversedList = new reverseList().reverse(o1);
        ListNode reversedList = new reverseList().reverse2(o1);
        System.out.println(reversedList);
    }
}
