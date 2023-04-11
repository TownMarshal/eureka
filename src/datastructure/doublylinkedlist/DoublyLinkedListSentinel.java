package datastructure.doublylinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

//单向链表 带哨兵
public class DoublyLinkedListSentinel implements Iterable<Integer> {


    //节点类
    static class Node {
        Node pre;//上一个节点指针
        int value;//值
        Node next;//下一个节点指针

        public Node(Node pre, int value, Node next) {
            this.pre = pre;
            this.value = value;
            this.next = next;
        }
    }

    private Node head;//头哨兵
    private Node tail;//尾哨兵

    public DoublyLinkedListSentinel() {
        head = new Node(null, 666, null);
        tail = new Node(null, 888, null);
        head.next = tail;
        tail.pre = head;
    }

    //根据索引查找节点
    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }


    public void addFirst(int value) {
        insert(0, value);
    }

    public void removeFirst() {
        remove(0);
    }

    public void addLast(int value) {
        Node lastNode = tail.pre;
        Node addedNode = new Node(lastNode, value, tail);
        lastNode.next = addedNode;
        tail.pre = addedNode;
    }

    public void removeLast() {
        Node removedNode = tail.pre;
        if (removedNode == head) {
            throw illegalIndex(0);
        }
        Node preNode = removedNode.pre;
        preNode.next = tail;
        tail.pre = preNode;
    }

    public void insert(int index, int value) {
        Node preNode = findNode(index - 1);
        if (preNode == null) {
            throw illegalIndex(index);
        }
        Node aftNode = preNode.next;
        Node insertedNode = new Node(preNode, value, aftNode);
        preNode.next = insertedNode;
        aftNode.pre = insertedNode;
    }

    public void remove(int index) {
        Node preNode = findNode(index - 1);
        if (preNode == null) {
            throw illegalIndex(index);
        }
        Node removedNode = preNode.next;
        if (removedNode == tail) {
            throw illegalIndex(index);
        }
        Node aftNode = removedNode.next;
        preNode.next = aftNode;
        aftNode.pre = preNode;

    }

    //异常处理
    private static IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index[%d] 不合法%n", index));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;

            @Override
            public boolean hasNext() {
                //遍历的条件，返回一个true or false
                return p != tail;
            }

            @Override
            public Integer next() {
                //返回当前指针指向的值，并且让当前指针指向下一个值
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

}
