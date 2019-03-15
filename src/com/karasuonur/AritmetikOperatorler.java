package com.karasuonur;

public class AritmetikOperatorler {
    public static void main(String[] args) {

        // + -  * / %
        // = Atama Operatorudur.



        int a=5;
        int b=20;



       // int toplam=(a+b);
        // System.out.println(toplam);

        //  int cikarma=(a-b);
        //  System.out.println(cikarma);

        //   int carpma=(a*b);
        //  System.out.println(carpma);

        double bolme= (double) a/b;
        System.out.println(bolme);


        int a1=17;
        int a2=7;

        int mod=a1%a2;
        System.out.println(mod);

        // Arttirma - Eksiltme

        int s1=15;

        s1++;// Once Kullan Sonra Arttir 16
        System.out.println(s1);
        ++s1;// Once Arttir Sonra Kullan 17
        System.out.println(s1);

        s1--;//Once Kullan Sonra Azalt 16
        System.out.println(s1);
        --s1;//Once Azalt Sonra Kullan 15

        System.out.println(s1);


    }
}
