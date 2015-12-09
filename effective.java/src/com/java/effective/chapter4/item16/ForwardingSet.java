package com.java.effective.chapter4.item16;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by 王勇 on 2015/12/9.
 */
public class ForwardingSet<E> implements Set<E> {
    private final Set<E> s;
    public ForwardingSet(Set<E> s) {
        this.s = s;
    }
    @Override
    public int size() {
        return s.size();
    }

    @Override
    public boolean isEmpty() {
        return s.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return s.contains(o);
    }

    @Override
    public Iterator iterator() {
        return s.iterator();
    }

    @Override
    public Object[] toArray() {
        return s.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return s.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return s.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return s.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        return s.addAll(c);
    }

    @Override
    public void clear() {
        s.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return s.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return s.retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return s.containsAll(c);
    }

}
