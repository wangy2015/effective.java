package com.java.effective.chapter5.item27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 王勇 on 2016/2/17.
 */
public class CompareTest {
    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            if (t.compareTo(result) > 0) {
                result = t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<CompareImpl> list = new ArrayList<CompareImpl>();
        list.add(new CompareImpl("王勇",1));
        list.add(new CompareImpl("韩晓娜",2));
        list.add(new CompareImpl("王子莟",3));
        System.out.println(CompareTest.max(list));
    }

    static class CompareImpl implements Comparable<CompareImpl> {
        private String name;
        private int order;
        public CompareImpl(String name, int order) {
            this.name = name;
            this.order = order;
        }
        @Override
        public int compareTo(CompareImpl o) {
            return this.getOrder() - o.getOrder();
        }

        public int getOrder() {
            return order;
        }

        @Override
        public String toString() {
            return "name="+name+",order="+order;
        }
    }
}
