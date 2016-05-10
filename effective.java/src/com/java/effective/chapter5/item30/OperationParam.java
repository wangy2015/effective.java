package com.java.effective.chapter5.item30;

/**
 * 特定于常量的方法实现与特定于常量的数据结合起来
 * Created by 王勇 on 2016/5/10.
 */
public enum OperationParam {
    PLUS("+") { double apply(double x, double y) {return x + y;} },
    MINUS("-") { double apply(double x, double y) {return x - y;} },
    TIMES("*") { double apply(double x, double y) {return x * y;} },
    DIVIDE("/") { double apply(double x, double y) {return x / y;} };

    abstract double apply(double x, double y);

    private final String symbol;
    OperationParam(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static void main(String[] args) {
        double x = 3, y = 2;
        for (OperationParam op : OperationParam.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }
        // valueOf方法，将字符串转为枚举常量
        System.out.println(OperationParam.valueOf("PLUS"));
    }
}
