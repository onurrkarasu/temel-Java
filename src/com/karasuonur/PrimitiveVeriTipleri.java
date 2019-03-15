package  com.karasuonur;

public class PrimitiveVeriTipleri {

    public static void main(String[] args) {

        /*
        _ ve Bosluk,Rakam İle baslayamaz.
        Türkce Karakter Kullanmamaliyiz.



        ilkel veri Tiplerinde

        byte, short, int  ve long




         */


        int ilkSayim=22;
        int ikinciSayim=20;

        System.out.println(ilkSayim+ikinciSayim);


        System.out.println("BYTE TÜRÜNÜN ALACAĞI EN DÜŞÜK DEĞER  : "+Byte.MIN_VALUE);
        System.out.println("BYTE TÜRÜNÜN ALACAĞI EN BÜYÜK DEĞER  : "+Byte.MAX_VALUE);
        System.out.println("BYTE TÜRÜNÜN HAFIZADA NE KADAR YER ALIYOR   : "+Byte.SIZE);

        System.out.println("SHORT TÜRÜNÜN ALACAĞI EN DÜŞÜK DEĞER  : "+Short.MIN_VALUE);
        System.out.println("SHORT TÜRÜNÜN ALACAĞI EN BÜYÜK DEĞER  : "+Short.MAX_VALUE);
        System.out.println("SHORT TÜRÜNÜN HAFIZADA NE KADAR YER ALIYOR   : "+Short.SIZE);



        System.out.println("INTEGER TÜRÜNÜN ALACAĞI EN DÜŞÜK DEĞER  : "+Integer.MIN_VALUE);
        System.out.println("INTEGER TÜRÜNÜN ALACAĞI EN BÜYÜK DEĞER  : "+Integer.MAX_VALUE);
        System.out.println("INTEGER TÜRÜNÜN HAFIZADA NE KADAR YER ALIYOR   : "+Integer.SIZE);


        System.out.println("LONG TÜRÜNÜN ALACAĞI EN DÜŞÜK DEĞER  : "+Long.MIN_VALUE);
        System.out.println("LONG TÜRÜNÜN ALACAĞI EN BÜYÜK DEĞER  : "+Long.MAX_VALUE);
        System.out.println("LONG TÜRÜNÜN HAFIZADA NE KADAR YER ALIYOR   : "+Long.SIZE);


        /*
        Ondalikli veri tipleri

        float ve Double

       */

        System.out.println("FLOAT TÜRÜNÜN ALACAĞI EN DÜŞÜK DEĞER  : "+Float.MIN_VALUE);
        System.out.println("FLOAT TÜRÜNÜN ALACAĞI EN BÜYÜK DEĞER  : "+Float.MAX_VALUE);
        System.out.println("FLOAT TÜRÜNÜN HAFIZADA NE KADAR YER ALIYOR   : "+Float.SIZE);


        System.out.println("DOUBLE TÜRÜNÜN ALACAĞI EN DÜŞÜK DEĞER  : "+Double.MIN_VALUE);
        System.out.println("DOUBLE TÜRÜNÜN ALACAĞI EN BÜYÜK DEĞER  : "+Double.MAX_VALUE);
        System.out.println("DOUBLE TÜRÜNÜN HAFIZADA NE KADAR YER ALIYOR   : "+Double.SIZE);

        float kayanSayi=2.5232f;

        System.out.println(kayanSayi);


        double kayanSayi2=2.23232323232d;
        System.out.println(kayanSayi2);



        /*
        Char ve Boolean İlkel Veri Tipleri

        */

            char ilkHarf='A';
        System.out.println(ilkHarf);

            boolean alive=true;

        System.out.println(alive);







    }
}
