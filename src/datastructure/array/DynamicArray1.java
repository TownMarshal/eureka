package datastructure.array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.stream.IntStream;

//动态数组
public class DynamicArray1 {

    private int size = 0;//逻辑大小
    private int capacity = 8;//动态数组容量
    private int[] arr = {};

    //向数组最后位置添加元素
    public void addList(int element) {
        add(size, element);

    }

    //向数组[0...size]中间位置添加元素
    public void add(int index, int element) {
        checkAndGrow();
        //添加逻辑
        if (index >= 0 && index < size) {
            System.arraycopy(arr, index, arr, index + 1, size - index);

        }
        arr[index] = element;
        size++;
    }

    private void checkAndGrow() {
        //容量检查
        if (size == 0) {
            arr = new int[capacity];
        } else if (size == capacity) {
            //进行扩容,1.5 1.618 2
            capacity += capacity >> 1;
            int[] newArr = new int[capacity];
            System.arraycopy(arr, 0, newArr, 0, size);
            arr = newArr;
        }
    }

    public void foreach(Consumer<Integer> consumer) {
        for (int i = 0; i < size; i++) {
//            System.out.println(arr[i]);
            consumer.accept(arr[i]);
        }
    }

    public static void main(String[] args) {
        DynamicArray1 dynamicArray = new DynamicArray1();
        for (int i = 0; i < 9; i++) {
            dynamicArray.addList(i + 1);
        }
        dynamicArray.foreach(System.out::println);

    }
}
