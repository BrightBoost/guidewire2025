package org.example.day2.exercises.generics;

public class Box<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T t) {
        this.item = t;
    }
}
