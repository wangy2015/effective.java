package com.java.effective.chapter5.item26;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by 王勇 on 2016/2/13.
 *  堆栈，使用泛型
 */
public class GenericStack<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        // 编译不通过，无法创建不可具体化的类型的数组
//        elements = new E[DEFAULT_INITIAL_CAPACITY];
        elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        E result = elements[--size];
        elements[size] = null;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>();
        for (String arg : args) {
            stack.push(arg);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toUpperCase());
        }
    }
}
