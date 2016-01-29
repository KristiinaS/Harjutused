package Test;

import java.util.Arrays;

/**
 * Created by Kristiina on 05.12.2015.
 */
public class KTyl4 {
    public static void main (String[] args) {
        int[] res = veeruMaxid (new int[][] { {-1, -4}}); // {4, 5, 6}
        // YOUR TESTS HERE
    }

    public static int[] veeruMaxid (int[][] m) {

        int arraySize = 0;

        for(int i = 0; i < m.length; i++) {
            if(arraySize < m[i].length) {
                arraySize = m[i].length;
            }
        }

        int[] maxima = new int[arraySize];
        for(int i = 0; i < maxima.length; i++) {
            maxima[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if(maxima[j] < m[i][j]) {
                    maxima[j] = m[i][j];
                }
            }
        }

        return maxima;


        //__________________________________________""
/*
        int elemendid = m.length;

        int pikim = 0;
        for (int i = 0; i < elemendid; i++) {
            int[] a = m[i];
            int b = a.length;
            if (pikim < b){
                pikim = b;
            }
        }
        int[] vastus = new int[pikim];


        for (int i = 0; i < pikim; i++) {
            int suurim = 0;
            for (int j = 0; j < elemendid; j++) {

                int c = m[i][j];
                if (suurim < c){
                    suurim = c;
                    System.out.println(suurim);
                }

            }

        }

        return vastus;*/
    }
}
