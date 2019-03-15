package com.tekrarlar;

import  java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        // Klavyeden kenarları girilen bir üçgenin çeşidini veren bir uygulamayı yazınız .


        Scanner tara=new Scanner(System.in);

        int x,y,z;


        System.out.println("Birinci Kenarı Giriniz : ");
        x=tara.nextInt();


        System.out.println("İkinci Kenarı Giriniz : ");
        y=tara.nextInt();

        System.out.println("Ücüncü Kenarı Giriniz : ");
        z=tara.nextInt();



        if(x==y && y==z){
            System.out.println("Bu üçgen Eşkanar Üçgendir.");
        }
        else if(x!=y && y!=z && x!=z){
            System.out.println("Bü Ücgen Çeşitkenardır. ");
        }else{
            System.out.println("Ücgen İkizkenar ücgendir.");
        }










    }
}
