package datastructure.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//动态数组
public class DynamicArray implements Iterable<Integer> {

    private int size = 0;//逻辑大小
    private final int capacity = 8;//动态数组容量
    private final int[] arr = new int[capacity];

    //向数组最后位置添加元素
    public void addList(int element) {
//        arr[size] = element;
//        size++;
        add(size, element);

    }

    //向数组[0...size]中间位置添加元素
    public void add(int index, int element) {
        if (index >= 0 && index < size) {
            System.arraycopy(arr, index, arr, index + 1, size - index);

        }
        arr[index] = element;
        size++;
    }

    public int remove(int index) {
        int removed = arr[index];
        if (index < size - 1) {
            System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        }
        size--;
        return removed;
    }

    public int get(int index) {
        return arr[index];
    }

    public void foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
//            System.out.println(arr[i]);
            consumer.accept(arr[i]);
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int i = 0;

            @Override
            public boolean hasNext() {//有没有下一个元素
                return i < size;
            }

            @Override
            public Integer next() {//返回当前元素，并移动到下一个元素
                return arr[i++];
            }
        };
    }

    public IntStream stream() {
        return IntStream.of(Arrays.copyOfRange(arr, 0, size));
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addList(1);
        dynamicArray.addList(2);
        dynamicArray.addList(3);
        dynamicArray.addList(4);
//        dynamicArray.addList(5);
        dynamicArray.add(2, 5);

        //foreach
        dynamicArray.foreach(System.out::println);
        //迭代器
        for (Integer element : dynamicArray) {
            System.out.println(element);
        }
        //stream流
        dynamicArray.stream().forEach(System.out::println);

        int removed = dynamicArray.remove(2);
        System.out.println(removed);
        dynamicArray.forEach(System.out::println);

    }
}
