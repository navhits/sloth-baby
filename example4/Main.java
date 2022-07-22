package com.naveen.example3;

import India;
import TamilNadu;
import Chennai;
import ChennaiHelper;


// Match calling of India.country() in all inherited classes and dependency class 

public class Main {
    public static void main(String[] args) {
        TamilNadu tamilnadu = new TamilNadu();
        Chennai chennai = new Chennai();
        
        String country = India.country();
        String countryFromState = tamilnadu.country();
        String countryFromCity = chennai.country();
        String countryFromStateViaCity = tamilnadu.getCity().country();
        String countryFromCityViaStateViaCity = chennai.getState().getCity().country();
        String countryFromStateViaCityViaCountry = tamilnadu.getCity().getCountry().country();
        String countryFromHelper = new ChennaiHelper(chennai).getCountryName();
    }
}
