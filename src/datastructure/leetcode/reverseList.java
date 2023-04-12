package datastructure.leetcode;

//反转单向链表  五种方法
public class reverseList {
    //方法一  复制一份新的节点，将原来的节点的值一一赋值给新节点
    public ListNode reverse1(ListNode o1) {
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

    //方法三 递归
    public ListNode reverse3(ListNode p) {
        if (p == null || p.next == null) {
            return p;//最后节点
        }
        ListNode last = reverse3(p.next);
        p.next.next = p;
        p.next = null;//5指向4 4指向3 逆序返回
        return last;
    }

    //方法四  从链表每次拿到第二个节点，将其从链表断开，插入头部，直至其为null结束
    public ListNode reverse4(ListNode o1) {
        //1.链表是空的  2.链表中只有一个元素
        if (o1 == null || o1.next == null) {
            return o1;
        }
        ListNode o2 = o1.next;//旧链表的第二个值
        ListNode n1 = o1;
        while (o2 != null) {
            //将o2节点从中断开，o1指向o3
            o1.next = o2.next;
            //3.让o2的指针指向新链表的头部
            o2.next = n1;
            //4.新头，n1指向
            n1 = o2;
            //5.o2指向旧链表的第二个节点
            o2 = o1.next;

        }
        //n1代表新链表的头部
        return n1;
    }

    //方法五  （跟方法二类似） 从旧链表的头部不断移除加入新链表的头部
    public ListNode reverse5(ListNode o1) {
        if (o1 == null || o1.next == null) {
            return o1;
        }
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
        ListNode o5 = new ListNode(5, null);
        ListNode o4 = new ListNode(4, o5);
        ListNode o3 = new ListNode(3, o4);
        ListNode o2 = new ListNode(2, o3);
        ListNode o1 = new ListNode(1, o2);
        System.out.println(o1);
//        ListNode reversedList = new reverseList().reverse1(o1);
//        ListNode reversedList = new reverseList().reverse2(o1);
//        ListNode reversedList = new reverseList().reverse3(o1);
//        ListNode reversedList = new reverseList().reverse4(o1);
        ListNode reversedList = new reverseList().reverse5(o1);
        System.out.println(reversedList);
    }
}
