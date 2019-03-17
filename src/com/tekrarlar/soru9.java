package com.tekrarlar;
import java.util.Scanner;


public class soru9 {
    public static void main(String[] args) {

        Scanner tara=new Scanner(System.in);


        //Çarpım tablosunu oluşturan bir uygulama yazınız .

        for(int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j)+"\t");

            }
        }

        System.out.println();
        System.out.println();


    }
}
