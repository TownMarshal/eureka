package datastructure.stack;

import datastructure.queue.ArrayQueue3;

import java.util.LinkedList;

/**
 * https://leetcode.cn/problems/implement-stack-using-queues/
 * 225. 用队列实现栈
 */
public class ImplementStackUsingQueues {
    ArrayQueue3<Integer> queue3 = new ArrayQueue3<>(100);
    private int size = 0;

    public void push(int x) {
        queue3.offer(x);
        for (int i = 0; i < size; i++) {
            queue3.offer(queue3.poll());
        }
        size++;
    }

    public int pop() {
        size--;
        return queue3.poll();
    }
    public int top(){
        return queue3.peek();
    }

    public boolean empty(){
        return queue3.isEmpty();
    }




}
