package com.fn2xn.asa.datastructure.queue;


/**
 * @description: 自定义队列
 * @author: Lee
 * @time: 2020/1/17 15:55
 */
public interface MyQueue<E> {

    /**
     * 添加元素到队尾
     * @param e 指定元素
     * @return 是否成功
     */
    boolean enQueue(E e);

    /**
     * 获取队头元素并删除
     * @return 队头元素
     */
    E deQueue();

    /**
     * 获取队头元素，不删除
     * @return 队头元素
     */
    E peek();


    /**
     * 队列内元素个数
     * @return
     */
    int size();

    /**
     * 队列是否为空
     * @return 为空 true, 不为空 false
     */
    boolean isEmpty();


}
