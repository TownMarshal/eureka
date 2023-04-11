package datastructure.doublylinkedlist;

import java.util.Iterator;

//单向链表 带哨兵
public class DoublyCircleLinkedListSentinel implements Iterable<Integer> {


    //节点类
    private static class Node {
        Node pre;//上一个节点指针
        int value;//值
        Node next;//下一个节点指针

        public Node(Node pre, int value, Node next) {
            this.pre = pre;
            this.value = value;
            this.next = next;
        }
    }


    private Node sentinel = new Node(null, -1, null);

    public DoublyCircleLinkedListSentinel() {
        sentinel.pre = sentinel;
        sentinel.next = sentinel;
    }

    public void addFirst(int value) {
        Node a = sentinel;
        Node b = sentinel.next;
        Node addedNode = new Node(a, value, b);
        a.next = addedNode;
        b.pre = addedNode;
    }

    public void addLast(int value) {
        Node a = sentinel.pre;
        Node b = sentinel;
        Node addedNode = new Node(a, value, b);
        a.next = addedNode;
        b.pre = addedNode;
    }

    public void removeFirst() {
        Node removedNode = sentinel.next;
        if (removedNode == sentinel) {
            throw new IllegalArgumentException("非法");
        }
        Node a = sentinel;
        Node b = removedNode.next;
        a.next = b;
        b.pre = a;
    }

    public void removeLast() {
        Node removedNode = sentinel.pre;
        if (removedNode == sentinel) {
            throw new IllegalArgumentException("非法");
        }
        Node a = removedNode.pre;
        Node b = sentinel;
        a.next = b;
        b.pre = a;
    }

    //根据值删除节点
    public void removeByValue(int value) {
        Node removedNode = findByValue(value);
        if (removedNode == null) {
            return;
        }
        Node a = removedNode.pre;
        Node b = removedNode.next;
        a.next = b;
        b.pre = a;
    }

    private Node findByValue(int value) {
        Node p = sentinel.next;
        while (p != sentinel) {
            if (p.value == value) {
                return p;
            }
            p = p.next;
        }
        return null;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;

            @Override
            public boolean hasNext() {
                return p != sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }
}
