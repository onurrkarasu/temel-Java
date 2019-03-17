package com.tekrarlar;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {


        Scanner tara=new Scanner(System.in);

        //100 Lük sistemde verilen notlari harfli sistemde gösteren bir uygulama yazınız .


        int girilenNot,notSiniri=0;
        System.out.print("Lütfen Notunuzu Giriniz : ");
        girilenNot=tara.nextInt();
        notSiniri=girilenNot-(girilenNot%10);

        switch (notSiniri){
            case 90:
                System.out.println("Harf Notunuz AA");
                break;
            case 80:
                System.out.println("Harf Notunuz BA");
                break;
            case 70:
                System.out.println("Harf Notunuz BB");
                break;
            case 60:
                System.out.println("Harf Notunuz CB");
                break;
            case 50:
                System.out.println("Harf Notunuz CC");
                break;
            case 45:
                System.out.println("Harf Notunuz FD");
                break;
            case 40:
                System.out.println("Harf Notunuz FD");
                break;
            case 35:
                System.out.println("Harf Notunuz FF");
                break;
            case 30:
                System.out.println("Harf Notunuz FF");
                break;
            case 20:
                System.out.println("Harf Notunuz Ff");
                break;

                default:
                    System.out.println("Bİ BOK YOK");
                    break;


        }









    }
}
