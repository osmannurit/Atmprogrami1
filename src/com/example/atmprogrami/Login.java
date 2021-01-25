package com.example.atmprogrami;


import java.util.Scanner;

public class Login {
    String yildiz = "**********************";
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        String kullaniciadi = scanner.nextLine();
        System.out.print("Parolanızı giriniz: ");
        String parola = scanner.nextLine();
        if (kullaniciadi.equals(hesap.getKullaniciAdi()) && parola.equals(hesap.getParola())){
            return true;
        }else return false;
    }
}
