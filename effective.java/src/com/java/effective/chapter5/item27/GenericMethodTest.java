package com.java.effective.chapter5.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 王勇 on 2016/2/17.
 */
public class GenericMethodTest {
    public static Set union(Set s1, Set s2) {
        // 编译警告
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    public static <E> Set<E> unionGeneric(Set<E> s1, Set<E> s2) {
        Set<E> result = new HashSet<E>(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>(Arrays.asList("s1", "s2", "s3"));
        Set<String> s2 = new HashSet<String>(Arrays.asList("s4", "s5", "s6"));
        System.out.println(GenericMethodTest.unionGeneric(s1, s2));
    }

}
