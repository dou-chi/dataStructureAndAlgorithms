package com.fn2xn.asa.datastructure.stack;


/**
 * @description: 链表实现得的栈
 * @author: Lee
 * @time: 2020/1/16 15:27
 */
public class LinkedStack<E> implements MyStack<E> {

    /**
     * 元素个数
     */
    private int size;

    /**
     * 栈顶指针
     */
    private Node<E> top;


    public void push(E e) {
        // 创建节点对象
        Node<E> node = new Node<E>(e, this.top);
        top = node;
        size ++;
    }

    public E pop() {
        if (empty())
            throw new RuntimeException("当前栈为空");
        E element = top.item;
        top = top.next;
        size--;
        return element;
    }

    public E peek() {
        if (empty())
            return null;
        return top.item;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    /**
     * 内部节点对象
     * @param <E> 元素
     */
    private static class Node<E>{
        // 节点数据
        E item;

        // 后指针
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }
}
