package com.douchi.table;


/**
 * @description: 数组实现线性表
 * @author: Lee
 * @time: 2020/1/10 12:40
 */
public class ListByArray<E> implements MyList<E> {

    /**
     * 如果初始化不传入长度，默认的数组长度
     */
    private static final int DEFAULT_INITIAL_CAPACITY = 10;

    /**
     * 存放数据的数组
     */
    private Object[] elementData;

    /**
     * 元素的个数
     */
    private int size;

    /**
     *
     * @param initialCapacity 数组初始长度
     */
    public ListByArray(int initialCapacity) {
        elementData = new Object[initialCapacity];
    }

    public ListByArray() {
        elementData = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);
        return (E)elementData[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(E e) {
        return false;
    }

    public int indexOf(E e) {
        return 0;
    }

    public void add(int index, E e) {

    }

    public void add(Object e) {
        elementData[size++] = e;
    }

    public boolean addBefore(E obj, E e) {
        return false;
    }

    public boolean addAfter(E obj, E e) {
        return false;
    }

    public E remove(int index) {
        return null;
    }

    public boolean remove(E e) {
        return false;
    }

    public E replace(int index, E e) {
        return null;
    }

    /**
     * 判断下标是否合法
     * @param index
     */
    private void checkIndex(int index){
        if (index < 0 || index >= size)
            throw new RuntimeException("数组下标越界：" + index);
    }
}
