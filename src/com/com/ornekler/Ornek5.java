package com.com.ornekler;

import java.util.Scanner;
public class Ornek5 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);

        //Basit ATM uygulaması

        double bakiye,yatiralanpara;


        String islemSec=null;

        System.out.print("LÜTFEN PARA İSLEM SEÇİNİZ : ");
        islemSec=tara.nextLine();

        switch (islemSec){
            case "ParaYatirma":
                System.out.println("Ne kadar Yatıracaksınız");
                yatiralanpara=tara.nextDouble();

                bakiye=+yatiralanpara;

                System.out.println("Bakiyeniz : "+bakiye);
                break;
                default:
                    System.out.println("İslemeler sonucsuz");
                    break;

        }







    }
}
