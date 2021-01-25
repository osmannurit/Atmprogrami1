package com.example.atmprogrami;


import java.util.Scanner;

public class ATM {
    String yildiz = "**********************";
    String islemler = "Bankamıza hoşgeldiniz!\n"+
            "***Yapabileceğiniz işlemler***"+
            "\n\t1- Bakiye Görüntüleme"+
            "\n\t2- Para Yatırma"+
            "\n\t3- Para Çekme"+
            "\n\t4- Çıkış için başka q'ya basınız";

    public void calis(Hesap hesap){
        System.out.println("ATM'ye bağlanmak için giriş yapmanız gerekmektedir.");
        Login login = new Login();
        int girisHakki=3;
        while (girisHakki>0){

        if (!login.login(hesap)) {
            System.out.println("Giriş Başarısız");
            girisHakki--;
            System.out.println("Kalan Deneme hakkınız: "+ girisHakki);
            if (girisHakki==0){
                System.out.println("Programdan çıkılıyor");
            }
        }else {
            System.out.println("Giriş Başarılı");



        System.out.println(yildiz);
        System.out.println(islemler);
        System.out.println(yildiz);
        Scanner scanner = new Scanner(System.in);

        boolean finishProject = false;
        while (finishProject == false) {
            System.out.println("Sıradaki işleminizi seçiniz");
            String girdi = scanner.nextLine();
            if (girdi.equals("1")) {
                System.out.println("Bakiyeniz" + hesap.getBakiye());
                System.out.println(yildiz);
                continue;
            } else if (girdi.equals("2")) {
                hesap.paraYatirma(hesap.getBakiye());
                System.out.println("İşlem başarılı.. Yeni bakiyeniz:" + hesap.getBakiye());
                continue;
            } else if (girdi.equals("3")) {
                hesap.paraCekme(hesap.getBakiye());
                continue;
            } else if (girdi.equals("q")) {
                System.out.println("işlem sonu");
                finishProject = true;
            } else {
                System.out.println("Yanlış değer girdiniz");
                System.out.println(yildiz);
                System.out.println(islemler);
                System.out.println(yildiz);
                continue;
            }
        }
            }
        }
    }
}
