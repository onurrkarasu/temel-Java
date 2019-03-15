package com.karasuonur;

public class TipDonusumleri {
/*
    Tip Donusumleri

 */


    public static void main(String[] args) {

        int sayi1=5/3;
        float sayi2=5f/3f;
        double sayi3=5d/3d;

        System.out.println("Sayi 1 : "+sayi1);
        System.out.println("Sayi 2 : "+sayi2);
        System.out.println("Sayi 3 : "+sayi3);


        int a=10;
        float b=3.23f;
        double c=15.1512321321321321321321d;

        a=(int)b; //a İnteger Sen Ona Float Değer atıyorsun bu Olmaz. Uyumsuz
        System.out.println(a);

        b=a;
      //  System.out.println(b);


        b=(float)c; // Double olan c bir Float olarak B de saklanıyor.
       // System.out.println(b);



        //valueOf , parse

        String adim="Onur Karasu";

        String s1="12";
        String s2="22";

      //  System.out.println(s1+s2);

        int a1=Integer.valueOf(s1); // s1 Degiskenini artik İnteger Degere Ceviriyoruz
        int a2=Integer.parseInt(s2); // s2 Degiskenini artik İnteger Deger Ceviriyoruz

      //  System.out.println(a1+a2);


        int b1=80;
        int b2=90;
     //   System.out.println(b1+b2);

        String c1=String.valueOf(b1);
        String c2=String.valueOf(b2);
     //   System.out.println(c1+c2);


        int d1=14;
        int d2=53;

        String f1=String.valueOf(d1);
        String f2=String.valueOf(d2);

        System.out.println(f1+f2);












    }

}
