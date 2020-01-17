package com.fn2xn.asa.datastructure.queue;

/**
 * @description: 使用数组实现简单的队列(不支持动态扩容)，这里使用的是循环数组
 * 在非循环数组中，如果出队后，需要将队头后的元素都向前移动一位，
 * 增大时间复杂度，使用循环数组就可避免这个问题。
 *
 * 定义两个指针一个队头指针 front, 队尾指针 rear,空出一个元素，
 * 作为队头与队尾的分界点
 *
 * 此时：队满条件为 （rear + 1 ) % maxSize == front
 *      队列长度为：size = (rear - front + maxSize) % maxSize
 *
 *
 * @author: Lee
 * @time: 2020/1/17 16:38
 */
public class ArrayQueue<E> implements  MyQueue<E> {

    /**
     * 定义数组，存储队列元素
     */
    private Object[] queueData;

    /**
     * 队头指针 (数组下标)
     */
    private int front;

    /**
     * 队尾指针 （数组下标）
     */
    private int rear;

    /**
     * 队列所能存储的最大元素个数
     */
    private int maxSize;

    public ArrayQueue(int queueSize) {
        if (queueSize <= 0)
            throw new RuntimeException("初始化队列大小值不合法："+ queueSize);
        maxSize = queueSize == Integer.MAX_VALUE ? queueSize : queueSize + 1;
        queueData = new Object[maxSize];
    }

    @Override
    public boolean enQueue(E e) {
        if (isFull())
            throw new RuntimeException("队列已满, 无法添加数据");
        queueData[rear] = e;
        rear = (rear + 1) % maxSize; // 向后移动一位，并取模
        return true;
    }

    @Override
    public E deQueue() {
        if (isEmpty())
            return null;
        E e = (E) queueData[front];
        front = (front + 1) % maxSize;
        return e;
    }

    @Override
    public E peek() {
        return (E) queueData[front];
    }

    @Override
    public int size() {
        return (rear - front + maxSize) % maxSize;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * 是否队满
     * @return
     */
    public boolean isFull(){
        return (rear + 1 ) % maxSize == front;
    }
}
