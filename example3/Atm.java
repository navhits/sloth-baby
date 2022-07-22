package com.naveen.example3;

import Bank;

public class Atm extends Bank {
    private int balance = 3000;
    
    public int getAtmBalance() {
        return balance;
    }

    public int getBankBalance() {
        return Bank.getBalance();
    }
}
