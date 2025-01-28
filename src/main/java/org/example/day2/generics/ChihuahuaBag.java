package org.example.day2.generics;

public class ChihuahuaBag {
    private Chihuahua chihuahua;

    public void putChihuahuaInBag(Chihuahua chihuahua) {
        this.chihuahua = chihuahua;
    }

    public Chihuahua getChihuahuaFromBag() {
        Chihuahua chihuahuaToBeTakenFromBag = chihuahua;
        this.chihuahua = null;
        return chihuahuaToBeTakenFromBag;
    }

}
