package com.tekrarlar;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {

        // Klavyeden Girilen 3 Sayının Ortalamasını alan bir Uygulama yazınız.


        Scanner tara=new Scanner(System.in);


        int sayi1,sayi2,sayi3;

        int ortalama;


        System.out.print("Lütfen Birinci Sayıyı Giriniz : ");
        sayi1=tara.nextInt();

        System.out.print("Lütfen İkinci Sayıyı Giriniz  :");
        sayi2=tara.nextInt();

        System.out.print("Lütfen Ücüncü Sayıyı Giriniz : ");
        sayi3=tara.nextInt();



        ortalama=(sayi1+sayi2+sayi3)/3;

        System.out.println("Klavyeden Girilen Üc Sayinin Ortalaması  : "+ortalama);









    }
}
