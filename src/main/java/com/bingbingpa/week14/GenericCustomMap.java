package com.bingbingpa.week14;

import java.util.HashMap;
import java.util.Map;

public class GenericCustomMap<K, V> {

    private final Map<K, V> map = new HashMap<K, V>();

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }
}
