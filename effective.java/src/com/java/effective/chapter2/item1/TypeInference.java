package com.java.effective.chapter2.item1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 王勇 on 2015/11/19.
 */
public class TypeInference {
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<T>();
    }

    public static void testList(List<Object> list) {
        System.out.println(list);
    }

    public static <T1, T2> void testGenricList(List<T1> list1, List<T2> list2, List<? extends T1> list3) {
        for (T1 t1 : list1) {
            System.out.println(t1);
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = TypeInference.newHashMap();
        map.put("key", "value");
        System.out.println(map);
        // 编译错误，因为String是Object的子类而List<String>不是List<Object>的子类
        // TypeInference.testList(new ArrayList<String>());
        // 使用泛型编译通过
        TypeInference.testGenricList(new ArrayList<String>(), new ArrayList<Integer>(), new ArrayList<String>());
    }
}
