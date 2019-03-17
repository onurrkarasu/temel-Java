package com.com.ornekler;

import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);


        int sayiGir;

        System.out.println("Sayi giriniz : ");
        sayiGir=tara.nextInt();

        if(sayiGir%2==0){
            System.out.println("Sayi Çifttir");
        }else if(sayiGir%2==1){
            System.out.println("Sayi Tektir");
        }else{
            System.out.println("Sayi yoh:D");
        }






    }
}
