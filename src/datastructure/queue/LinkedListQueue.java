package datastructure.queue;

import java.util.Iterator;

public class LinkedListQueue<E> implements Queue<E>, Iterable {
    private static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    Node<E> head = new Node<>(null, null);
    Node<E> tail = head;

    public LinkedListQueue() {
        tail.next = head;
    }

    @Override
    public boolean offer(E value) {
        return false;
    }

    @Override
    public E poll() {
        return null;
    }

    @Override
    public E peak() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
