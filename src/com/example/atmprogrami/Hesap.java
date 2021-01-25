package com.example.atmprogrami;


import java.util.Scanner;

public class Hesap {
    private int bakiye;
    private String kullaniciAdi;
    private String parola;
    String yildiz = "**********************";
    Scanner scanner = new Scanner(System.in);

    public Hesap(int bakiye, String kullaniciAdi, String parola) {
        this.bakiye = bakiye;
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public void paraYatirma(int tutar){
        System.out.print(yildiz + "\nYatırmak istediğiniz tutarı giriniz: ");
        tutar= scanner.nextInt();
        bakiye+=tutar;
        System.out.println("İşlem başarılı.\nYeni bakiyenizi" + bakiye +"TLdir.");
    }

    public void paraCekme(int tutar){
        System.out.print(yildiz + "\nÇekmek istediğiniz tutarı giriniz: ");
        tutar = scanner.nextInt();
        if (tutar>bakiye){
            System.out.println("Hesabınızdaki bakiyeden fazlasını çekemezsiniz\nBakiyeniz:" + bakiye);
        }else{
            bakiye-=tutar;
            System.out.println("İşleminiz başarılı..\nYeni bakiyeniz: " + bakiye);
            System.out.println(yildiz);
        }
    }
}
