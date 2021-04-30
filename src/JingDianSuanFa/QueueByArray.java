package JingDianSuanFa;

public class QueueByArray {

    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.println(queue.poll());;
        System.out.println(queue.poll());;
        System.out.println(queue.poll());;
        System.out.println(queue.poll());;
        System.out.println(queue.poll());;
    }

}

class MyQueue {

    private int head;

    private int tail;

    private int size;

    private final static int MAX_CAPACITY = 1 << 30;

    private String[] queue;

    private int capacity;

    public MyQueue(int initialCapacity) throws Exception {
        if (initialCapacity > MAX_CAPACITY){
            throw new Exception("initialCapacity too large");
        }
        if (initialCapacity < 0){
            throw new Exception("initialCapacity must be more than zero");
        }
        queue = new String[initialCapacity];
        head = tail = -1;
        size = 0;
    }

    public MyQueue(){
        capacity = 16;
        queue = new String[capacity];
        head = tail = -1;
        size = 0;
    }

    //插入
    public void offer(String str){
//        if (++tail > capacity){
//            System.out.println("满了");
//            tail = 0;
//        }
        queue[++tail] = str;
        size++;
    }

    //弹出
    public String poll(){
        size--;
        String str = queue[++head];
        queue[head] = "";
        return str;
    }

    @Override
    public String toString() {
        if (size <= 0) return "{}";
        StringBuilder builder = new StringBuilder(size + 8);
        builder.append("{");
        int h = head;
        int count = 0;
        while (count < size){
            if (++h > capacity-1) h = 0;
            builder.append(queue[h]);
            builder.append(", ");
            count++;
        }
        return builder.substring(0,builder.length()-2) + "}";
    }
}
