package com.com.ornekler;

import  java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);


        int sayiGir;

        System.out.println("Lütfen Sayi giriniz ");
        sayiGir=tara.nextInt();

        if(sayiGir>0.0){
            System.out.println("Sayı Pozitif");
        }
        else if(sayiGir<0.0){
            System.out.println("Sayi Negatif");
        }
        else{
            System.out.println("Sayi Sifirdir.");
        }






    }
}
