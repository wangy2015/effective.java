package com.java.effective.chapter5.item28;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 有限制通配符：extends super
 * Created by 王勇 on 2016/3/22.
 */
public class Stack<E> {

    public Stack(){}
    public void push(E e){}
    public E pop(){return null;}
    public boolean isEmpty(){return false;}

    public void pushAll(Iterable<? extends E> src) {
        // src中E的子类自动转换为父类E
        // src为生产者
        for (E e : src) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> dst) {
        while (!isEmpty()) {
            // pop()得到的E自动转换为E的父类
            // dst为消费者
            dst.add(pop());
        }
    }

    /**
     * 如果类型参数只在方法声明中出现一次，就可以用通配符取代它
     */
    // 有限制类型参数
    public <T extends Set> void limitTypeParam(List<T> t) {
    }

    // 无限制类型参数
    public <T> void unlimitTypeParam(List<T> t) {
    }

    // 有限制通配符
    public void limitWildcard(List<? extends Set> t) {
    }

    // 无限制通配符
    public void unlimitWildcard(List<?> t) {
    }
}
