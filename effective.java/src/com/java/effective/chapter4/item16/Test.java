package com.java.effective.chapter4.item16;

import java.util.HashSet;

/**
 * Created by 王勇 on 2015/12/9.
 */
public class Test {
    /**
     * 装配模式
     * 抽象组件角色(Component)：Set接口，定义一个对象接口，以规范准备接受附加责任的对象
     * 具体组件角色(ConcreteComponent)：HashSet类，被装饰者，定义一个将要被装饰增加功能的类
     * 抽象装饰器(Decorator)：ForwardingSet类，维持一个指向构件Component对象的实例
     * 具体装饰器角色（ConcreteDecorator)：InstrumentedSet类，向组件添加职责
     * @param args
     */
    public static void main(String[] args) {
        InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<String>());
        s.add("1");
        s.add("2");
        s.add("3");
        System.out.println(s.getAddCount());
    }
}
