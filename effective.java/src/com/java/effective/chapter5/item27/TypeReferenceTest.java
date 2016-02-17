package com.java.effective.chapter5.item27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类型推导
 * Created by 王勇 on 2016/2/17.
 */
public class TypeReferenceTest {

    public static <K,V> HashMap<K,V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> map = newHashMap();
    }
}
