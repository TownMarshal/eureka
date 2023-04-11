package datastructure.singlylinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

//单向链表类 三种遍历方法
public class SinglyLinkedList1 implements Iterable<Integer> {
    private Node head = null;//头指针


    //节点类
    private static class Node {
        int value;//值
        Node next;//下一个节点指针

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    //往链表中添加新的节点
    public void addFirst(int value) {
        //链表为空的情况
//        head = new Node(value, null);
        //链表非空情况
        head = new Node(value, head);

    }

    //单向链表遍历方法1 while循环
    public void loop1(Consumer<Integer> consumer) {
        Node p = head;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    //单向链表遍历方法2  for循环
    public void loop2(Consumer<Integer> consumer) {
//        Node p = head;
//        while (p != null)
        for (Node p = head; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }


    //单向链表遍历方法3  迭代器
    @Override
    public Iterator<Integer> iterator() {
        //匿名内部类
        return new Iterator<Integer>() {
            Node p = head;

            @Override
            public boolean hasNext() {//是否有下一个元素
                return p != null;
            }

            @Override
            public Integer next() {//返回当前值，并指向下一个元素
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }



}
