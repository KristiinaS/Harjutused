package Test;

import java.util.Arrays;

/**
 * Created by Kristiina on 05.12.2015.
 */
public class KT {
    public static void main (String[] args) {
        int[][] res = yhik (9);
    }

    public static int[][] yhik (int n) {

        int[][] tabel = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j){
                    tabel[i][j] = 1;
                } else {
                    tabel[i][j] = 0;
                }
            }
        }

        return tabel; // TODO!!! Your code here
    }

}
