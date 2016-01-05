package com.java.effective.chapter5.item25;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王勇 on 2016/1/5.
 */
public class Test {

    /**
     * 测试数组协变
     */
    public void testArrayCovariant() {
        Object[] objectArray = new Long[1];
        // ArrayStoreException异常
        objectArray[0] = "I don't fit in";

        // 不能编译通过
//        List<Object> ol = new ArrayList<Long>();

        // 编译不通过，Generic array creation（泛型数组创建非法）
//        List<String>[] stringLists = new ArrayList<String>[1];
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.testArrayCovariant();
    }
}
