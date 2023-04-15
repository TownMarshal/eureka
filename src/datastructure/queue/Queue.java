package datastructure.queue;

public interface Queue<E> {
    /**
     * 向队尾插入元素
     *
     * @param value 待插入值
     * @return 插入成功返回true 失败false
     */
    boolean offer(E value);

    /**
     * 从对列头获取值，并移除
     *
     * @return 如果对列非空返回对列头的值，否则返回null
     */
    E poll();

    /**
     * 从对列头获取值，不移除
     *
     * @return 如果对列非空返回对列头的值，否则返回null
     */
    E peak();

    /**
     * 检查对列是否为空
     *
     * @return 对列为空返回true 否则返回false
     */
    boolean isEmpty();

    /**
     * 检查队列是否已满
     *
     * @return 满返回 true, 否则返回 false
     */
    boolean isFull();
}
