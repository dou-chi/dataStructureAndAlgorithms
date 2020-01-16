package com.fn2xn.asa.datastructure.table;

/**
 * @description: 线性表接口
 * @author: Lee
 * @time: 2020/1/10 12:27
 */
public interface MyList<E> {

    /**
     * 表内元素的个数
     * @return int
     */
    int size();

    /**
     * 返回线性表中序号为 index 的数据元素
     * @param index 下标
     * @return E
     */
    E get(int index);


    /**
     * 判断表内是否有元素
     * @return boolean
     */
    boolean isEmpty();

    /**
     * 判断线性表是否包含数据元素 e
     * @param e 查找元素
     * @return boolean
     */
    boolean contains(E e);


    /**
     * 返回数据元素 e 在线性表中的序号
     * @param e 查找元素
     * @return 元素所在下标
     */
    int indexOf(E e);


    /**
     * 将数据元素 e 插入到线性表中 index 号位置
     * @param index 想要插入的位置
     * @param e
     */
    void add(int index, E e);


    /**
     * 将数据元素 e 插入到线性表末尾
     * @param e 待插入元素
     */
    void add(Object e);

    //

    /**
     * 将数据元素 e 插入到元素 obj 之前
     * @param obj 位置元素
     * @param e 待插入元素
     * @return boolean
     */
    boolean addBefore(E obj, E e);

    /**
     * 将数据元素 e 插入到元素 obj 之后
     * @param obj 位置元素
     * @param e 待插入元素
     * @return boolean
     */
    boolean addAfter(E obj, E e);

    /**
     * 删除线性表中序号为 index 的元素,并将其返回
     * @param index 序号
     * @return E
     */
    E remove(int index);


    /**
     * 删除线性表中第一个与 e 相同的元素
     * @param e 元素
     * @return boolean
     */
    boolean remove(E e);


    /**
     * 替换线性表中序号为 index 的数据元素为 e，返回原数据元素
     * @param index 序号
     * @param e 替换元素
     * @return E 原元素
     */
    E replace(int index, E e);



}
