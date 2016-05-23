package com.java.effective.chapter6.item30;

/**
 * 特定于常量的方法实现
 * Created by 王勇 on 2016/5/10.
 */
public enum Operation {
    PLUS { double apply(double x, double y) {return x + y;} },
    MINUS { double apply(double x, double y) {return x - y;} },
    TIMES { double apply(double x, double y) {return x * y;} },
    DIVIDE { double apply(double x, double y) {return x / y;} };

    abstract double apply(double x, double y);

    public static void main(String[] args) {
        System.out.println(com.java.effective.chapter5.item30.Operation.PLUS.apply(1, 2));
    }
}
