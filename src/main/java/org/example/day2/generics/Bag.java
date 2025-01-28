package org.example.day2.generics;

public class Bag<T> {

    private T content;

    public void putContentInBag(T content) {
        this.content = content;
    }

    public T getContentFromBag() {
        T contentToBeTakenFromBag = content;
        this.content = null;
        return contentToBeTakenFromBag;
    }
}
