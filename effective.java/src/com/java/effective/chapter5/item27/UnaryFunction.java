package com.java.effective.chapter5.item27;

/**
 * 泛型单例工厂测试使用接口
 * Created by 王勇 on 2016/2/17.
 */
public interface UnaryFunction<T> {

    T apply(T arg);
}
