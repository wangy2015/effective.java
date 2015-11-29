package com.java.effective.chapter3.item8;

/**
 * Created by 王勇 on 2015/11/28.
 */
public class FloatCompareTest {
    public static void main(String[] args) {
        float f1 = 123.456f;
        float f2 = 123.456f;
        System.out.println(Float.valueOf(f1).equals(f2));
        float f3 = Float.NaN;
        float f4 = Float.NaN;
        System.out.println(f3 == f4);
        System.out.println(Float.valueOf(f3).equals(f4));
        System.out.println(Float.compare(f3, f4));
        float f5 = 0.0f;
        float f6 = -0.0f;
        System.out.println(f5 == f6);
        System.out.println(Float.valueOf(f5).equals(f6));
        System.out.println(Float.compare(f5, f6));
    }
}
