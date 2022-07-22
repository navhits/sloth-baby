package com.naveen.example2;

import Lamborghini;

public class Hurracan extends Lamborghini {
    public Hurracan() {
        this.brand = "Hurracan";
        this.parent = "Lamborghini";
    }
    public static Lamborghini getParent() {
        return new Lamborghini();
    }
}
