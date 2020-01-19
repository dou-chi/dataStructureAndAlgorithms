package com.fn2xn.asa.datastructure.queue;

/**
 * @description: 单链表结构实现队列
 * @author: Lee
 * @time: 2020/1/19 10:06
 */
public class LinkedQueue<E> implements MyQueue<E> {

    /**
     * 定义一个头节点
     */
    private Node<E> front;

    /**
     * 队尾指针
     */
    private Node<E> rear;

    /**
     * 队列元素个数
     */
    private int size;

    public LinkedQueue() {
        // 定义一个头节点
        front = new Node<>(null, null);
        rear = front;
    }

    @Override
    public boolean enQueue(E e) {
        // 构造新节点
        Node newNode = new Node<>(e, null);
        // 在队尾添加节点
        rear.next = newNode;
        // rear替换为新的最后节点
        rear = newNode;
        size ++;
        return true;
    }

    @Override
    public E deQueue() {
        if (isEmpty())
            return null;

        // 获取头节点后一个元素
        Node<E> node = front.next;
        // 将其出队
        front.next = node.next;
        size --;

        // 如果队头是队尾（只有一个元素）
        if (node == rear){
            // 尾节点移到头节点
            rear = front;
        }

        return node.item;
    }

    @Override
    public E peek() {
        if (isEmpty())
            return null;

        // 获取头节点的后一个元素的数据
        return front.next.item;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 内部节点对象
     */
    private static class Node<E>{
        // 节点数据
        E item;

        // 后节点指针
        Node<E> next;

        public Node(E item, Node<E> next) {
            this.item = item;
            this.next = next;
        }
    }
}
