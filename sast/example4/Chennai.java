package com.naveen.example4;

import TamilNadu;

public class Chennai extends TamilNadu {
    private static String name = "Chennai";
    public static String city() {
        return name;
    }

    public India getCountry() {
        return new India();
    }
}
