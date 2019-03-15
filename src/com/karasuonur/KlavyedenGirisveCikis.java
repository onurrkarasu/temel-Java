package com.karasuonur;

import java.util.Scanner;



public class KlavyedenGirisveCikis {

    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);

       /* String isim="";



        System.out.print("Lütfen Adınızı giriniz :");


        isim=tara.nextLine();

        System.out.println("Girilen İsim : "+isim);



        // next : Klavyeden Girilen ifadenin ilk kelimesini okur.
        // findInLine(".").charAt(0)// Klavyeden girilen ifadeyi belirtilen Karaktere Böler.
        // nextInt : Klavyeden girilen değeri İntegere Çevirir. Float, Double.


        String soyad="";
        System.out.println("Lütfen Soyadınızı Giriniz:");
        soyad=tara.next();
        System.out.println(" Soyadınız  "+soyad);*/



/*

       int s1,s2,s3;

       String enKücük,enBüyük;

        System.out.print("Birinci Sayıyı Giriniz : ");
        s1=tara.nextInt();

        System.out.print("İkinci Sayıyı Giriniz  :" );
        s2=tara.nextInt();

        System.out.print("Ücüncü Sayiyi Giriniz : ");
        s3=tara.nextInt();


        if(s1>s2 && s1>s3){
            System.out.println("Birinci Sayi Büyüktür.");

        }
        else if(s2>s1 && s2>s3){
            System.out.println("İkinci Sayi Büyüktür.");
        }
        else if(s3>s1 && s3>s2){
            System.out.println("Ücüncü Sayi Büyüktür");
        }
        else{
            System.out.println("İşlemler Başarısız. Sayılar Tanimsiz.");
        }

*/


        String ad,soyad,okul,bolum;

        System.out.println("Lütfen Adınızı Giriniz : ");
        ad=tara.nextLine();

        System.out.println("Lütfen Soyadınızı Giriniz ");
        soyad=tara.nextLine();

        System.out.println("Lütfen Mezun Oldugunuz Okul Adını Giriniz : ");
        okul=tara.nextLine();

        System.out.println("Lütfen Mezun Oldugunuz Bölüm Adını Giriniz :  ");
        bolum=tara.nextLine();


        System.out.println("Adınız  : "+ad);
        System.out.println("Soyadınız  : "+soyad);
        System.out.println("Mezun Oldugunuz Okul   : "+okul);
        System.out.println("Bolümünüz  : "+bolum);








    }
}
