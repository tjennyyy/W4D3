package Intermediate;


import java.util.Arrays;

public class Intermediate_A3 {

    public static void main( String[] args){

        Rectangular [] rects = new Rectangular[3];


        rects [0] = new Rectangular(20, 40);
        rects [1] = new Rectangular(30,60);
        rects [2] = new Rectangular(40,80);

        int rect0Fläche = 20 * 40;
        int rect1Fläche = 40 * 80;
        int rect2Fläche = 30 * 60;

        int [] ints = new int[]{rect0Fläche, rect1Fläche, rect2Fläche};




        System.out.println(java.util.Arrays.toString(ints));

        java.util.Arrays.sort(ints);

        System.out.println(java.util.Arrays.toString(ints));

        for(int i = ints.length-1; i>=0; i--){
            System.out.println(ints[i]);
        }










    }


}
