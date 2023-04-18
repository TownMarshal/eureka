package datastructure.queue;


import java.util.Iterator;
import java.util.StringJoiner;

public class LinkedListQueue<E> implements Queue<E>, Iterable<E> {
    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    private final Node<E> head = new Node<>(null, null);
    private Node<E> tail = head;
    private int size = 0;//节点数
    private int capacity = Integer.MAX_VALUE;//容量

    {
        tail.next = head;
    }


    public LinkedListQueue(int capacity) {
        this.capacity = capacity;
    }

    public LinkedListQueue() {
    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }
        Node<E> added = new Node<>(value, head);
        tail.next = added;
        tail = added;
        size++;
        return true;
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        Node<E> first = head.next;
        head.next = first.next;
        if (first == tail) {
            tail = head;
        }
        size--;
        return first.value;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return head.next.value;
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return size == capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> p = head.next;

            @Override
            public boolean hasNext() {
                return p != head;
            }

            @Override
            public E next() {
                E value = p.value;
                p = p.next;
                return value;
            }
        };
    }


    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(",");
        for (E e : this) {
            sj.add(e.toString());
        }
        return sj.toString();
    }

    public static void main(String[] args) {
        LinkedListQueue<Object> queue = new LinkedListQueue<>();
//        LinkedListQueue<Object> queue = new LinkedListQueue<>(3);
        System.out.println(queue.peek());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        for (Object o : queue) {
//            queue.poll();
            System.out.println(o);
        }
        queue.poll();
        queue.poll();

        for (Object o : queue) {
            System.out.println(o);
        }
        System.out.println(queue.peek());

    }
}
