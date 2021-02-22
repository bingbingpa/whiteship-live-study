package com.bingbingpa.week14;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private final List list = new ArrayList();

    public void add(Object element) {
        list.add(element);
    }

    public Object get(int index) {
        return list.get(index);
    }
}