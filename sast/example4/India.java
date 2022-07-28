package com.naveen.example4;

import Country;

public class India extends Country {
    private static String name = "India";
    public static String country() {
        return name;
    }
    public TamilNadu getState() {
        return new TamilNadu();
    }
}
