package com.karasuonur;

public class DallanmaBreakContinueReturn {
    public static void main(String[] args) {

        /*for(int i=0;i<=10;i++){

            if(i==5)
                break;

            System.out.println(i);


        }
*/

        /*etiket:
        for (int i=0;i<10;i++){


            for (int j=0;j<5;j++){

                if(j==2)
                    break etiket;


                System.out.println("i :"+i +" j : "+j);
            }
        }*/

/*
        for (int i=0;i<10;i++){

            if(i==5)
                continue;
           // System.out.println(i);
        }



        etiket:
        for (int i=0;i<10;i++){


            for (int j=0;j<5;j++){

                if(j==2)
                    continue etiket;


                System.out.println("i :"+i +" j : "+j);
            }
        }*/


        for (int i=0;i<10;i++){

            if(i==6)
                return;// i 6 a eşit oldugunda direk main metodundan cikis yapti.
            System.out.println(i);
        }

    }
}
