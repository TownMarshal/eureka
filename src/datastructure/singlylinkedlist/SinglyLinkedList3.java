package datastructure.singlylinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

//单向链表类  往链表尾部添加节点
public class SinglyLinkedList3 implements Iterable<Integer> {
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

    //寻找链表尾部节点
    private Node findLast() {
        if (head == null) {//空链表
            return null;
        }
        Node p;
        for (p = head; p.next != null; p = p.next) {

        }
        return p;
    }

    //往链表尾部添加节点
    public void addLast(int value) {
        Node last = findLast();
        if (last == null) {
            addFirst(value);
            return;
        }

        last.next = new Node(value, null);
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


    //单向链表 遍历过程中寻找索引
    public void loop3() {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            System.out.println("值为：" + p.value + "索引为：" + i);
        }
    }

    //根据给定的索引位置找到 节点对象
    private Node findNode(int index) {
        int i = 0;
        for (Node p = head; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;//没有找到的情况
    }

    //根据节点对象，找到节点对象的值
    public int get(int index) {
        Node node = findNode(index);
        if (node == null) {
            //抛异常
            throw new IllegalArgumentException(String.format("index[%d] 不合法%n", index));
        }
        return node.value;
    }
}
