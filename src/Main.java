import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random ran = new Random();
        int x = 10 + ran.nextInt(49 - 1 + 1);
        int[] lottozahlen = new int[6];
        boolean[] unique = new boolean[50];
        for (int i=0; i< unique.length; i++) {
            unique[i] = false;
        }

        for (int i = 0; i < 6; i++) {

            x = 1 + ran.nextInt(49);
//            System.out.println(x);
            while(unique[x] == true) {
                x = 1 + ran.nextInt(49);
//                System.out.println("while");
            }
            unique[x] = true;
            lottozahlen[i] = x;
            System.out.println((i + 1) + ". Ziehung : " + x);

        }


    }
}


