package com.fn2xn.asa.datastructure.stack;


/**
 * @description: 栈接口
 * @author: Lee
 * @time: 2020/1/16 15:19
 */
public interface MyStack<E> {

    /**
     * 入栈
     * @param e 入栈元素
     */
    void push(E e);

    /**
     * 出栈
     * @return E栈顶元素
     */
    E pop();

    /**
     * 获取栈顶元素
     * @return 栈顶元素
     */
    E peek();

    /**
     * 栈是否为空
     * @return boolean
     */
    boolean empty();

    /**
     * 堆里有多少元素
     * @return 元素个数
     */
    int size();

}
