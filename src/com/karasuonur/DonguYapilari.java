package com.karasuonur;

public class DonguYapilari {
    public static void main(String[] args) {
        // Dongu nedir : belirli ifadeleri yada kod bloklarını tekrar tekrar calistiran yapilardir.

        //While Döngüsü (Kosul Dogru oldugu sürece kod blogunu calistir.
/*
        int sayi=1;

        while(sayi<10){

            System.out.println("Şu anki sayi : "+sayi);
            sayi++;
        }

        int s1=1,toplam=0;

        while (s1<=10){

            toplam=toplam+s1;
            s1++;

        }

        System.out.println("1 den 10 a kadar olan sayıların toplami "+toplam);*/


    // Do While Döngüsü : whilenin şartı sağlandıkca Do calisacak. (Do içi 1 Kere çalıştırılacak)

      /*  int sayi=1;

        do {
            System.out.println("Sayi "+sayi);
            sayi++;
        }while (sayi<=10);
*/


      // For Döngüsü :

/*
        for(int i=0;i<=100;i=i+2){
            System.out.println("Sayi : "+i);
        }*/



        for (int a=5,b=6;a*b<100;a++,b+=3){
            System.out.println("A nın ilk Degeri"+a);
            System.out.println("B nin ilk degeri "+b);
            System.out.println("a*b nin degeri"+a*b);
        }


    }
}
