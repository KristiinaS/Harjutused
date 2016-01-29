package Test;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Kristiina on 05.12.2015.
 */
public class KTyl3 {
    public static void main (String[] args) {
        //System.out.println (result(new double[]{0., 1., 2., 3., 4.}));
        System.out.println (result(new double[]{1.0, 2.0, 1.0})); //1.0
        System.out.println (result(new double[]{1.0, 2.0, 3.0})); //2.0
        System.out.println (result(new double[]{-2.0, -1.0, -1.0, 0.0})); //-1.0

    }

    public static double result (double[] marks) {
        int kordi = marks.length;
        double summa = 0;
        for (int i = 0; i < kordi; i++) {
            summa = summa + marks[i];
        }
        //System.out.println("summa="+summa);

        double a = Integer.MAX_VALUE;
        for (int i = 0; i < kordi; i++) {
            if (marks[i] < a){
                a = marks[i];
            }
        }
        //System.out.println("a="+a);

        double b = Integer.MIN_VALUE;
        for (int i = 0; i < kordi; i++) {
            if (marks[i] > b){
                b = marks[i];
            }
        }
        //System.out.println("b="+b);

        summa = summa - (a+b);
        //System.out.println("summa2="+summa);
        double aritm = summa/(kordi-2);

        return aritm;
    }

}
