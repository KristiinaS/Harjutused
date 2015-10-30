package LaevadePommitamine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Kristiina on 30.10.2015.
 */
public class Example {
    static int[][] laud; //Kui static, siis saab main-meetodi all kasutada (static sees), kui pole, siis ei saa

    public static void main(String[] args) {


        //Meetodid:

        //Mängulaud genereerida
        generateTable();

        //Täida laud laevadega
        //fillTableWithShips();

        //Kasutajalt küsida, kuhu pommitada
        //askWhereToBomb();

        //Pommitamise tulemus
        //resultOfBombing();

        //Kontrollida, kas on laevu
        //anyShiptsLeft();

        //Kui laevad on otsas, siis mäng läbi või uuesti step 3;
        //gameover()


    }

    private static void generateTable() {
        HashMap a = new HashMap();
        a.put("Toomas", 5);
        a.put("Eva", 5);
        System.out.println(a.toString());

    }



}
