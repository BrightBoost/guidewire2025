package org.example.day2.exercises.generics;

public class DataHolder<K, V extends Box<?>> {
    private K key;
    private V value;

    public DataHolder(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
