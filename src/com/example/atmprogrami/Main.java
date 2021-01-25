package com.example.atmprogrami;

public class Main {

    public static void main(String[] args) {
        String yildiz = "**********************";
        Hesap hesap = new Hesap(2000, "osman", "123");

        ATM atm = new ATM();
        atm.calis(hesap);
    }
}
