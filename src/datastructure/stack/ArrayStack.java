package datastructure.stack;

import java.util.Iterator;

/**
 * 底    顶
 * 0 1 2 3
 * a b
 * t
 * * 底    顶
 * * 0 1 2 3
 * * a b c d
 * *         t
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E>, Iterable<E> {
    private final E[] arr;
    private int top;//栈顶的指针

    @SuppressWarnings("all")
    public ArrayStack(int capaciy) {
        this.arr = (E[]) new Object[capaciy];
    }

    @Override
    public boolean push(E value) {
        if (isFull()) {
            return false;
        }
//        arr[top] = value;
//        top++;
        arr[top++] = value;
        return true;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            return null;
        }
//        E value = arr[top - 1];
//        top--;
        return arr[--top];
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean isFull() {
        return top == arr.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = top;

            @Override
            public boolean hasNext() {
                return p > 0;
            }

            @Override
            public E next() {
                return arr[--p];
            }
        };
    }

    public static void main(String[] args) {
        ArrayStack<Object> stack = new ArrayStack<>(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        for (Object o : stack) {
            System.out.println(o);
        }

        stack.pop();
        stack.pop();
//        stack.pop();
        for (Object o : stack) {
            System.out.println(o);
        }
    }
}
