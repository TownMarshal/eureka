package datastructure.singlylinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

//内部类 是否添加 static的辨别方法
public class SinglyLinkedList2 implements Iterable<Integer> {
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


    //单向链表遍历方法3  迭代器
    @Override
    public Iterator<Integer> iterator() {
        //匿名内部类
        return new NodeIterator();
    }

    //不能加static ，内部类使用了外部类的一个成员变量时，就不能加static   Node p = head;
    private class NodeIterator implements Iterator<Integer> {
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
    }
}
