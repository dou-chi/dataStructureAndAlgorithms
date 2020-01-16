package com.fn2xn.asa.datastructure;

import com.fn2xn.asa.datastructure.table.ListByArray;
import com.fn2xn.asa.datastructure.table.MyList;
import org.junit.Test;

/**
 * @description: 线性表测试
 * @author: Lee
 * @time: 2020/1/10 12:56
 */
public class TableTest {


    /**
     * 线性表测试
     */
    @Test
    public void listByArrayTest(){


        MyList<Integer> list1 = new ListByArray<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        System.out.println(list1.size());
        System.out.println(list1.isEmpty());
        System.out.println(list1.get(-1));
    }


}
