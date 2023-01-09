import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
        LF 6 / Programmierung II
        Array, Aufgabensammlung
        A04.01 Array Aufgabensammlung (2).pdf
        Aufgabe 4
        "Lottozahlen"
        von M.W
        */

        Random ran = new Random();
        int x = 1 + ran.nextInt(49);
        int[] lottozahlen = new int[6];
        boolean[] unique = new boolean[50];
        for (int i = 0; i < unique.length; i++) {
            unique[i] = false;
        }

        for (int i = 0; i < 6; i++) {

            x = 1 + ran.nextInt(49);

            while (unique[x]) {
                x = 1 + ran.nextInt(49);
            }
            unique[x] = true;
            lottozahlen[i] = x;
            System.out.println((i + 1) + ". Ziehung : " + x);


        }
        Arrays.sort(lottozahlen);
        System.out.print(Arrays.toString(lottozahlen));


    }
}


