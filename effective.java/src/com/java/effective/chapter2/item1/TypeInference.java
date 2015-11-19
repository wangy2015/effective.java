package com.java.effective.chapter2.item1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ���� on 2015/11/19.
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
        // ���������ΪString��Object�������List<String>����List<Object>������
        // TypeInference.testList(new ArrayList<String>());
        // ʹ�÷��ͱ���ͨ��
        TypeInference.testGenricList(new ArrayList<String>(), new ArrayList<Integer>(), new ArrayList<String>());
    }
}
