package datastructure.queue;


import java.util.Iterator;

/**
 * 仅用 head, tail 判断空满, head, tail 需要换算成索引值
 *
 * @param <E> 队列中元素类型
 */
    /*
        求模运算：
        - 如果除数是 2 的 n 次方
        - 那么被除数的后 n 位即为余数 (模)
        - 求被除数的后 n 位方法： 与 2^n-1 按位与
     */

public class ArrayQueue3<E> implements Queue<E>, Iterable<E> {
    private final E[] array;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("all")
    public ArrayQueue3(int c) {
       /* if ((capacity & (capacity - 1)) != 0) {
            throw new IllegalArgumentException("capacity必须是2的N次方");
        }*/
        c -= 1;
        c |= c >> 1;
        c |= c >> 2;
        c |= c >> 4;
        c |= c >> 8;
        c |= c >> 16;
        c += 1;
        array = (E[]) new Object[c];
    }

    @Override
    public boolean offer(E value) {
        if (isFull()) {
            return false;
        }
        // array[(int) (Integer.toUnsignedLong(tail) % array.length)] = value;
        array[tail & (array.length - 1)] = value;
        tail++;
        return true;

    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E value = array[head & (array.length - 1)];
        head++;
        return value;
    }

    @Override
    public E peak() {
        if (isEmpty()) {
            return null;
        }
        return array[head & (array.length - 1)];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public boolean isFull() {
        return tail - head == array.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int p = head;

            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public E next() {
                E value = array[p & (array.length - 1)];
                p++;
                return value;
            }
        };
    }


    public static void main(String[] args) {
/*        ArrayQueue3<Object> queue = new ArrayQueue3<>(8);

        System.out.println(queue.peak());
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        for (Object o : queue) {
            System.out.println(o);
        }
        queue.poll();
        queue.poll();
        queue.poll();
        for (Object o : queue) {
            System.out.println(o);
        }
        System.out.println(queue.peak());*/
/*
求离c最近，比c大的 2^n (方法1)
2^4     = 16
2^4.?   = 30
2^5     = 32

(int)log2(30) + 1
2

log2(x) = log10(x) / log10(2)

1
10      2^1
100     2^2
1000    2^3
*/

        int c = 31;
        int i = (int) (Math.log10(c - 1) / Math.log10(2)) + 1;
        System.out.println(i);
        System.out.println(1 << i);
        c -= 1;
        c |= c >> 1;
        c |= c >> 2;
        c |= c >> 4;
        c |= c >> 8;
        c |= c >> 16;
        c += 1;
        System.out.println(c);


    }
}
