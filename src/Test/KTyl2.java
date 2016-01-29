package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Kristiina on 05.12.2015.
 */

//Töötab, aga test ei võtnud vastu...
public class KTyl2 {
    public static void main (String[] args) {
        String s = "Tere, TUDENG, 1234!";
        String t = asenda (s); // "Tere**TUDENG*******"
        System.out.println (s + " > " + t);
    }

    public static String asenda (String s) {
        int sPikkus = s.length();
        String t = s;
        char[] tChar = t.toCharArray();

        for (int i = 0; i < sPikkus; i++) {
            if (Character.isLetter(s.charAt(i)) == false){
                tChar[i] = '*';
            }
        }
        t = String.valueOf(tChar);
        System.out.println(t);
        return t; // TODO!!! Your code here
    }
}
