package sast.example3;


// Match calling of Bank.getBalance() from inherited classes as well

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        int balance = wallet.getBalance();
        int bankBalance = wallet.getBankBalance();
    }
}
