package com.douchi;

import com.douchi.stack.ArrayStack;
import com.douchi.stack.MyStack;
import com.douchi.stack.LinkedStack;
import org.junit.Test;

/**
 * @description: 栈测试
 * @author: Lee
 * @time: 2020/1/16 15:41
 */
public class StackTest {



    @Test
    public void testLinkedStack() {

        MyStack<String> stack = new LinkedStack<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push("e");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }


    @Test
    public void arrayStackTest(){
        ArrayStack<String> stack = new ArrayStack<String>(1);

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("d");


        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push("e");
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
    }


}
