package datastructure.singlylinkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

//单向链表 带哨兵
public class SinglyLinkedListSentinel implements Iterable<Integer> {
    private Node head = new Node(666, null);//头指针 指向哨兵节点


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
        insert(0, value);
    }

    //寻找链表尾部节点
    private Node findLast() {
        Node p;
        for (p = head; p.next != null; p = p.next) {

        }
        return p;
    }

    //往链表尾部添加节点
    public void addLast(int value) {
        Node last = findLast();
        last.next = new Node(value, null);
    }

    //单向链表遍历方法1 while循环
    public void loop1(Consumer<Integer> consumer) {
        Node p = head.next;
        while (p != null) {
            consumer.accept(p.value);
            p = p.next;
        }
    }

    //单向链表遍历方法2  for循环
    public void loop2(Consumer<Integer> consumer) {

        for (Node p = head.next; p != null; p = p.next) {
            consumer.accept(p.value);
        }
    }

    //单向链表遍历方法3  迭代器
    @Override
    public Iterator<Integer> iterator() {
        //匿名内部类
        return new Iterator<Integer>() {
            Node p = head.next;

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
        for (Node p = head.next; p != null; p = p.next, i++) {
            System.out.println("值为：" + p.value + "索引为：" + i);
        }
    }

    //根据给定的索引位置找到 节点对象
    private Node findNode(int index) {
        int i = -1;//哨兵节点开始
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
            throw illegalIndex(index);
        }
        return node.value;
    }

    //异常处理
    private static IllegalArgumentException illegalIndex(int index) {
        return new IllegalArgumentException(String.format("index[%d] 不合法%n", index));
    }

    //向索引位置插入节点
    public void insert(int index, int value) {
        //寻找索引位置的上一个节点
        Node prenode = findNode(index - 1);
        if (prenode == null) {//找不到上一个节点
            throw illegalIndex(index);
        }
        prenode.next = new Node(value, prenode.next);

    }

    //删除第一个节点
    public void removeFirst() {
        remove(0);
    }

    public void remove(int index) {
        Node prenode = findNode(index - 1);//上一个节点
        if (prenode == null) {
            throw illegalIndex(index);
        }
        Node removednode = prenode.next;//被删除的节点
        if (removednode == null) {
            throw illegalIndex(index);
        }
        prenode.next = removednode.next;
    }
}
