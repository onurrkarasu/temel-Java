package com.karasuonur;

public class DegeratamaveKarsilastirmaOperatorleri {

    public static void main(String[] args) {

        // Aritmetik Atama Operatörleri

        // += -= /= *= %=

        int a=40,b=20;

        a+=b;// a=a+b;
        System.out.println("A nın yeni Değeri  : "+a);





        a-=b;// a=a-b; anın ilk değeri 60-20=40
        System.out.println("A nın Cikarma sonrasi Degeri  : "+a);


        a*=b; // a=a*b; 40*20=800
        System.out.println("A'nın Çarpma sonrasi Degeri : "+a);


        a/=b; // a=a/b; 800/20
        System.out.println("A'nın bölme sonrasi degeri  :"+a);



        a%=b; //
        System.out.println("A'nın Mod(Kalan) degeri sonrasi : "+a);



        // İlişkisel Karşılaştırma Operatorleri

        // ==, >, <, >=,  <=,  !=


        int x=6,y=5;

        System.out.println(x!=y);
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x==y);
        System.out.println(x>=y);
        System.out.println(x<=y);


        int birinciSayi=14, ikinciSayi=15;

        if(birinciSayi>ikinciSayi)
        {
            System.out.println("Birinci Büyük");
        }

        if (ikinciSayi>birinciSayi){
            System.out.println("İkinci Büyük");
        }


        if (birinciSayi==ikinciSayi){
            System.out.println("Sayilar birbirine eşittir");

        }










    }
}
