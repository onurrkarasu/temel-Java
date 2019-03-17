package com.tekrarlar;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        // Klavyeden girilen, bir sayının faktöriyelini alan bir uygulama yazınız.

        Scanner tara=new Scanner(System.in);

        int girilenSayi,faktoriyel=1,sayac=1;

        System.out.println("Lütfen Hesaplanacak Sayiyi giriniz : ");
        girilenSayi=tara.nextInt();


        while (sayac<=girilenSayi){
            faktoriyel=faktoriyel*sayac;
            sayac++;
        }

        System.out.println("Girdiniz Sayi  :"+girilenSayi+"   sayının Faktöriyelini  : "+faktoriyel);











    }
}
