package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class WorkintechList<E> extends ArrayList<E> {

    @Override
    public boolean add(E element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean result = false;
        for (E element : c) {
            if (add(element)) {
                result = true;
            }
        }
        return result;
    }

    public void sort() {
        super.sort(null);
    }

    @Override
    public E remove(int index) {
        E removedElement = super.remove(index);
        sort();
        return removedElement;
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }
}