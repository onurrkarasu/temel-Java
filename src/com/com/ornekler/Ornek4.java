package com.com.ornekler;

import  java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);




        String islem = null;


        int sayi1,sayi2,toplam;

        System.out.println("Hangi İslemi Yapacaksınız +/-/*/ /   : ");
        islem=tara.nextLine();


        switch (islem){
            case "+":
                System.out.println("Sayi 1 Gir : ");
                sayi1=tara.nextInt();
                System.out.println("Sayi 2 Gir" );
                sayi2=tara.nextInt();
                toplam=(sayi1+sayi2);

                System.out.println(toplam);
                break;
            case "-":
                System.out.println("Sayi 1 Gir : ");
                sayi1=tara.nextInt();
                System.out.println("Sayi 2 Gir" );
                sayi2=tara.nextInt();
                toplam=(sayi1-sayi2);

                System.out.println(toplam);
                break;
            case "*":
                System.out.println("Sayi 1 Gir : ");
                sayi1=tara.nextInt();
                System.out.println("Sayi 2 Gir" );
                sayi2=tara.nextInt();
                toplam=(sayi1*sayi2);

                System.out.println(toplam);
                break;
            case "/":
                System.out.println("Sayi 1 Gir : ");
                sayi1=tara.nextInt();
                System.out.println("Sayi 2 Gir" );
                sayi2=tara.nextInt();
                toplam=(sayi1+sayi2);

                System.out.println(toplam);
                break;
                default:
                    System.out.println("fak");
                    break;
        }






    }
}
