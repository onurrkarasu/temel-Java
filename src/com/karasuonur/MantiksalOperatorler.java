package com.karasuonur;

public class MantiksalOperatorler {
    public static void main(String[] args) {
        // Mantiksal Operatorler


        // AND,OR,XOR,NOT

        boolean x=true;
        boolean y=false;
        boolean z=true;
        boolean t=false;

        System.out.println("X && N :"+(x&&y)); // HER İKİSİNİN TRUE OLDUĞU DURUMDA TRUEDUR; diğer halleri falsedir.
        System.out.println("y && t:"+(y&&t)); // HER İKİSİNİN TRUE OLDUĞU DURUMDA TRUEDUR; diğer halleri falsedir.


        System.out.println("X || N : "+(x||y)); // her ikisinin false olduğu yerde falsedur gerisi truedür.


        System.out.println("x^ y :"+(x^y)); //xor da sag ve soldaki değerler aynı ise(ikiside  true ise) false olur, diğer durumlar true//true
        System.out.println("x^ z :"+(x^z)); // false


        System.out.println("!X : "+(!x));
        System.out.println("!y : "+(!y));// Deger degistirme.( )




        //İşlem Önceliği

        int a=10,b=8,c=3;

        System.out.println(a-b*3);
        System.out.println((a-b)*c-a);








    }
}
