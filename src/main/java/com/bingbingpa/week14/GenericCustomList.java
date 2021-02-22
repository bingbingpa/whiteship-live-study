package com.bingbingpa.week14;

import java.util.ArrayList;
import java.util.List;

public class GenericCustomList<E> {

    private final List<E> list = new ArrayList<E>();

    public void add(E element) {
        list.add(element);
    }

    public E get(int index) {
        return list.get(index);
    }
}
