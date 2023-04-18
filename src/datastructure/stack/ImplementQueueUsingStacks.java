package datastructure.stack;

/**
 * https://leetcode.cn/problems/implement-queue-using-stacks/
 * 232. 用栈实现队列
 * * 双栈模拟队列
 * * <ul>
 * *     <li>调用 push、pop 等方法的次数最多 100</li>
 * * </ul>
 * 队列头        队列尾
 * b
 * 顶   底     底   顶
 * s1              s2
 * <p>
 * 队列尾添加
 * s2.push(a)
 * s2.push(b)
 * <p>
 * 队列头移除
 * 先把 s2 的所有元素移动到 s1
 * s1.pop()
 */
public class ImplementQueueUsingStacks {
    ArrayStack<Integer> s1 = new ArrayStack<>(100);
    ArrayStack<Integer> s2 = new ArrayStack<>(100);

    public void push(int x) {
        s2.push(x);
    }

    public int pop() {
        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty()) {
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

}
