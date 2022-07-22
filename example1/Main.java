package com.naveen.example1;

import Secrets;

public class Main {
    public static void main(String[] args) {
        
        String secret = "dont_tell_anyone"; /* This is the string that needs to be identified 
                                                wherever it is used/assigned */
        Secrets secrets = new Secrets();
        
        // A secret "dont_tell_anyone" is being stored
        // This maybe assigned to some local variable inside Secrets() for some processing purposes
        // Its possible that this variable is logged to STDOUT or STDERR
        // This variable could also undergo some mutations before being stored in the Secrets class
        
        /* Is it possible to identify the value "dont_tell_anyone" wherever 
            it gets assigned and where it undergoes some mutation? */
        
        secrets.storeSecret();
        String value = secrets.getSecret();
        System.out.println(secrets.unsaltSecret(value));
    }
}