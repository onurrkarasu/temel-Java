package com.tekrarlar;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        // Klavyeden Girilen vize ve Final notlarına göre öğrencinin dersi geçip geçmediğini söyleyen bir uygulama yazınız. ( Geçme notu : 50 , vizenin %40 , finalin %60 dahil)



        Scanner tara=new Scanner(System.in);

        double vizeSinavi,finalSinavi,gecmeNotu;

        System.out.println("Lütfen Vize Sınav Notunu Giriniz : ");
        vizeSinavi=tara.nextDouble();

        System.out.println("Lütfen Final Sınav Notunu Giriniz : ");
        finalSinavi=tara.nextDouble();

        gecmeNotu=vizeSinavi*0.4+finalSinavi*0.6;

        System.out.println("Gecme Notu "+gecmeNotu);

        if(gecmeNotu>=50){

            System.out.println("Ortalama 50  Şartın üstündedir Öğrenci Sınavi Geçti");
        }
        else{
            System.out.println("Ortalama 50 şartın altındadır Öğrenci Sınavdan Kaldı");
        }







    }
}
