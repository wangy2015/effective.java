package com.java.effective.chapter2.item1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ÍõÓÂ on 2015/11/19.
 */
public class TypeInference {
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    public static void main(String[] args) {
        Map<String, String> map = TypeInference.newHashMap();
        map.put("key", "value");
        System.out.println(map);
    }
}
