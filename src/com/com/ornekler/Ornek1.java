package com.com.ornekler;

import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);


        int girilenSayi1,girilenSayi2,toplam;

        System.out.println("Birinci Sayıyı Giriniz : ");
        girilenSayi1=tara.nextInt();

        System.out.println("İkinci Sayıyı Giriniz : ");
        girilenSayi2=tara.nextInt();


        toplam=(girilenSayi1+girilenSayi2)/2;

        System.out.println("Toplam Değer"+toplam);












    }
}
