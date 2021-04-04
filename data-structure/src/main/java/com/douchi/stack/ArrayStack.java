package com.douchi.stack;

import java.util.Arrays;

/**
 * @description: 数组结构实现栈
 * @author: Lee
 * @time: 2020/1/16 15:52
 */
public class ArrayStack<E> implements MyStack<E> {

    // 元素个数
    private int size;

    // 栈元素数据
    private Object[] elementData;

    // 默认创建的数组长度
    private static final int DEFAULT_ARRAY_LENGTH = 10;

    // 空数组
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    /**
     * 构造函数
     *
     * @param initialCapacity 默认创建的数组长度
     */
    public ArrayStack(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        } else {
            throw new RuntimeException("输入的数组初始值不合法");
        }
    }

    /**
     * 默认创建长度为10的数组
     */
    public ArrayStack() {
        this.elementData = new Object[DEFAULT_ARRAY_LENGTH];
    }

    public void push(E e) {
        // 数组已经满了
        if (elementData.length == size) {
            // 扩容为原来的百分之五十
            int oldLength = elementData.length;
            int newLength = oldLength + (oldLength >> 1);
            if ((newLength - oldLength) == 0)
                newLength = oldLength << 1;
            // 拷贝旧数组到新数组中
            newLength = newLength - Integer.MAX_VALUE > 0 ? Integer.MAX_VALUE : newLength;
            // 拷贝
            elementData = Arrays.copyOf(elementData, newLength);
        }
        elementData[size] = e;
        size++;
    }

    public E pop() {
        if (empty())
            throw new RuntimeException("栈为空，没有数据可弹出");
        return (E) elementData[--size];
    }

    public E peek() {
        if (empty())
            throw new RuntimeException("栈为空，没有数据");
        return (E) elementData[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
