package org.example.day2.generics;

// not very type safe, the same bag can hold a Chihuahua, a laptop and EVERYTHING
public class GeneralBag {
    private Object object;

    public void putObjectInBag(Object object) {
        this.object = object;
    }

    public Object getObjectFromBag() {
        Object objectToBeTakenFromBag = object;
        this.object = null;
        return objectToBeTakenFromBag;
    }
}
